package screens.plansScreen;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.List;

/**
 * Plans screen.
 *
 * @author Steven.Cardona
 */
public class PlansScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionMatches(\".*of 7, button\")")
    private List<AndroidElement> optionList;
    @AndroidFindBy(accessibility = "Check Dining Availability, 1 of 7, button")
    private AndroidElement diningOption;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public PlansScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    /**
     * @author Steven.Cardona
     * return true if Dining option  is displayed in the list, otherwise false.
     */
    public boolean checkDiningOption() {
        return isElementAvailable(diningOption);
    }

    /**
     * @author Steven.Cardona
     * Get the size of the option list
     */
    public int getSizePlansOptionList() {
        return optionList.size();
    }
}
