package test.list;

import java.util.Arrays;

public class ArrayTest {
	static int arr[] = new int[10];
	public static void main(String[] args) {
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));

		int k= arr[9];
		
		System.out.println(Arrays.toString(arr));
		System.out.println(k);
		
	}
}
