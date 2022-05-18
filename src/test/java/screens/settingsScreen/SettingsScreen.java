package screens.settingsScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import util.screens.BaseScreen;

/**
 * Settings screen.
 *
 * @author Steven.Cardona
 */
public class SettingsScreen extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public SettingsScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }
}
