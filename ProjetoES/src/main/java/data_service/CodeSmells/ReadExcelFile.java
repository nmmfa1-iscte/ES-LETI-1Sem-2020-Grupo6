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
			this.file = new FindFile("Defeitos.xlsx", new File("C:/"), 6).find();
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
		
		ReadExcelFile ref=new ReadExcelFile();
		SourceCode[] sca=ref.getExcelValuesToAnArray();
		for(int i=0;i<ref.getRownCount()-1;i++) {
			System.out.println(sca[i].toString());
		}
		System.out.println(sca[16].getIs_featue_envy());
	}

}  
