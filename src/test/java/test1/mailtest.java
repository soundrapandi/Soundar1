package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

import test.bassclass;
import test.mailobj;
import test.mailobj1;

public class mailtest {


	
	mmailobj mo112233;
	bassclass bp;
	mailobj1 mo1;
	
	public mailtest(){
		
		mo=new mailobj();
		bp=new bassclass();
		mo1=new mailobj1();
		}
	@Test
	public void verifyemail(){
		mo.getemail();
		mo.clickbtn();
		Assert.assertTrue(mo1.getverify().getText().contains("You have successfully subscribed to this newsletter"));
	}


}
