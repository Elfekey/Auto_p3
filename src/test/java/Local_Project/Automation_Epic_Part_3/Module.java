package Local_Project.Automation_Epic_Part_3;

import org.openqa.selenium.WebDriver;

public class Module {
	public void ModTest (WebDriver driver,String WebSite) throws InterruptedException {
		driver.get(WebSite);
		driver.manage().window().maximize();
		String Url = driver.getCurrentUrl().toString();
		System.out.println(Url);
		driver.navigate().refresh();
		Thread.sleep(5000);
        driver.quit();
	}

}
