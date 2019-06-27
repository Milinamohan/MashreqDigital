package CommonMethodPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MasterClass {

protected WebDriver driver;
	
	public MasterClass(WebDriver driver){
	 this.driver=driver;	
	
	}
	
	public WebElement getElement(By by) {
		return new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	public boolean getElementPresent(By by) {
	 new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(by));
	return true;
		
	}
	
	public void selectFromDropdownByVisibleText(By by, String value) {
//		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(by));
		Select product = new Select(driver.findElement(by));
		product.selectByVisibleText(value);
	}
	
	public void selectFromDropdownByIndex(By by, int value) {
		//new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(by));
		Select product = new Select(driver.findElement(by));
		product.selectByIndex(value);
		
	}
	
	public void selectFromDropdownByValue(By by, String value) {
		new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(by));
		Select product = new Select(driver.findElement(by));
		product.selectByValue(value);
	}
}
