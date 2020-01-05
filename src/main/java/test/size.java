package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class size extends bassclass {
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_1']/a")
	private WebElement sizeS;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_2']/a")
	private WebElement sizeM;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_3']/a")
	private WebElement sizeL;
	
	
	public size(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSsize(){
		return sizeS;
		
	}
	
	public WebElement getMsize(){
		return sizeM;
		
	}
 
	public WebElement getLsize(){
		return sizeL;
		
	}
	
	public void clickSsize(){
		sizeS.click();
		}
	
	public void clickMsize(){
		sizeM.click();
	}
	
	public void clickLsize(){
	     sizeL.click();
	}
	
	
	
}
