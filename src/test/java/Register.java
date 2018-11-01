
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.TapOptions.tapOptions;

import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Register extends Cap {

    @BeforeClass
    public void emptyNumber() {
        System.out.println("*** Empty number control test ***");
        WebDriverWait wait = new WebDriverWait(driver, 3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.humally:id/btnNext")));
        driver.findElement(By.id("com.humally:id/btnNext")).click();
        driver.findElement(By.id("com.humally:id/btnNext")).click();
        String errorText = driver.findElement(By.id("com.humally:id/lblErrorTxtMobile")).getText();
        try {
            Assert.assertEquals(errorText, "* Please fill");
            System.out.println("Error message shared correctly");

        } catch (AssertionError e) {
            System.out.println("Error message did not shared");
        }

    }

    @Test
    public void invalidNumber() {
        System.out.println("*** Invalid number control test ***");
        WebDriverWait wait = new WebDriverWait(driver, 3000);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.humally:id/btnNext")));
        driver.findElement(By.id("com.humally:id/txtMobile")).sendKeys("1111122222333334444455555");
        driver.hideKeyboard();
        driver.findElement(By.id("com.humally:id/btnNext")).click();
        String errorText = driver.findElement(By.id("com.humally:id/lblErrorTxtMobile")).getText();
        try {
            Assert.assertEquals(errorText, "* Please check");
            System.out.println("Invalid number error message shared correctly");

        } catch (AssertionError e) {
            System.out.println("Invalid number error message did not shared");
        }

    }

    //1111122222333334444455555
    @Test
    public void register() throws InterruptedException {

        driver.findElement(By.id("com.humally:id/btnMobileFlag")).click();

        driver.findElement(By.id("com.humally:id/searchboxEditText")).click();
        driver.findElement(By.id("com.humally:id/searchboxEditText")).sendKeys("Turkey");
        driver.hideKeyboard();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]")).click();
        driver.findElement(By.id("com.humally:id/btnDone2")).click();
        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Turkey\"));").click();
        // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector())scrollIntoView(text(\"Aruba\"));");
        driver.findElement(By.id("com.humally:id/txtMobile")).sendKeys("05541112233");
        driver.hideKeyboard();
        driver.findElement(By.id("com.humally:id/btnNext")).click();

        Thread.sleep(2000);

    }

    @Test
    public void tstizin() {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        TouchAction contactDone = new TouchAction(driver);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.packageinstaller:id/permission_allow_button")));
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.findElement(By.id("com.humally:id/btnClose")).click();
        contactDone.tap(point(620, 1700)).release().perform();
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        // System.out.println(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout")).isDisplayed());
    }


}
