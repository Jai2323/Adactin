package COM.pojoclass;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver; 
	import org.openqa.selenium.WebElement; 
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Booking {
	public static WebDriver driver;

	@FindBy(id="first_name")
	private WebElement fname;

	@FindBy(id="last_name")
	private WebElement lname;

	@FindBy(id="address")
	private WebElement addr;

	@FindBy(id="cc_num")
	private WebElement ccard;

	@FindBy(id="cc_type")
	private WebElement card;

	@FindBy(id="cc_exp_month")
	private WebElement expmon;

	@FindBy(id="cc_exp_year")
	private WebElement expyr;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement book;

	public Booking(WebDriver driver2) {
	 
	this.driver=driver2; PageFactory.initElements(driver2, this);
	}

	public WebElement getFname() {
	return fname;
	}

	public WebElement getLname() {
	return lname;
	}

	public WebElement getAddr() {
	return addr;
	}

	public WebElement getCcard() {
	return ccard;
	}

	public WebElement getCard() {
	return card;
	}

	public WebElement getExpmon() {
	return expmon;
	}

	public WebElement getExpyr() {
	return expyr;
	}

	public WebElement getCvv() {
	return cvv;
	}

	public WebElement getBook() {
	return book;
	}
	}

