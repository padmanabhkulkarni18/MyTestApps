package test.list;

import java.util.Arrays;

public class MultiValueComparisonNew {
	static int reserved [] = {12,13,14,15};
	static int startSavedValue =-1;
	public static void main(String[] args) {
//	System.out.println("Glob "+ startSavedValue);
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
		boolean engineStartRaised = false;
		
		if(Arrays.binarySearch(reserved, input)>=0) {
			System.out.println("Contains Reserved Value");
				return;
		}
		if(startSavedValue!=-1) {
			if(engineStartRaised==false) {
				if(input==8 && input!=startSavedValue && startSavedValue!=8) {
					System.out.println("EngineStartRaised");
					startSavedValue=input;
					engineStartRaised=true;
				}
				else if(input==9 && input!=startSavedValue && startSavedValue!=9) {
					System.out.println("EngineStartRaised");
					startSavedValue=input;
					engineStartRaised=true;
				}
				else {
					System.out.println("EngineStopRaised");
					startSavedValue=input;
					engineStartRaised=false;
				}
			}
			else {
					
			}
			
		}
		else {
			startSavedValue=input;
		}
	}

}
