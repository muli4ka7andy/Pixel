package Pixelshot;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollUp {

    @Test
    public void FirstTest1() throws InterruptedException {
        System.setProperty("webdriver.opera.driver", "/Users/Андрей/operadriver_win64/operadriver_win64/operadriver.exe");
         WebDriver driver = new OperaDriver();
         driver.get("https://pixel-shot.studio");
         driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);


       WebElement element = driver.findElement(By.xpath("/html/body/div[2]/span/text()"));










    }

}
