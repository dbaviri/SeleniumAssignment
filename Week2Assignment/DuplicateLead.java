package Week2.Day2.Assignment;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	// TODO Auto-generated method stub

		public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps/control/main");
	        driver.manage().window().maximize();
	        WebElement user = driver.findElementByXPath("//input[@id='username']");
	        user.sendKeys("DemoSalesManager");
	        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
	        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
	        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
	        driver.findElementByLinkText("Leads").click();
	        driver.findElementByLinkText("Find Leads").click();
	        driver.findElementByLinkText("Email").click();
	        driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("baviri.damodar@gmail.com");
	        Thread.sleep(2000);
	        		
	        driver.findElementByXPath("//td[@class='x-btn-center']/em/button[text()='Find Leads']").click();
	        Thread.sleep(3000);
	        String companyName =  driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a)[1]").getText();
	        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-companyName']/a)[1]").click();
	        driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
	        Assert.assertEquals("Duplicate Lead | opentaps CRM", driver.getTitle());
	        driver.findElementByXPath("//input[@value='Create Lead']").click();
	        String duplicateCompanyName =  driver.findElementById("viewLead_companyName_sp").getText();
	        String filteredDupCompName = duplicateCompanyName.replaceAll("[0-9()]","").trim();
	        Assert.assertEquals(companyName,filteredDupCompName);
	        driver.close();
	        driver.quit();

	}

}
