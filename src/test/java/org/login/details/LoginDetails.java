package org.login.details;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDetails extends BaseClass {
	
	public LoginDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "username")
	private WebElement Username;
	
//	public WebElement getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	@FindBy(name= "password")
	private WebElement Password;
	
	@FindBy(id= "login")
	private WebElement Login;
	
	@FindBy(name= "location")
	private WebElement Location;
	
	@FindBy(id= "hotels")
	private WebElement Hotel;
	
	@FindBy(name= "room_type")
	private WebElement RoomType;

	@FindBy(id= "room_nos")
	private WebElement NoOfRooms;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement Checkin;
	
	@FindBy(xpath="(//input[@name='datepick_out'])")
	private WebElement Checkout;

	@FindBy(id= "adult_room")
	private WebElement Adults;

	@FindBy(name= "child_room")
	private WebElement Children;

	@FindBy(id= "Submit")
	private WebElement SearchBtn;
	
	@FindBy(xpath="(//input[@type='radio'])")
	private WebElement RadioBtn;

	@FindBy(name= "continue")
	private WebElement ContinueBtn;

	@FindBy(name= "first_name")
	private WebElement Fname;

	@FindBy(name= "last_name")
	private WebElement Lname;

	@FindBy(name= "address")
	private WebElement BillAddress;

	@FindBy(name= "cc_num")
	private WebElement CCnumber;

	@FindBy(name= "cc_type")
	private WebElement CCtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement ExpMonth;
	
	@FindBy(xpath="(//select[@name='cc_exp_year'])")
	private WebElement ExpYear;

	@FindBy(name= "cc_cvv")
	private WebElement cvv;

	@FindBy(name= "book_now")
	private WebElement BookBtn;

	@FindBy(name= "order_no")
	private WebElement OrderNo;

	// Using id
//	@FindBy(id= "username")
//	private WebElement username;
	
	//Using Name
//	@FindBy(name= "username")
//	private WebElement username;
	
	//Using xpath
//	@FindBy(xpath="username")
//	private WebElement username;
	
}
