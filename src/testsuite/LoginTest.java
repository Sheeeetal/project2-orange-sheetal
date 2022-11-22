package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.UtilitiesMain;

public class LoginTest extends UtilitiesMain {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // send text to login field

        sendTextToElement(By.name("username"), "Admin");
        //Enter Admin123 password
        sendTextToElement(By.name("password"), "admin123");
        //Click on Login button
        clickOnElement(By.xpath("//button[@type='submit']"));
        //verify the dashboard text display
        WebElement actualTextMessagrElement = driver.findElement(By.xpath("//h6[contains(@class,'header-breadcrumb-module')]"));
        String actualMessage = actualTextMessagrElement.getText();
        String expectedMessage= "Dashboard text is displayed";

    }
}