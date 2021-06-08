package Steps;

import Utility.LoggerHelper;
import Utility.ReadProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

import java.util.concurrent.TimeUnit;

/**
 * SetupTeardown.java - a class having following methods
 * Setup() - Responsible for creating browser instance and navigating to URL
 * TearDown () - Responsible for taking screen shot in case of scenario fail/pass and closing the driver
 *
 * @author Bhagyalakshmi Jayanna
 * @version 1.0
 */

public class SetupTeardown {
	
	public static NgWebDriver nGWebDriver;
    public static JavascriptExecutor jsDriver;

    public static WebDriver driver;
    Logger log = LoggerHelper.getLogger(SetupTeardown.class);
    ReadProperties readProperties = new ReadProperties();
    String url;


    /**
     * Setup() function responsible for performing the following
     * Reads the browser name from properties file
     * Based on the browser, sets the path to <browser>.exe and creates browser instance
     * maximize a browser window
     * sets the amount of time to wait for a page load to complete
     * sets the WebDriver instance to wait for specified amount time
     * Reads the URL from properties file and navigate to URL
     *
     * @param scenarios The instance of Scenarios Interface
     * @throws Exception
     */
    @Before
    public void setUp(Scenario scenarios) throws Exception {
        String browser = readProperties.getBrowser("browser");
        if (browser.equals("chrome")) {
            //set path to chrome.exe
            System.setProperty("webdriver.chrome.driver", readProperties.getBrowserDriverPath("chromeDriverPath"));
            //create chrome instance
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            //set path to Firefox.exe
            System.setProperty("webdriver.gecko.driver", readProperties.getBrowserDriverPath("firefoxDriverPath"));
            //create firefox instance
           /* FirefoxOptions options = new FirefoxOptions();
            options.setCapability("marionette", true);
            driver = new FirefoxDriver(options);*/
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver", readProperties.getBrowserDriverPath("edgeDriverPath"));
            //create Edge instance
            driver = new EdgeDriver();
        } else {
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        NgWebDriver nGWebDriver = new NgWebDriver(jsDriver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        url = readProperties.getUrl("url");
        driver.get(url);
        nGWebDriver.waitForAngularRequestsToFinish();
      
        


    }

    /**
     * TearDown () responsible for perform the following
     * Takes Screen shot in case scenario execution fails and embed to Scenario
     * Takes Screen shot in case scenario execution pass and embed to Scenario
     * Close the driver instance
     *
     * @param scenario The instance of Scenarios Interface
     */
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                log.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            try {
                log.info(scenario.getName() + " is Passed");
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        driver.quit();
    }
}
