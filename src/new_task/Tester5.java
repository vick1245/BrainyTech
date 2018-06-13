package new_task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tester5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value="./jars/geckodriver.exe";
		System.setProperty(key, value);
		WebDriver d1=new FirefoxDriver();
		// enter url
		d1.get("http://localhost/login.do;jsessionid=2h0b3aoax8nnj");
		//get current page url
		String url = d1.getCurrentUrl();
		System.out.println("URL"+url);
		//get title of current page
		String title = d1.getTitle();
		System.out.println("Title"+title);
		//get source code of current page
		String src = d1.getPageSource();
		System.out.println("src: \n"+src);
}
}
