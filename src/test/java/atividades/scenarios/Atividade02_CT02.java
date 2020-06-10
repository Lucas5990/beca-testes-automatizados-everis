package atividades.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividades.core.Driver;
import atividades.pages.BlazedemoConfirmationPage;
import atividades.pages.BlazedemoPage;
import atividades.pages.BlazedemoPurchasePage;
import atividades.pages.BlazedemoReservePage;

public class Atividade02_CT02 {
	WebDriver driver;
	BlazedemoPage blazedemoPage;
	BlazedemoReservePage blazedemoReservePage;
	BlazedemoPurchasePage blazedemoPurchasePage;
	BlazedemoConfirmationPage blazedemoConfirmationPage;

	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		blazedemoPage = new BlazedemoPage(driver);
		blazedemoReservePage = new BlazedemoReservePage(driver);
		blazedemoPurchasePage = new BlazedemoPurchasePage(driver);
		blazedemoConfirmationPage = new BlazedemoConfirmationPage(driver);
	}

	@Test
	public void test() {
		blazedemoPage.preencherForm("San Diego","New York");
		blazedemoReservePage.escolherPrimeiroVoo();
		blazedemoPurchasePage.preencherForm();
		blazedemoConfirmationPage.validarMensagem();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		Driver.close(driver);
	}
	
	
}
