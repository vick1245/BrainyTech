package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./jars/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();		
		WebElement ele= driver.findElement(By.id("identifierId"));
		ele.sendKeys("tchoice06@gmail.com");
		WebElement ele1=driver.findElement(By.xpath("//div[@id='identifierNext']"));
		ele1.click();
		WebElement ele2=driver.findElement(By.name("password"));
		ele2.sendKeys("parser@1");
		
	}

}
