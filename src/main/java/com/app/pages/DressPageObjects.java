package com.app.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPageObjects extends Basepage {

	@FindBy (xpath = "//h1/span[1]")
	private WebElement dresstitle;
	@FindBy (xpath = "//h1/span[2]")
	private WebElement dresscount;
	@FindBy (xpath = "//li//div/span/input[@id='layered_id_attribute_group_1']")
	private WebElement smallcheckbox;
	@FindBy (id = "//li//div/span/input[@id='layered_id_attribute_group_2']")
	private WebElement mediumcheckbx;
	@FindBy (id = "//li//div/span/input[@id='layered_id_attribute_group_3']")
	private WebElement largecheckbox;
	@FindBy (xpath = "//ul[@id='ul_layered_id_attribute_group_1']//li[1]//label/a")
	private WebElement smallcheckboxtext;
	@FindBy (xpath = "//ul[@id='ul_layered_id_attribute_group_1']//li[2]//label/a")
	private WebElement mediumcheckboxtext;
	@FindBy (xpath = "//ul[@id='ul_layered_id_attribute_group_1']//li[3]//label/a")
	private WebElement largecheckboxtext;
	@FindBy (xpath = "//ul//li//div//a[@title='Casual Dresses']")
	private WebElement casuldressselection;
	@FindBy (xpath = "//ul//li//div//a[@title='Evening Dresses']")
	private WebElement eveningdressselection;
	@FindBy (xpath = "//ul//li//div//a[@title='Summer Dresses']")
	private WebElement summerdressselection;
	@FindBy (xpath = "//div//a[@title='View']")
	private List <WebElement> Moreoptionofproduct;
	public DressPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDressPageTitile()
	{
		return dresstitle;
	}
	public WebElement getsmallcheckbox()
	{
		return smallcheckbox;
	}
	public WebElement getmediumcheckbox()
	{
		return mediumcheckbx;
	}
	public WebElement getlargecheckbox()
	{
		return largecheckbox;
	}
	public WebElement getsmallcheckboxtext()
	{
		return smallcheckboxtext;
	}
	public WebElement getsmediumcheckboxtext()
	{
		return mediumcheckboxtext;
	}
	public WebElement getlargeboxtext()
	{
		return largecheckboxtext;
	}
	public WebElement getDressPagecount()
	{
		return dresscount;
	}
	
	public int getDressPagecountbycounting()
	{
		List<WebElement> dresscountbycounting = driver.findElements(By.xpath("//div//div//div//div//div//ul/li/div//h5[@itemprop='name']/a"));
		for(int i=0;i<dresscountbycounting.size();i++)
		{
			System.out.println(dresscountbycounting.size());
			WebElement we= dresscountbycounting.get(i);
			System.out.println(we.getText());
		}
		return dresscountbycounting.size();
	}
		public WebElement getcasualdressoption()
		{
			return casuldressselection;
		}
		public WebElement geteveningdressoption()
		{
			return eveningdressselection;
		}
		public WebElement getsummerdressoption()
		{
			return summerdressselection;
		}
		public List <WebElement> getaddcartoptiondress()
		{
			List<WebElement> ls = driver.findElements(By.xpath("//div//a[@title='Add to cart']"));
			return ls;
		}
		public List <WebElement> getDressTitleOfEachProduct()
		{
			List<WebElement> getDressTitleOfEachProduct = driver.findElements(By.xpath("//div//div//div//div//div//ul/li/div//h5[@itemprop='name']/a"));
			return getDressTitleOfEachProduct;
		}
		public List <WebElement> getmoreoptionofproduct(){
			return Moreoptionofproduct;
		}
}
