package com.choucair.ultimoreto.definition;

import java.util.List;

import com.choucair.ultimoreto.steps.CrearMeetSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearMeetDefinitions {
	@Steps
	CrearMeetSteps crearMeetSteps;
	
	@When("^selecciono en el menu meeting, luego meetings y creo una nueva meeting$")
	public void selecciono_en_el_menu_meeting_luego_meetings_y_creo_una_nueva_meeting(DataTable ddatos2) {
		List<List<String>> data = ddatos2.raw();
		for (int i = 1; i < data.size(); i++) {
			crearMeetSteps.crearMeet(data, i);
			}		
	}

	@Then("^Verifico que la reunion haya sido creada$")
	public void verifico_que_la_reunion_haya_sido_creada() {
	 
	}
}
