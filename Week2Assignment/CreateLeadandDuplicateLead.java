package Week2.Day2.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadandDuplicateLead {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver ();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		driver.findElementById("username").sendKeys("DemoSalesManager");
	
		WebElement password = driver.findElementById("password");
			password.sendKeys("crmsfa");
			Thread.sleep(5000);
            //password.clear();
            
		driver.findElementByClassName("decorativeSubmit").click();
	  
		String Actual = driver.getTitle();
	  String Expected = "http://leaftaps.com/opentaps/control/main";
	  
	  if (Actual.equals(Expected)) {
		  System.out.println("Title Verificaiton Passed");
	  }
	  else {
		  System.out.println("Title Verification Failed");
		    }
	  
	  driver.findElementByLinkText("CRM/SFA").click();
	  driver.findElementByLinkText("Leads").click();
	  driver.findElementByLinkText("Create Lead").click();
	  
	  driver.findElementById("createLeadForm_companyName").sendKeys("BSOFT");
	 // driver.findElementById("createLeadForm_parentPartyId").sendKeys("BIRLASOFT Company");
	  driver.findElementById("createLeadForm_firstName").sendKeys("KUMAR");
	  driver.findElementById("createLeadForm_lastName").sendKeys("DAMODARAN");
	  
	    WebElement c0 = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown0 = new Select (c0);
		dropdown0.selectByIndex(4);
		
		
		WebElement cl = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown = new Select (cl);
		dropdown.selectByValue("DEMO_MKTG_CAMP");
		   
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Damodar");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Baviri");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
		driver.findElementById("createLeadForm_birthDate").sendKeys("05/19/21");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test Lead");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Test Engineer");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000");
		
		WebElement c3 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown2 = new Select (c3);
		dropdown2.selectByVisibleText("INR - Indian Rupee");
		
		WebElement c2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown1 = new Select (c2);
		dropdown1.selectByVisibleText("Computer Software");
	  		
	  driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
	  
	  WebElement onwer = driver.findElementById("createLeadForm_ownershipEnumId");
	  Select dropdown3 = new Select (onwer);
	  dropdown3.selectByValue("OWN_SCORP");
	  
	  driver.findElementById("createLeadForm_sicCode").sendKeys("SBA");
	  driver.findElementById("createLeadForm_tickerSymbol").sendKeys("MR");
	  
	  driver.findElementById("createLeadForm_description").sendKeys("Data of Damodar");
	  driver.findElementById("createLeadForm_importantNote").sendKeys("Citizen of Chennai");
	  
	  driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("91");
	  driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("040");
	  driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("67425311");
	  driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("07");
	  driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Damodar");
	  driver.findElementById("createLeadForm_primaryEmail").sendKeys("baviri.damodar@gmail.com");
	  
	  driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm");
	  
	  driver.findElementById("createLeadForm_generalToName").sendKeys("BAVIRI");
	  driver.findElementById("createLeadForm_generalAttnName").sendKeys("Mr. Damodar");
	  driver.findElementById("createLeadForm_generalAddress1").sendKeys("Plot NO 100A ,VGP LAYOUT , PALAVAKKAM");
	  driver.findElementById("createLeadForm_generalAddress2").sendKeys("         ");
	  driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
	  
	  driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600041");
	  
	  WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
	  Select dropdown6 = new Select (Country);
	  dropdown6.selectByVisibleText("India");
	  Thread.sleep(2000);	
	  
	  WebElement Province = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
	  Select dropdown5 = new Select (Province);
	  dropdown5.selectByVisibleText("ANDHRA PRADESH");
	       
     driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("532001");
	  
	  driver.findElementByClassName("smallSubmit").click();  
	  
	  driver.findElementByLinkText("Duplicate Lead").click();
	  
	  driver.findElementById("createLeadForm_companyName").clear();
	  
	  driver.findElementById("createLeadForm_companyName").sendKeys("FreshWorks");
	 
	  driver.findElementByClassName("smallSubmit").click(); 
	  
	  WebElement compName = driver.findElementById("createLeadForm_companyName");
	        compName.getText();
	        
	    driver.close();
	    
	  }
		  
	
	
	
}
