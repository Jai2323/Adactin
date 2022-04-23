package helper_file;

import java.io.File;
import java.io.FileInputStream; import java.io.IOException; import java.util.Properties;

public class ConfigurationReader {

public static Properties p;
public ConfigurationReader() throws IOException { 
	File f=new File("C:\\Users\\JaiHarish Ramesh\\eclipse-workspace\\march_cucumbers\\src\\main\\java\\helper_file\\Configuration.properties");
FileInputStream fis=new FileInputStream(f);
 p=new Properties();
p.load(fis);
}

public String getUrl() {
String url_auto = p.getProperty("url");
return url_auto;

}
}
