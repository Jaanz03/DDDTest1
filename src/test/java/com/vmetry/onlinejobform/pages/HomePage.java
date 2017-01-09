package com.vmetry.onlinejobform.pages;

import com.vmetry.onlinejobform.initializer.Initializer;
import com.vmetry.onlinejobform.initializer.driverfunctions;

public class HomePage extends Initializer {
	public static void enterName(String Name){
		getWebelementByXpath("HOMEPAGE_TYPE_NAME_XPATH").sendKeys(Name);
	}

	public static void enterDOB(String DOB){
		getWebelementByXpath("HOMEPAGE_TYPE_DOB_XPATH").sendKeys(DOB);
	}
	public static void selectGender(String Gender){
		getWebelementByXpath("HOMEPAGE_CHECK_GENDER_XPATH").sendKeys(Gender);
	}
	public static void enterCity(String City){
		getWebelementByXpath("HOMEPAGE_TYPE_CITY_XPATH").sendKeys(City);
	}
	public static void selectCountry(String Country){
		driverfunctions.SelectByVisibleText(Country, "HOMEPAGE_SELECT_COUNTRY_XPATH");
	}
	public static void enterEmail(String Email){
		getWebelementByXpath("HOMEPAGE_TPYE_EMAIL_XPATH").sendKeys(Email);
	}
	public static void confirmEmail(String Email1){
		getWebelementByXpath("HOMEPAGE_TPYE_CONFIRMEMAIL_XPATH").sendKeys(Email1);
	}
	public static void enterPassword(String Password){
		getWebelementByXpath("HOMEPAGE_TPYE_PASSWORD_XPATH").sendKeys(Password);
	}
	public static void confirmPassword(String Password1){
		getWebelementByXpath("HOMEPAGE_TPYE_CONFIRMPASSWORD_XPATH").sendKeys(Password1);
	}
}
