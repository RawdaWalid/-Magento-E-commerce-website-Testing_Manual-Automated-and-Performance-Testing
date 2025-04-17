package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesPage {
    WebDriver driver;
    public SalesPage(WebDriver driver) {
        this.driver = driver;
    }
    //locator
    private By SalesName= By.xpath("//h1[@class='page-title']");

    public String SalesNameGet(){
        return driver.findElement(SalesName).getText();

    }
}
