package test.list;

public class PallindromeString {

	public static void main(String[] args) {
		float p=2f;
		
		int z = (int) (p *(-1));
		
		System.out.println(p+" "+ z);
//		String a="gadag";
//		String b="";
//		for(int i=a.length()-1;i>=0;i--) {
//			b=b+a.charAt(i);
//		}
//
//		System.out.println(b);
//	if(a.equals(b)) {
//		System.out.println("is pallindrome");
//	}
		
		
		int n=54315;
		int numRev=0;
		int numCopy=n;
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if(numCopy==sum) {
			System.out.println("integer is pallindrome");
		}
	}
}
