package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.menuScreen.MenuScreen;
import screens.menuScreen.PrivacyAndLegalScreen;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    @Description(value = "We are going to evaluate all links from the Privacy & Legal Screen")
    @Test
    public void checkLegalAndPrivacyLinks() {
        log.info("Start Navigation to Menu Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.closeUpdateMessage();

        log.info("Validate Menu Button is Displayed");
        Assert.assertTrue(dashBoard.menuButtonIsDisplayed(), "Menu button not displayed");

        log.info("Navigate to Menu Screen and go to the bottom");
        MenuScreen menuScreen = dashBoard.goToMenuScreen();
        menuScreen.goToBottomScreen();

        log.info("Validate the options links is displayed");
        Assert.assertTrue(menuScreen.isDisplayedHelpLink(), "Help link not displayed");
        Assert.assertTrue(menuScreen.isDisplayedLinkToAccount(), "Link to account not displayed");
        Assert.assertTrue(menuScreen.isDisplayedMyProfileLink(), "My Profile link not displayed");
        Assert.assertTrue(menuScreen.isDisplayedPropertyRulesLink(), "Property Rules link not displayed");

        log.info("Navigate to privacy and legal screen");
        PrivacyAndLegalScreen privacyScreen = menuScreen.goToPrivacyScreen();

        log.info("Validate that if we are on the privacy and legal screen");
        Assert.assertEquals(privacyScreen.getTitleScreen(), "Privacy & Legal");
        Assert.assertTrue(privacyScreen.getSizeOptionLegalList() >= 6, "Missing more links for the privacy and legal screen");
    }
}
