package com.vmetry.onlinejobform.testcases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vmetry.onlinejobform.initializer.Initializer;
import com.vmetry.onlinejobform.inputreader.inputreader;
import com.vmetry.onlinejobform.pages.HomePage;

public class HomePageTest extends Initializer{
	@BeforeTest
	public void openbrowser() throws IOException{
	initialize();		
	}
	@Test(dataProvider = "HomePageTest")
	public void testHomePage(String Name,String DOB,String Gender,String City,String Country,String Email,String Email1,String Password,String Password1) throws IOException{
		wd.get(envProp.getProperty("URL"));
		HomePage.enterName(Name);
		HomePage.enterDOB(DOB);
		HomePage.selectGender(Gender);
		HomePage.enterCity(City);
		HomePage.selectCountry(Country);
		HomePage.enterEmail(Email);
		HomePage.confirmEmail(Email1);
		HomePage.enterPassword(Password);
		HomePage.confirmPassword(Password1);
		
	}
	@DataProvider(name="HomePageTest")
	public static Object[][] getdata() throws Exception{
		if(inputreader.RunModeVerification("HomePageTest")){
			Object[][] data = inputreader.selectSingleDataOrMulitiData("HomePageTest");
		/*Object[][] data = new Object[2][9];
		data[0][0] = "TestA";
		data[0][1] = "03/07/1992";
		data[0][2] = "Female";
		data[0][3] = "Chennai";
		data[0][4] = "India";
		data[0][5] = "abc@gmail.com";
		data[0][6] = "abc@gmail.com";
		data[0][7] = "donnley";
		data[0][8] = "donnley";
		
		data[1][0] = "TestB";
		data[1][1] = "03/08/1992";
		data[1][2] = "Female";
		data[1][3] = "Chennai";
		data[1][4] = "France";
		data[1][5] = "abc@gmail.com";
		data[1][6] = "abc@gmail.com";
		data[1][7] = "donnley";
		data[1][8] = "donnley";*/
		return data;
		}
		return null;	
	}
	@AfterMethod
	public void teardown(ITestResult R){
		if(R.isSuccess()){
}
		else{
			
		}
}
}
