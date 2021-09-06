package com.choucair.ultimoreto.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearUnidadPage extends PageObject{
	@FindBy(xpath = "//i[contains(@class,'nav-icon fa fa-sitemap premium-feature')]")
	public WebElementFacade bnunidadn;
	@FindBy(xpath = "//a[contains(@href,'/demo/Organization/BusinessUnit')]")
	public WebElementFacade bnunidadn2;
	@FindBy(xpath = "//span[contains(text(),'New Business Unit')]")
	public WebElementFacade newbuss;
	@FindBy(xpath = "//input[contains(@class,'editor s-StringEditor required')]")
	public WebElementFacade bussname;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElementFacade bnSave;
	@FindBy(xpath = "//i[contains(@class,'fa fa-times')]")
	public WebElementFacade bnclou;
}
