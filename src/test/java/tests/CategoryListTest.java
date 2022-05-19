package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.mapScreen.MapScreen;
import screens.mapScreen.widgets.ModalCategories;
import util.tests.BaseMobileTest;

public class CategoryListTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Confirm the category 'Hotel' exist in the categories list")
    @Test()
    public void validateSelectionInCategory() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.closeUpdateMessage();

        log.info("Validate Map Button is Displayed");
        Assert.assertTrue(dashBoard.mapButtonIsDisplayed(), "Map button not displayed");

        log.info("Go To Map Page");
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Open category list");
        ModalCategories categoriesScreen = map.openCategoriesList();
        Assert.assertTrue(categoriesScreen.getNumberOfCategories() > 5);

        log.info("Validate Category Hotel exist in the categories list");
        Assert.assertTrue(categoriesScreen.existCategoryHotel(), "The category 'Hotel' not exist");
    }

}
