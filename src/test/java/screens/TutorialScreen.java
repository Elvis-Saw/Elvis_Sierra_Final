package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Object of the first screen that appears when we open the application.
 *
 * @author Arley.Bolivar
 */
public class TutorialScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*permission_primary_btn\")")
    private AndroidElement getStartedButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*skip_text\")")
    private AndroidElement skipLocationButton;

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Arley.Bolivar
     */
    public TutorialScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Hans.Marquez
     * Start permissions process.
     */
    public void startPermissionsProcess() {
        click(getStartedButton, 25);
    }

    /**
     * Skip Location permissions process and return a screen.
     *
     * @return DashBoardScreen
     * @author Hans.Marquez
     */
    public DashBoardScreen skipLocationPermissions() {
        click(skipLocationButton);
        return new DashBoardScreen(driver);
    }
}
