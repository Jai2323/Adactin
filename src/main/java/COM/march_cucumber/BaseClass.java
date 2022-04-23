package COM.march_cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver; //null driver
	
	//for ChromeBrowser
	public static WebDriver getBrowser(String browser ) {
		if(browser.equalsIgnoreCase("chrome"));
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 return driver;
	}
	
	
	//for click
	public static void clickButton(WebElement element) {
		element.click();
		
	}
	//for textInput
	public static void textInput(WebElement element, String Value) {
		element.sendKeys(Value);
		
	}
	//getting WebpageUrl
	public static void getUrl(String WebUrl) {
		driver.get(WebUrl);

	}
	
	//for close
	public static void close() {
		driver.close();
			}
	
	public static void clear(WebElement element) {
		element.clear();

	}
	
	//for Dropdown
	public static  void dropDown(WebElement element, String type, String value) {
	Select s = new Select(element);
	if(type.equalsIgnoreCase("Visible Text")) {
		s.selectByVisibleText(value);
	}

	else if (type.equalsIgnoreCase("ByValue")) {
		s.selectByValue(value);
	}
	else if(type.equalsIgnoreCase("ByIndex")) {
		
		int byIndex_Value= Integer.parseInt(value);
		s.selectByIndex(byIndex_Value);
	}
	}
		

}
