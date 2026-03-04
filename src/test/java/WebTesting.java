


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chromium.ChromiumOptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;


public class WebTesting {
	private static WebDriver localDriver;
	
	
	public static WebDriver getDriver() {
		return localDriver;
	}
	
	
	public static void initSystemProperties() {
		// Collect path to drivers

		String geckoPath = "/Users/abubakar/Downloads/geckodriver";
		System.out.println(geckoPath);
		
				
		// Firefox Driver
		/** Tested for Firefox Version 85.0.2    **/
		/** Tested for geckdriver Version 0.29.0 **/
		System.setProperty("webdriver.gecko.driver", geckoPath);
		
		
	}
	
	
	public static WebDriver launchDriver(String siteUrl, String browser) {
		if (browser.equals("firefox")) {
			// Set options for Firefox
			FirefoxOptions options = new FirefoxOptions()
					     	.addPreference("browser.startup.page", 1)
					     	.addPreference("browser.startup.homepage", siteUrl)
					     	.setAcceptInsecureCerts(true);
				
			// Browser is launched on creation of the driver

			quitDriver();
			localDriver = new FirefoxDriver(options);
		} else if (browser.equals("chrome")) {

		    // Set options for Chrome
		    ChromeOptions options = (ChromeOptions) new ChromeOptions()
		            .addArguments(siteUrl).addArguments("profile-directory=Default").addArguments("--disable-blink-features=AutomationControlled");
;

		    // Browser is launched on creation of the driver
		    quitDriver();
		    localDriver = new ChromeDriver(options);

		    // OPEN THE WEBSITE
		    localDriver.get(siteUrl);
		     
		} 
		return localDriver;
	}
	
	public static void quitDriver() {
		if (localDriver != null) {
			localDriver.quit();
			localDriver = null;
		}
	}
}
