package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.KabumResultMap;

public class KabumResultPage {
	WebDriver driver;

	public KabumResultPage(WebDriver driver) {
		this.driver = driver;
	}

	KabumResultMap kabumResultMap = new KabumResultMap(driver);

	public void clicarLinkProduto(String item) {
		kabumResultMap.itemLink(item).click(driver);
	}
}
