package test.list;

import java.sql.Timestamp;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Generated; 
  
public class TimeStampPOC { 
    private static long cloudMillis;
	private static long cloudMillisPlus30;
	private static long currentMillis;
	private static boolean isCloudTimePast30Seconds;

	public static void main(String args[]) 
    { 
  
        // milliseconds 
    	//Cloud timestamp
        long miliSec1 = System.currentTimeMillis(); 
        System.out.println("Miliseconds : " + miliSec1);
        long seconds =  (miliSec1 / 1000);
//        System.out.println("Current Time is :"+  getDatefromMillis(miliSec1));
//        int nanos = ((int)((miliSec % 1000) * 1000000));
//        
//        System.out.println("seconds : " + seconds);
//        System.out.println("nanos : " + nanos);
//        // Creating date format 
//        DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss"); 
//  
//        
//        // Creating date from milliseconds 
//        // using Date() constructor 
//        Date result = new Date(miliSec); 
//  
//        // Formatting Date according to the 
//        // given format 
//        System.out.println(simple.format(result)); 
//        long plus30=30000/1000;
//        //Conversting back to seconds and nanos
//        miliSec = ((seconds)*1000);
//       long  miliSecPlus30= miliSec+plus30;
//        System.out.println("Converted milisec "+  miliSec);
//        
//        Date result1 = new Date(miliSec); 
//        
//        // Formatting Date according to the 
//        // given format 
//        System.out.println(simple.format(result1));
////        try {
////			Thread.sleep(30000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//        //We Recieved 30 seconds later, current timestamp
////        long miliSecPlus30 = System.currentTimeMillis(); 
////        Date result2 = new Date(miliSecPlus30); 
////        
////        // Formatting Date according to the 
////        // given format 
////        System.out.println(simple.format(result2));
//        if(miliSecPlus30>=miliSec) {
//        	System.out.println("Ignoring the command");
//        }
//        
        long miliSec = (seconds*1000);
        Timestamp original = new Timestamp(miliSec);
//        System.out.println(original.getTime());
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(original.getTime());
        cal.add(Calendar.SECOND, 30);
        Timestamp originalPlus30 = new Timestamp(cal.getTime().getTime());
        long a = original.getTime();
        long aPlus30 = originalPlus30.getTime();
        System.out.println("Current TimeStamp : "+ a);
        System.out.println("Current Date : " + getDatefromMillis(a));
//        System.out.println(getDatefromMillis(a));
        System.out.println("Cloud TimeStamp Plus 30: " + aPlus30);
        System.out.println("Cloud Time Plus 30 " + getDatefromMillis(aPlus30));
        try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        System.out.println("Current Time is : "+ getDatefromMillis(currentTime.getTime()));
//      System.out.println("Current Time is : "+ currentTime.getTime());
             
        
       if(currentTime.getTime()>=aPlus30) {
    	   System.out.println("Rejecting the remote command");
       }
       else {
    	   System.out.println("Accepting the remote command");
       }
        
        
        
//        cloudMillis= (seconds*1000);
//        long plus30=30000;
////        System.out.println("Cloud Time : "+  getDatefromMillis(cloudMillis));
//		cloudMillisPlus30 = (cloudMillis)+ plus30;
//		System.out.println("Cloud Time Plus 30 : "+getDatefromMillis(cloudMillisPlus30));
//		currentMillis = System.currentTimeMillis();
//		System.out.println("Current Time is : "+ getDatefromMillis(currentMillis));
//		if(currentMillis>=cloudMillisPlus30) {
//			isCloudTimePast30Seconds=true;
//		}
//		else {
//			isCloudTimePast30Seconds=false;
//		}
//        
//        System.out.println("isCloudTimePast30Seconds :" +  isCloudTimePast30Seconds);
        
    } 
	private static String getDatefromMillis(long millis) {
		 DateFormat simple = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
		 Date result = new Date(millis); 		  
	     return simple.format(result);
	}
} 
