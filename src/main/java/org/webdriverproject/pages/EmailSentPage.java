package org.webdriverproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {

    private WebDriver driver;
    private By emailSentConfirmation = By.cssSelector("body h1");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() {
        return driver.findElement(emailSentConfirmation).getText();
    }

}
