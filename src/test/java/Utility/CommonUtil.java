package Utility;


import Base.BaseUtil;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Random;

/**
 * CommonUtil.java - a class having set of methods which represents the common actions that
 * performed on a web page
 *
 * @author Bhagyalakshmi Jayanna
 * @version 1.0
 */
public class CommonUtil extends BaseUtil {

    /**
     * Wait for an element to be visible in the given DOM of a Page
     *
     * @param element the WebElement to check for its visibility
     * @param seconds the timeout when an expectation is called
     */
    public static void waitUntilElementIsDisplayed(WebElement element, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * wait for an element is visible and enabled such that you can click it
     *
     * @param element the WebElement to check for visible and enable so that it can be clicked
     * @param seconds the timeout when an expectation is called
     */
    public static void waitUntilElementIsClickable(WebElement element, long seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * Wait until if the given text is present in the specified element
     *
     * @param element the WebElement
     * @param seconds the timeout when an expectation is called
     * @param text    to be present in the element
     */
    public static void waitUntilElementTextPresent(WebElement element, long seconds, String text) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));

    }

    /**
     * To click on WebElement using JavascriptExecutor
     *
     * @param element the WebElement to be clicked.
     */

    public static void clickUsingJS(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }


    /**
     * To Determine whether checkbox element is selected or not
     *
     * @param element The WebElement
     * @return True if the element is currently selected or checked, false otherwise.
     */
    public static boolean getCheckboxSelectStatus(WebElement element) {
        return element.isSelected();
    }

    /**
     * To select an option from the drop down based on text
     *
     * @param element the WebElement
     * @param name    The visible text to match against
     */
    public static void selectDropDownByVisibleText(WebElement element, String name) {
        Select item = new Select(element);
        item.selectByVisibleText(name);
    }

    /**
     * To select an option from the drop down based on value matching the argument
     *
     * @param element the WebElement
     * @param value   The visible value to match against
     */
    public static void selectDropDownByValue(WebElement element, String value) {
        Select item = new Select(element);
        item.selectByValue(value);
    }

    /**
     * To Select an option from the drop dwn at the given index
     *
     * @param element The WebElement
     * @param index   The option at this index will be selected
     */

    public static void selectDropDownByIndex(WebElement element, int index) {
        Select item = new Select(element);
        item.selectByIndex(index);
    }

    /**
     * To select a radio button
     *
     * @param element The webElement that represents the Radio button
     */
    public static void selectRadioButton(WebElement element) {
        boolean status;
        status = element.isSelected();
        if (!status) {
            element.click();
        }
    }

    /**
     * To un select a Radio button
     *
     * @param element The webElement that represents the Radio button
     */
    public static void deselectRadioButton(WebElement element) {
        boolean status;
        status = element.isSelected();
        if (status) {
            element.click();
        }
    }

    /**
     * To check Element is Displayed or not
     *
     * @param element The WebElement
     * @return True if the element is displayed/Present , false otherwise.
     */


    public static boolean isElementPresent(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        }
        return false;
    }

    /**
     * To switch to an Alert and click on OK  to accept
     */
    public static void acceptAlert() {
        int timeout = 10;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.accept();
    }

    /**
     * To switch to an Alert and click on Cancel to dismiss
     */
    public static void dismissAlert() {
        int timeout = 10;
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a = driver.switchTo().alert();
        a.dismiss();
    }

    /**
     * To Switch to Child Window
     */
    public static void switchToChildWindow() {
        String parentWindow = driver.getWindowHandle();
        // It returns no. of windows opened by WebDriver and will return Set of Strings
        Set<String> set = driver.getWindowHandles();
        // Using Iterator to iterate with in windows
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close.
            if (!parentWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
            }
        }
    }

    /**
     * To switch to parent Window
     */
    public static void switchToParentWindow() {
        Set<String> s = driver.getWindowHandles();
        Iterator<String> itr = s.iterator();
        String w1 = (String) itr.next();
        driver.switchTo().window(w1);
        System.out.println("PARENT WINDOW: " + w1);
    }

    /**
     * To check whether an alert is present or not
     *
     * @return True if alert present otherwise false
     */
    public static boolean isAlertPresent() {
        try {
            int timeout = 5;
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * To verify Whether the page contains the text that matches the argument
     *
     * @param pageText The argument which is used for matching the text
     * @return True if Text matches otherwise false
     */
    public static boolean verifyPageContainsText(String pageText) {
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * To verify whether an element visible or not
     *
     * @param element The WebElement to check for its visibility
     * @return True if element is visible otherwise false
     */
    public static boolean verifyElementIsVisible(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        }
        return false;
    }

    /**
     * To check is the element currently enabled or not?
     *
     * @param element The WebElement to check for Enabled
     * @return True if the element is enabled, false otherwise.
     */
    public static boolean verifyElementIsEnabled(WebElement element) {
        if (element.isEnabled()) {
            return true;
        }
        return false;
    }

    /**
     * To check is the element currently disabled  or not?
     *
     * @param element The WebElement
     * @return True if the element is disabled, false otherwise.
     */
    public static boolean verifyElementIsDisabled(WebElement element) {
        if (!element.isEnabled()) {
            return true;
        }
        return false;
    }

    /**
     * To verify the text field of element contains the value which is passed as an argument
     *
     * @param element The WebElement
     * @param value   The value to be matched
     * @return True if the value matches , false otherwise.
     */
    public static boolean verifyTextFieldContainsValue(WebElement element, String value) {
        if (element.getAttribute("value").equals(value)) {
            return true;
        }

        return false;
    }

    /**
     * To Switch to frame using index and verify the text
     *
     * @param index    The index as an argument to switch To Frame
     * @param pageText The Text to be verified
     * @return True if text matches otherwise false
     */

    public static boolean verifyFrameContainsTextUsingIndex(int index, String pageText) {
        driver.switchTo().frame(index);
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * To Switch to frame using name and verify the text
     *
     * @param name     The name is an argument to switch To Frame
     * @param pageText The Text to be verified
     * @return True if text matches otherwise false
     */
    public static boolean verifyFrameContainsTextUsingName(String name, String pageText) {
        driver.switchTo().frame(name);
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + pageText + "')]"));
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * To check the given WebElement is empty or not
     *
     * @param element The WebElement to check for Empty or not
     * @return True is empty false otherwise
     */
    public static boolean verifyEditBoxFieldIsEmpty(WebElement element) {
        String fieldValue = element.getAttribute("value");
        if (fieldValue.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * To get a default or selected option from drop down
     *
     * @param element The WebElement
     * @return String The Selected option from the drop down
     */
    public static String getDefaultValueOfDropdown(WebElement element) {
        String defaultSelectedValue;
        Select item = new Select(element);
        WebElement defaultSelectedElement = item.getFirstSelectedOption();
        defaultSelectedValue = defaultSelectedElement.getText();
        return defaultSelectedValue;
    }


    /**
     * Wait for Presence of Elements for a given time out
     *
     * @param timeout The timeout in seconds to wait for expected condition
     * @param locator The locator used to find the element
     */
    public static void waitForPresenceOfElements(int timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }


    /**
     * Moves the mouse to the specified element
     *
     * @param element The WebElement on which mouse needs to be moved
     */
    public static void moveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    


    /**
     * Performs a context-click(right click) at middle of the given element.
     *
     * @param element The WebElement
     */
    public static void contextClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    /**
     * Performs a double-click at middle of the given element
     *
     * @param element
     */
    public static void doubleClick(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }


    /**
     * Performs click-and-hold at the location of the source element,
     * moves to the location of the target element, then releases the mouse.
     *
     * @param from element to move from
     * @param to   element to move to
     */
    public static void dragAndDrop(WebElement from, WebElement to) {
        Actions action = new Actions(driver);
        action.dragAndDrop(from, to);
    }

//Keyboard Actions

    /**
     * To simulate the modifier key-up Action
     *
     * @param element the WebElement on which the key-release action to be performed
     */
    public static void keysUp(WebElement element) {
        Actions actions = new Actions(driver);
        actions.keyUp(Keys.CONTROL).click(element);
    }

    /**
     * To simulate the modifier key-down Action
     *
     * @param element the WebElement on which the key-release action to be performed
     */
    public static void keyDown(WebElement element) {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(element);
    }

    /**
     *
     * To scrolls the page until the mentioned element is in full view
     * @param element the WebElement until which the page will be scrolled
     */
    public static void scrollByVisibleElement(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", element);
    }
    public static int generateRandomNum()
    {
        int n = 1000 + new Random().nextInt(9000);
        System.out.println(n);
// 10000 ≤ n ≤ 99999
    return n;
    }
    public static void getTextElement(WebElement element)
    {
    	String gettextvalue=	element.getText();
    	System.out.println(gettextvalue);
    }
}