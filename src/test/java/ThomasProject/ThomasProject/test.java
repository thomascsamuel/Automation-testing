package ThomasProject.ThomasProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class test{
	
	public void driver() {

		try {
			System.setProperty("webdriver.chrome.driver", "/Users/thomassamuel/Documents/Drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String args[]) {
		test t= new test();
			t.driver();

	}
	
}