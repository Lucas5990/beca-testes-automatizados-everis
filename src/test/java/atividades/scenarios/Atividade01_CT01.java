package atividades.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import atividades.core.Driver;
import atividades.pages.FormularioPage;
import atividades.pages.InicioPage;

public class Atividade01_CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;

	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://wpforms.com/demo/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);

	}

	@Test
	public void test() {
		inicioPage.selecionarTipoFormulario();
		formularioPage.preencherFormulario();
		formularioPage.validarMensagemSucesso();
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
