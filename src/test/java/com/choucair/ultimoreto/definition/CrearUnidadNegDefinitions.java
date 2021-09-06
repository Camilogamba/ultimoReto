package com.choucair.ultimoreto.definition;

import java.util.List;
import cucumber.api.DataTable;
import com.choucair.ultimoreto.steps.CrearUnidadSteps;
import com.choucair.ultimoreto.steps.LoginSteps;
import com.choucair.ultimoreto.steps.VerfCreacionSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearUnidadNegDefinitions {
	@Steps
	LoginSteps loginSteps;
	@Steps
	CrearUnidadSteps crearUnidadSteps;
	@Steps
	VerfCreacionSteps verfCreacionSteps;

	@Given("^Abro la pagina y me logeo con usuario \"([^\"]*)\" y contraseña \"([^\"]*)\"$")
	public void abro_la_pagina_y_me_logeo_con_usuario_y_contraseña(String strUser, String strPass){
	   loginSteps.login(strUser, strPass);
	}

	@When("^selecciono en el menu organizacion, luego unidades de negocio y creo una unidad de negocio$")
	public void selecciono_en_el_menu_organizacion_luego_unidades_de_negocio_y_creo_una_unidad_de_negocio(DataTable dtDatosForm){
		List<List<String>> data = dtDatosForm.raw();
		for (int i = 1; i < data.size(); i++) {
			crearUnidadSteps.menu(data, i);
			}
	}

	@Then("^Verifico que la unidad de negocio haya sido creada$")
	public void verifico_que_la_unidad_de_negocio_haya_sido_creada()  {
		verfCreacionSteps.validar();
	}
}
