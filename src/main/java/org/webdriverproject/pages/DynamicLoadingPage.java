package org.webdriverproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXpathFormat = "//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpathFormat, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpathFormat, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPageExample1 clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingPageExample1(driver);
    }

    public DynamicLoadingPageExample2 clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingPageExample2(driver);
    }

    public DynamicLoadingPageExample2 rightClickExample2(){
        driver.findElement(link_Example2).sendKeys(Keys.COMMAND, Keys.RETURN);
        return new DynamicLoadingPageExample2(driver);
    }
}
