package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"browserName", "os", "URL"})
    @BeforeTest
    public void setUp(String browserName, String os,String URL){
        System.out.println("Session is going to start");
        getLocalDriver(browserName, os);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
    }
    public  WebDriver getLocalDriver(String browserName, String os){
        browserName = browserName.toLowerCase();
        os = os.toLowerCase();
        if(browserName.contains("chrome")){
            if(os.contains("win")){
                System.setProperty("webdriver.chrome.driver","C:\\Users\\sujon\\IdeaProjects\\sujonAutomation\\Generic\\drive\\chromedriver.exe");
            }else if (os.contains("mac")|| os.contains("os x")){
                System.setProperty("webdriver.chrome.driver","C:\\Users\\sujon\\IdeaProjects\\sujonAutomation\\Generic\\drive\\chromedriver.exe");
            }
            driver = new ChromeDriver();
        }else if(browserName.contains("firefox")){
            if(os.contains("win")){
                System.setProperty("webdriver.gecko.driver","C:\\Users\\sujon\\IdeaProjects\\sujonAutomation\\Generic\\drive\\geckodriver.exe");
            }else if(os.contains("mac") || os.contains("os x")){
                System.setProperty("webdriver.gecko.driver","C:\\Users\\sujon\\IdeaProjects\\sujonAutomation\\Generic\\drive\\geckodriver.exe");
            }
            driver = new FirefoxDriver();
        }
        return driver;
    }
    @AfterTest
    public void finishUp(){
        System.out.println("Session is over");
        driver.close();
    }
}
