package wrappers;

import org.apache.log4j.Logger;
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

    Logger log = Logger.getLogger("EventsWrapper.class");
    public static WebDriver driver;
    public static Properties prop;

    public void launchApp() {
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
            driver.findElement(By.id(idValue)).sendKeys(data);
            log.info("The value "+data+" entered Successfully");
        } catch (NoSuchElementException e) {
            log.info("The value "+data+" NOT entered Successfully");
            e.printStackTrace();
        }
    }

    public void clickById(String idValue) {

        try {
            driver.findElement(By.id(idValue)).click();
            log.info("Element clicked Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("Element NOT clicked Successfully");
        }
    }

    public void clickByXpath(String xpathValue) {

        try {
            driver.findElement(By.xpath(xpathValue)).click();
            log.info("Element clicked Successfully");
        } catch (Exception e) {
            e.printStackTrace();
            log.info("Element NOT clicked Successfully");
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

    public boolean VerifyTextValueByXpath(String xpathValue,String data) throws Throwable{
        boolean bReturn = false;
        try {
            if(driver.findElement(By.xpath(xpathValue)).getText().trim().equalsIgnoreCase(data)){
                log.info(" verified and"+ data +" is working as expected");
                bReturn = true;
            }
            else {
                log.info(" verified and"+ data +" is NOT working as expected");
            }
        } catch (Exception e) {
           log.error("Logger Error: "+ e);
        }
        return bReturn;
    }

    public void verifyTitle(String data){
        String title = "";
        title = driver.getTitle();
        try {
            if(title.trim().equalsIgnoreCase(data)){
                log.info(data+" verified and Title is same as expected");
            }
            else {
                log.info(data+" verified and Title is NOT same as expected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quiteBrowser(){
        driver.quit();
    }
}
