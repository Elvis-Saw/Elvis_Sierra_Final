package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.PlansScreen;
import util.tests.BaseMobileTest;

public class PlanTest extends BaseMobileTest {

    @Description(value = "Validate if the dining option is in the list")
    @Test
    public void diningReservation(){
        log.info("Start Navigation to Menu Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.closeUpdateMessage();

        log.info("Validate Plans Button is Displayed");
        Assert.assertTrue(dashBoard.plansButtonIsDisplayed(), "Plans button not displayed");

        log.info("Navigate to Plans Screen");
        PlansScreen plansScreen = dashBoard.goToPlansScreen();

        log.info("Validate that there are 7 options in the list");
        Assert.assertEquals(plansScreen.getSizePlansOptionList(), 7, "Missing options in the list");

        log.info("Validate that the dining option exists in the list of options");
        Assert.assertTrue(plansScreen.checkDiningOption(), "Dining option not displayed");
    }
}
