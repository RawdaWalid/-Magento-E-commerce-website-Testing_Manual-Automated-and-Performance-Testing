package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingAdressPage {
    WebDriver driver;
    public ShippingAdressPage(WebDriver driver) {
        this.driver = driver;
    }

    private By ShippingAdressTitle = By.xpath("//div[contains(text(), 'Shipping Address')]");

    public String GetTextShippingAddressTitle(){
        return driver.findElement(ShippingAdressTitle).getText();
    }
}
