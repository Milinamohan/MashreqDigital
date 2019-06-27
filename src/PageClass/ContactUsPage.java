package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import CommonMethodPages.MasterClass;

public class ContactUsPage extends MasterClass {
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	By reachOutProduct		=	By.xpath("//form//div//select[contains(@id,'reachoutforproduct')]");
	By compInqServ			=	By.xpath("//form//div//select[contains(@id,'compInqServ')]");
	By need					=	By.xpath("//form//div//select[contains(@id,'need')]");
	By product				=	By.xpath("//form//div//select[(@id='product')]");
	By emirate				=	By.xpath("//form//div//select[contains(@id,'emirate')]");
	By branch				=	By.xpath("//form//div//select[contains(@id,'branch')]");
	By prefLang				=	By.xpath("//form//div//select[contains(@id,'prefLang')]");
	By curStatus			=	By.xpath("//form//div//select[contains(@id,'curStatus')]");
	By firstName			=	By.xpath("//form//div//input[contains(@id,'firstName')]");
	By lastName				=	By.xpath("//form//div//input[contains(@id,'lastName')]");
	By email				=	By.xpath("//form//div//input[contains(@id,'email')]");
	By mobileCode			=	By.xpath("//form//div//select[contains(@id,'mob1')]");
	By mobile				=	By.xpath("//form//div//input[contains(@id,'mobile')]");
	By submitButton			=	By.xpath("//form//div//button[contains(@id,'btnSubmit')]");
	By errorMsg				=	By.xpath("//form//div//span[contains(text(),'Mobile number should be 7 digit')]");
	
	public void selectReachOutProduct() throws Exception {
		getElement(reachOutProduct).click();
		Thread.sleep(1000);
		selectFromDropdownByIndex(reachOutProduct,1);
	}
	
	public void selectcompInqServ() {
		getElement(compInqServ).click();
		selectFromDropdownByIndex(compInqServ,1);
	}
	
	public void selectTheProduct() throws InterruptedException {
		getElement(need).click();
		Thread.sleep(1000);
		selectFromDropdownByIndex(need,1);
	}
	
	public void selSubProduct() {
		getElement(product).click();
	}
	
	public void selectSubProduct() throws Exception {
		getElement(product).click();
		Thread.sleep(1000);
		selectFromDropdownByIndex(product,3);
	}
	
	public void selectEmirate() {
		getElement(emirate).click();
		selectFromDropdownByIndex(emirate,1);
	}
	
	public void selectBranch() {
		getElement(branch).click();
		selectFromDropdownByIndex(branch,1);
	}
	
	public void selectPrefLang() {
		getElement(prefLang).click();
		selectFromDropdownByIndex(prefLang,1);
	}
	
	public void selectCurStatus() {
		getElement(curStatus).click();
		selectFromDropdownByIndex(curStatus,1);
	}
	
	public void getInputFirstName() {
		getElement(firstName).sendKeys("Axcv");
	}
	
	public void getInputLastName() {
		getElement(lastName).sendKeys("Axcv");
	}
	
	public void getInputEmailId() {
		getElement(email).sendKeys("Axcv@gmail.com");
	}
	
	public void selectMobCode() {
		getElement(mobileCode).click();
		selectFromDropdownByIndex(mobileCode,1);
	}
	
	public void selectMobileNumer() {
		getElement(mobile).sendKeys("09878");
		String Msg=getElement(errorMsg).getText();
		System.out.println(Msg);
		getElement(mobile).clear();
		getElement(mobile).sendKeys("0987834");
		
	}
	
	public void selectSubmitButton() throws Exception {
		Thread.sleep(1000);
		getElement(submitButton).click();
		
	}
	

}
