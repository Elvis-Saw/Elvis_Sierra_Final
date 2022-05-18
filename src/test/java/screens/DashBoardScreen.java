package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import screens.mapScreen.MapScreen;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // AndroidElements
    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement dismissPreferenceUpdateButton;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Map, Tab, 2of5")
    @AndroidFindBy(uiAutomator = "//android.widget.ImageView[]")
    private AndroidElement mapButton;

    /**
     * @author Hans.Marquez
     * Close the message about new updates
     */
    public void closeUpdateMessage() {
        click(dismissPreferenceUpdateButton);
    }

    /**
     * @author Hans.Marquez
     * Navigate to Map Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * @author Steven.Cardona
     * return true if map button element is displayed in screen, otherwise false.
     */
    public boolean mapButtonIsDisplayed() {
        return isElementAvailable(mapButton, 25);
    }

}
