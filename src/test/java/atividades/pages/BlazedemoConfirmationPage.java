package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.BlazedemoConfirmationMap;
import junit.framework.Assert;

public class BlazedemoConfirmationPage {
	WebDriver driver;

	public BlazedemoConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	BlazedemoConfirmationMap blazedemoConfirmationMap = new BlazedemoConfirmationMap(driver);


	public void validarMensagem() {
		String msgSucesso = blazedemoConfirmationMap.msg.criarElemento(driver).getText();
		Assert.assertEquals("Erro ao validar mensagem de sucesso!", "Thank you for your purchase today!", msgSucesso);
	}
	
}
