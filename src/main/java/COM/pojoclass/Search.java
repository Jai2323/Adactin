package COM.pojoclass;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 
public class Search {
public static WebDriver driver;

@FindBy(id="location") 
private WebElement loc;

@FindBy(id="hotels") 
private WebElement hotelsel;

@FindBy(id="room_type") 
private WebElement room;

@FindBy(id="room_nos") 
private WebElement num;

@FindBy(id="datepick_in") 
private WebElement indate;

@FindBy(id="datepick_out") 
private WebElement outdate;

@FindBy(id="adult_room") 
private WebElement adults;

@FindBy(id="child_room") 
private WebElement child;

@FindBy(id="Submit") 
private WebElement click;

public Search(WebDriver driver) { 
	this.driver=driver; PageFactory.initElements(driver, this);
 
}
public WebElement getLoc() { 
	return loc;
}

public WebElement getHotelsel() { 
	return hotelsel;
}

public WebElement getRoom() { 
	return room;
}

public WebElement getNum() { 
	return num;
}

public WebElement getIndate() { 
	return indate;
}

public WebElement getOutdate() { 
	return outdate;
}

public WebElement getAdults() { 
	return adults;
}

public WebElement getChild() { 
	return child;
}

public WebElement getClick() { 
	return click;
}
}

