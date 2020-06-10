package atividades.uimaps;


import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class FormularioMap {

	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// Formulario
	public Element radioOptionOne = new Element(driver, ByValue.ID, "wpforms-260271-field_1_1");
	public Element textAreaOne = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	public Element textAreaTwo = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	public Element radioOptionTwo = new Element(driver, ByValue.ID, "wpforms-260271-field_4_1");
	public Element textAreaThree = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	public Element textAreaFour = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");

	// Mensagem
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']/..//a[@class='button']");
}
