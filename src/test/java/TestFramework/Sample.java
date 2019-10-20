package TestFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class Sample {
@Test
	public void open(){
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\10518\\Downloads\\chromedriver_win32\\chromedriver.exe");  
     
     // Instantiate a ChromeDriver class.     
WebDriver driver=new ChromeDriver();  
  
   // Launch Website  
driver.navigate().to("http://www.javatpoint.com/");  
  
 //Maximize the browser  
  driver.manage().window().maximize();  
  

  
   

}
}