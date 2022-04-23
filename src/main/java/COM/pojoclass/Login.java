package COM.pojoclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="username")
	private WebElement user;
	

	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(id="login")
	private WebElement log;
	
	public static WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLog() {
		return log;
	}

	public WebElement getUser() {
		return user;
	}
	 
	public WebElement getPwd() {
		return pwd;
	}

	

}
