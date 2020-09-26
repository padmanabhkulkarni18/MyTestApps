package test.list;

public class VdpLengthCalculation {
	private static final int RTC_LENGTH = 4;
	public static void main(String[] args) {
		
		int[] totalLengthArr = { -117 & 0xff,2 & 0xff };
		long totalLength = littleEndian2Long(totalLengthArr, 2) - RTC_LENGTH;
		System.out.println(totalLengthArr);
		System.out.println(totalLength);
//		System.out.println(totalLengthArr);
}
	public static long littleEndian2Long(int[] a, int size) {
		long res = 0;

		if (size == 1) {
			res = a[0];
		} else if (size == 2) {
			res = (a[1] << 8) | a[0];
		} else if (size == 4) {
			res = (a[3] << 24) | (a[2] << 16) | (a[1] << 8) | a[0];
		}

		return res;
	}

}
