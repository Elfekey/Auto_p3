package Local_Project.Automation_Epic_Part_3;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Test_Case_1 {
	
WebDriver driver;
String WebDriver;
String WebSite;
	@Test
	public void test_1() throws InterruptedException {

		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			final DocumentBuilder builder = factory.newDocumentBuilder();
			try {
				final Document document= builder.parse(new File("Data.xml"));
				document.getDocumentElement().normalize();
				Element root = document.getDocumentElement();
				
				//Test Data
				WebDriver= root.getElementsByTagName("web_directory").item(0).getTextContent();
				WebSite= root.getElementsByTagName("WebSite").item(0).getTextContent();

				  
			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} catch (ParserConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.setProperty("webdriver.chrome.driver", WebDriver);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--lang=en-GB");
		driver = new ChromeDriver(options);
		
         Module m = new Module();
         m.ModTest(driver, WebSite);
         
	}	
}