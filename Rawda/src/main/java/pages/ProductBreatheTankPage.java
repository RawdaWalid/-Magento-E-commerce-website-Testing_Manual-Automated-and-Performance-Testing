package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductBreatheTankPage  {
    WebDriver driver;

    public ProductBreatheTankPage(WebDriver driver) {
        this.driver = driver;;
    }

    private By BreathProductTitle = By.xpath("//span[contains(text(), 'Breathe-Easy Tank')]");

    public String GetTextProductBreathe(){
       return driver.findElement(BreathProductTitle).getText();

    }
}
