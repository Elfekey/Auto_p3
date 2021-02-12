package Local_Project.Automation_Epic_Part_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class weather_module   {
	

public void Search_By_country(WebDriver driver ,String country) throws InterruptedException {
    WebDriverWait  wait = new WebDriverWait(driver, 10);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	driver.get("https://weather.com/?Goto=Redirected");
	driver.manage().window().maximize();
	
	///Go on
	WebElement search_bar = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/header/div/div[2]/div[1]/div/div[1]/input"));
	System.out.println("search detected");  
	System.out.println();  
	search_bar =wait.until(ExpectedConditions.elementToBeClickable((By.xpath("/html/body/div[1]/div[3]/div[1]/header/div/div[2]/div[1]/div/div[1]/input"))));
	search_bar.sendKeys(country);
	Thread.sleep(3000);
search_bar.sendKeys(Keys.RETURN);
	System.out.println("search done"); 
	

	
	//getting temps 
	//------------------------------------------------morning                            
	WebElement temp_morning = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[2]/main/div[2]/section/div/ul/li[1]/a/div[1]/span")));
	System.out.println("located  "); 
	//getting the temp
	
	String M_temp = temp_morning.getText().toString();
	System.out.println("----------------------------------------------------------"); 
	System.out.println(" The morning Temprature in "+ country+" is : "+M_temp); 
	System.out.println("----------------------------------------------------------"); 
	
	//--------------------------------------------------afternoon 
	WebElement temp_afternoon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[2]/main/div[2]/section/div/ul/li[2]/a/div[1]/span")));
    //	System.out.println("After located  "); 
	//getting the temp
	
	String A_temp = temp_afternoon.getText().toString();
	System.out.println("----------------------------------------------------------"); 
	System.out.println(" The afternoon Temprature in "+ country+" is : "+A_temp); 
	System.out.println("----------------------------------------------------------"); 

	//------------------------------------------------Evening 
	WebElement temp_Evening = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/div[2]/main/div[2]/section/div/ul/li[3]/a/div[1]/span")));
   //	System.out.println("Evening located"); 
   //getting the temp
	
	String E_temp = temp_Evening.getText().toString();
	System.out.println("----------------------------------------------------------"); 
	System.out.println(" The Evening Temprature in "+ country+" is : "+E_temp); 
	System.out.println("----------------------This Country Weather Done!------------------------------------"); 
     
}
}
