package test.list;

import java.util.Arrays;

public class WakeUpSrcCalculation {

	public static void main(String[] args) {
	
		int [] a = getWakepSrc(127);
		System.out.println(Arrays.toString(a));
		int [] b = getWakeUpSrcArr(128, MMConstants.NO_MODE);
		System.out.println(Arrays.toString(b));
		
	}
	   protected static int[] getWakepSrc(long wakeupsrc) {
	        int[] wakeupArr = new int[9];
	        /*
	         * 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 ETH | CCU | BCALL| CAN | Accl | KL15 | Ecall| Batt | Switch
	         */
	        for (int i = 0; i < wakeupArr.length; i++) {
	            wakeupArr[i] = (int) ((wakeupsrc >> i) & 1);
	        }
	        return wakeupArr;
	    }
	   
	   private static int[] getWakeUpSrcArr(long wakeupsrc, int mode) {
			// int KL15 = (int) ((wakeupsrc & 0x8) >> 4); //8
			// int CAN = (int) ((wakeupsrc & 0x28) >> 6); //40
			// int SMS = (int) ((wakeupsrc & 0x200) >> 10); //512
			// int RTC = (int) ((wakeupsrc & 0x100) >> 9); // 256
			int KL15 = 0, CAN = 0, SMS = 0, RTC = 0, PWRREBOOT = 0, Sleep = 0;

			int wakeUpSrcCounter = 0;
			// Code has been modified
			// changed for the bug -Sleep Packet has wakeup source active
			// ITRAMSSYMC-220
			if (mode == MMConstants.SLEEP_MODE) {
				wakeUpSrcCounter++;
			}

			if ((wakeupsrc & 0x8) == 0x08 && mode != MMConstants.SLEEP_MODE) {
				KL15 = 1;
				wakeUpSrcCounter++;
			}

			if ((wakeupsrc & 0x8) == 0x20 && mode != MMConstants.SLEEP_MODE) {
				CAN = 2;
				wakeUpSrcCounter++;
			}
			if ((wakeupsrc & 0x80) == 0x80 && mode != MMConstants.SLEEP_MODE) {
				SMS = 3;
				wakeUpSrcCounter++;
			}
			// Code has been Added
			// Wake up source is null in DE packet to server,logic has been added for POWER
			// ON/REBOOT
			// ITRAMSSYMC-188
			if ((wakeupsrc & 0x8000) == 0x8000 && mode != MMConstants.SLEEP_MODE) {
				PWRREBOOT = 16;
				wakeUpSrcCounter++;
			}

			int[] res = new int[wakeUpSrcCounter];
			int wakeUpSrcAddcounter = 0;
			if (KL15 != 0) {
				res[wakeUpSrcAddcounter++] = KL15;
			}

			if (CAN != 0) {
				res[wakeUpSrcAddcounter++] = CAN;
			}

			if (SMS != 0) {
				res[wakeUpSrcAddcounter++] = SMS;
			}

			if (RTC != 0) { // NOSONAR
				res[wakeUpSrcAddcounter++] = RTC;
			}

			// Code has been Added
			// Wake up source is null in DE packet to server,logic has been added for POWER
			// ON/REBOOT
			// ITRAMSSYMC-188
			if (PWRREBOOT != 0) {
				res[wakeUpSrcAddcounter++] = PWRREBOOT;
			}

			if (wakeUpSrcAddcounter == 0) {
				res[wakeUpSrcAddcounter++] = Sleep;
			}

			return res;
		}


}
