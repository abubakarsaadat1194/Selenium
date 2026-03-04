# Selenium Web Automation Projects

This repository contains two Selenium automation projects developed using *Java, Gradle, and JUnit*. These projects demonstrate automated browser testing using Selenium WebDriver.

---

## Projects Included

### 1. Google Calculator Automation

This project automates the Google Calculator using Selenium WebDriver. It performs arithmetic operations and verifies that the output displayed by the calculator is correct.

#### Features
•⁠  ⁠Opens Google in a browser
•⁠  ⁠Searches for the calculator
•⁠  ⁠Performs automated button clicks
•⁠  ⁠Validates results using *JUnit assertions*
•⁠  ⁠Uses *WebDriverWait* for dynamic elements

#### Example Test Case
Input:


63 × 21


Expected Result:


1323


The test verifies that the calculator displays the correct result.

---

### 2. Internet Speed Test Automation

This project automates a web-based speed test using Selenium WebDriver.

#### Features
•⁠  ⁠Opens the speed test website
•⁠  ⁠Starts the internet speed test automatically
•⁠  ⁠Waits for the test to complete
•⁠  ⁠Extracts and prints:
  - Download speed
  - Upload speed
  - Ping (optional)

This demonstrates how Selenium can interact with dynamic elements that update over time.

---

## Technologies Used

•⁠  ⁠Java 21
•⁠  ⁠Selenium WebDriver
•⁠  ⁠JUnit 4
•⁠  ⁠Gradle
•⁠  ⁠Eclipse IDE

---

## Project Structure


Selenium
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       └── java
│           └── webdrivertest
│               ├── WebTesting.java
│               └── SpeedTest.java
│
├── drivers
├── build.gradle.kts
├── settings.gradle.kts
└── README.md


---

## Setup Instructions

### 1. Clone the repository


git clone https://github.com/your-username/selenium-web-automation.git


### 2. Open the project

Open the project in *Eclipse IDE*.

### 3. Install dependencies

Gradle will automatically download the required dependencies.

You can also refresh manually:


Right Click Project → Gradle → Refresh Gradle Project


---

## Running the Tests

Tests are executed using *JUnit*.

1.⁠ ⁠Right click the test class (e.g., ⁠ WebTesting.java ⁠)
2.⁠ ⁠Select:


Run As → JUnit Test


The browser will open automatically and execute the automation steps.

---

## Learning Objectives

These projects demonstrate:

•⁠  ⁠Browser automation using Selenium
•⁠  ⁠Writing automated test cases with JUnit
•⁠  ⁠Handling dynamic web elements
•⁠  ⁠Using explicit waits (⁠ WebDriverWait ⁠)
•⁠  ⁠Structuring Java automation projects

---

## Author

*Abu Bakar Saadat*

Master's in Electrical and Information Technology  
Karlsruhe Institute of Technology (KIT)

Specialization:
•⁠  ⁠Software Quality Assurance
•⁠  ⁠Test Automation
•⁠  ⁠Selenium
•⁠  ⁠Networking Systems

---

## License

This project is for *educational purposes*.
