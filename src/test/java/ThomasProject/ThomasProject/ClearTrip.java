package ThomasProject.ThomasProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClearTrip {
	WebDriver driver;

	@BeforeClass
	public void browser() {

		System.setProperty("webdriver.chrome.driver", "/Users/thomassamuel/Documents/Drivers/chromedriver 4");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void launchClearTrip() {
		try {
			driver.manage().window().maximize();
			driver.get("https://www.cleartrip.com/");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 2)
	public void searchHotel() {
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@title='Find hotels in destinations around the world']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@title='Where do you want to go']")));
			driver.findElement(By.xpath("//input[@title='Where do you want to go']")).click();
			driver.findElement(By.xpath("//input[@title='Where do you want to go']")).sendKeys("ITC Grand Chola");


			driver.findElement(By.xpath("//li[@class='list'][1]")).click();
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//div[@class='monthBlock first']/table/tbody/tr[4]/td[@data-handler='selectDay'][1]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//div[@class='monthBlock first']/table/tbody/tr[4]/td/following::td[@data-handler='selectDay'][1]"))
					.click();
			driver.findElement(By.id("SearchHotelsButton")).click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
