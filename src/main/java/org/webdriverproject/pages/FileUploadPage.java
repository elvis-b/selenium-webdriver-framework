package org.webdriverproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {

    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String absolutePath) {
        driver.findElement(inputField).sendKeys(absolutePath);
        clickUploadButton();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFiles() {
        return driver.switchTo().alert().getText();
    }

}
