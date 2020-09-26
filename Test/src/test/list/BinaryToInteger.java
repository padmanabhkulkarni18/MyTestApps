package test.list;

public class BinaryToInteger {

	public static void main(String args[]) {
		
		char [] array= {'1','1','1','1','1','1','0','1','1','1','1','1','1'};
		String a= new String(array);
//		String a= "1000000000000";
		
		System.out.println("Output: "+Integer.parseInt(a,2));
	}
}
