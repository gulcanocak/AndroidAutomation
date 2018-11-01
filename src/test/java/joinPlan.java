import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class joinPlan extends Cap {

    @Test
    public void timelineJoin() throws InterruptedException {
        System.out.println("*** Timeline join test ***");
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        objectClass obj = new objectClass();

        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")));
        // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")).click();
        Thread.sleep(2000);

        obj.scrollDown("JOIN");
        MobileElement joinButton = (MobileElement) driver.findElement(By.id("com.humally:id/txtJoin"));

        String planButtonText = joinButton.getText();
        System.out.println("Button text is: " +planButtonText);
        try {
            Assert.assertEquals(planButtonText, "REQUESTED");
            System.out.println("After tab button change succesfully with REQUESTED");

        } catch (AssertionError e) {
            System.out.println("Button did not change succesfully with REQUESTED");
        }


    }
}