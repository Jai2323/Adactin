package helper_file; 
import java.io.IOException; 
public class FileReaderManager {
public FileReaderManager() {

}

public static FileReaderManager getInstance_FRM() 
{ 
	FileReaderManager helper=new FileReaderManager(); 
	return helper;

}

public ConfigurationReader getInstance_CR() throws IOException { 
	ConfigurationReader reader=new ConfigurationReader(); 
	return reader;
}

}

