package SelTraining.SelTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTraining {

	public void selTraining(){
		//Driver Initialization
		System.setProperty("webdriver.chrome.driver", "D://Dineshkumar//07_Personal//AutomationLearn//SelTraining//Resource//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigating to WebPage
		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}
}
