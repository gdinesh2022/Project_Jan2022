package org.hotel.test.AdactinHotel;

import org.baseclass.BaseClass;
import org.login.details.LoginDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel extends BaseClass {
	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		implicitWait(20);
		urlLaunch("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("Dineshkumarg");
		
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("70FA61");
		
		WebElement LoginBtn = driver.findElement(By.id("login"));
		LoginBtn.click();
		
		WebElement Location = driver.findElement(By.name("location"));
		Select s1=new Select(Location);
		s1.selectByIndex(6);
		
		WebElement Hotels = driver.findElement(By.id("hotels"));
		Select s2=new Select(Hotels);
		s2.selectByValue("Hotel Creek");
		
		WebElement RoomType = driver.findElement(By.name("room_type"));
		Select s3=new Select(RoomType);
		s3.selectByIndex(1);
		
		WebElement NoOfRooms = driver.findElement(By.id("room_nos"));
		Select s4=new Select(NoOfRooms);
		s4.selectByValue("1");
		
		WebElement Checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Checkin.clear();
		Checkin.sendKeys("09/01/2022");
		
		WebElement Checkout = driver.findElement(By.xpath("(//input[@name='datepick_out'])"));
		Checkout.clear();
		Checkout.sendKeys("10/01/2022");
		
		WebElement Adults = driver.findElement(By.id("adult_room"));
		Select s5=new Select(Adults);
		s5.selectByIndex(2);
		
		WebElement Children = driver.findElement(By.name("child_room"));
		Select s6=new Select(Children);
		s6.selectByIndex(2);
		
		WebElement SearchBtn = driver.findElement(By.id("Submit"));
		SearchBtn.click();
		
		WebElement RadioBtn = driver.findElement(By.xpath("(//input[@type='radio'])"));
		RadioBtn.click();
		
		WebElement ContinueBtn = driver.findElement(By.name("continue"));
		ContinueBtn.click();
		
		WebElement Fname = driver.findElement(By.name("first_name"));
		Fname.sendKeys("Dinesh");
		
		WebElement Lname = driver.findElement(By.name("last_name"));
		Lname.sendKeys("Kumar");
		
		WebElement BillAddress = driver.findElement(By.name("address"));
		BillAddress.sendKeys("Tambaram, Chennai");
		
		WebElement CCnumber = driver.findElement(By.name("cc_num"));
		CCnumber.sendKeys("1234 5678 8765 4321");
		
		WebElement CCtype = driver.findElement(By.name("cc_type"));
		Select s7=new Select(CCtype);
		s7.selectByIndex(1);
		
//		WebElement ExpMonth = driver.findElement(By.name("cc_exp_month"));
//		Select s8=new Select(ExpMonth);
//		s8.selectByIndex(2);
		
//		WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
//		Select s8=new Select(ExpMonth);
//		s8.selectByValue("7");
		
		WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8=new Select(ExpMonth);
		s8.selectByVisibleText("August");
		
		WebElement ExpYear = driver.findElement(By.xpath("(//select[@name='cc_exp_year'])"));
		Select s9=new Select(ExpYear);
		s9.selectByIndex(11);
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("111");
		
		WebElement BookBtn = driver.findElement(By.name("book_now"));
		BookBtn.click();
		
		WebElement OrderNo = driver.findElement(By.name("order_no"));
		String ID = OrderNo.getAttribute("value");
		System.out.println(ID);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
