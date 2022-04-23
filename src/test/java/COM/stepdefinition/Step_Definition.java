package COM.stepdefinition;

import org.openqa.selenium.WebDriver;
import COM.march_cucumber.BaseClass;
import COM.pojoclass.Adactin_Pom;
import COM.runnerfile.RunnerClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper_file.FileReaderManager;

public class Step_Definition extends BaseClass {
	public static WebDriver driver=RunnerClass.driver;  //Runner class driver is used here
	public static Adactin_Pom pom =new Adactin_Pom(driver);
	

	
	@Given("^user is launching the application$")
	public void user_is_launching_the_application() throws Throwable {
		getUrl(FileReaderManager.getInstance_FRM().getInstance_CR().getUrl());
	}

	@When("^user is enterting the \"([^\"]*)\" in username field$")
	public void user_is_enterting_the_in_username_field(String uname) throws Throwable {
		textInput(pom.getInstancelgin().getUser(),uname); 
	}

		

	@When("^user is entering the \"([^\"]*)\" in the password field$")
	public void user_is_entering_the_in_the_password_field(String pass) throws Throwable {
		textInput(pom.getInstancelgin().getPwd(),pass);
	}

	@Then("^user is click on login button$")
	public void user_is_click_on_login_button() throws Throwable {
		clickButton(pom.getInstancelgin().getLog());
	}

	@Given("^The user is directed to search hotel page$")
	public void the_user_is_directed_to_search_hotel_page() throws Throwable {
		
	}
	@When("^the user is selecting the location from the location dropdown menu$")
	public void the_user_is_selecting_the_location_from_the_location_dropdown_menu() throws Throwable {
	dropDown(pom.getInstancesrch().getLoc(),"VisibleText","Brisbane");
	}

	@And("^user is select the hotel$")
	public void user_is_select_the_hotel() throws Throwable {
		dropDown(pom.getInstancesrch().getHotelsel(),"VisibleText","Hotel Creek");
	}

	@And("^user is select the room type$")
	public void user_is_select_the_room_type() throws Throwable {
		dropDown(pom.getInstancesrch().getRoom(),"VisibleText","Super Deluxe");
	}

	@And("^user is select number of rooms$")
	public void user_is_select_number_of_rooms() throws Throwable {
		dropDown(pom.getInstancesrch().getNum(),"ByValue","2");
	}

	@And("^user is enter the check in date$")
	public void user_is_enter_the_check_in_date() throws Throwable {
		textInput(pom.getInstancesrch().getIndate(),"02/4/2022");
	}

	@And("^user is enter the chech out date$")
	public void user_is_enter_the_chech_out_date() throws Throwable {
		textInput(pom.getInstancesrch().getOutdate(),"02/4/2022");
	}

	@And("^user is select adults count$")
	public void user_is_select_adults_count() throws Throwable {
		dropDown(pom.getInstancesrch().getAdults(),"ByValue","1");
	}

	@And("^user is select children count$")
	public void user_is_select_children_count() throws Throwable {
		dropDown(pom.getInstancesrch().getChild(),"ByValue","1");
	}

	@Then("^user is click on search button$")
	public void user_is_click_on_search_button() throws Throwable {
		clickButton(pom.getInstancesrch().getClick());
	}

	@Given("^The user is directed to the select hotel page$")
	public void the_user_is_directed_to_the_select_hotel_page() throws Throwable {
		
}

	@When("^the user is clicking the radio button of select hotel$")
	public void the_user_is_clicking_the_radio_button_of_select_hotel() throws Throwable {

		clickButton(pom.getInstancesel().getRbutton());
	}

	@Then("^user is click on continue$")
	public void user_is_click_on_continue() throws Throwable {
		clickButton(pom.getInstancesel().getCont());
	}

	@Given("^the user is directed to the booking a hotel page$")
	public void the_user_is_directed_to_the_book_a_hotel_page() throws Throwable {
		
	}
	@When("^the user is entering the Firstname$")
	public void the_user_is_entering_the_Firstname_of_the_user_in_the_firstname_field() throws Throwable {

		textInput(pom.getInstancehb().getFname(),"JaiHarish");
	}

	@And("^user is enter the lastname$")
	public void user_is_enter_the_lastname() throws Throwable {
		textInput(pom.getInstancehb().getLname(),"Ramesh");
	}

	@And("^user is enter the billing address$")
	public void user_is_enter_the_billing_address() throws Throwable {
		textInput(pom.getInstancehb().getAddr(),"3M Bells Road, Brisbane");

	}

	@And("^user is enter the credit card num$")
	public void user_is_enter_the_credit_card_num() throws Throwable {
		textInput(pom.getInstancehb().getCcard(),"2589631478523698");
	}

	@And("^user is select the credit card type$")
	public void user_is_select_the_credit_card_type() throws Throwable {
		dropDown(pom.getInstancehb().getCard(),"VisibleText","VISA");
	}

	@And("^user is select the month$")
	public void user_is_select_the_month() throws Throwable {
		dropDown(pom.getInstancehb().getExpmon(),"VisibleText","May");
	   
	}

	@And("^user is select the year$")
	public void user_is_select_the_year() throws Throwable {
		dropDown(pom.getInstancehb().getExpyr(),"VisibleText","2025");
	}

	@And("^user is enter cvv number$")
	public void user_is_enter_cvv_number() throws Throwable {
		textInput(pom.getInstancehb().getCvv(),"202");
	}

	@Then("^user is click on booknow$")
	public void user_is_click_on_booknow() throws Throwable {
	    clickButton(pom.getInstancehb().getBook());
	}


	
	

}
