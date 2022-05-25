package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class NavigationTest extends BaseMobileTest {

    private MapScreen loadMapScreen;

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen Navigation test")
    @Test()
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");
    }

    public void categoryList(){
        log.info("Validate Show Category List");
        MapScreen mapScreen = loadMapScreen;
        MapScreen categorylist = mapScreen.goToMapScreen();
        
        log.info("Validate Category List Displayed");
        Assert.assertTrue(categorylist.filterIsDisplayed(), "CategoryList not displayed");
    }

}
