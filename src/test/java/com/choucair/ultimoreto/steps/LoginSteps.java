package com.choucair.ultimoreto.steps;

import com.choucair.ultimoreto.pageobjects.LoginPagePage;
import com.choucair.ultimoreto.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	AccionesWeb accionesWeb;
	LoginPagePage loginPage;
	@Step
	public void login(String strUser, String strPass) {
		accionesWeb.abrirURL("https://serenity.is/demo/Account/Login/");
		accionesWeb.espBorCliSendKey(loginPage.cbUsername, strUser);
		accionesWeb.espBorCliSendKey(loginPage.cbPassword, strPass);
		accionesWeb.bordearScrenClick(loginPage.btnLogin);
	}
}
