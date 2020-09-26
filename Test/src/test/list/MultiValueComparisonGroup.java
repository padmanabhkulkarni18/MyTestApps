package test.list;

import java.util.Arrays;

public class MultiValueComparisonGroup {
	static int startSavedValue = -1;
	static int reserved [] = {12,13,14,15};
	static int engineStop [] = {0,1,2,3,4,5,6,7,10,11};
	static int engineStart [] = {8,9};
	public static void main(String[] args) {
		//Engine Start --> 8,9
		//Engine Stop --> 11,7,6,5,4,3,2,1,0
		//Reserved --> 15,14,13,12
		System.out.println("Glob "+ startSavedValue);
			int input =8;
			System.out.println("Value= 8");
		checkForStateChange(input);
		int input1 = 9;
		System.out.println("Value= 9");
		checkForStateChange(input1);
		int input2 = 11;
		System.out.println("Value= 11");
		checkForStateChange(input2);
		int input3 = 8;
		System.out.println("Value= 8");
		checkForStateChange(input3);
		int input4 = 9;
		System.out.println("Value= 9");
		checkForStateChange(input4);
		int input5 = 5;
		System.out.println("Value= 5");
		checkForStateChange(input5);
		int input6 = 3;
		System.out.println("Value= 3");
		checkForStateChange(input6);
		int input7 = 8;
		System.out.println("Value= 8");
		checkForStateChange(input7);
		int input8 = 0;
		System.out.println("Value= 0");
		checkForStateChange(input8);
	}

	private static void checkForStateChange(int input) {
//		int value =10;
//		if(input)
		if(Arrays.binarySearch(reserved, input)>=0) {
			System.out.println("Contains Reserved Value");
				return;
		}
//		System.out.println("Engine Start if " + input +" glob : " + startSavedValue );
//		System.out.println("Engine stop if " + input +" glob : " + startSavedValue );
		if(startSavedValue!=-1) {
			boolean engineStartCheck = Arrays.binarySearch(engineStart, input)>=0;
//			System.out.println("input : "+ input +" Global value "+ startSavedValue + " exists in engineStartArray : " + engineStartCheck);
			boolean engineStopCheck = Arrays.binarySearch(engineStop, input)>=0;
//			System.out.println("input : "+ input +" Global value "+ startSavedValue + " exists in engineStopArray : " + engineStopCheck);
			if(engineStartCheck && (!(Arrays.binarySearch(engineStart, startSavedValue)>=0))) {
					System.out.println("Engine start, transition : old value = " + startSavedValue + " new value : "+ input);
					startSavedValue=input;
			}
			if(engineStopCheck &&  (!(Arrays.binarySearch(engineStop, startSavedValue)>=0))) {
					System.out.println("Engine stop,  transition : old value = " + startSavedValue + " new value : "+ input);	
					startSavedValue=input;
				}
			}
		
		else {
			System.out.println("Assign new value input : "+ input);
			startSavedValue=input;
		}
		startSavedValue=input;
		
		}
	}
