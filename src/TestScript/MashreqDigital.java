package TestScript;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CommonMethodPages.BaseTest;
import CommonMethodPages.MasterClass;
import PageClass.ContactUsPage;
import PageClass.HomePage;

public class MashreqDigital extends BaseTest {
	@BeforeMethod
	public void initilazation() {
		masterclass	=	new MasterClass(driver);
		homepage	=	new HomePage(driver);	
		contactpage	=	new ContactUsPage(driver);
	}
	
	 @Test
	  public void launchApplication() {
		 driver.get("https://www.mashreqbank.com/uae/en/personal/home");
	  }
	 
	 @Test(dependsOnMethods = {"launchApplication"})
	  public void verifyTheHeader() throws Exception{
		homepage.validateHeader();
		Thread.sleep(2000);
		 Assert.assertTrue(homepage.verifyTheNewsHeaderIsPresent(),"Mashreq News");
		 homepage.clickOnNewsLink();
		 homepage.clickOnContactUsLink();
	  }
	 
	 @Test(dependsOnMethods = {"verifyTheHeader"})
	  public void verifyContactPage() throws Exception{
		homepage.clickOnContactUsLink();
		contactpage.selectSubmitButton();
		contactpage.selectReachOutProduct();
		contactpage.selectcompInqServ();
		contactpage.selSubProduct();
		contactpage.selectTheProduct();
		contactpage.selectSubProduct();
		contactpage.selectEmirate();
		contactpage.selectBranch();
		contactpage.selectPrefLang();
		contactpage.selectCurStatus();
		contactpage.getInputFirstName();
		contactpage.getInputLastName();
		contactpage.getInputEmailId();
		contactpage.selectMobCode();
		Thread.sleep(2000);
		contactpage.selectMobileNumer();
		
		
	  }

}
