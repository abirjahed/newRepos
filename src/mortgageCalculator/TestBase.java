package mortgageCalculator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver = new ChromeDriver();

    //This method sets chromedriver and opens the url
    @BeforeMethod
    public void loadUrl() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver.get("https://www.mortgagecalculator.org/");
    }

    //This method closes the driver
    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

}
