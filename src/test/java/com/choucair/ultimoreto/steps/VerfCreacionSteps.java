package com.choucair.ultimoreto.steps;

import com.choucair.ultimoreto.pageobjects.VerfCreacionPage;
import com.choucair.ultimoreto.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class VerfCreacionSteps {
	VerfCreacionPage verfCreacionDefinitions;
	AccionesWeb accionesWeb;
	
	@Step
	public void validar() {
		accionesWeb.bordearValdScren(verfCreacionDefinitions.verifCre);
	}
}
