package season3ofjava;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\hp\\Desktop\\selinium1//saik.properties");
		System.out.println(f.createNewFile());
		System.out.println("end");
		

	}

}
