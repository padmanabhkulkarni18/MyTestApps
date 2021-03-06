package test.list;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileFormatChange {

	public static void main(String[] args) throws IOException {
		
	
//		copyFile("D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\File.xls", "D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\File.xlsx");
		
		Date date = new Date();
		LocalDate localDatefriday = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		String postMonth = localDatefriday.getMonth().toString().substring(0, 3);
		
		System.out.println("Post Month is : "+ postMonth);
		LocalDate correspondingMondayDate = localDatefriday.minusDays(4);
		String preMonth = correspondingMondayDate.getMonth().toString().substring(0, 3);
		System.out.println("Pre Month is : "+ preMonth);
		System.out.println("Minus 4 from today : " + correspondingMondayDate.getDayOfWeek());
		
		int postDay = localDatefriday.getDayOfMonth();
		System.out.println(postDay);		
		
		int preDay = correspondingMondayDate.getDayOfMonth();
		System.out.println(preDay);
		
		int year= localDatefriday.getYear();
		
		String finalString =  preDay+"_"+preMonth+"_"+postDay+"_"+postMonth+"_"+year+"_"+"ECCUploadQueueData.xlsx";
		System.out.println("final String : "+  finalString);
		
		String destinatonPath =  "D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\"+finalString;
		copyFile("D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\File.xls", destinatonPath);
		
//		File inputFile=new File("D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\File.xls");
//		FileInputStream fis=new FileInputStream(inputFile);
//		XSSFWorkbook inputWorkbook=new XSSFWorkbook(fis);
//		int inputSheetCount=inputWorkbook.getNumberOfSheets();
//		System.out.println("Input sheetCount: "+inputSheetCount);
//		
//		// Provide the path of excel file in which we wanted to copy the data
//		File outputFile=new File("D:\\TML_EV\\V3_6.2.0\\EasyTestingForV3\\File.xlsx");
//		FileOutputStream fos=new FileOutputStream(outputFile);
//		
//		// Creating workbook for output
//		XSSFWorkbook outputWorkbook=new XSSFWorkbook();
//		
//	
//		for(int i=0;i<inputSheetCount;i++) 
//                { 
//                  XSSFSheet inputSheet=inputWorkbook.getSheetAt(i); 
//                  String inputSheetName=inputWorkbook.getSheetName(i); 
//                  XSSFSheet outputSheet=outputWorkbook.createSheet(inputSheetName); 
//
//                 // Create and call method to copy the sheet and content in new workbook. 
//                 copySheet(inputSheet,outputSheet); 
//                }
//
//               // Write all the sheets in the new Workbook(testData_Copy.xlsx) using FileOutStream Object
//               outputWorkbook.write(fos); 
//              // At the end of the Program close the FileOutputStream object. 
//               fos.close(); 
//          }
//
//           public static void copySheet(XSSFSheet inputSheet,XSSFSheet outputSheet) 
//           { 
//              int rowCount=inputSheet.getLastRowNum(); 
//              System.out.println(rowCount+" rows in inputsheet "+inputSheet.getSheetName()); 
//               
//                int currentRowIndex=0; if(rowCount>0)
//		{
//			Iterator rowIterator=inputSheet.iterator();
//			while(rowIterator.hasNext())
//			{
//				int currentCellIndex=0;
//				Iterator cellIterator=((Row) rowIterator.next()).cellIterator();
//				while(cellIterator.hasNext())
//				{
//				//  Creating new Row, Cell and Input value in the newly created sheet. 
//					String cellData=cellIterator.next().toString();
//					if(currentCellIndex==0)
//						outputSheet.createRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
//					else
//						outputSheet.getRow(currentRowIndex).createCell(currentCellIndex).setCellValue(cellData);
//					
//					currentCellIndex++;
//				}
//				currentRowIndex++;
//			}
//			System.out.println((currentRowIndex-1)+" rows added to outputsheet "+outputSheet.getSheetName());
//			System.out.println();
//		}
	}
	public static void copyFile(String sourcePath, String destinationPath) throws IOException {
	    FileInputStream excelFile = new FileInputStream(new File(sourcePath));
	    Workbook workbook = new XSSFWorkbook(excelFile);
	    FileOutputStream outputStream = new FileOutputStream(destinationPath);
	    workbook.write(outputStream);
	    workbook.close();
	}
}
