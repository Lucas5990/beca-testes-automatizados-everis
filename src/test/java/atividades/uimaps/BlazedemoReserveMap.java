package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class BlazedemoReserveMap {
	WebDriver driver;

	public BlazedemoReserveMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element departs = new Element(driver, ByValue.XPATH, "//*[contains(text(),'Departs')]");
	public Element arrives = new Element(driver, ByValue.XPATH, "//*[contains(text(),'Arrives')]");
	public Element btnFirst = new Element(driver, ByValue.XPATH, "(//input[@value='Choose This Flight'])[1]");

	public Element btnChooseFlight(String flight) {
		return new Element(driver, ByValue.XPATH, "//td[text()='"+ flight +"']/../td[1]/input");
	}
}
