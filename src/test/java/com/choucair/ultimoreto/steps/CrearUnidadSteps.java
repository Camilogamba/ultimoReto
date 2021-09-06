package com.choucair.ultimoreto.steps;

import java.util.List;

import com.choucair.ultimoreto.pageobjects.CrearUnidadPage;
import com.choucair.ultimoreto.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class CrearUnidadSteps {
	AccionesWeb accionesWeb;
	CrearUnidadPage crearUnidadDefinitions;
	@Step
	public void menu(List<List<String>> data, int id) {
		accionesWeb.espBordearClick(crearUnidadDefinitions.bnunidadn);
		accionesWeb.bordearClick(crearUnidadDefinitions.bnunidadn2);
		accionesWeb.espBordearClick(crearUnidadDefinitions.newbuss);
		accionesWeb.espBorCliSendKey(crearUnidadDefinitions.bussname, data.get(id).get(0).trim());
		accionesWeb.bordearScrenClick(crearUnidadDefinitions.bnSave);
		accionesWeb.bordearClick(crearUnidadDefinitions.bnclou);
	}
}
