package Pages;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testpage {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    String s = System.setProperty("webdriver.gecko.driver","C:\\Users\\kholo\\IdeaProjects\\Academisa\\chromedriver.exe");


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://mytest.academi.sa/");
        driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).click();
        driver.findElement(By.xpath("//form[@id='login']/div[3]/div/div/label")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.findElement(By.linkText("Students Statistics")).click();
        driver.findElement(By.xpath("//nav[@id='nav_id']/ul/div[2]/li/a/span[2]")).click();
        driver.findElement(By.linkText("Students")).click();
        driver.findElement(By.xpath("//nav[@id='nav_id']/ul/div[3]/li/div/ul/li")).click();
        driver.findElement(By.xpath("//nav[@id='nav_id']/div/div[2]/span[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

//    private String closeAlertAndGetItsText() {
//        try {
//            Alert alert = driver.switchTo().alert();
//            String alertText = alert.getText();
//            if (acceptNextAlert) {
//                alert.accept();
//            } else {
//                alert.dismiss();
//            }
//            return alertText;
//        } finally {
//            acceptNextAlert = true;
//        }
//    }
}
