package COM.runnerfile;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import COM.march_cucumber.BaseClass;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Featurefile\\AdactinHotel.feature",
							glue="COM.stepdefinition",
							monochrome=true,
							dryRun=false,
							strict=true,
							plugin= {"html:Report/Cucumber_Report",
	"pretty",
	//"json:Report/Json_Report",
	//"com.cucumber.listener.ExtentCucumberFormatter:Report/extent_cucumber.html"
    }
	
						    )


public class RunnerClass {
public static WebDriver driver;   //null driver
@BeforeClass
	public static void setUp() {
		driver=BaseClass.getBrowser("Chrome");  //now null driver acting as Chrome driver
	}
	
@AfterClass
	public static void tearDown() {
		driver.close();
	}}
