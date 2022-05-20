package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.List;

public class PrivacyAndLegalScreen extends BaseScreen {
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*txt_element\")")
    private List<AndroidElement> optionsLegalList;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*snowball_header_screen_name\").childSelector(new UiSelector().className(\"android.widget.TextView\"))")
    private AndroidElement titleScreen;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PrivacyAndLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Get the size of the list of links
     *
     * @return int
     * @author Steven.Cardona
     */
    public int getSizeOptionLegalList() {
        return optionsLegalList.size();
    }

    /**
     * Get the title from privacy and legal screen
     *
     * @return String
     * @author Steven.Cardona
     */
    public String getTitleScreen() {
        return getText(titleScreen);
    }
}
