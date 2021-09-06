package com.choucair.ultimoreto.steps;

import java.util.List;

import com.choucair.ultimoreto.pageobjects.CrearMeetPage;
import com.choucair.ultimoreto.utilities.AccionesWeb;

import net.thucydides.core.annotations.Step;

public class CrearMeetSteps {
	AccionesWeb accionesWeb;
	CrearMeetPage crearMeetPage;
	@Step
	public void crearMeet(List<List<String>> data, int id) {
		accionesWeb.espBordearClick(crearMeetPage.bnmenu);
		accionesWeb.bordearClick(crearMeetPage.bnmenu2);
		accionesWeb.espBordearClick(crearMeetPage.bnnewm);
		accionesWeb.espBorCliSendKey(crearMeetPage.mName, data.get(id).get(0).trim());
		accionesWeb.bordearClick(crearMeetPage.mtype);
		accionesWeb.bordearClick(crearMeetPage.mtype2);
		accionesWeb.bordearElemento(crearMeetPage.mfecha);
		accionesWeb.clear_sendKeys(crearMeetPage.mfecha, data.get(id).get(1).trim());
		accionesWeb.bordearClick(crearMeetPage.btubi);
		accionesWeb.espBorCliSendKey(crearMeetPage.lname, data.get(id).get(2).trim());
		accionesWeb.espBorCliSendKey(crearMeetPage.lubi, data.get(id).get(3).trim());
		accionesWeb.espBorCliSendKey(crearMeetPage.llati, data.get(id).get(4).trim());
		accionesWeb.espBorCliSendKey(crearMeetPage.llon, data.get(id).get(5).trim());
		//accionesWeb.bordearClick(crearMeetPage.lSave);
	}
}
