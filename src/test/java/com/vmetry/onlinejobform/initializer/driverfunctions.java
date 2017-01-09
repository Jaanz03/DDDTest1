package com.vmetry.onlinejobform.initializer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class driverfunctions extends Initializer{
	public static void SelectByVisibleText(String India, String Xpath){
		WebElement select = getWebelementByXpath(Xpath);
		Select S = new Select(select);
		S.selectByVisibleText(India);
	}

}
