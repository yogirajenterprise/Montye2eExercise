package Montye2eExercise;

import org.openqa.selenium.By;

/**
 * All the reusable methods
 */
public class Utils extends BasePage {

    //All reusable methods are listed here

    // Send or Type to field like name,username or password
    public static void typeText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    // Clear the Text in Field
    public static void clear(By by) {
        driver.findElement(by).clear();
    }

    // Click on Element( click Method)
    public static void clickOnElement(By by)

    {
        driver.findElement(by).click();
    }


}
