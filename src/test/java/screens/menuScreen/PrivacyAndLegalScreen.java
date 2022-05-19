package screens.menuScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.List;

public class PrivacyAndLegalScreen extends BaseScreen {
    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PrivacyAndLegalScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*txt_element\")")
    private List<AndroidElement> optionsLegalList;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*snowball_header_screen_name\").childSelector(new UiSelector().className(\"android.widget.TextView\"))")
    private AndroidElement titleScreen;


    /**
     * @author Steven.Cardona
     * We get the size of the list of links
     */
    public int getSizeOptionLegalList(){
        return optionsLegalList.size();
    }

    /**
     * @author Steven.Cardona
     * Get the title from privacy and legal screen
     */
    public String getTitleScreen(){
        return getText(titleScreen);
    }
}
