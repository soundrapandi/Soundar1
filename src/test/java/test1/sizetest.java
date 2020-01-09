package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.bassclass;
import test.obj;
import test.size;

public class sizetest {
	
	obj hp;
	bassclass bp;
    size sp;
    
    
    public sizetest321(){
    	hp=new obj();
    	bp=new bassclass();
    	sp=new size();
    }
    @Test
    public void verifysize(){
    	hp.getwomentitle();
    	Assert.assertTrue(sp.getSsize().isDisplayed());
    	Assert.assertTrue(sp.getMsize().isDisplayed());
    	Assert.assertTrue(sp.getLsize().isDisplayed());
    }
    //@Test
    //public void clicksizeS(){
    	//sp.clickSsize();
    	//Assert.assertTrue(sp.getTitlte().contains("Women"));
    //}
    //public void clicksizeM(){
    	//sp.clickMsize();
    	//Assert.assertTrue(sp.getTitlte().contains("Women"));
    //}
    //public void clicksizeL(){
    	//sp.clickLsize();
    	//Assert.assertTrue(sp.getTitlte().contains("Women"));
    //}
    
}