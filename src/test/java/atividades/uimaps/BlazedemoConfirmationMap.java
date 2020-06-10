package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class BlazedemoConfirmationMap {
	WebDriver driver;

	public BlazedemoConfirmationMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element msg = new Element(driver, ByValue.XPATH, "//h1");
}
