package webdrivertest;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/* READ THIS FIRST
 * 
 * General instructions are given above each of the 4 test classes. Make sure to use the correct "By"
 * function for selection. You will either submit the line where you added your code fragment or the entire section
 * of code that you write for later problems on this assignment marked by CODE FRAGMENT or CODE.
 * 
 */

public class main {
	
	
	@BeforeClass
	public static void setUp() {
		WebTesting.initSystemProperties();
	}
	
	@AfterClass
	public static void tearDownAll() {
		if (WebTesting.getDriver() != null) {
			WebTesting.quitDriver();
		}
	}

	@After
	public void tearDown() {
		if (WebTesting.getDriver() != null) {
			WebTesting.quitDriver();
		}
	}
	
	

	
	
	/* Speed Test Explicit Instructions
	 * 
	 * Use "By.xpath" to select elements in these code fragments.
	 * "By.id" and "By.name" should be used where possible.
	 * 
	 */
	
	@Test
	public void testGoogleSpeedTestExplicitly() {
		/* Use one */
  //      FirefoxDriver driver = (FirefoxDriver) WebTesting.launchDriver("https://www.google.com", "firefox");
		ChromeDriver driver = (ChromeDriver) WebTesting.launchDriver("https://www.google.com", "chrome");
		if (driver == null) {
			fail("Driver not created.");
		}
		driver.manage().window().maximize();

		/* You can change these timeout values to what you see fit for your machine */
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(90));
		
		
		
		/* FIRST TEST */
		
		// #1: TODO (ensure that the search bar is visible before accessing it)
		// HINT: the search bar has attribute name="q"
		try {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    WebElement acceptCookies = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//button[.//div[text()='Alle akzeptieren']]"))
		    );
		    acceptCookies.click();
		    
		} catch (Exception e) {
		    // cookies already accepted or popup not shown
		}
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		} catch (TimeoutException ex) {
			fail("Search bar not found.");
		}
		
		
		
		
		// #2: TODO (enter "internet speed test" into the search bar then press the "Return" key)
		driver.findElement(By.name("q")).sendKeys("internet speed test" + Keys.RETURN);
		
		
		

		// #3: TODO (ensure that the "RUN SPEED TEST" button is clickable)
		// HINT: the button has attribute id="knowledge-verticals-internetspeedtest__test_button"
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"knowledge-verticals-internetspeedtest__test_button\"]/div")));
		} catch (TimeoutException ex) {
			fail("\"RUN SPEED TEST\" button not found.");
		}
		
		
		
		
		// #4: TODO (click the "RUN SPEED TEST" button by its "id" attribute)
		driver.findElement(By.id("knowledge-verticals-internetspeedtest__test_button")).click();

		try {
			longWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[jsaction='iyDKIb'] div[class='niO4u VDgVie SlP8xc']")));		
			} catch (TimeoutException ex) {
			fail("Retest button not found.");
		}
		
		// Getting the Downlink Throughput
		String downlink_throughput=driver.findElement(By.cssSelector("div[id='knowledge-verticals-internetspeedtest__download'] p[class='spiqle']")).getText();
		String uplink_throughput = driver.findElement(By.cssSelector("p[jsname='dSdcdd']")).getText();
		System.out.print("Your downlink throughput is: "+ downlink_throughput + " and your uplink throughput is: " + uplink_throughput);
	}

	
@Test
public void testGoogleCalculator() {
	/* Use one */
//      FirefoxDriver driver = (FirefoxDriver) WebTesting.launchDriver("https://www.google.com", "firefox");
	ChromeDriver driver = (ChromeDriver) WebTesting.launchDriver("https://www.google.com", "chrome");
	if (driver == null) {
		fail("Driver not created.");
	}
	driver.manage().window().maximize();

	/* You can change these timeout values to what you see fit for your machine */
	WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebDriverWait longWait = new WebDriverWait(driver, Duration.ofSeconds(90));
	
	
	
	/* FIRST TEST */
	
	// #1: TODO (ensure that the search bar is visible before accessing it)
	// HINT: the search bar has attribute name="q"
	try {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement acceptCookies = wait.until(
	        ExpectedConditions.elementToBeClickable(By.xpath("//button[.//div[text()='Alle akzeptieren']]"))
	    );
	    acceptCookies.click();
	    
	} catch (Exception e) {
	    // cookies already accepted or popup not shown
	}
	try {
		shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	} catch (TimeoutException ex) {
		fail("Search bar not found.");
	}
	
	
	
	
	// #2: TODO (enter "calculator" into the search bar then press the "Return" key)
	driver.findElement(By.name("q")).sendKeys("Calculator" + Keys.RETURN);
	
	
	

	// #3: TODO (ensure that the "RUN SPEED TEST" button is clickable)
	// HINT: the button has attribute id="knowledge-verticals-internetspeedtest__test_button"
	try {
		shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".z7BZJb.XSNERd")));
	} catch (TimeoutException ex) {
		fail("Calculator not found.");
	}
	
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='rk7bOd']")).click();
	
	shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cwos")));
	String output= "7";
	
	System.out.print(driver.findElement(By.cssSelector("#cwos")).getText());
	
	WebElement calculatorText = driver.findElement(By.id("cwos"));
	
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7"));
	} catch (TimeoutException ex) {
		fail("\"7\" was not input.");
	}
	
	driver.findElement(By.cssSelector("div[aria-label='Plus']")).click();
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7 +"));
	} catch (TimeoutException ex) {
		fail("\"+\" was not input.");
	}
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='lVjWed']")).click();
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "7 + 2"));
	} catch (TimeoutException ex) {
		fail("\"2\" was not input.");
	}
	driver.findElement(By.cssSelector("div[aria-label='Ist gleich']")).click();
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "9"));
	} catch (TimeoutException ex) {
		fail("\"Answer incorrect not equal to 9.");
    }
	// #22: TODO (press "AC" button and check whether the value was cleared)
			// HINT: the clear button is a div with jsname="SLn8gc"
	// press AC button
	WebElement clearButton = shortWait.until(
	        ExpectedConditions.elementToBeClickable(
	                By.cssSelector("div[aria-label='Alles löschen']")
	        )
	);

	clearButton.click();

	try {
	    longWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
	}
	catch (TimeoutException ex) {
	    fail("Output not cleared to \"0\".");
	}
	
	// #23: TODO (Solve "87 + 52" with correct usage of WebDriverWait)
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='T7PMFe']")).click();
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='rk7bOd']")).click();

	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87"));
	} catch (TimeoutException ex) {
		fail("Not enetered 87.");
    }
	
	driver.findElement(By.cssSelector("div[aria-label='Plus']")).click();
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 +"));
	} catch (TimeoutException ex) {
		fail("\"+\" was not input.");
	}
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='Ax5wH']")).click();
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='lVjWed']")).click();
	
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "87 + 52"));
	} catch (TimeoutException ex2) {
		fail("\"+\" was not input.");
	}
	driver.findElement(By.cssSelector("div[aria-label='Ist gleich']")).click();
	try {
		longWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "139"));
	} catch (TimeoutException ex3) {
		fail("\"Answer incorrect not equal to 139.");
	
	}
	// press AC button

		clearButton.click();

		try {
		    longWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "0"));
		}
		catch (TimeoutException ex) {
		    fail("Output not cleared to \"0\".");
		}
	// #24: TODO (Solve "63 × 21" with correct usage of WebDriverWait)
			/*CODE*/
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='abcgof']")).click();
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='KN1kY']")).click();

	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63"));
	} catch (TimeoutException ex) {
		fail("Not enetered 63.");
    }
	
	driver.findElement(By.cssSelector("div[aria-label='Multiplizieren']")).click();
	try {
		shortWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "63"));
	} catch (TimeoutException ex) {
		fail("\"x\" was not input.");
	}
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='lVjWed']")).click();
	driver.findElement(By.cssSelector(".XRsWPe.AOvabd[jsname='N10B9']")).click();
	
	driver.findElement(By.cssSelector("div[aria-label='Ist gleich']")).click();
	try {
		longWait.until(ExpectedConditions.textToBePresentInElement(calculatorText, "1323"));
	} catch (TimeoutException ex3) {
		fail("\"Answer incorrect not equal to 1323.");
	
	}
	
}
}	
	
	
	