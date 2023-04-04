package data.excel.DataLoad;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import data.excel.Dto.ExclDto;
import data.excel.Model.ExclModel;

public class DataLoad
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		 ArrayList<ExclDto> ExclList = new ArrayList<ExclDto>();
		 
		 ExclModel EMdl = new ExclModel();
		 
		 try
		 {
			 FileInputStream FIS = new FileInputStream("C:\\Users\\nisha\\Downloads\\DataLoad.xlsx");
			 XSSFWorkbook WB = new XSSFWorkbook(FIS);
			 XSSFSheet Sh = WB.getSheetAt(0);
			 
			 Iterator<Row> Rw = Sh.iterator();
			 
			 while (Rw.hasNext())
			 {
				 Row Rw1 = Rw.next();
				 
				 Iterator<Cell> Cl = Rw1.cellIterator();
				 
				 ExclDto ED = new ExclDto();
				 
				 while(Cl.hasNext())
				 {
					 Cell Cl1 = Cl.next();
					 
					 switch(Cl1.getColumnIndex())
					 {
					 case '0':
						 ED.setOrdrId(Cl1.getNumericCellValue());
					 case '1':
						 ED.setOrdrDt(Cl1.getDateCellValue());
					 case '2':
						 ED.setOrdrQntty(Cl1.getNumericCellValue());
					 case '3':
						 ED.setSls(Cl1.getNumericCellValue());
					 case '4':
						 ED.setShpMd(Cl1.getStringCellValue());
					 case '5':
						 ED.setPrft(Cl1.getNumericCellValue());
					 case '6':
						 ED.setUntPrc(Cl1.getNumericCellValue());
					 case '7':
						 ED.setCstmNm(Cl1.getStringCellValue());
					 case '8':
						 ED.setCstmSg(Cl1.getStringCellValue());
					 case '9':
						 ED.setPrdctCtgry(Cl1.getStringCellValue());
					 }
					 
					 ExclList.add(ED);
				 }
			 }
		 }
		 catch(Exception e)
		 {
			 	e.printStackTrace();
		 }

		 if(ExclList != null)
		 {
			 EMdl.ListSave(ExclList);
		 }
		  
	}

}
