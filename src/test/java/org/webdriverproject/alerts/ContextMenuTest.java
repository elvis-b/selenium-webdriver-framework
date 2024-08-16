package org.webdriverproject.alerts;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.ContextMenuPage;

public class ContextMenuTest extends BaseTest {

    @Test
    public void testContextMenu() {
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPage();
        contextMenuPage.rightClickOnBox();
        String message = contextMenuPage.getAlertText();
        contextMenuPage.acceptPopUp();
        Assert.assertEquals(message, "You selected a context menu", "Selection not successful");
    }

}
