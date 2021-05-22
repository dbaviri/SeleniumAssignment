package Week2.Day2.Assignment;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContactLead {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        //System.out.println(System.getProperty("webdriver.chrome.driver"));//to check path of driver
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        WebElement user = driver.findElementByXPath("//input[@id='username']");
        user.sendKeys("DemoSalesManager");
        driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
        driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
        driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
        driver.findElementByXPath("//a[text()='Contacts']").click();
        driver.findElementByXPath("//a[text()='Create Contact']").click();
        driver.findElementByXPath("//input[@id='firstNameField']").sendKeys("Damo");
        driver.findElementByXPath("//input[@id='lastNameField']").sendKeys("Sunny");
        driver.findElementById("createContactForm_firstNameLocal").sendKeys("tune");
        driver.findElementById("createContactForm_lastNameLocal").sendKeys("Char");
        driver.findElementById("createContactForm_departmentName").sendKeys("SEPT");
        driver.findElementByXPath("//textarea[@id='createContactForm_description']").sendKeys("this is description box");
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@id='createContactForm_primaryEmail']").sendKeys("baviri.damodar@gmail.com");
        driver.findElementByClassName("smallSubmit").click();
        driver.findElementByLinkText("Edit").click();
        driver.findElementById("updateContactForm_description").clear();
        driver.findElementByXPath("//textarea[@id='updateContactForm_importantNote']").sendKeys("this is for important note");
        driver.findElementByXPath("//input[@class='smallSubmit']").click();
        System.out.println(driver.getTitle());
        
        driver.close();
	    
    }
    
}
