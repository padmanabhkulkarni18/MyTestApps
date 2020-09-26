package test.list;

import java.util.Arrays;

class LongestPallindromeCheck {
	@SuppressWarnings("null")
	public static void main(String args[]) {
		
		String pallCheck= "forgeeksskeegfor";
		char original_char_array [] = pallCheck.toCharArray();
		int pall_length= pallCheck.length();
		String pall_reverse= "";
		System.out.println(pall_length);
		int halfSize= pallCheck.length()/2;
		String firstHalfString = pallCheck.substring(halfSize-1, halfSize);
		String secondHalfString= pallCheck.substring(halfSize, halfSize+1);
		System.out.println("First Half String : " + firstHalfString);
		System.out.println("Second Half String :" + secondHalfString);
		
		for(int i=pall_length-1; i>=0;i--) {
		pall_reverse= pall_reverse+ pallCheck.charAt(i);
		}
		System.out.println("Original : " + pallCheck);
		System.out.println("Reverse : "+ pall_reverse);
		char reverse_char_array []= pall_reverse.toCharArray();
		if(pallCheck.equals(pall_reverse)) {
			System.out.println("Is a pallindrome");
			
		}
		System.out.println("Is not a  pallindrome");
		char comman_array[] = new char[pallCheck.length()];
		int j=0;
		int count_to_be_deleted=0;
		for(int k=0;k<pall_length; k++) {
			if(original_char_array[k]==reverse_char_array[k]) {
				//store in new array
				comman_array[j]=original_char_array[k];
				j++;
			}
			else {
				count_to_be_deleted++;
				System.out.println("else for loop common_array"+ Arrays.toString(comman_array));
				comman_array=null;
				comman_array= new char[pallCheck.length()-count_to_be_deleted];
				j=0;
			}
		}
		System.out.println("common_array"+ Arrays.toString(comman_array));
	}
	//forgeeksskeegroffor;
	//rofforgeeksskeegrof;
}