package org.webdriverproject.wait;

import org.webdriverproject.base.BaseTest;
import org.testng.annotations.Test;
import org.webdriverproject.pages.DynamicLoadingPageExample1;
import org.webdriverproject.pages.DynamicLoadingPageExample2;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public void testWaitUntilHidden() {
        DynamicLoadingPageExample1 loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Text could not be retrieved");
    }

    @Test
    public void testWaitUntilHidden2() {
        DynamicLoadingPageExample2 loadingPageExample2 = homePage.clickDynamicLoading().clickExample2();
        loadingPageExample2.clickStart();
        assertEquals(loadingPageExample2.getLoadedText(), "Hello World!", "Text could not be retrieved");
    }
}
