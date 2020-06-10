package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.KabumMap;

public class KabumPage {
	WebDriver driver;

	public KabumPage(WebDriver driver) {
		this.driver = driver;
	}

	KabumMap kabumMap = new KabumMap(driver);

	public void realizarBusca(String query) {
		kabumMap.inputSearch.sendKeys(driver, query);
		kabumMap.btnSearch.click(driver);
	}
}

