package test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chart extends bassclass {
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement sevenpro;
	
	@FindBy4321(xpath="//img[@itemprop='image']")	
	private List<WebElement> Dress;
	
	public chart() {
		PageFactory.initElements(driver, this);
	}

	public int count(){
		String value=sevenpro.getText();
		String[] r=value.split(" ");
		int t=Integer.parseInt(r[2]);
		return t;
	}
	public int dress(){
		return Dress.size();
		
		
	}
}
