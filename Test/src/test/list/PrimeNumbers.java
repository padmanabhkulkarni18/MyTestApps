package test.list;

import java.util.*;

class PrimeNumbers{
    public static void main(String[] args)
    {
    	int a = 0;
    	int b = 0;
        Scanner scan=new Scanner(System.in);
        try {
        a=scan.nextInt();
        b=scan.nextInt();
        }
        catch(Exception e) {
//        	System.out.println(e);
        }
        
        if((a>=b) || (a<=0) || (b<=0))
        {
            System.out.print("Provide valid input");
            return;
        }
        else if(a<b) {
        
        for (int i=a; i<=b; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+ " ");
            }
        }
      }
    }
    
    public static boolean isPrime(int n)
    {
        for( int i=2;i<=n/2; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}