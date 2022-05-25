package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

// TODO: Auto-generated Javadoc

/**
 * Map screen.
 */
public class MapScreen extends BaseScreen {

    /**
     * Constructor method.
     * @param driver the driver
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    // AndroidElements

    @AndroidFindBy(id = "categoryTitle")
    private AndroidElement categoryList;

    @AndroidFindBy(id = "filterTitle")
    private AndroidElement filterButton;

    @AndroidFindBy(id = "toggleTitle")
    private AndroidElement showListButton;

    @AndroidFindBy(id = "attractionList")
    private AndroidElement tapCategoryList;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hotels\")")
    private AndroidElement hotels;

    /**
     * return true if Category List element is displayed in screen, otherwise false.
     */
    public boolean categoryIsDisplayed() {
        return isElementAvailable(categoryList);
    }

    /**
     * return true if Filter Button element is displayed in screen, otherwise false.
     */
    public boolean filterIsDisplayed() {
        return isElementAvailable(filterButton);
    }

    /**
     * return true if Show List Button element is displayed in screen, otherwise false.
     */
    public boolean showListIsDisplayed() {
        return isElementAvailable(showListButton);
    }

    private AndroidElement attractionList;
    private AndroidElement hotelsOption;

    /**
     * Navigate to Log in Screen from DashBoard Screen.
     */
    public MapScreen goToMapScreen() {
        click(attractionList);
        click(hotels);
        return new MapScreen(driver);
    }

}
