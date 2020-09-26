package test.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringNullDTCTest {

	public static void main(String[] args) {
		List<String> dtcStringList = new ArrayList<>();
		String dtcParameter = "";
		//Activator.log.info("[VSoHChecker] DTC Parameter String :  " + dtcParameter);
		String[] parameterDTCArray = dtcParameter.split(", ");
		//Activator.log.info("[VSoHChecker] parameterDTCArray :  " + parameterDTCArray);
		dtcStringList = Arrays.asList(parameterDTCArray);
		System.out.println(dtcStringList);
		System.out.println(dtcStringList.size());
		
	
	}

}
