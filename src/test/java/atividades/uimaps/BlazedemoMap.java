package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class BlazedemoMap {
	WebDriver driver;

	public BlazedemoMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element selectDepartureCity = new Element(driver, ByValue.XPATH, "(//h2[text()='Choose your departure city:']//following::select)[1]");
	public Element selectDestinationCity = new Element(driver, ByValue.XPATH, "(//h2[text()='Choose your destination city:']//following::select)[1]");
	public Element btnFindFlights = new Element(driver, ByValue.XPATH, "//input[@value='Find Flights']");
	
}
