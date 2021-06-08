package Base;

import Steps.SetupTeardown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;


/**
 * BaseUtil.java - Its Base class and it has a reference to WebDriver.
 * Other class can extend this base class and get the WebDriver reference.
 *
 * @author 
 * @version 1.0
 */
public class BaseUtil {

    public static WebDriver driver;
   

    public BaseUtil() {
        this.driver = SetupTeardown.driver;
    }
    
    
}





