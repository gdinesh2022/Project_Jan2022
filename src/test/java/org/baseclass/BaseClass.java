package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		} else if(browserName.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		} else if(browserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		}
		return driver;		
	}
	
	public static WebDriver launchBrowser2(String browserName2) {
		switch (browserName2) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
		    WebDriverManager.edgedriver().setup();
		    driver=new EdgeDriver();
		    break;

		default:
			break;
		}
		return driver;
	}
	
	public static WebDriver chromeBrowser() {		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;		
	}
	
	public static WebDriver firefox() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);		
	}
	
	public static void implicitWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void sendKeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void click1(WebElement e) {
		e.click();
	}
	
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target);
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	public static void selectById(WebElement e, int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	
	public static WebElement findElement(String locatorName, String loc) {
		WebElement e=null;
		if(locatorName.equalsIgnoreCase("id")) {
		    e=driver.findElement(By.id(loc));
		} else if(locatorName.equalsIgnoreCase("name")) {
			e=driver.findElement(By.name(loc));
		} else if(locatorName.equalsIgnoreCase("xpath")) {
			e=driver.findElement(By.xpath(loc));
		}
		return e;
		}

}
