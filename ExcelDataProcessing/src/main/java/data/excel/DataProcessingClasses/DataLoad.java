package data.excel.DataProcessingClasses;

import java.io.FileInputStream;
import java.util.ArrayList;
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
		 ArrayList<ExclDto> exclst = new ArrayList<ExclDto>();
		 
		 ExclModel emdl = new ExclModel();
		 
		 try
		 {
			 FileInputStream fis = new FileInputStream("C:\\Users\\nisha\\Downloads\\DataLoad.xlsx");
			 XSSFWorkbook wb = new XSSFWorkbook(fis);
			 XSSFSheet sh = wb.getSheetAt(0);
			 
			 Iterator<Row> rw = sh.iterator();
			 
			 
			 while (rw.hasNext())
			 {
				 Row rw1 = rw.next();
				 
				 Iterator<Cell> cll = rw1.cellIterator();
				 
				 ExclDto ed = new ExclDto();
				 
				 while(cll.hasNext())
				 {
					 Cell cll2 = cll.next();
					 System.out.println(cll2.getColumnIndex());
					 switch(cll2.getColumnIndex())
					 {
					 case 0:
						 ed.setOrdrId(cll2.getNumericCellValue());
						 break;
					 case 1:
						 ed.setOrdrDt(cll2.getDateCellValue());
						 break;
					 case 2:
						 ed.setOrdrQntty(cll2.getNumericCellValue());
						 break;
					 case 3:
						 ed.setSls(cll2.getNumericCellValue());
						 break;
					 case 4:
						 ed.setShpMd(cll2.getStringCellValue());
						 break;
					 case 5:
						 ed.setPrft(cll2.getNumericCellValue());
						 break;
					 case 6:
						 ed.setUntPrc(cll2.getNumericCellValue());
						 break;
					 case 7:
						 ed.setCstmNm(cll2.getStringCellValue());
						 break;
					 case 8:
						 ed.setCstmSg(cll2.getStringCellValue());
						 break;
					 case 9:
						 ed.setPrdctCtgry(cll2.getStringCellValue());
						 break;
					 }		 
					
				 }
				 exclst.add(ed);
			 }
		 }
		 catch(Exception e)
		 {
			 	e.printStackTrace();
		 }

		 if(exclst != null)
		 {
			 emdl.ListSave(exclst);
		 }
		  
	}

}
