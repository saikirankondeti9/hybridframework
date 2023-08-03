package season3ofjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fIS=new FileInputStream("configure.properties");
		Properties pRO=new Properties();
		pRO.load(fIS);
System.out.println(pRO.getProperty("url"));
System.out.println(pRO.getProperty("100"));
System.out.println(pRO.getProperty("browser"));

	}

}
