package com.choucair.ultimoreto.utilities;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AccionesWeb extends PageObject {

	public void recorrer_productos() {

		waitFor(2).second();

		List<WebElementFacade> allProduct = findAll("//*[@id='content']/div[2]/div");

		String strMarca = "";

		String strPrecio = "";

		String strDescripcion = "";

		for (int cont = 1; cont < allProduct.size(); cont++) {

			strMarca = find(By.xpath("//*[@id='content']/div[3]/div[" + cont + "]/div/div[2]/div[1]/h4/a")).getText();

			strPrecio = find(By.xpath("//*[@id='content']/div[3]/div[" + cont + "]/div/div[2]/div[1]/p[2]")).getText();

			strDescripcion = find(By.xpath("//*[@id='content']/div[3]/div[" + cont + "]/div/div[2]/div[1]/p[1]"))
					.getText();

			System.out.println("\n" + strMarca + " " + strDescripcion + " " + strPrecio);

			System.out.println("*********************************************************************");

		}

	}
	
	/**
	 *  * compara datos de dos xpath
	 * 
	AddCardPage addCardPage;
	public void validartotal() {
		waitFor(2).second();
		String strPrecioU, strPrecioT, strCantidad = "";
		strPrecioU = find("//*[@id='content']/div/div[2]/ul[2]/li[1]/h2").getText();
		clicku(addCardPage.btncard);
		strPrecioT = addCardPage.price.getText();
		strCantidad = find("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[3]").getText();
		strPrecioU = strPrecioU.replace("$", "0");
		double Total = Double.parseDouble(strPrecioU);
		strCantidad = strCantidad.replace("x ", "00");
		int Total2 = Integer.parseInt(strCantidad);
		double Total4 = Total2 * Total;
		String Total5 = "$" + String.valueOf(Total4);
		validarTextoDeUnElemetoContieneTexto2(addCardPage.price, Total5, Total5);
		strPrecioU = strPrecioU.replace("0", "$");
		System.out.println("*********************************************************************");
		System.out.println("Precio Unitario Producto:   " + strPrecioU + "\n" + "Precio del Producto (xpath):  "
				+ strPrecioT + "\n" + "Unidades compradas:   " + Total2 + "\n" + "Validacion por codigo valor total:   "
				+ Total5);
		System.out.println("*********************************************************************");

	}
*/
	
	private String bordeRojo = "arguments[0].style.border='3px dashed red'";
	private String bordeVerde = "arguments[0].style.border='3px dashed green'";
	
	
	
	/**
	 * Este metodo espera a que un elemento este visible
	 * 
	 * @param xpath elemento que se requiere esperar a que sea visible
	 * 
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoVisible(By xpath) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 50);
			espera.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			if (element(xpath).isCurrentlyVisible()) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}

	/**
	 * esperoelementovisible xpath
	 * 
	 * @param strXpath
	 * @return
	 */

	public boolean esperoElementoVisible(String strXpath) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 50);
			espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXpath)));
			if (element(strXpath).isCurrentlyVisible()) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}

	/**
	 * Este metodo espera a que un elemento este visible
	 * 
	 * @param WebElementFacade elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoVisible(WebElementFacade wbElemento) {
		try {
			element(wbElemento).waitUntilVisible();
			if (element(wbElemento).isCurrentlyVisible()) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}
	
	

	/**
	 * Este metodo espera a que un elemento este Habilitado
	 * 
	 * @param xpath elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoHabilitado(By xpath) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 50);
			espera.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			if (element(xpath).isCurrentlyEnabled()) {
				return true;
			}

		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoHabilitado " + e);
		}
		return false;
	}

	/**
	 * esperoelementohabilitado con xpath
	 * 
	 * @param strXpath
	 * @return
	 */
	public boolean esperoElementoHabilitado(String strXpath) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 50);
			espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXpath)));
			if (element(strXpath).isCurrentlyEnabled()) {
				return true;
			}

		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoHabilitado " + e);
		}
		return false;
	}

	/**
	 * Este metodo espera a que un elemento este Habilitado
	 * 
	 * @param WebElementFacader elemento que se requiere esperar a que sea visible
	 * @return retorna true o false si el elemento esta o no presente
	 */
	public boolean esperoElementoHabilitado(WebElementFacade wbElemento) {
		try {
			element(wbElemento).waitUntilEnabled();
			if (element(wbElemento).isCurrentlyEnabled()) {
				return true;
			}

		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoHabilitado " + e);
		}
		return false;
	}

	/**
	 * click con web element
	 * 
	 * @param wbElement
	 * @param blnTomarPantalla
	 */
	public void click(WebElementFacade wbElement, boolean blnTomarPantalla) {
		esperoElementoVisible(wbElement);
		esperoElementoHabilitado(wbElement);
		if (blnTomarPantalla) {
			Serenity.takeScreenshot();
		}
		wbElement.click();
	}
	
	public void clicku(WebElementFacade wbElement) {
		esperoElementoVisible(wbElement);
		esperoElementoHabilitado(wbElement);
		wbElement.click();
	}

	/**
	 * click con xpath
	 * 
	 * @param strXpath
	 * @param blnTomarPantalla
	 */
	public void click(String strXpath, boolean blnTomarPantalla) {
		esperoElementoVisible(strXpath);
		esperoElementoHabilitado(strXpath);
		if (blnTomarPantalla) {
			Serenity.takeScreenshot();
		}
		find(By.xpath(strXpath)).click();
		Serenity.takeScreenshot();
	}

	/**
	 * Metodo encargado de abrir la url
	 *
	 * @param strURL
	 */
	public void abrirURL(String strURL) {
		openAt(strURL);
		esperasegundos(2);
		getDriver().navigate().refresh();

	}

	/**
	 * MÃ©todo de una aserciÃ³n la cual valida que el elemeto contenga un texto
	 *
	 * @param mensaje
	 * @param elemet
	 * @param textoaComparar
	 */
	public void validarTextoDeUnElemetoContieneTexto(WebElementFacade elemet, String textoaComparar, String mensaje) {
		String textoElemet = element(elemet).getText();
		Serenity.takeScreenshot();
		assertTrue(mensaje, textoElemet.contains(textoaComparar));

	}
	public void validarTextoDeUnElemetoContieneTexto2(WebElementFacade elemet, String textoaComparar, String mensaje) {
		String textoElemet = element(elemet).getText();
		assertTrue(mensaje, textoElemet.contains(textoaComparar));
	}
	
	public void validarVisib(WebElementFacade texto) {
		assertThat(texto.isCurrentlyVisible(), is(true));
		}
	
	public void validarVisibScreen(WebElementFacade texto) {
		assertThat(texto.isCurrentlyVisible(), is(true));
		Serenity.takeScreenshot();
		}
	

	/**
	 * Metodo generico para las funciones de limpiar campos y escribir
	 * 
	 * @param wbElement
	 * @param dato
	 */
	public void clear_sendKeys(WebElementFacade wbElement, String dato) {
		esperoElementoHabilitado(wbElement);
		esperoElementoVisible(wbElement);
		wbElement.click();
		wbElement.clear();
		wbElement.sendKeys(dato);
	}
	public void espBorCliSendKey(WebElementFacade webElementFac, String dato) {
		try {
			esperoElementoHabilitado(webElementFac);
			esperoElementoVisible(webElementFac);
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElementFac);
			webElementFac.click();
			webElementFac.sendKeys(dato);
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElementFac);
		}
	}
	public void espBorCliSendKey2(WebElementFacade webElementFac, String dato) {
		try {
			esperoElementoHabilitado(webElementFac);
			esperoElementoVisible(webElementFac);
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElementFac);
			webElementFac.click();
			webElementFac.sendKeys(dato);
			webElementFac.click();
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElementFac);
		}
	}

	/**
	 * 
	 * @param webElementFac
	 * @param bordearElemento
	 * @param tomarScreenshot
	 */
	public void moverPantallahastaElemento(WebElementFacade webElementFac, boolean bordearElemento,
			boolean tomarScreenshot) {

		try {
			esperoElementoVisible(webElementFac);
			esperoElementoHabilitado(webElementFac);
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElementFac);
		} catch (Exception ex) {
			System.out.println("No se movio la pantalla hacia el elemento con xpath: " + webElementFac);
		}
		/*
		 * if (bordearElemento) bordearElemento(webElementFac);
		 */
		if (tomarScreenshot)
			Serenity.takeScreenshot();
	}
	public void moverPantallahastaElemento2(WebElementFacade webElementFac) {

		try {
			esperoElementoVisible(webElementFac);
			esperoElementoHabilitado(webElementFac);
			((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView();", webElementFac);
		} catch (Exception ex) {
			System.out.println("No se movio la pantalla hacia el elemento con xpath: " + webElementFac);
		}
	}

	/**
	 * Este metodo crea un borde rojo sobre un elemento de la pagina
	 * 
	 * @param strXptElemento xpath del elemento que se bordea
	 */
	public void bordearElemento(String strXptElemento) {
		try {
			WebElement webElemeBordear = find(By.xpath(strXptElemento));
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElemeBordear);
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + strXptElemento);
		}
	}

	/**
	 * Este metodo crea un borde rojo sobre un elemento de la pagina
	 * 
	 * @param webElementFac Elemento que se bordeara
	 */
	public void bordearElemento(WebElementFacade webElementFac) {
		try {
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElementFac);
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElementFac);
		}
	}
	
	public void bordearClick(WebElementFacade webElement) {
		try {
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElement);
			webElement.click();
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElement);
		}	
	}
	public void bordearScrenClick(WebElementFacade webElement) {
		try {
			esperaelemClick(webElement);
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElement);
			Serenity.takeScreenshot();
			webElement.click();
		} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElement);
		}	
		
	}
	public void bordearValdScren(WebElementFacade webElementFac) {
		try {
			((JavascriptExecutor) getDriver()).executeScript(bordeVerde, webElementFac);
			validarVisib(webElementFac);
			Serenity.takeScreenshot();
		} catch (Exception ex) {
			System.out.println("No es visible el elemento con xpath: " + webElementFac);
		}	
		
	}
	public void esperaelemClick(WebElementFacade webElement) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 20);
			espera.until(ExpectedConditions.elementToBeClickable(webElement));
		}catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo EsperaElementoClickeable" + e);
		}
	}

	public void bordearEspe(WebElementFacade webElement) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 50);
			espera.until(ExpectedConditions.elementToBeClickable(webElement));
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElement);
			} catch (Exception ex) {
			System.out.println("No se pudo bordear el elemento con xpath: " + webElement);
		}	
	}
	
	public boolean bordearEspe2(WebElementFacade webElement) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 10);
			espera.until(ExpectedConditions.visibilityOf(webElement));
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElement);
			if (element(webElement).isCurrentlyVisible()) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}
	
	public boolean espBordearClick(WebElementFacade webElement) {
		try {
			WebDriverWait espera = new WebDriverWait(getDriver(), 5);
			espera.until(ExpectedConditions.visibilityOf(webElement));
			((JavascriptExecutor) getDriver()).executeScript(bordeRojo, webElement);
			webElement.click();
			if (element(webElement).isCurrentlyVisible()) {
				return true;
			}
		} catch (Exception e) {
			System.out.print("en la clase AccionesWeb en el metodo esperoElementoVisible" + e);
		}
		return false;
	}	
	
	/**
	 * Mueve la pantalla hasta la parte final de la pagina
	 */
	public void moverScrollHastaFinal() {
		try {
			((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception jE) {
			System.out.println("No Movio la pantalla: " + jE.getMessage());
		}
	}

	/**
	 * 
	 */
	public void esperasegundos(int seconds) {
		waitFor(seconds).seconds();
	}

}

