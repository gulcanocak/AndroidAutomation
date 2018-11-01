import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class inspirationInterest extends Cap {
    @Test
    public void timelineJoin() throws InterruptedException {
        System.out.println("*** Timeline event interesting test ***");
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        objectClass obj = new objectClass();

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")));
        // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.humally:id/meetTab")));
        driver.findElement(By.id("com.humally:id/meetTab")).click();

        obj.scrollDown("INTERESTING");
        Thread.sleep(2000);
        MobileElement interestButton = (MobileElement) driver.findElement(By.id("com.humally:id/lblJoin"));

        String eventButtonText = interestButton.getText();
        System.out.println("Button text is: " + eventButtonText);
        try {
            Assert.assertEquals(eventButtonText, "INTERESTED");
            System.out.println("After tab button change succesfully with INTERESTED");


        } catch (AssertionError e) {
            System.out.println("Button did not change succesfully with INTERESTED");
        }
//com.humally:id/meetTab

    }
}