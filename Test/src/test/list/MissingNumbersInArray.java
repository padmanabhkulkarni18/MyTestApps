package test.list;

import java.util.Arrays;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int input_array[] = {1,3,5,7};
		int max=input_array[0];
		for(int i=0;i<input_array.length;i++) {
			if(input_array[i]>max) {
				max=input_array[i];
			}
		}
			
		
		
		int[] dummy = new int[max+1];
		
		for(int i : input_array) {
			System.out.println(i);
			dummy[i]= 1;
			
		}
		System.out.println(Arrays.toString(dummy));
		
		
		for(int j=1;j<dummy.length;j++) {
			if(dummy[j]==0) {
		
				System.out.println("Missing numbers in array are "+j);
		}

	}
	}
}

