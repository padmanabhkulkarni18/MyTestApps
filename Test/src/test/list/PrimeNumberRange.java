package test.list;

public class PrimeNumberRange {

	public static void main(String[] args) {
		boolean prime = testPrime(12);
		System.out.println(prime);
	}

	private static boolean testPrime(int number) {

			
			int sqrt= (int) Math.sqrt(number)+1;
			for(int q=2;q<sqrt;q++) {
				if(number%q==0) {
					System.out.println("Number is "+ number);
					return false;
				}
			}
		return true;
		
	}

}
