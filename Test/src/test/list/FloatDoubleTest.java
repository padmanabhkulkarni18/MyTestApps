package test.list;

public class FloatDoubleTest {

	public static void main(String[] args) {
		float a = 0.9f;
		double b = 0.9;
		System.out.println("a : " + a);
		System.out.println("a : " + a*10);
		
		System.out.println("b : " + b);
		System.out.println("b : " + b * Math.pow(10, 1));
		b= b* Math.pow(10, 1);
		System.out.println((int) b);
//		System.out.println("Double : "+  b*);
		
	}

}
