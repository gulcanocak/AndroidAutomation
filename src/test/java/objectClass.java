import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.appium.java_client.touch.offset.PointOption.point;

public class objectClass extends Cap {
    @SuppressWarnings("unused")
    public void scrollDown(String text) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + text + "\"));").click();
    }

    public void tab(int x, int y) {
        TouchAction nextButton = new TouchAction(driver);
        nextButton.tap(point(x, y)).release().perform();
    }
    public void swipe(int fromX, int fromY, int toX, int toY){
        TouchAction swipe = new TouchAction(driver);
         swipe.longPress(point(fromX, fromY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(point(toX, toY)).release().perform();

    }
}
