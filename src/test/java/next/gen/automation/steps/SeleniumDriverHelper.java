package next.gen.automation.steps;

import io.cucumber.core.api.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class SeleniumDriverHelper {

    protected static ChromeDriver driver = null;
    protected static WebDriverWait driverWait = null;

    @Before
    public void before() {
        int implicityWaitTime = 30;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driverWait = new WebDriverWait(driver, implicityWaitTime);
    }

    @After
    public void after(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            final File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destFile = new File("src/test/resources/screenshots/" + scenario.getName() + ".png");
            FileUtils.copyFile(screenshot, destFile);
        }
        driver.quit();
    }

}
