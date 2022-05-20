package screens.widgets;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.ArrayList;

/**
 * Categories screen.
 *
 * @author Steven.Cardona
 */
public class ModalCategories extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\".*of10, button\")")
    private ArrayList<AndroidElement> categoryList;
    @AndroidFindBy(accessibility = "Hotels, Category, 9of10, button")
    private AndroidElement categoryHotel;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public ModalCategories(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * Get number of items of the categories list
     *
     * @return int
     * @author Steven.Cardona
     */
    public int getNumberOfCategories() {
        isElementAvailable(categoryList.get(0));
        return categoryList.size();
    }

    /**
     * Check if the category "Hotel" exists in the list of categories; otherwise false.
     *
     * @return boolean
     * @author Steven.Cardona
     */
    public boolean existCategoryHotel() {
        return isElementAvailable(categoryHotel);
    }
}
