/**
 * 
 */
package new_task;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 Write a selenuium script to lanuch Firefox browser
 */
public class Login {

	/**
	 * @param args
	 * 
	 * 
	 */
	static
	{
		String key="webdriver.chrome.driver";
		String value="./jars/chromedriver.exe";
		System.setProperty(key, value);
	}
	static
	{
		String key="webdriver.gecko.driver";
		String value="./jars/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		FirefoxDriver d1=new FirefoxDriver();
		ChromeDriver d=new ChromeDriver();
	*/	
		

	}

}
