package com.choucair.ultimoreto.pageobjects;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearMeetPage extends PageObject {
	@FindBy(xpath = "//i[contains(@class,'nav-icon fa fa-comments premium-feature')]")
	public WebElementFacade bnmenu;
	@FindBy(xpath = "//a[contains(@href,'/demo/Meeting/Meeting')]")
	public WebElementFacade bnmenu2;
	@FindBy(xpath = "//span[contains(text(),'New Meeting')]")
	public WebElementFacade bnnewm;
	@FindBy(name = "MeetingName")
	public WebElementFacade mName;
	@FindBy(id = "s2id_StartSharp_Meeting_MeetingDialog14_MeetingTypeId")
	public WebElementFacade mtype;	
	@FindBy(id = "select2-results-6")
	public WebElementFacade mtype2;
	@FindBy(id = "StartSharp_Meeting_MeetingDialog14_StartDate")
	public WebElementFacade mfecha;  
	@FindBy(xpath = "//select[contains(@class,'editor s-DateTimeEditor time valid')]")
	public WebElementFacade mhora;
	@FindBy(xpath = "//select[contains(@class,'editor s-DateTimeEditor time valid')]/option[68]")
	public WebElementFacade mhora2;
	@FindBy(xpath = "//div[@class='field LocationId col-sm-6']//child::a[@class='inplace-button inplace-create']")
	public WebElementFacade btubi;
	@FindBy(xpath = "//input[@id='StartSharp_Meeting_MeetingLocationDialog37_Name']")
	public WebElementFacade lname;
	@FindBy(xpath = "//input[@id=('StartSharp_Meeting_MeetingLocationDialog37_Address')]")
	public WebElementFacade lubi;
	@FindBy(xpath = "//input[@id=('StartSharp_Meeting_MeetingLocationDialog37_Latitude')]")
	public WebElementFacade llati;	 
	@FindBy(xpath = "//input[@id=('StartSharp_Meeting_MeetingLocationDialog37_Longitude')]")
	public WebElementFacade llon;
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElementFacade lSave;
}
