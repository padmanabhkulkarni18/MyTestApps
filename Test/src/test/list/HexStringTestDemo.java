package test.list;

public class HexStringTestDemo {

	public static void main(String[] args) {
		long a= 3058l;
		String b = Long.toHexString(a);
		char [] c= b.toCharArray();
//		int lsb= c[1];
//		System.out.println(c[0]);
//		System.out.println(c[1]);
//		System.out.println(c[2]);
		String ab= c[1]+"";
		String res = ab+c[2];
		System.out.println(c[0]);
		System.out.println(res);
		System.out.println(Long.toHexString(a));
		
		
		
		

	}
	

}
