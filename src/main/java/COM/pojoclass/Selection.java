package COM.pojoclass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection {

public static WebDriver driver;

@FindBy(id="radiobutton_0")
private WebElement rbutton;

@FindBy(id="continue")
 
private WebElement cont;

public Selection(WebDriver driver2) { this.driver=driver2; PageFactory.initElements(driver, this);
}

public WebElement getRbutton() {
return rbutton;
}

public WebElement getCont() {
return cont;
}

}

