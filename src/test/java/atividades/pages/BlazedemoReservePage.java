package atividades.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Element;

import atividades.uimaps.BlazedemoReserveMap;
import junit.framework.Assert;

public class BlazedemoReservePage {
	WebDriver driver;

	public BlazedemoReservePage(WebDriver driver) {
		this.driver = driver;
	}
	
	BlazedemoReserveMap blazedemoReserveMap = new BlazedemoReserveMap(driver);


	public void validarTabela() {
		String departs = blazedemoReserveMap.departs.criarElemento(driver).getText();
		String arrives = blazedemoReserveMap.arrives.criarElemento(driver).getText();
		Assert.assertEquals("Erro ao validar local de partida!", "Departs: San Diego", departs);
		Assert.assertEquals("Erro ao validar destino!", "Arrives: New York", arrives);
	}
	
	public void escolherPrimeiroVoo() {
		blazedemoReserveMap.btnFirst.click(driver);
	}
	
	public void escolherVoo(String flightNumber) {
		blazedemoReserveMap.btnChooseFlight(flightNumber).click(driver);;
	}
}



