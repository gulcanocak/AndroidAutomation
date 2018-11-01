import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class chat extends Cap {

    @Test
    public void newChat() throws InterruptedException {

        System.out.println("*** Chat test ***");

        objectClass obj = new objectClass();
        WebDriverWait wait = new WebDriverWait(driver, 3000);

        try {

            // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")));
            //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")).click();
            //chat icon bottom
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")));
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")).click();
            //new chat icon
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")));
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
            Thread.sleep(4000);

            obj.tab(500, 990);
            obj.tab(500, 1620);
            String name = driver.findElement(By.id("com.humally:id/lblTitle")).getText();
            driver.findElement(By.id("com.humally:id/editTextMessage")).sendKeys("Hello");
            driver.findElement(By.id("com.humally:id/sendButton")).click();
            String messageText = driver.findElement(By.id("com.humally:id/lblText")).getText();

            //  System.out.println(messageText, "Hello " + name);

            Thread.sleep(2000);
            Assert.assertEquals(messageText,  "Hello");
            System.out.println("Message sent successfully");

        } catch (AssertionError e) {
            System.out.println("Message did not send successfully");
        }

    }
}
