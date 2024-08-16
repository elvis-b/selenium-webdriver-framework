package org.webdriverproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DynamicLoadingPageExample1 {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingSymbol = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingPageExample1(WebDriver driver) {
        this.driver = driver;
    }

//    public void clickStart() {
//        driver.findElement(startButton).click();
//        Duration duration = Duration.of(5, ChronoUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingSymbol)));
//    }

    public void clickStart() {
        driver.findElement(startButton).click();
        FluentWait fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingSymbol)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

}
