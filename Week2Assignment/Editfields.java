package JavaProgramsAssignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editfields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
        
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElementById("email").sendKeys("baviri.damodar@gmail.com");
	    driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys(Keys.HOME + "Test" + Keys.TAB);
        
	    String enteredtext = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input").getAttribute("value");
	     System.out.println(enteredtext);
	     
	    driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
	    
	    boolean check = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled();
	     if (check == false) {
	    	 System.out.println("The edit field is disabled");
	     }
	     else
	     {
	    	 System.out.println("The edit field is enabled");
		} 
	             		 
	     //driver.close();		
		
	}

}
