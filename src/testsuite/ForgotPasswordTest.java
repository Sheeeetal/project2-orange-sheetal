package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.UtilitiesMain;

public class ForgotPasswordTest extends UtilitiesMain {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        clickOnElement(By.xpath("//p[contains(@class,'-forgot-header')]"));

        String expectedMessage = "Reset Password";

        String actualTextMessage=getTextFromElement(By.xpath("//h6[contains(@class,'forgot-password-title')]"));

        //Validate actual and expected message
        Assert.assertEquals("No Message such Found", expectedMessage, actualTextMessage);


    }

    public void closeBrowser() {
        driver.close();


    }

}