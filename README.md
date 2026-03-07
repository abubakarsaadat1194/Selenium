# Selenium Web Automation Tests

This repository contains **automated web tests developed using Selenium WebDriver and JUnit**.  
The project demonstrates browser automation by interacting with Google services such as:

- Google Internet Speed Test
- Google Calculator

The automated tests simulate real user behavior, verify UI interactions, and validate application functionality using **explicit waits and WebDriver locators**.

---

# Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Test Scenarios](#test-scenarios)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running the Tests](#running-the-tests)
- [Key Selenium Concepts Demonstrated](#key-selenium-concepts-demonstrated)
- [Future Improvements](#future-improvements)
- [Author](#author)

---

# Project Overview

This project demonstrates **web automation testing using Selenium WebDriver** with the **JUnit testing framework**.

The automated tests perform tasks such as:

- Searching on Google
- Running a Google internet speed test
- Performing calculations using Google Calculator
- Validating expected results using assertions
- Using explicit waits to synchronize test execution

The goal of this project is to showcase how Selenium can be used to automate real-world browser interactions and validate application behavior.

---

# Technologies Used

- Java
- Selenium WebDriver
- JUnit
- ChromeDriver / FirefoxDriver
- WebDriverWait (Explicit Waits)

---

# Test Scenarios

The project includes the following automated test cases.

---

## 1. Google Internet Speed Test Automation

This test performs the following steps:

1. Launches Google in the browser
2. Accepts the cookie dialog (if present)
3. Searches for **"internet speed test"**
4. Clicks the **Run Speed Test** button
5. Waits for the test to complete
6. Extracts and prints:

   - Download speed
   - Upload speed

Example output:

    Your downlink throughput is: 85.23 Mbps
    Your uplink throughput is: 21.17 Mbps

---

## 2. Google Calculator Automation

This test automates Google Calculator and verifies mathematical operations.

### Test Case 1

Steps:

1. Search for **Calculator**
2. Enter `7 + 2`
3. Verify the result equals **9**
4. Clear the calculator

---

### Test Case 2

Steps:

1. Perform calculation **87 + 52**
2. Verify the result equals **139**
3. Clear the calculator

---

### Test Case 3

Steps:

1. Perform multiplication **63 × 21**
2. Verify the result equals **1323**

---

# Project Structure

    selenium-webdriver-tests
    │
    ├── src
    │   └── webdrivertest
    │       └── main.java
    │
    ├── drivers
    │   ├── chromedriver
    │   └── geckodriver
    │
    └── README.md

### Description

| Folder/File | Description |
|-------------|-------------|
| src/webdrivertest | Contains Selenium test classes |
| main.java | Main test implementation |
| drivers | Browser drivers for Chrome and Firefox |
| README.md | Project documentation |

---

# Setup Instructions

## 1 Install Java

Verify installation:

    java -version

---

## 2 Install Chrome Browser

Download Chrome:

https://www.google.com/chrome/

---

## 3 Download ChromeDriver

Download ChromeDriver from:

https://chromedriver.chromium.org/

Place it in your project **drivers folder**.

---

## 4 Add Selenium Dependencies

If using Maven:

    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.x.x</version>
    </dependency>

---

## 5 Configure Driver Path

Ensure the driver is configured in your WebTesting class:

    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

---

# Running the Tests

Run the tests using your IDE or JUnit runner.

Example:

    Run as → JUnit Test

The browser will open and execute the automated scenarios.

---

# Key Selenium Concepts Demonstrated

This project demonstrates several important Selenium automation concepts:

### WebDriver Initialization
Launching browsers such as Chrome or Firefox.

### Element Locators

Using different locator strategies:

- By.id
- By.name
- By.xpath
- By.cssSelector

### Explicit Waits

Using WebDriverWait and ExpectedConditions to synchronize tests.

Example:

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

### Assertions

Using JUnit assertions to validate expected outcomes.

Example:

    assertEquals("9", calculatorOutput);

---

# Future Improvements

Possible improvements for this project:

- Implement **Page Object Model (POM)**
- Add **TestNG framework**
- Generate **automated test reports**
- Add **parallel test execution**
- Integrate with **CI/CD pipelines**

---

# Author

Abu Bakar Saadat

QA Automation Engineer

Skills:

- Selenium WebDriver
- Playwright Automation
- Appium Mobile Testing
- JMeter Performance Testing
- Python and Java Automation

---

⭐ If you found this project useful, consider giving it a star!
