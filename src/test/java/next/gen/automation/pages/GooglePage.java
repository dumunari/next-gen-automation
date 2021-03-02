package next.gen.automation.pages;

import next.gen.automation.steps.SeleniumDriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends SeleniumDriverHelper {

    @FindBy(name = "q")
    public WebElement googleSearchField;

    @FindBy(id = "result-stats")
    public WebElement resultStats;

    @FindBy(xpath = "//*[@id=\"wp-tabs-container\"]/div[1]/div[3]/div/div/div/div[2]/h2")
    public WebElement bandNameDataContainer;

    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    public void goToGoogleSearchPage() {
        driver.get("http://www.google.com");
    }

    public void searchFor(String searchItem) {
        googleSearchField.sendKeys(searchItem);
        googleSearchField.submit();
    }

    public boolean dataContainerHasBandName(String bandName) {
        return bandName.equals(bandNameDataContainer.getText());
    }
}
