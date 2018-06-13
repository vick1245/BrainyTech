package new_task;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./jars/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver d1=new FirefoxDriver();
		d1.get("http://localhost/login.do;jsessionid=2h0b3aoax8nnj");
	}

}
