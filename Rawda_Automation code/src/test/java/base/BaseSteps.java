package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseSteps {

    public WebDriver driver;
    public HomePage homePage;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://magento.softwaretestingboard.com/");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    public void GoBack(){

        driver.navigate().back();
    }
}
