package homepage;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTest extends BaseSteps {
// HomePage homePage;
// BaseSteps baseSteps;
// SalesPage salesPage;
//SignInPage signInPage;??
///SignInPage signInPage = new SignInPage(driver);



    //Test case 1
    @Test(priority = 2)
    public void OpenCategories() throws InterruptedException {
        homePage.ClickOnWhatsNew();
        driver.navigate().back();
        homePage.ClickOnWomen();
        driver.navigate().back();
        homePage.ClickOnMen();
        driver.navigate().back();
        homePage.ClickOnGear();
        driver.navigate().back();
        homePage.ClickOnTraining();
        driver.navigate().back();
        homePage.ClickOnSales();
        Thread.sleep(5000);
        SalesPage salesPage1 = new SalesPage(driver);
        String ActualResultSales = salesPage1.SalesNameGet();
        String ExpectedResultales = "Sale";
        Assert.assertTrue(ActualResultSales.equals(ExpectedResultales));
        System.out.println("Test case 1 successful= "+ ActualResultSales);
        //WhatsNewPage whatsNewPage = homePage.ClickOnWhatsNew();

    }

    //Test case 5
    @Test(priority = 2)
    public void DropdownMenu() {
        homePage.CheckDropDownWomen();
        String ActualResultDropdown = homePage.CheckTextTops();
        String ExpectedResultDropdown = "Tops";
        Assert.assertTrue(ActualResultDropdown.contains(ExpectedResultDropdown));
        System.out.println("Test case 5 successful= "+ ActualResultDropdown);
    }

    //Test case 6
    @Test(priority = 1)
    public void SubDropdownMenu() throws InterruptedException {
        homePage.CheckDropDownWomen();
        homePage.CheckSubDropDownTops();
        String ActualResultSubDropdown = homePage.CheckTextJackets();
        String ExpectedResultSubDropdown = "Jackets";
        Assert.assertTrue(ActualResultSubDropdown.contains(ExpectedResultSubDropdown));
        System.out.println("Test case 6 successful= "+ ExpectedResultSubDropdown);
    }

    //Test case 3
    @Test(priority = 3)
    public void OpenProductPage() {
        homePage.ClickOnProductBreath();
        ProductBreatheTankPage productBreatheTankPage = new ProductBreatheTankPage(driver);
        String ActualResultProductBreathe = productBreatheTankPage.GetTextProductBreathe();
        String ExpectedResultProductBreathe = "Breathe";
        Assert.assertTrue(ActualResultProductBreathe.contains(ExpectedResultProductBreathe));
        System.out.println("Test case 3 successful= "+ ExpectedResultProductBreathe);

    }

//Test case 7
    @Test(priority = 4)
    public void WishlistGuest() {
        homePage.HoverOnProductBreath();
        homePage.ClickWishlistProductBreathe();
        SignInPage signInPage = new SignInPage(driver);
        String ActualResultCustomerLogin = signInPage.CheckCustomerLoginPage();
        String ExpectedResultCustomerLogin = "Customer Login";
        Assert.assertTrue(ActualResultCustomerLogin.contains(ExpectedResultCustomerLogin));
        System.out.println("Test case 7 successful= "+ ExpectedResultCustomerLogin);
    }

    //Test case 8 (issue)
    @Test (priority = 16)
    public void WishlistUser() throws InterruptedException {
        SignInPage signInPage = new SignInPage(driver);
        homePage.ClickOnSignIn();
        signInPage.WriteEmail();
        signInPage.WritePassword();
        signInPage.ClickSignInBtn();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage.HoverOnProductBreath();
        homePage.ClickWishlistProductBreathe();
        WishlistPage wishlistPage = new WishlistPage(driver);
        String ActualResultWishlistPageTitle = wishlistPage.GetWishlistPageTitle();
        String ExpectedResultWishlistPageTitle = "My Wish List";
        Assert.assertTrue(ActualResultWishlistPageTitle.contains(ExpectedResultWishlistPageTitle));
        System.out.println("Test case 8 successful= "+ ExpectedResultWishlistPageTitle);
    }

    //Test case 9
    @Test(priority = 6)
    public void AddToCartNoSizeorColor() {
        homePage.HoverOnProductBreath();
        homePage.ClickOnAddCart();
        ProductBreatheTankPage productBreatheTankPage = new ProductBreatheTankPage(driver);
        String ActualResultProductBreathe = productBreatheTankPage.GetTextProductBreathe();
        String ExpectedResultProductBreathe = "Breathe";
        Assert.assertTrue(ActualResultProductBreathe.contains(ExpectedResultProductBreathe));
        System.out.println("Test case 9 successful= "+ ExpectedResultProductBreathe);
    }

    //Test case 10
    @Test (priority= 7)
    public void AddToCompareList() {
        homePage.HoverOnProductBreath();
        homePage.ClickOnAddCompareList();
        String ActualResultCompareListPopup = homePage.PopUpCompareListGetText();
        String ExpectedResultCompareListPopup = "comparison list";
        Assert.assertTrue(ActualResultCompareListPopup.contains(ExpectedResultCompareListPopup));
        System.out.println("Test case 10 successful= "+ ExpectedResultCompareListPopup);
    }

    //Test case 13
    @Test (priority =8)
    public void Reviews() {
        homePage.HoverOnProductBreath();
        homePage.ClickOnReviewsBreathe();
        ProductBreatheTankPage productBreatheTankPage = new ProductBreatheTankPage(driver);
        String ActualResultProductBreathe = productBreatheTankPage.GetTextProductBreathe();
        String ExpectedResultProductBreathe = "Breathe";
        Assert.assertTrue(ActualResultProductBreathe.contains(ExpectedResultProductBreathe));
        System.out.println("Test case 13 successful= "+ ExpectedResultProductBreathe);

    }

    // Test case 14
    @Test (priority = 9)
    public void AddToCartAfterSizeColor() {
        homePage.AddBreatheTankToCart();
        homePage.FindBreatheTankInCartGetText();
        String ActualResultCartProduct = homePage.FindBreatheTankInCartGetText();
        String ExpectedResultCartProduct  = "Breathe";
        Assert.assertTrue(ActualResultCartProduct.contains(ExpectedResultCartProduct));
        System.out.println("Test case 14 successful= "+ ExpectedResultCartProduct);
    }

    // Test case 15
    @Test (priority = 10)
    public void ClickOnProductName() {
        homePage.AddBreatheTankToCart();
        homePage.ClickOnFindBreatheTankInCart();
        ProductBreatheTankPage productBreatheTankPage = new ProductBreatheTankPage(driver);
        String ActualResultProductBreathe = productBreatheTankPage.GetTextProductBreathe();
        String ExpectedResultProductBreathe = "Breathe";
        Assert.assertTrue(ActualResultProductBreathe.contains(ExpectedResultProductBreathe));
        System.out.println("Test case 15 successful= "+ ExpectedResultProductBreathe);
    }

    // Test case 16
    @Test (priority = 11)
    public void ClickEditCart() {
        homePage.AddBreatheTankToCart();
        homePage.ClickOnEditProductCart();
        System.out.println("Test case 16 successful");
    }

    // Test case 17
    @Test (priority = 12)
    public void EditQty() throws InterruptedException {
        Thread.sleep(500);
        homePage.AddBreatheTankToCart();
        homePage.EditQtyIsDisplayed();
        String EditQtyNumber = homePage.EditQtyBreatheCartGetAttribute();
        System.out.println("Initial value= " + EditQtyNumber);
        homePage.EditQtyDeleteNumber();
        String EditQtyNumber2 =  homePage.EditQtyBreatheCartGetAttribute();
        System.out.println("Empty Qty= " + EditQtyNumber2);
        Assert.assertEquals(EditQtyNumber2, "");
        homePage.EditQtyAddNumber("20");
        homePage.ClickOnEditUpdateBtn();
        String EditQtyNumber3 = homePage.EditQtyBreatheCartGetAttribute();
        System.out.println("New Qty= " + EditQtyNumber3);
        Assert.assertNotEquals(EditQtyNumber3, EditQtyNumber);
        System.out.println("Test case 17 successful");
    }

    // Test case 18
    @Test (priority = 13)
    public void DeleteProductCart() throws InterruptedException {
        Thread.sleep(500);
        homePage.AddBreatheTankToCart();
        homePage.DeleteBreatheTankFromCart();
        String ActualResultDeletionMessage = homePage.AfterDeletionMessageGetText();
        String ExpectedResultDeletionMessage = "You have no items in your shopping cart";
        Assert.assertTrue(ActualResultDeletionMessage.contains(ExpectedResultDeletionMessage));
        System.out.println("Test case 18 successful= "+ ExpectedResultDeletionMessage);


    }

    // Test case 19
    @Test (priority = 14)
    public void CheckOutBtnCart() throws InterruptedException {
        Thread.sleep(500);
        homePage.AddBreatheTankToCart();
        homePage.ClickOnCheckOutBtnCart();
        ShippingAdressPage shippingAdressPage = new ShippingAdressPage(driver);
        String ActualResultShippingAddressTitle = shippingAdressPage.GetTextShippingAddressTitle();
        String ExpectedResultShippingAddressTitle = "Shipping Address";
        Assert.assertTrue(ActualResultShippingAddressTitle.contains(ExpectedResultShippingAddressTitle));
        System.out.println("Test case 19 successful= "+ ExpectedResultShippingAddressTitle);
    }

    // Test case 20
    @Test (priority = 15)
    public void ViewCartMainPage() throws InterruptedException {
        Thread.sleep(500);
        homePage.AddBreatheTankToCart();
        homePage.ClickOnViewProductCart();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        String ActualResultShoppingCartTitle = shoppingCartPage.ShoppingCartTitleGetText();
        String ExpectedResultShoppingCartTitle = "Shopping";
        Assert.assertTrue(ActualResultShoppingCartTitle.contains(ExpectedResultShoppingCartTitle));
        System.out.println("Test case 20 successful= "+ ExpectedResultShoppingCartTitle);

    }

}
