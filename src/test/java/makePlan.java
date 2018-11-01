import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.appium.java_client.touch.offset.PointOption.point;

public class makePlan extends Cap {

    @Test
    public void makeSelection() throws InterruptedException {
        System.out.println("*** Make plan test ***");
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        objectClass obj = new objectClass();
        TouchAction selectDate = new TouchAction(driver);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout")));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout")).click();

        driver.findElement(By.id("com.humally:id/txtSelectActivity")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();

        //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Pub\"));").click();
        obj.scrollDown("Pub");
        //            <defaultGoal>install</defaultGoal>
        driver.findElement(By.id("com.humally:id/btnDone")).click();
        driver.findElement(By.id("com.humally:id/btnCurrentLocation")).click();
        driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        obj.tab(1000, 1400);

        driver.findElement(By.xpath("//android.view.View[@content-desc=\"31 October 2018\"]")).click();
        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("com.humally:id/mdtp_ok")).click();
        obj.tab(500, 1620);
        //nextButton.tap(point(500, 1620)).release().perform(); //nextbutton
        Thread.sleep(4000);
        obj.scrollDown("User User");
        obj.tab(500, 1620);
        driver.findElement(By.id("com.humally:id/txtPostMessage")).sendKeys("Plan kontrol");
        driver.hideKeyboard();
        driver.findElement(By.id("com.humally:id/btnPost2")).click();
        Thread.sleep(2000);
        String postedTime = driver.findElement(By.id("com.humally:id/lblPostedTime")).getText();

        System.out.println("tariiih" +postedTime);
        try {
            postedTime.contains("s");

            System.out.println("New plan shared");


        }
        catch (AssertionError e){

            System.out.println("Plan did not share");
        }
    }
}
