package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends Basepage {
	
	@FindBy (xpath = "//div[@id='block_top_menu']/ul[1]/li[1]/a")
	private WebElement womentab;
	@FindBy (xpath = "//div[@id='block_top_menu']/ul[1]/li[2]/a")
	private WebElement dresstab;
	@FindBy (xpath = "//div[@id='block_top_menu']/ul[1]/li[3]/a")
	private WebElement tshirttab;
	@FindBy (xpath = "//input[@id='newsletter-input']")	
	private WebElement emailnewsletter;
	@FindBy (name= "submitNewsletter")
   private WebElement newsletterbutton;
	@FindBy (xpath= "//div[@id='columns']/p")
	private WebElement emailalert;
		
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}	
	
	public WebElement getwomentab() {
		return womentab;
	}
	public WebElement getdresstab() {
		return dresstab;
	}
	public WebElement gettshirttab() {
		return tshirttab;
	}
	public WebElement getemailnewletterfield() {
		return emailnewsletter;
	}
	public WebElement getemailnewletterbutton() {
		return newsletterbutton;
	}
	public WebElement getemailnewletteralert() {
		return emailalert;
	}
}
