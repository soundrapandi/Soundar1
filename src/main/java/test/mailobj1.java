package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailobj1 extends bassclass {
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement verify;
	
	public mailobj1(){
	PageFactory.initElements(driver, this);
	}

	
	public WebElement getverify(){
		return verify;
		
	}
	
}
