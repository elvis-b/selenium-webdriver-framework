package org.webdriverproject.dropdown;

import org.webdriverproject.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.webdriverproject.pages.DropdownPage;

import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }

}
