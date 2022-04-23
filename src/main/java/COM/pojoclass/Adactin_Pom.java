package COM.pojoclass;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory; 
	
	public class Adactin_Pom {
	public static WebDriver driver;

	private Login lgin;
	private Search srch;
	private Selection sel;
	private Booking hb; 
	private Logout lgout;

	public Adactin_Pom(WebDriver driver2) { 
		this.driver=driver2; PageFactory.initElements(driver, this);
	}
	public Login getInstancelgin() { 
		lgin=new Login(driver); 
		return lgin;
	}

	public Search getInstancesrch() { 
		srch=new Search(driver); 
		return srch;

	}

	public Selection getInstancesel() { 
		sel=new Selection(driver); 
		return sel;
	}

	public Booking getInstancehb() { 
		hb=new Booking(driver); 
		return hb;
	}
	 
	public Logout getInstancelgout() { 
		lgout=new Logout(driver); 
		return lgout;
	}


	}
