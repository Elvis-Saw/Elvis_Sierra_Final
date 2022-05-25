package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     * @param driver : AndroidDriver
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // AndroidElements
    @AndroidFindBy(id = "button2")
    private AndroidElement dismissPreferenceUpdateButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "button1")
    @AndroidFindBy(uiAutomator = "//android.widget.ImageView[]")
    private AndroidElement mapButton;

    /**
     * Navigate to Login Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        click(dismissPreferenceUpdateButton);
        click(mapButton);
        return new MapScreen(driver);
    }
}
