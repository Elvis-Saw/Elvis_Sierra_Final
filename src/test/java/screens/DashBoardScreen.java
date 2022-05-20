package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    @AndroidFindBy(id = "android:id/button2")
    private AndroidElement dismissPreferenceUpdateButton;
    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(accessibility = "Map, Tab, 2of5")
    @AndroidFindBy(uiAutomator = "//android.widget.ImageView[]")
    private AndroidElement mapButton;
    @AndroidFindBy(accessibility = "More Options, Tab, 5of5")
    private AndroidElement menuButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*tab_animated_icon\")")
    private AndroidElement plansButton;
    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Hans.Marquez
     * Close the message about new updates
     */
    public void closeUpdateMessage() {
        click(dismissPreferenceUpdateButton);
    }

    /**
     * Navigate to Map Screen from DashBoard Screen.
     *
     * @return MapScreen
     * @author Hans.Marquez
     */
    public MapScreen goToMapScreen() {
        click(mapButton);
        return new MapScreen(driver);
    }

    /**
     * Navigate to Settings Screen from DashBoard Screen.
     *
     * @return MenuScreen
     * @author Steven.Cardona
     */
    public MenuScreen goToMenuScreen() {
        click(menuButton);
        return new MenuScreen(driver);
    }

    /**
     * Navigate to Plans Screen from DashBoard Screen.
     *
     * @return PlansScreen
     * @author Steven.Cardona
     */
    public PlansScreen goToPlansScreen() {
        click(plansButton);
        return new PlansScreen(driver);
    }

    /**
     * Check if map button element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean mapButtonIsDisplayed() {
        return isElementAvailable(mapButton, 25);
    }

    /**
     * Check if menu button element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean menuButtonIsDisplayed() {
        return isElementAvailable(menuButton, 25);
    }

    /**
     * Check if plans button element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean plansButtonIsDisplayed() {
        return isElementAvailable(plansButton, 25);
    }
}
