package org.webdriverproject.login;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.LoginPage;
import org.webdriverproject.pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickAuthenticationForm();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Alert text is incorrect");
    }

}
