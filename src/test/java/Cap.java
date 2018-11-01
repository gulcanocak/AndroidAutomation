import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import static com.google.gson.internal.bind.TypeAdapters.URL;

public class Cap {
    public static AndroidDriver driver;

    @BeforeSuite
    public static void setUp()throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 27");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, "/Users/gulcanocak/Downloads/HumallyAnd.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);

    }
}

