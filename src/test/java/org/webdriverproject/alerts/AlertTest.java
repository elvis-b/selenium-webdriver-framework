package org.webdriverproject.alerts;

import org.webdriverproject.base.BaseTest;
import org.testng.annotations.Test;
import org.webdriverproject.pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert() {
        AlertsPage alertsPage = homePage.clickJSAlert();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Result text could not be retrieved");
    }

    @Test
    public void testGetTextFromAlert() {
        AlertsPage alertsPage = homePage.clickJSAlert();
        alertsPage.confirmAlert();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Text could not be retrieved");
    }

    @Test
    public void testSetInputInAlert() {
        AlertsPage alertsPage = homePage.clickJSAlert();
        alertsPage.triggerPrompt();

        String text = "Testing";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResultText(), "You entered: " + text, "Result could not be retrieved");
    }
}
