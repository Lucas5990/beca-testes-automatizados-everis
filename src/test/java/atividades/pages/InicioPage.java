package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;

	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}

	InicioMap inicioMap = new InicioMap(driver);

	public void selecionarTipoFormulario() {
		inicioMap.selectTipoFormulario.select(driver, "Feedback");
		inicioMap.btnViewDemo("Neighborhood Events Questionnaire Form Demo").click(driver);
	}
}
