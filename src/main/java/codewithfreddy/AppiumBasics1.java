package codewithfreddy;

import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;



public class AppiumBasics1 extends BaseTest{

    @Test
    public void WifiSettingsName() throws MalformedURLException {

        //Xpath, id, accessibilityId, classname, androidUIAutomator
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("freddywifi");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

    }
}
