package COM.march_cucumber;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver; 
import helper_file.FileReaderManager;
import COM.pojoclass.Adactin_Pom;


public class Adactin_Mclass extends BaseClass {

public static WebDriver driver=BaseClass.getBrowser("chrome");
public static Adactin_Pom pom=new Adactin_Pom(driver);
public static void main(String[] args) throws IOException {


getUrl(FileReaderManager.getInstance_FRM().getInstance_CR().getUrl());

textInput(pom.getInstancelgin().getUser(),"Jaiharis2323"); 
textInput(pom.getInstancelgin().getPwd(),"ZE980J"); 
clickButton(pom.getInstancelgin().getLog());
dropDown(pom.getInstancesrch().getLoc(),"byvalue", "Paris");
dropDown(pom.getInstancesrch().getHotelsel(), "byvalue", "Hotel Sunshine");

dropDown(pom.getInstancesrch().getRoom(), "byvalue", "Double"); 
dropDown(pom.getInstancesrch().getNum(), "byvalue", "1"); 
clear(pom.getInstancesrch().getIndate()); textInput(pom.getInstancesrch().getIndate(), "21/03/2022"); 
clear(pom.getInstancesrch().getOutdate()); textInput(pom.getInstancesrch().getOutdate(), "22/03/2022"); 
dropDown(pom.getInstancesrch().getAdults(), "byvalue", "1");
dropDown(pom.getInstancesrch().getChild(), "byvalue", "0");
clickButton(pom.getInstancesrch().getClick());
clickButton(pom.getInstancesel().getRbutton()); clickButton(pom.getInstancesel().getCont());
textInput(pom.getInstancehb().getFname(), "Jay"); 
textInput(pom.getInstancehb().getLname(), "Haris"); 
textInput(pom.getInstancehb().getAddr(), "4/9 Bharathi Nagar,Vellore");
textInput(pom.getInstancehb().getCcard(), "5270910259874561");
dropDown(pom.getInstancehb().getCard(), "byvalue", "VISA");
dropDown(pom.getInstancehb().getExpmon(), "byvalue", "2");
dropDown(pom.getInstancehb().getExpyr(), "byvalue", "2022");
textInput(pom.getInstancehb().getCvv(), "123");
 clickButton(pom.getInstancehb().getBook());
clickButton(pom.getInstancelgout().getLout());

close();

}

}

