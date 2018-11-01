import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class makeComment extends Cap {
    @Test
    public void makeComment() throws InterruptedException {
        try {


            System.out.println("*** Make comment control test ***");
            WebDriverWait wait = new WebDriverWait(driver, 3000);
            objectClass obj = new objectClass();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")));
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")).click();
            driver.findElement(By.id("com.humally:id/txtCommentMessage")).sendKeys("Comment Test");
            driver.findElement(By.id("com.humally:id/btnSendComment")).click();
            //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CHAT\"));").click();


            Thread.sleep(2000);
            obj.swipe(500, 1550, 500, 430);
            // refresh.longPress(point(500, 1550)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(point(500, 430)).release().perform();
            //refresh.longPress(point(500, 1550)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(point(500, 430)).release().perform();
            System.out.println("Make comment executed succesfully");

        } catch (AssertionError e) {

            System.out.println("Make comment did not execute succesfully");
        }
    }

}