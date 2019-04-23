package com.app.test;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.Basepage;
import com.app.pages.CartPageObjects;
import com.app.pages.DressPageObjects;
import com.app.pages.HomePageObjects;


public class DressPageTest {
	HomePageObjects hpo;
	Basepage bp;
	DressPageObjects dpo;
	
	public DressPageTest(){
   	     bp = new Basepage();
	     hpo = new HomePageObjects();
	     dpo = new DressPageObjects();
	   
	      }
 @Test
	public  void verigysizedresscheckbox()
	{
		hpo.getdresstab().click();
		System.out.println(dpo.getsmallcheckbox().isDisplayed());
		Assert.assertTrue(dpo.getsmallcheckboxtext().getText().contains("S "));
		Assert.assertTrue(dpo.getsmediumcheckboxtext().getText().contains("M "));
		Assert.assertTrue(dpo.getlargeboxtext().getText().contains("L "));
		
	}
	@Test
	public  void verigydresscount()
	{
		hpo.getdresstab().click();
		String str1= "There are ";
		String str2= " products.";
		String str3= str1+dpo.getDressPagecountbycounting()+str2;
		System.out.println(str3);
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	  	dpo.getcasualdressoption().click();
	  	str1= "There is ";
	    str2= " product.";
	    str3=str1+dpo.getDressPagecountbycounting()+str2;
	    System.out.println(str3);
	    System.out.println(dpo.getDressPagecount().getText());
	    Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	    hpo.getdresstab().click();
	  	dpo.geteveningdressoption().click();
	  	str3=str1+dpo.getDressPagecountbycounting()+str2;
	    System.out.println(str3);
	    System.out.println(dpo.getDressPagecount().getText());
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	   	hpo.getdresstab().click();
     	dpo.getsummerdressoption().click();
     	str1= "There are ";
     	str2= " products.";
	  	str3=str1+dpo.getDressPagecountbycounting()+str2;
	  	System.out.println(str3);
	  	System.out.println(dpo.getDressPagecount().getText());
	  	Assert.assertTrue( dpo.getDressPagecount().getText().equals(str3));
	} 
	
	@Test
	public void verifyaddcartproduct1()
	{
		hpo.getdresstab().click();
		String str= dpo.getDressTitleOfEachProduct().get(0).getText();
		System.out.println(str);
		Actions ac= new Actions(bp.driver);
		ac.moveToElement(dpo.getDressTitleOfEachProduct().get(0));
		dpo.getaddcartoptiondress().get(0).click();
		CartPageObjects  cpo = new CartPageObjects();
		System.out.println(bp.isElementVisible(cpo.getcartproductname()));
		System.out.println(cpo.getcartproductname().getText());
		Assert.assertTrue(cpo.getcartproductname().getText().equals(str)); 
		System.out.println(cpo.getcartsucessandcountmesage().get(0).getText());
		Assert.assertTrue(cpo.getcartsucessandcountmesage().get(0).getText().equals("Product successfully added to your shopping cart"));
		System.out.println(cpo.getitemincartmessage().getText());
		Assert.assertTrue(cpo.getitemincartmessage().getText().equals("There is 1 item in your cart.")); 
		cpo.getcartclosebutton().click();
	}
	public void closebrowser(){
		bp.quitDriver();
	}
}
