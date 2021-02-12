package Local_Project.Automation_Epic_Part_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class weather2 {
// globals to use it in the weather_module inheretance
	WebDriver driver;
     String country;
	@BeforeClass
		public void Before_claas() {
			System.setProperty("webdriver.chrome.driver", "D:\\Testing\\programs\\chromedriver_win32\\\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--lang=en-GB");
			driver = new ChromeDriver(options);
			System.out.println("This before class starts");
		}
	
	
	
	@Test
	public void Weather_test() throws InterruptedException {
   	//Starting from module !! 
     weather_module modul = new weather_module();
     country = "Egypt,Cairo";
     System.out.println(country+" Weather is ");
     modul.Search_By_country(driver,country);
    //second country
     driver.navigate().back();
     country = "England, AR";
     System.out.println(country+" Weather is ");
     modul.Search_By_country(driver,country);
     //Third country
     driver.navigate().back();
     country = "China Grove, NC";
     System.out.println(country+" Weather is ");
     modul.Search_By_country(driver,country);
	
	
		
	}
	@AfterClass
	public void After_claas() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("This After class ");
		driver.quit();
	}

}
