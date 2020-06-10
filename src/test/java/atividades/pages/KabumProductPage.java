package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.KabumProductMap;
import junit.framework.Assert;

public class KabumProductPage {
	WebDriver driver;

	public KabumProductPage(WebDriver driver) {
		this.driver = driver;
	}

	KabumProductMap kabumProductMap = new KabumProductMap(driver);

	public void preencherCEP(String cep) {
		kabumProductMap.inputCEP.sendKeys(driver, cep);
	}
	
	public void calcularFrete() {
		kabumProductMap.btnCalcFrete.click(driver);
	}
	
	public void validarFrete() {
		String valFreteOne = kabumProductMap.valFreteOne.criarElemento(driver).getText();
		String valFreteTwo = kabumProductMap.valFreteTwo.criarElemento(driver).getText();
		String valFreteThree = kabumProductMap.valFreteThree.criarElemento(driver).getText();
		Assert.assertEquals("Primeiro valor não confere!", "R$ 23,39", valFreteOne);
		Assert.assertEquals("Segundo valor não confere!", "R$ 40,97", valFreteTwo);
		Assert.assertEquals("Terceiro valor não confere!", "R$ 51,79", valFreteThree);
	}
}
