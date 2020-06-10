package atividades.pages;

import org.openqa.selenium.WebDriver;

import atividades.uimaps.BlazedemoPurchaseMap;
import junit.framework.Assert;

public class BlazedemoPurchasePage {
	WebDriver driver;

	public BlazedemoPurchasePage(WebDriver driver) {
		this.driver = driver;
	}

	BlazedemoPurchaseMap blazedemoPurchaseMap = new BlazedemoPurchaseMap(driver);

	public void preencherForm() {
		blazedemoPurchaseMap.inputName.sendKeys(driver, "Lucas Andrade");
		blazedemoPurchaseMap.address.sendKeys(driver, "Rua, Bairro, Numero");
		blazedemoPurchaseMap.city.sendKeys(driver, "Cidade");
		blazedemoPurchaseMap.state.sendKeys(driver, "Estado");
		blazedemoPurchaseMap.zipCode.sendKeys(driver, "38408420");
		blazedemoPurchaseMap.cardType.select(driver, "American Express");
		blazedemoPurchaseMap.creditCardNumber.sendKeys(driver, "38408420");
		blazedemoPurchaseMap.creditCardMonth.sendKeys(driver, "06");
		blazedemoPurchaseMap.creditCardYear.sendKeys(driver, "2025");
		blazedemoPurchaseMap.nameOnCard.sendKeys(driver, "Lucas H Andrade");
		blazedemoPurchaseMap.rememberMe.click(driver);
		blazedemoPurchaseMap.btnPurchase.click(driver);
	}

	public void preencherFormParam(String inputName, String address, String city, String state, String zipCode,
			String cardType, String creditCardNumber, String creditCardMonth, String creditCardYear,
			String nameOnCard) {
		blazedemoPurchaseMap.inputName.sendKeys(driver, inputName);
		blazedemoPurchaseMap.address.sendKeys(driver, address);
		blazedemoPurchaseMap.city.sendKeys(driver, city);
		blazedemoPurchaseMap.state.sendKeys(driver, state);
		blazedemoPurchaseMap.zipCode.sendKeys(driver, zipCode);
		blazedemoPurchaseMap.cardType.select(driver, cardType);
		blazedemoPurchaseMap.creditCardNumber.sendKeys(driver, creditCardNumber);
		blazedemoPurchaseMap.creditCardMonth.sendKeys(driver, creditCardMonth);
		blazedemoPurchaseMap.creditCardYear.sendKeys(driver, creditCardYear);
		blazedemoPurchaseMap.nameOnCard.sendKeys(driver, nameOnCard);
		blazedemoPurchaseMap.rememberMe.click(driver);
		blazedemoPurchaseMap.btnPurchase.click(driver);
	}

}
