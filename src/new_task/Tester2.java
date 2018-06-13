package new_task;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./jars/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver d=new ChromeDriver();
		d.close();
		d.quit();

	}

}
