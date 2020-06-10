package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.BlazedemoMap;

public class BlazedemoPage {
	WebDriver driver;

	public BlazedemoPage(WebDriver driver) {
		this.driver = driver;
	}

	BlazedemoMap BlazedemoMap = new BlazedemoMap(driver);

	public void preencherForm(String departure, String destination) {
		BlazedemoMap.selectDepartureCity.select(driver, departure);
		BlazedemoMap.selectDestinationCity.select(driver, destination);
		BlazedemoMap.btnFindFlights.click(driver);
	}
	
}
