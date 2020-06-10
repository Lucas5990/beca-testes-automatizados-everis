package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class KabumProductMap {
	WebDriver driver;

	public KabumProductMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element inputCEP = new Element(driver, ByValue.ID, "calc_cep");
	public Element btnCalcFrete = new Element(driver, ByValue.XPATH, "//input[@value='Calcular Frete']");
	public Element valFreteOne = new Element(driver, ByValue.XPATH, "//tbody[@id='table-calcular']//tr[1]//td[3]");
	public Element valFreteTwo = new Element(driver, ByValue.XPATH, "//tbody[@id='table-calcular']//tr[2]//td[3]");
	public Element valFreteThree = new Element(driver, ByValue.XPATH, "//tbody[@id='table-calcular']//tr[3]//td[3]");
}
