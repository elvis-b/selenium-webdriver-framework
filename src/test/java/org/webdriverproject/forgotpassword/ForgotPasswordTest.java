package org.webdriverproject.forgotpassword;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.EmailSentPage;
import org.webdriverproject.pages.ForgotPasswordPage;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testPasswordRecovery() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("elvisalex.b@gmail.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        Assert.assertTrue(emailSentPage.getConfirmationMessage().contains("Internal Server Error"), "Failed recovery");
    }


}
