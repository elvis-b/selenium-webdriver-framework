package org.webdriverproject.base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.webdriverproject.pages.HomePage;
import org.webdriverproject.utils.EventReporter;
import org.webdriverproject.utils.WindowManager;
import java.io.File;
import java.io.IOException;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriverListener listener = new EventReporter();
        driver = new EventFiringDecorator<>(listener).decorate(new ChromeDriver(getChromeOptions()));
        goHome();
        setCookie();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://the-internet.herokuapp.com");
    }

    @AfterClass
    public void closeWebDriver() {
        driver.quit();
    }

//    @AfterMethod
//    public void takeScreenshot(){
//        TakesScreenshot camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        try {
//            Files.move(screenshot, new File("resources/screenshots/test.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Screenshot taken: " + screenshot);
//    }

        @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()){
            TakesScreenshot camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Screenshot taken: " + screenshot);
        }
    }



    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("--disable-search-engine-choice-screen");
        return options;

    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("mycookie", "123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
