package util.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base class for all screens Objects.
 *
 * @author Arley.Bolivar
 */
public abstract class BaseScreen {

    /**
     * The driver.
     */
    protected final AndroidDriver<AndroidElement> driver;

    /**
     * Constructor method for standard screens object.
     *
     * @param driver : AndroidDriver
     * @author Arley.Bolivar, Hans.Marquez
     */
    public BaseScreen(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(0)), this);
    }

    /**
     * Scroll down (From Top to Bottom).
     *
     * @param swipes the swipes
     * @author Hans.Marquez
     */
    public void scrollDown(int swipes) {
        String locator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*ontainer.*\")).flingToEnd(1)";
        scroll(locator, swipes);
    }

    /**
     * Scroll Up (From Bottom to Top).
     *
     * @param swipes the swipes
     * @author Hans.Marquez
     */
    public void scrollUp(int swipes) {
        String locator = "new UiScrollable(new UiSelector().resourceIdMatches(\".*ontainer.*\")).flingToBeginning(1)";
        scroll(locator, swipes);
    }

    /**
     * Scroll.
     *
     * @param locator the locator
     * @param swipes  the swipes
     */
    public void scroll(String locator, int swipes) {
        int swipesAmount = 0;
        while (swipesAmount < swipes) {
            try {
                driver.findElementByAndroidUIAutomator(locator);
                swipesAmount++;
            } catch (Exception e) {
                swipesAmount++;
            }
        }
    }

    /**
     * Wrapper for click  event specifying custom wait.
     *
     * @param element : AndroidElement
     * @author Hans.Marquez
     */
    public void click(AndroidElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * Wrapper for click event.
     *
     * @param element : AndroidElement
     * @author Hans.Marquez
     */
    public void click(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    /**
     * return the text contained in element
     *
     * @param element : AndroidElement
     * @author Steven.Cardona
     */
    public String getText(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    /**
     * Wrapper for Visibility event.
     *
     * @param element : AndroidElement
     * @author Hans.Marquez
     */
    public boolean isElementAvailable(AndroidElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    /**
     * Wrapper for Visibility event.
     *
     * @param element : AndroidElement
     * @param timeout : int
     * @author Hans.Marquez
     */
    public boolean isElementAvailable(AndroidElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
}
