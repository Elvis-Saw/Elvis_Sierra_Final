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

    /**
     * Go to map section.
     */
    @AndroidFindBy(accessibility = "Map, Tab, 2of5")
    private AndroidElement mapIcon;

    @HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(id = "button1")
    @AndroidFindBy(id = "permission_primary_btn")
    private AndroidElement mapButton;

    /**
     * Navigate to Login Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        click(mapIcon);
        click(mapButton);
        return new MapScreen(driver);
    }
}
