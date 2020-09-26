package test.list;

public class ReplaceAllZeroesTo5InInteger {

	private static int q;
	private static int sum1;

	public static void main(String[] args) {
		System.out.println("Number is "+ 10120); 
		System.out.println(convert0To5(10120)); 
//		int n = 1020;
//		int temp=n;
////		int n=0;
//		int d=0;
//		int sum=0;
//		while(n>0) {
//			
//			
//			d=n%10;
//			if(d==0) {
//				d=5;
//			}
//			
//			sum=(sum*10)+d;
//			n=n/10;
////			System.out.println("sum : "+ sum);
////			System.out.println("n :"+ n);
////			System.out.println("d :"+ d);
//			
//		}
//		System.out.println("The sum is : "+sum);
//
//		while(sum>0) {
//			
//			q=sum%10;
//			
//			sum1=q+(sum1*10);
//			sum=sum/10;
//		}
//		System.out.println("The sum is : "+sum1);
		
	}
	static int convert0To5Rec(int num) 
    { 
        // Base case 
        if (num == 0) 
            return 0; 
          
        // Extraxt the last digit and change it if needed 
        int digit = num % 10;  
        System.out.println("Digit is  : "+ digit);
        if (digit == 0) 
            digit = 5; 
  
        // Convert remaining digits and append the  
        // last digit 
        System.out.println("Before calling recursive : "+ num);
        return convert0To5Rec(num / 10) * 10 + digit; 
    } 
  
    // It handles 0 and calls convert0To5Rec() for 
    // other numbers 
    static int convert0To5(int num) 
    { 
        if (num == 0) 
            return 5; 
        else
            return convert0To5Rec(num); 
    } 
	

}
