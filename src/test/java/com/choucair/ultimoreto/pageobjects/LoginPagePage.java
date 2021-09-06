package com.choucair.ultimoreto.pageobjects;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPagePage extends PageObject {
	@FindBy(name="Username")
	public WebElementFacade cbUsername;
	@FindBy(name="Password")
	public WebElementFacade cbPassword;	
	@FindBy(id="StartSharp_Membership_LoginPanel0_LoginButton")
	public WebElementFacade btnLogin;
	@FindBy(xpath = "//i[contains(@class,'nav-icon fa fa-comments premium-feature')]")
	public WebElementFacade bnmenu;
	@FindBy(xpath = "//span[contains(text(),'Meetings')]")
	public WebElementFacade bnmenu2;
}
