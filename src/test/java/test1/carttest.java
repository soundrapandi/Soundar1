package test1;

import org.testng.annotations.Test;

import test.bassclass;
import test.chart;
import test.obj;

public class carttest {
	
	obj hp;
	bassclass bp;
	chart ch;
 
	public carttest(){
		hp=new obj();
		bp=new bassclass();
		ch=new chart();
		
	}
	@Test
	public void verifycarttest(){
		hp.getwomentitle().click();
	System.out.println(ch.count());
	System.out.println(ch.dress());

	
	}
}
