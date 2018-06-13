package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./jars/geckodriver.exe");
		FirefoxDriver d1=new FirefoxDriver();
d1.get("file:///C:/Users/Vivek/Desktop/PageSource.html");
d1.findElement(By.tagName("a")).click();
	}

}
