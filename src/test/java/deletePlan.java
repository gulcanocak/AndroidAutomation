import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class deletePlan extends Cap {

    @Test
    public void deletePlan() {
        System.out.println("*** Delete plan test ***");

        WebDriverWait wait = new WebDriverWait(driver, 3000);

        //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")));
        //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.FrameLayout/android.widget.LinearLayout")).click();
        objectClass obj = new objectClass();
        try {
            obj.scrollDown("DELETE");

            //obj.tab(240, 920);
            driver.findElement(By.id("android:id/text1")).click();
            driver.findElement(By.id("com.humally:id/btnPositive")).click();
            System.out.println("Plan deleted succesfully");

        } catch (AssertionError e) {
            System.out.println("Plan did not delete succesfully");

        }
    }
}