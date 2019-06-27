package CommonMethodPages;

import PageClass.ContactUsPage;
import PageClass.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	protected MasterClass masterclass;
	protected HomePage homepage;
	protected ContactUsPage contactpage;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\ResourceFiles\\chromedriver.exe");
	  driver	= new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
