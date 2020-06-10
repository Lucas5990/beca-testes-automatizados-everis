package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class KabumMap {
	WebDriver driver;

	public KabumMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element inputSearch = new Element(driver, ByValue.CLASS_NAME, "sprocura");
	public Element btnSearch = new Element(driver, ByValue.ID, "bt-busca");
}
