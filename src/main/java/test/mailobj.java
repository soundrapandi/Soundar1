package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailobj extends bassclass {

	@FindBy(id="newsletter-input")
	private WebElement email;
	
	@FindBy(name="submitNewsletter")
	private WebElement bclick;
	
	
	public mailobj(){
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getemail(){
		email.sendKeys("shdfvd@gmail.com");
		return email;
		}
	
	public WebElement clickbtn(){
		bclick.click();
		return bclick;
		}
	
}




