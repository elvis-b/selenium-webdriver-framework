package org.webdriverproject.nestedframes;

import org.webdriverproject.base.BaseTest;
import org.testng.annotations.Test;
import org.webdriverproject.pages.NestedFramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest {


    @Test
    public void testNestedFrames() {
        NestedFramesPage nestedFramesPage = homePage.clickNestedFramesPage();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Incorrect frame");;
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "Incorrect frame");

    }
}
