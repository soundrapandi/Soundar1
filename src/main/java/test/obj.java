package test;


	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.FindBys;
	import org.openqa.selenium.support.PageFactory;

	public class obj extends bassclass {

		@FindBy(xpath = "//li/a[@title='Women']")
		private WebElement womentitle;

		@FindBy(xpath = "(//li/a[@title='Dresses'])[2]")
		private WebElement dresstitle;

		@FindBy(xpath = "(//li//a[@title='T-shirts'])[2]")
		private WebElement tshirts;

		

		public obj() {
			PageFactory.initElements(driver, this);
		}

		public WebElement getwomentitle() {
			womentitle.click();
			return womentitle;
		}
		public WebElement getdress() {
			dresstitle.click();
			return dresstitle;
		}
		public WebElement getshirts() {
			tshirts.click();
			return tshirts;
		}
		


	}