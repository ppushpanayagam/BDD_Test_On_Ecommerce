package wrappers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class EventsWrapper implements EventsInterFace {

    public static WebDriver driver;
    public static Properties prop;

    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    public void loadObjects() {
        prop = new Properties();
        try {
            prop.load(new FileInputStream(new File("./src/main/resources/object.properties")));
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enterById(String idValue,String data){

        try{
            driver.findElement(By.id(idValue)).clear();
            driver.findElement(By.id(idValue)).sendKeys(data);

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void clickById(String idValue) {

        try {
            driver.findElement(By.id(idValue)).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectByIdWithValue(String cnameValue, String data) throws Throwable {

        try {
            Select dropdown = new Select(driver.findElement(By.className(cnameValue)));
            dropdown.selectByValue(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void VerifyTextValueById(String iDValue,String data){
        boolean bReturn = false;
        try {
            if(driver.findElement(By.id(iDValue)).getAttribute("value").trim().equalsIgnoreCase(data)){
                System.out.println(data+" verified and working as expected");
            }
            else {
                System.out.println(data+" verified and NOT same as expected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyTitle(String data){
        String title = "";
        title = driver.getTitle();
        try {
            if(title.trim().equalsIgnoreCase(data)){
                System.out.println(data+" verified and working as expected");
            }
            else {
                System.out.println(data+" verified and NOT same as expected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
