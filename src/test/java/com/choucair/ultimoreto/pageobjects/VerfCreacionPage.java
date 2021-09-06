package com.choucair.ultimoreto.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class VerfCreacionPage extends PageObject{
	@FindBy(xpath = "//a[@href='#Organization-BusinessUnit/1'][text()='Estrategia']")
	public WebElementFacade verifCre;
	
}
