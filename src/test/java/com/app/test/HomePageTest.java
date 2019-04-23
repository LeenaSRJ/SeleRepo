package com.app.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.*;

public class HomePageTest {
	HomePageObjects hpo;
	Basepage bp;
	WomenPageObjects wpo;
	DressPageObjects dpo;
	TshirtPageObjects tpo;
	public HomePageTest(){
	    	 bp = new Basepage();
		     hpo = new HomePageObjects();
		     wpo = new WomenPageObjects();
		     dpo = new DressPageObjects();
		     tpo = new TshirtPageObjects();
		      }
	
	 @Test
	   public void verifywomendresstshirttab(){
		   Assert.assertTrue(bp.isElementVisible(hpo.getwomentab()));
		   Assert.assertTrue(bp.isElementVisible(hpo.getdresstab()));
		   Assert.assertTrue(bp.isElementVisible(hpo.gettshirttab()));
	   }
	/* @Test
	   public void verifyvalidnewemailnewletter(){
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletterfield()));
		 hpo.getemailnewletterfield().sendKeys("wise125@gmail.com");
		 hpo.getemailnewletterbutton().click();
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletteralert()));
		 System.out.println(hpo.getemailnewletteralert().getText());
		 Assert.assertTrue(hpo.getemailnewletteralert().getText().equals("Newsletter : You have successfully subscribed to this newsletter."));
		 	}
*/	 @Test
	   public void verifyvalidexistingemailnewletter(){
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletterfield()));
		 bp.setText(hpo.getemailnewletterfield(), "wise124@gmail.com");
		 hpo.getemailnewletterbutton().click();
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletteralert()));
		 System.out.println(hpo.getemailnewletteralert().getText());
		 Assert.assertTrue(hpo.getemailnewletteralert().getText().equals("Newsletter : This email address is already registered."));
		 	}
	 @Test
	   public void verifyinvalidemailnewletter(){
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletterfield()));
		 bp.setText(hpo.getemailnewletterfield(), "wise123gmail.com");
		 hpo.getemailnewletterbutton().click();
		 Assert.assertTrue(bp.isElementVisible(hpo.getemailnewletteralert()));
		 System.out.println(hpo.getemailnewletteralert().getText());
		 Assert.assertTrue(hpo.getemailnewletteralert().getText().equals("Newsletter : Invalid email address."));
		 	}  
	 @Test
	 public void verifyhomepagetabnavigation(){
		 hpo.getwomentab().click();
		 System.out.println(wpo.getwomenpagetitle().getText());
		 Assert.assertTrue(wpo.getwomenpagetitle().getText().equals("WOMEN "));
		 hpo.getdresstab().click();
		 System.out.println(dpo.getDressPageTitile().getText());
		 Assert.assertTrue(dpo.getDressPageTitile().getText().equals("DRESSES "));
		 hpo.gettshirttab().click();
		 System.out.println(tpo.getTshirtPageTitile().getText());
		 Assert.assertTrue(tpo.getTshirtPageTitile().getText().equals("T-SHIRTS "));
	 }
	 public void closebrowser(){
			bp.quitDriver();
		}
}
