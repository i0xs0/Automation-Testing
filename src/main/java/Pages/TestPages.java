package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl() {
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }


    public void ChangeLanguge() {
        WebElement English = driver.findElement(languge); // Find login button element
        English.click(); // Click on the login button
    }

    public void ClickBootCamp() {
        WebElement BootCamp = driver.findElement(Boot); // Find login button element
        BootCamp.click(); // Click on the login button
    }

    public void ClickFilter() {
        WebElement Filter = driver.findElement(filter1); // Find login button element
        Filter.click(); // Click on the login button
    }

    public void ClickSearche() {
        WebElement Search = driver.findElement(Search1); // Find login button element
        Search.click(); // Click on the login button
    }

    public void EnterText() {
         driver.findElement(Text1).sendKeys("علم");
         // Click on the login button
    }

    public void ClickRegion() {
        WebElement Region = driver.findElement(Region1); // Find login button element
        Region.click(); // Click on the login button
    }

    public void ClickData() {
        WebElement Data = driver.findElement(Data1); // Find login button element
        Data.click(); // Click on the login button
    }

    public void SelectFromRegion() {
        WebElement Regionn = driver.findElement(Region2); // Find login button element
        Regionn.click(); // Click on the login button
    }

    public void ClickCatogray() {
        WebElement Catogray = driver.findElement(Catogray1); // Find login button element
        Catogray.click(); // Click on the login button
    }


    public void Scroll(int x, int y) {
        JavascriptExecutor Js = (JavascriptExecutor) driver; // Find login button element
        Js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x,y); // Click on the login button
    }


    public void ClickBoot2() {
        WebElement BootCamp2 = driver.findElement(Boot2); // Find login button element
        BootCamp2.click(); // Click on the login button
    }



/*
    public void EnterText() {
        WebElement Text = driver.findElement(Text1).sendKeys("e.com");
        Text.click(); // Click on the login button
    }
*/


//driver.findElement(emailAddressLogin).sendKeys("roxas.xs@gmail.com");




}









/*
    // Method to click on the login button on the home page
    public void LoginHomePageMethod() {
        WebElement loginPage = driver.findElement(loginBtnInHomePage); // Find login button element
        loginPage.click(); // Click on the login button
    }

    // Method to enter login credentials and verify login
    public void EnterLoginCredentials() throws InterruptedException {
        driver.findElement(emailAddressLogin).sendKeys("roxas.xs@gmail.com"); // Find email address field and enter email
        Thread.sleep(3000); // Pause execution for 3000 milliseconds (not recommended; use explicit waits instead)
        driver.findElement(passwordLogin).sendKeys("@Mm504966817"); // Find password field and enter password
        driver.findElement(signInBtn).click(); // Click on sign-in button

        boolean homepageview = driver.findElement(assertionUponLogin).isDisplayed(); // Check if assertion element is displayed
        Assert.assertTrue(homepageview, "home page is not displayed!"); // Assert that homepageview is true
    }

    public void test() {

        WebElement learnbtm = driver.findElement(btm); // Find login button element
        learnbtm.click(); // Click on the login button


    }


    public void test2() {

        WebElement learnbtm2 = driver.findElement(btm2); // Find login button element
        learnbtm2.click(); // Click on the login button


    }


    public void click1() {

        WebElement put1 = driver.findElement(path1); // Find login button element
        put1.click(); // Click on the login button

    }


    public void click2() {

        WebElement put2 = driver.findElement(path2); // Find login button element
        put2.click(); // Click on the login button


    }



}
/*
    public void click3() {

        WebElement put3 = driver.findElement(path3).sendKeys(Keys.Enter; // Find login button element
        put3.click(); // Click on the login button

    }
    */




/*
    public void click() {
        driver.findElement(signInBtn).click(); // Click on sign-in button
    }
*/

/*
    public void click() {
        WebElement elementToClick = driver.findElement(all); // Find the element you want to click
        elementToClick.click(); // Click on the element
    }
    */
/*

 */
