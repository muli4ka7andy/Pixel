package Pixelshot;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.opera.OperaDriver;

public class FirstTest {
    @Test
    public void FirstTest() {
        System.setProperty("webdriver.opera.driver", "/Users/Андрей/operadriver_win64/operadriver_win64/operadriver.exe");
        OperaDriver operaDriver = new OperaDriver();
        operaDriver.get("https://pixel-shot.studio");

        String title = operaDriver.getTitle();
        Assert.assertTrue(title.equals("PIXEL-SHOT — Фотостудия"));


    }
}

