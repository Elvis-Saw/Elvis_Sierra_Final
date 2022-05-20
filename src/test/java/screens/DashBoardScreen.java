package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import screens.mapScreen.MapScreen;
import screens.menuScreen.MenuScreen;
import screens.plansScreen.PlansScreen;
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
     * Navigate to Settings Screen from DashBoard Screen.
     */
    public MenuScreen goToMenuScreen() {
        click(menuButton);
        return new MenuScreen(driver);
    }

    /**
     * @author Steven.Cardona
     * Navigate to Plans Screen from DashBoard Screen.
     */
    public PlansScreen goToPlansScreen() {
        click(plansButton);
        return new PlansScreen(driver);
    }

    /**
     * @author Steven.Cardona
     * return true if map button element is displayed in screen, otherwise false.
     */
    public boolean mapButtonIsDisplayed() {
        return isElementAvailable(mapButton, 25);
    }

    /**
     * @author Steven.Cardona
     * return true if menu button element is displayed in screen, otherwise false.
     */
    public boolean menuButtonIsDisplayed() {
        return isElementAvailable(menuButton, 25);
    }

    /**
     * @author Steven.Cardona
     * return true if plans button element is displayed in screen, otherwise false.
     */
    public boolean plansButtonIsDisplayed() {
        return isElementAvailable(plansButton, 25);
    }
}
