package org.webdriverproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
        while (getNumberOfPragraphs() < index) {
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfPragraphs() {
        return driver.findElements(textBlocks).size();
    }

}
