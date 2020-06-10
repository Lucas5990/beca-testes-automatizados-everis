package atividades.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atividades.uimaps.FormularioMap;
import junit.framework.Assert;

public class FormularioPage {
	WebDriver driver;

	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}

	FormularioMap formularioMap = new FormularioMap(driver);

	public void preencherFormulario() {
		formularioMap.radioOptionOne.click(driver);
		formularioMap.textAreaOne.sendKeys(driver, "Teste");
		formularioMap.textAreaTwo.sendKeys(driver, "Teste");
		formularioMap.radioOptionTwo.click(driver);
		formularioMap.textAreaThree.sendKeys(driver, "Teste");
		formularioMap.textAreaFour.sendKeys(driver, "Teste");
		formularioMap.btnSubmit.click(driver);
	}

	/**
	 * metodo que valida a mensagem de sucesso
	 */
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			System.out.println(resultado);
			Assert.assertEquals("Erro ao validar mensagem de sucesso!", "Get Started with WPForms Today", resultado);

		} catch (Exception e) {
			System.out.println("Falha!");
		}

	}

}
