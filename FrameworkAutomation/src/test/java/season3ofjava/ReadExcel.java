package season3ofjava;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\Desktop\\selinium1\\Book1.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet workSheet = workBook.getSheet("sheet1");
		System.out.println(workSheet.getLastRowNum());
		System.out.println(workSheet.getPhysicalNumberOfRows());
		System.out.println(workSheet.getRow(0).getLastCellNum());
		System.out.println(workSheet.getRow(0).getPhysicalNumberOfCells());
		XSSFRow row=null;
		XSSFCell cell=null;
		for(int i=0;i<=workSheet.getLastRowNum();i++) {
			row=workSheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING) {
					System.out.println(cell.getStringCellValue());
				}
					else if(cell.getCellType()==CellType.NUMERIC) {
						System.out.println(cell.getNumericCellValue());
				}
					else if(cell.getCellType()==CellType.BOOLEAN) {
						System.out.println(cell.getBooleanCellValue());
					}
			}
		}
		System.out.println("end");

	}

}
