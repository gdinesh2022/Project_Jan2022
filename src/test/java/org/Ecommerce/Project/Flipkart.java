package org.Ecommerce.Project;

import java.util.Collection;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.sourceforge.htmlunit.corejs.javascript.ast.ForLoop;

public class Flipkart extends BaseClass {
	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		implicitWait(20);
		urlLaunch("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement CloseBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		CloseBtn.click();
		
//		WebElement SearchBox = driver.findElement(By.name("q"));
//		SearchBox.sendKeys("iphone");
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
//		WebElement ClickkSearch = driver.findElement(By.className("L0Z3Pu"));
//		ClickkSearch.click();
		
		driver.findElement(By.className("L0Z3Pu")).click();		
		
		List<WebElement> ItemName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		WebElement IN;
		System.out.println("Product Name List:");
		System.out.println("===================");
		for(int i=0; i<ItemName.size(); i++) {
			IN = ItemName.get(i);
			System.out.println(IN.getText());
		}
		
		List<WebElement> ItemPrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		WebElement IP;
		System.out.println(" ");
		System.out.println("Product Price List:");
		System.out.println("===================");
		for(int j=0; j<ItemPrice.size(); j++) {
			IP = ItemPrice.get(j);
			System.out.println(IP.getText());
		}
		
		String s="₹27,999";
		String rp="";
		
		if(s.contains("₹")) {
			rp=s.replace("₹", "");
		}
		System.out.println(rp);
		
		if(rp.contains(",")) {
			rp=rp.replace(",", "");
		}
		System.out.println(rp);
		
		
		
		
		
		
		
		
		}
	}


