package nopcommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;
/*Homework -1
Navigate to google https://www.google.com/
In Goole search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to Computers page.
Navigate to google https://www.google.com/
In Goole search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
*/

public class HomeWork_1 {
   static WebDriver driver;
    @Before
    public  void navigateToGoogle() {

        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
        @Test
                public void openNopCommerceAndClickOnComputerTab() {
            driver.findElement(By.xpath("//div[text()='I agree']")).click();
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
            driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
           driver.findElement(By.xpath("//a[text()='Computers ']")).click();

    }
    @Test
    public void openNopCommerceAndClickOnElectronicsTab(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();

    }
    @Test
    public void openNopCommerceAndClickOnApparelTab(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();

    }
    @Test
    public void openNopCommerceAndClickOnDigitalDownloadsTab(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
    }
    @Test
    public void openNopCommerceAndClickOnBooksTab() {
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Books ']")).click();

    }
    @Test
    public void openNopCommerceAndClickOnJewleryTab(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();


    }
    @Test
    public void openNopCommerceAndClickOnGiftCardTab(){
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();


    }
    @After
    public void tearDown(){
        driver.quit();
    }
    }



