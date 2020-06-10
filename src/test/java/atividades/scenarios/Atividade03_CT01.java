package atividades.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividades.core.Driver;
import atividades.pages.KabumPage;
import atividades.pages.KabumResultPage;
import atividades.pages.KabumProductPage;


public class Atividade03_CT01 {
	WebDriver driver;
	KabumPage kabumPage;
	KabumResultPage kabumResultPage;
	KabumProductPage kabumProductPage;

	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		kabumPage = new KabumPage(driver);
		kabumResultPage = new KabumResultPage(driver);
		kabumProductPage = new KabumProductPage(driver);

	}

	@Test
	public void test() {
		kabumPage.realizarBusca("Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		kabumResultPage.clicarLinkProduto("Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		kabumProductPage.preencherCEP("38413108");
		kabumProductPage.calcularFrete();
		kabumProductPage.validarFrete();
		try {
			Thread.sleep(5000);
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
