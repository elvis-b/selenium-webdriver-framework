# Selenium-TestNG Automation Tests

This project is a series of automated tests performed on the testing website [the-internet.herokuapp.com](https://the-internet.herokuapp.com) using Selenium WebDriver, TestNG, and Java. The framework includes features such as screenshot capture for test failures and event logging for enhanced debugging and analysis. 

## Features

- **Automated Testing**: Tests are automated using Selenium WebDriver.
- **TestNG Integration**: Test execution and management are handled using TestNG.
- **Screenshot Capture**: Automatically captures screenshots on test failures.
- **Event Listener**: The tests can listen for events, improving the test analysis process.

## Getting Started

Follow these instructions to set up and run the tests on your local machine.

### Prerequisites

- **Java Development Kit (JDK)**: Ensure that you have JDK 9 or higher installed.
- **Maven**: Apache Maven is required to manage the project dependencies.
- **ChromeDriver**: Download and place an updated version of ChromeDriver executable in the `resources` directory.

### Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/selenium-webdriver-framework.git
   cd selenium-webdriver-framework
2. **Navigate to the project directory and run the following Maven command to download the required dependencies**:
   ```bash
   mvn clean install
3. **To execute the tests, use the following Maven command**:
  ```bash
  mvn test
