package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver= driver;
    }
    private By ShoppingCartTile = By.xpath("//span[contains(text(), 'Shopping Cart') and @data-ui-id = 'page-title-wrapper']");

    public String ShoppingCartTitleGetText(){
        return driver.findElement(ShoppingCartTile).getText();
    }
}
