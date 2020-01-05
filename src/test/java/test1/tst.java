package test1;
import org.testng.Assert;
import org.testng.annotations.Test;

import test.bassclass;
import test.obj;

public class tst {

	obj hp;
	bassclass bp;

	public tst() {
		hp = new obj();
		bp = new bassclass();
	}

	@Test
	public void verifycabs() {
		Assert.assertTrue(hp.getwomentitle().isDisplayed());
		Assert.assertTrue(hp.getdress().isDisplayed());
		Assert.assertTrue(hp.getshirts().isDisplayed());
	}
	@Test
	public void clickWomen(){
		hp.getwomentitle();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
	}
	@Test
	public void clickdress(){
		hp.getdress();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
	}
	@Test
	public void clickshirts(){
		hp.getshirts();
     Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
		
	}
	

}