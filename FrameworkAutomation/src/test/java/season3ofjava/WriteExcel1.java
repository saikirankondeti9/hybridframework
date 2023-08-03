package season3ofjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fic=new FileInputStream("C:\\Users\\hp\\Desktop\\selinium1\\Book1.xlsx");
		XSSFWorkbook wB= new XSSFWorkbook(fic);
		XSSFSheet sT=wB.getSheet("sheet1");
		//modifying an existing cell
		sT.getRow(0).getCell(1).setCellValue(true);
		FileOutputStream fOC=new FileOutputStream("C:\\Users\\hp\\Desktop\\selinium1\\Book1.xlsx");
		//creating a new cell in existing row
		sT.getRow(0).createCell(4).setCellValue("shake");
		//creating a new row and new cell in workbook
		sT.createRow(5).createCell(5).setCellValue(123);
		wB.write(fOC);
		wB.close();

	}

}
