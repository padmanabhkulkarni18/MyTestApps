package test.list;

import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ByteSkipTest {

	public static void main(String[] args) {
		byte a[]= {0x4d ,0x41, 0x54, 0x36, 0x32, 0x37, 0x31, 0x34, 0x34,0x4b, 0x4c, 0x50, 0x34, 0x38, 0x38, 0x34, 0x36, 0x31, 0x37, 0x30, 0x33, 0x30, 0x31, 0x31};
		String b = new String(a);
		System.out.println("Byte array a : " + b);
		String finall = b.substring(0,17);
		System.out.println(finall);
		System.out.println(finall.length());
		finall= finall+"0000000";
		System.out.println(finall);
		Integer a1= new Integer(9999);
		String s ="SN12345678";
		System.out.println(a1.byteValue());
		System.out.println(s.getBytes().length);
		byte p[] = s.getBytes();
		System.out.println("     "+ Arrays.toString(p));
		byte reqID [] =  {48};
		System.out.println("Request ID "+ Arrays.toString(reqID));
		String actual_data= byteToStringConversion(reqID,0,3);
		System.out.println("Acutal data :" + actual_data);
		String sasda = "";
		
			
		System.out.println(bytesToHex(reqID));	
			
		System.out.println("Final hex " + sasda );
//		
		
		
//		
//		System.out.println(reqID);
//		String q1= new String(reqID);
//		System.out.println("reqID : "+ q1);
//		String ps = String.valueOf(p);
		String q= new String(p);
		System.out.println(q);
		
//		int lat= 129377600;
		Integer lat= new Integer(1800000000);
		System.out.println(lat.byteValue());
		System.out.println(Arrays.toString(bigIntToByteArray(lat)));
		
		
		
		
	}
	private static byte[] bigIntToByteArray( final int i ) {
	    BigInteger bigInt = BigInteger.valueOf(i);      
	    return bigInt.toByteArray();
	}
	
	private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();
//	public static String bytesToHex(byte[] bytes) {
//	    char[] hexChars = new char[bytes.length * 2];
//	    for (int j = 0; j < bytes.length; j++) {
//	        int v = bytes[j] & 0xFF;
//	        hexChars[j * 2] = HEX_ARRAY[v >>> 4];
//	        hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
//	    }
//	    System.out.println(new String(hexChars));
//	    return new String(hexChars);
//	}
	private static String byteToStringConversion(byte[] payload, int startPoint, int endPoint) {
		//	Activator.log.info("[VSoH Response] Inside byteToStringConversion");
			byte[] asmByte = Arrays.copyOfRange(payload, startPoint, endPoint);
			//Activator.getLogInstance().info("[VSoH Response] asmByte " + Arrays.toString(asmByte));
			String actualValue = new String(asmByte, StandardCharsets.UTF_8);
			//Activator.getLogInstance().info("[VSoH Response] Parameter Value " + actualValue);
			return actualValue;

		}
	private static String bytesToHex(byte[] asmByte) {
		char[] hexChars = new char[asmByte.length * 2];
		for (int j = 0; j < asmByte.length; j++) {
			int data = asmByte[j] & 0xFF;
			hexChars[j * 2] = HEX_ARRAY[data >>> 4];
			hexChars[j * 2 + 1] = HEX_ARRAY[data & 0x0F];
			
		}
		return new String(hexChars);
	}
}
