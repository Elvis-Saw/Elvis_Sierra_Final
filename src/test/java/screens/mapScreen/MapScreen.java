package screens.mapScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.mapScreen.widgets.ModalCategories;
import util.screens.BaseScreen;

/**
 * Map screen.
 *
 * @author Hans.Marquez
 */
public class MapScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*categoryTitleLayout\")")
    private AndroidElement categoryList;
    @AndroidFindBy(id = "com.disney.wdpro.dlr:id/categoryTitle")
    private AndroidElement categoryTitle;

    /**
     * Constructor method.
     *
     * @param driver the driver
     * @author Hans.Marquez
     */
    public MapScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Hans.Marquez
     * return true if Category List element is displayed in screen, otherwise false.
     */
    public boolean categoryIsDisplayed() {
        return isElementAvailable(categoryList);
    }

    /**
     * @author Steven.Cardona
     * Open the list of Open the list of categories
     */
    public ModalCategories openCategoriesList() {
        click(categoryList);
        return new ModalCategories(driver);
    }

    /**
     * @author Steven.Cardona
     * return the text of category title
     */
    public String getCategoryTitle() {
        return getText(categoryTitle);
    }
}
