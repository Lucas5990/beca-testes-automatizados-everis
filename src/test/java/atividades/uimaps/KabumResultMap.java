package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class KabumResultMap {
	WebDriver driver;

	public KabumResultMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element itemLink(String item) {
		return new Element(driver, ByValue.XPATH, "//a[text()='" + item + "']");
	}

}
