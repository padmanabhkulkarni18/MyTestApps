package test.list;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class AcTimerTest {

	public static void main(String[] args) {
		
		AcTimerTest a = new AcTimerTest();
		a.sendTimerValueToRH850();
	}
	private void sendTimerValueToRH850() {
		System.out.println("[RSP_RCC] Sending timer value to RH850 ");
			//getTimerValue
			int timerValue= 120;
			System.out.println("Timer Value is :" + timerValue);
			byte [] timerData = new byte [3]; 
			String timerString = Integer.toString(timerValue);
			int timerLength=timerString.length();
			byte [] tempData = new byte [2];
			System.out.println("[RSP_RCC] Timer Length in String is :  "+timerLength);
			if(timerValue>0 && timerValue<=2500) {
//				double d= (double) timerValue/60;
//				DecimalFormat df = new DecimalFormat("0.00");
//				String str1=df.format(d);
//				double df1= Double.parseDouble(str1);
//				double decimal_value= df1- (long)df1;
//				String str2_decimal = df.format(decimal_value);
//				double df2= Double.parseDouble(str2_decimal);
//				System.out.println("Double Value is :"+ df1);
//				double min= timerValue/60;
//				System.out.println("Double Value minutes is :"+ Math.round(min));
//				System.out.println("Double Value in seconds:"+Math.round(df2*60));
//				double minutes=Math.round(min);
//				double seconds=Math.round(df2*60);
//				tempData[0]=(byte) seconds;
//				tempData[1]=(byte) minutes;
				tempData[1] = (byte)((timerValue>>8 ) &  0xFF);//msb//littleEndian
				tempData[0] = (byte)(timerValue & 0xFF);//lsb\
				
				Object x=10.0;
				
//				x=(int)x;
				System.out.println(x);
			
			}  
			System.out.println("[RSP_RCC] Timer data[1]  "+ timerData[1]);
			System.out.println("[RSP_RCC] Timer data whole array "+ timerData);
			byte[] sendTimerValue = {tempData[0],tempData[1]};
			System.out.println("[RSP_RCC] Timer value being sent to RH850 is : "+ Arrays.toString(sendTimerValue));
			//RemoteServicesInit.getTxInstance().ISignalDataSend(TxFunctionIdentifierEnum.climateStartAcTimerRequest,sendTimerValue);
			System.out.println("[RSP_RCC] Timer Value sent");
		}
	}