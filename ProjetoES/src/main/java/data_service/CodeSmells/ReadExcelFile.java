package data_service.CodeSmells;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class ReadExcelFile 
{  

	private File file;
	private FileInputStream fis;
	private XSSFWorkbook wb;
	private XSSFSheet sheet;
	private Row row;
	private int rowCount;
	private SourceCode[] sc;

	public ReadExcelFile() {

		try {
			this.file = new File("C:\\Users\\João Santos\\Downloads\\Defeitos.xlsx");
			this.fis = new FileInputStream(file);
			this.wb = new XSSFWorkbook(fis);
			this.sheet = wb.getSheetAt(0);
			//this.row=sheet.getRow(0);
		} catch (IOException e) {

			e.printStackTrace();
		}
		this.rowCount=sheet.getLastRowNum()+1;

	}

	public int getRownCount() {
		return rowCount;
	}

	public SourceCode[] getExcelValuesToAnArray() {
		sc=new SourceCode[rowCount-1];
		for(int i=1;i<rowCount;i++) {
			row=sheet.getRow(i);
			SourceCode srcCd=new SourceCode();
			srcCd.setMethodID((int)row.getCell(0).getNumericCellValue());
			srcCd.setPkg(row.getCell(1).getStringCellValue());
			srcCd.setClss(row.getCell(2).getStringCellValue());
			srcCd.setMethod(row.getCell(3).getStringCellValue());
			srcCd.setLOC((int)row.getCell(4).getNumericCellValue());
			srcCd.setCYCLO((int)row.getCell(5).getNumericCellValue());
			srcCd.setATFD((int)row.getCell(6).getNumericCellValue());
			srcCd.setLAA(row.getCell(7));//nao corre o getNumericCellValue() nem getStringCellValue()
			srcCd.setIs_long_method(row.getCell(8));
			srcCd.setiPlasma(row.getCell(9));
			srcCd.setPMD(row.getCell(10));
			srcCd.setIs_featue_envy(row.getCell(11));
			sc[i-1]=srcCd;
			

		}
		return sc;
	}

	public XSSFSheet getSheet() {
		return sheet;
	}

	public void setSheet(XSSFSheet sheet) {
		this.sheet = sheet;
	}  

	public static void main(String[] args)   
	{  
		//		try  
		//		{  
		//			File file = new File("C:\\Users\\João Santos\\Downloads\\Defeitos.xlsx");   //creating a new file instance  
		//			FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		//			//creating Workbook instance that refers to .xlsx file  
		//			XSSFWorkbook wb = new XSSFWorkbook(fis);   
		//			XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		//			Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
		//			while (itr.hasNext())                 
		//			{  
		//				Row row = itr.next();  
		//				Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
		//				while (cellIterator.hasNext())   
		//				{  
		//					Cell cell = cellIterator.next();  
		//					switch (cell.getCellType())               
		//					{  
		//					case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
		//						System.out.print(cell.getStringCellValue() + "\t\t\t");  
		//						break;  
		//					case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
		//						System.out.print(cell.getNumericCellValue() + "\t\t\t");  
		//						break; 
		//					case Cell.CELL_TYPE_BOOLEAN:    //field that represents number cell type  
		//						System.out.print(cell.getBooleanCellValue() + "\t\t\t");  
		//						break; 
		//					case Cell.CELL_TYPE_FORMULA:    //field that represents number cell type  
		//						System.out.print(cell.getStringCellValue() + "\t\t\t");  
		//						break; 
		//					default:  
		//					}  
		//				}  
		//				System.out.println("");  
		//			}  
		//		}  
		//		catch(Exception e)  
		//		{  
		//			e.printStackTrace();  
		//		}  
		ReadExcelFile ref=new ReadExcelFile();
		System.out.println(ref.getExcelValuesToAnArray().length+"/n");
		SourceCode[] sca=ref.getExcelValuesToAnArray();
		for(int i=0;i<ref.getRownCount()-1;i++) {
			System.out.println(sca[i].toString());
		}
		
	}

}  
