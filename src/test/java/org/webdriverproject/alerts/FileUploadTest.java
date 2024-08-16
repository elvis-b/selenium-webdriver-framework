package org.webdriverproject.alerts;

import org.webdriverproject.base.BaseTest;
import org.testng.annotations.Test;
import org.webdriverproject.pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/elvisbucatariu/Documents/TestAutomationUniversity/junit5tutorial/selenium_demo/seleniumtutorial/seleniumtutorial/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "File not found");
    }

}
