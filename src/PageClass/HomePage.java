package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import CommonMethodPages.MasterClass;

public class HomePage extends MasterClass {
	
		
	public HomePage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	By corporateLink		=	By.linkText("Corporate");
	By businessLink			=	By.linkText("Business");
	By internationalLink	=	By.linkText("International");
	By privateBankingLink	=	By.linkText("Private Banking");
	By alIslamiLink			=	By.linkText("Al Islami");
	By goldLink				=	By.linkText("Gold");
	By mashreqSecuritiesLink=	By.linkText("Mashreq Securities");
	By mashreqCapitalLink	=	By.linkText("Mashreq Capital");
	By marsheqGlobalServiceLink	=	By.linkText("Mashreq Global Services");
	By maesheqNews			=	By.xpath("//div[contains(@class,'newsBox')]/h3[contains(text(),'Mashreq News')]");
	By newsRightArrow		=	By.xpath("//div//a[contains(@class,'right carousel-control')]");
	By contactUsLink		=	By.linkText("Call +9714 424 4444 Lost your card? Enquiries?");
	
	
	
	public void validateHeader() {
		Actions action = new Actions(driver);
		WebElement cor	=	getElement(corporateLink);
		action.moveToElement(cor).build().perform();
		WebElement bus	=	getElement(businessLink);
		action.moveToElement(bus).build().perform();
		WebElement inte	=	getElement(internationalLink);
		action.moveToElement(inte).build().perform();
		WebElement pri	=	getElement(privateBankingLink);
		action.moveToElement(pri).build().perform();
		WebElement alis	=	getElement(alIslamiLink);
		action.moveToElement(alis).build().perform();
		WebElement gold	=	getElement(goldLink);
		action.moveToElement(gold).build().perform();
		WebElement sec	=	getElement(mashreqSecuritiesLink);
		action.moveToElement(sec).build().perform();
		WebElement capt	=	getElement(mashreqCapitalLink);
		action.moveToElement(capt).build().perform();
		WebElement serv	=	getElement(marsheqGlobalServiceLink);
		action.moveToElement(serv).build().perform();	
	}
	
	public boolean verifyTheNewsHeaderIsPresent() {
		return getElementPresent(maesheqNews);
	}
	
	public void clickOnNewsLink() {
		getElement(newsRightArrow).click();
	}
		
	public void clickOnContactUsLink() {
		getElement(contactUsLink).click();
	}
	
}
