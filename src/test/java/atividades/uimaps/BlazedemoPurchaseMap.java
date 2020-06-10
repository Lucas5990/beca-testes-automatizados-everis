package atividades.uimaps;

import org.openqa.selenium.WebDriver;

import atividades.core.Element;
import atividades.enums.ByValue;

public class BlazedemoPurchaseMap {
	WebDriver driver;

	public BlazedemoPurchaseMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element inputName = new Element(driver, ByValue.ID, "inputName");
	public Element address = new Element(driver, ByValue.ID, "address");
	public Element city = new Element(driver, ByValue.ID, "city");
	public Element state = new Element(driver, ByValue.ID, "state");
	public Element zipCode = new Element(driver, ByValue.ID, "zipCode");
	public Element cardType = new Element(driver, ByValue.ID, "cardType");
	public Element creditCardNumber = new Element(driver, ByValue.ID, "creditCardNumber");
	public Element creditCardMonth = new Element(driver, ByValue.ID, "creditCardMonth");
	public Element creditCardYear = new Element(driver, ByValue.ID, "creditCardYear");
	public Element nameOnCard = new Element(driver, ByValue.ID, "nameOnCard");
	public Element rememberMe = new Element(driver, ByValue.ID, "rememberMe");
	public Element btnPurchase = new Element(driver,ByValue.XPATH, "//input[@value='Purchase Flight']" );
}
