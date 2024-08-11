package sofwarename;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver web = new ChromeDriver();
		web.get("https://learn-automation.com/");
		System.err.println("Added new enhancement");
	}

}
