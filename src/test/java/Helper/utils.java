package Helper;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class utils {

	public static String getproperty(String property) throws Exception {
		InputStream input = new FileInputStream("src/test/resources/Propreties/propreties");
		Properties properties  = new Properties();
		properties.load(input);
		
		return(properties.getProperty(property));
	}
}
  