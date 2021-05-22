package JavaProgramsAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //Chrome Driver Set-up//
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //Implicit Wait//
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Loading URL and Login Page//
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        //Landing Page//
        driver.findElementByLinkText("CRM/SFA").click();
        //Home Page > Click Contact
        driver.findElementByLinkText("Contacts").click();
        driver.findElementByLinkText("Create Contact").click();
        //Create Contact//
        driver.findElementById("firstNameField").sendKeys("Damodar");
        driver.findElementById("lastNameField").sendKeys("Baviri");
        driver.findElementById("createContactForm_firstNameLocal").sendKeys("Damodar");
        driver.findElementById("createContactForm_lastNameLocal").sendKeys("Rao");
        driver.findElementById("createContactForm_personalTitle").sendKeys("MR");
        driver.findElementById("createContactForm_birthDate").sendKeys("01/01/89");
        driver.findElementById("createContactForm_generalProfTitle").sendKeys("Mr");
        driver.findElementById("createContactForm_departmentName").sendKeys("DBT");
        driver.findElementById("createContactForm_description").sendKeys("SUMAN LIVES IN");
        driver.findElementById("createContactForm_importantNote").sendKeys("KOLKATA CITY");
        //Contact Information//
        driver.findElementById("createContactForm_primaryPhoneCountryCode").clear();
        driver.findElementById("createContactForm_primaryPhoneCountryCode").sendKeys("+91");
        driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("7358");
        driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("325459");
        driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("123");
        driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Damo");
        driver.findElementByXPath("//input[@id='createContactForm_primaryEmail']").sendKeys("baviri.damodar@gmail.com");
        //Primary Address//
        driver.findElementById("createContactForm_generalAttnName").sendKeys("Door 10");
        driver.findElementById("createContactForm_generalAddress1").sendKeys("Palavakkam");
        driver.findElementById("createContactForm_generalAddress2").sendKeys("VGP Layout");
        driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
        WebElement stateDropdown =driver.findElementById("createContactForm_generalStateProvinceGeoId");
        Select state = new Select(stateDropdown);
        state.selectByVisibleText("Arizona");
        driver.findElementById("createContactForm_generalPostalCode").sendKeys("12345");
        driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("12");
        driver.findElementByXPath("//input[@class='smallSubmit']").click();
        driver.findElementByLinkText("Edit").click();
        driver.findElementById("updateContactForm_description").clear();
        driver.findElementById("updateContactForm_importantNote").sendKeys("DamodarAddress information");
        driver.findElementByXPath("//input[@class='smallSubmit']").click();
        System.out.println(driver.getTitle());
        driver.close();
        driver.quit();
		
		
		
		
	}

}
