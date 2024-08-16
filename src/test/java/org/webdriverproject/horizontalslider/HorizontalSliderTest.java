package org.webdriverproject.horizontalslider;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testHorizontalSlider() {
        String value = "4";
        HorizontalSliderPage horizontalSlider = homePage.clickHorizontalSliderPage();
        horizontalSlider.setSliderValue(value);
        Assert.assertEquals(horizontalSlider.getSliderValue(), "4", "Slider value is not correct");
    }
}

