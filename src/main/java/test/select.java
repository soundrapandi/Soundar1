package test;

import java.awt.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chrome 79\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement a=driver.findElement(By.id("username"));
		a.sendKeys("qwe123321");
		WebElement b=driver.findElement(By.id("password"));
		b.sendKeys("admin123");
		WebElement c=driver.findElement(By.id("login"));
		c.click();
		WebElement d=driver.findElement(By.id("location"));
		Select sel=new Select(d);
		sel.selectByIndex(5);
		
		WebElement hj=driver.findElement(By.id("hotels"));
		Select sell=new Select(hj);
		sell.selectByIndex(2);
		
		WebElement dj=driver.findElement(By.id("room_type"));
		Select se=new Select(dj);
		se.selectByIndex(2);
		
		WebElement vv=driver.findElement(By.id("room_nos"));
		Select ff=new Select(vv);
		ff.selectByIndex(2);
		
		WebElement v=driver.findElement(By.id("room_type"));
		Select g=new Select(v);
		g.selectByIndex(2);
		
		WebElement y=driver.findElement(By.id("room_nos"));
		Select k=new Select(y);
		k.selectByIndex(3);
		
		driver.findElement(By.id("datepick_in")).sendKeys("10/12/2019");
		driver.findElement(By.id("datepick_out")).sendKeys("15/2/2020");
		
		WebElement z=driver.findElement(By.id("adult_room"));
		Select mm=new Select(z);
		mm.selectByIndex(2);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Raghu");
		driver.findElement(By.id("last_name")).sendKeys("Rajan");
		driver.findElement(By.id("address")).sendKeys("chennai tambaram");
		driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
		driver.findElement(By.id("cc_type")).sendKeys("1234567812345678");
		
		WebElement t=driver.findElement(By.id("cc_type"));
		Select aa=new Select(t);
		aa.selectByIndex(2);
		
		WebElement r=driver.findElement(By.id("cc_exp_month"));
		Select n=new Select(r);
		n.selectByIndex(1);
		
		WebElement q=driver.findElement(By.id("cc_exp_year"));
		Select u=new Select(q);
		u.selectByIndex(2);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("112");
		driver.findElement(By.id("book_now")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		String s=driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(s);
		
		WebElement cc=driver.findElement(By.id("my_itinerary"));
		cc.click();
		
		java.util.List<WebElement>row=driver.findElements(By.xpath("//table[@cellpadding='5']//tr"));
		for(WebElement e: row)
		{
			java.util.List<WebElement> data=e.findElements(By.xpath(".//td//input"));
			for(WebElement table:data){
			System.out.println(table.getAttribute("value"));

			WebElement aq=driver.findElement(By.xpath("//tr//td[@bgcolor='#FFFFFF']//input[@name='btn_id_321330']"));
			aq.click();
			
			WebElement qa=driver.findElement(By.xpath("//td[@align='center']//input[3])"));
					qa.click();
					Alert aaa=driver.switchTo().alert();
					aaa.accept();
			}
		
		}
		
	}
	}
		
		
