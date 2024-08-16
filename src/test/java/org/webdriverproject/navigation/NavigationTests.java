package org.webdriverproject.navigation;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.DynamicLoadingPageExample2;

public class NavigationTests extends BaseTest {


    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");

    }

    @Test
    public void testSwitchTabAfterRightClick(){
        DynamicLoadingPageExample2 dynamicLoadingPageExample2 = homePage.clickDynamicLoading().rightClickExample2();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(dynamicLoadingPageExample2.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
