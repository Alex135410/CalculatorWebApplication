# KSU SWE 3643 Software Testing and Quality Assurance Semester Project: Web-Based Calculator
The repository contains many files and information that show how the “Web-Based Calculator” was developed. This repository has code for application and unit testing code.

## Table of Contents
- [Team Members](#team-members )
- [Architechture](#architecture)
- [Environment](#environment)
- [Executing the Web Application](#executing-the-web-application )
- [Executing Unit Test](#executing-unit-test )
- [Reviewing Unit Test Coverage](#reviewing-unit-test-coverage )
- [Executing End-To-End Tests](#executing-end-to-end-tests )
- [Final Video Presentation ](#final-video-presentation )


# Team Members 
Alex Castillo <br/>
Joel Roche 

# Architecture
This Architecture of this project is set up using a combination of packages and classes. Packages include: Calculator Engine, Calculator Engine Unit Test, Calculator Web Server App, and Calculator End-To-End Test. Classes include: CalculatorEngine, CalculatorTest, CalculatorEndToEndTest, Models, Views, and Controllers. The relationship betweens these are, CalculatorEngineUnitTest interacts with CalculatorEngine for unit testing. Controllers inteact with Models and Views to manage data and user interface elements. Controllers use the CalculatorEngine to preform calculations. Fianlly, CalculatorEndToEndTests interact with Controllers via HTTP calls simulating through a headless browser.

![UMLSoftware](https://github.com/Alex135410/SWE3643Project/assets/129552122/c70b4156-e62a-4dc8-833f-788720f68bfa)


# Environment
This is a cross-platform application and should work in Windows 10+ and MacOS.<br/>
(Note this application has only been tested on MacOS.)<br/>
To prepare your environment to execute this application:
  1. [Install the latest version of Java](https://www.oracle.com/java/technologies/downloads/#java22) 
  2. [Install the lastest version of IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=mac)
  3. [Clone repostitory from Github](https://github.com/Alex135410/SWE3643Project)<br/>
  
Upon installing all these files above you have sucessfully set up your environment and are ready to run the application on your device. 

# Executing the Web Application
This below will show you how to run the web application from the terminal command line <br/>

# Executing Unit Test
This below will show you how to run the unit test from the terminal command line <br/>
  1. Open terminal application
  2. Change directory to "cd /Users/alexcastillo/IdeaProjects/SWE3643Project/calculator-engine/src/test/java/org/example"
  3. Type in "javac calculatorTest.java" to compile the test
  4. Type in "java calculatorTest" to run the test

Doing all these step will insure you can run the web application via command line. This is incase the user does not have an IDE to run the program.

# Reviewing Unit Test Coverage
Coverage statistics:


<img width="792" alt="Screenshot 2024-04-24 at 5 39 13 PM" src="https://github.com/Alex135410/SWE3643Project/assets/129552122/6589c362-926e-49e8-87e8-4c9e48dff633">


# Excecuting End-To-End Tests
This below will show you how to run the end-to-end test from the terminal command line <br/>
  1. Open terminal application
  2. Change directory to "cd /Users/alexcastillo/IdeaProjects/SWE3643Project/calculator-engine/src/test/java/org/example/calculatorengine/CalculatorEngineApplicationTests.java"
  3. Type in "javac CalculatorEngineApplication.java" to compile the test
  4. Type in "java CalculatorEngineApplication" to run the test

Doing all these steps will insure you can run the end-to-end test via command line. This is incase the user does not have an IDE to run the program.

# Final Video Presentation

