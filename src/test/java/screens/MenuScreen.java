package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

/**
 * Settings screen.
 *
 * @author Steven.Cardona
 */
public class MenuScreen extends BaseScreen {
    @AndroidFindBy(accessibility = "Tip Board, 1 of 16, button")
    private AndroidElement cardOfMenuScreen;
    @AndroidFindBy(accessibility = "My Profile, 12 of 16, button")
    private AndroidElement myProfileLink;
    @AndroidFindBy(accessibility = "Property Rules, 13 of 16, button")
    private AndroidElement propertyRulesLink;
    @AndroidFindBy(accessibility = "Link to Account, 14 of 16, button")
    private AndroidElement linkToAccount;
    @AndroidFindBy(accessibility = "Help, 15 of 16, button")
    private AndroidElement helpLink;
    @AndroidFindBy(accessibility = "Privacy & Legal, 16 of 16, button")
    private AndroidElement privacyAndLegalLink;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public MenuScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Steven.Cardona
     * Go to the bottom of the screen
     */
    public void goToBottomScreen() {
        scrollDown(2);
    }

    /**
     * We are going to the privacy and legal screen
     *
     * @return PrivacyAndLegalScreen
     * @author Steven.Cardona
     */
    public PrivacyAndLegalScreen goToPrivacyScreen() {
        click(privacyAndLegalLink);
        return new PrivacyAndLegalScreen(driver);
    }

    /**
     * if help link element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean isDisplayedHelpLink() {
        return isElementAvailable(helpLink);
    }

    /**
     * Check if my profile link element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean isDisplayedMyProfileLink() {
        return isElementAvailable(myProfileLink);
    }

    /**
     * Check if link to account element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean isDisplayedLinkToAccount() {
        return isElementAvailable(linkToAccount);
    }

    /**
     * Check if property rules link element is displayed in screen, otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean isDisplayedPropertyRulesLink() {
        return isElementAvailable(propertyRulesLink);
    }
}
