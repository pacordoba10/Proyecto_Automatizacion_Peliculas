package Seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numerodecaso = 0;

    @Before
    public void Inicio () {
        numerodecaso ++;
        System.out.println("El caso numero " + numerodecaso + "se esta ejecutando" );
        System.setProperty("webdriver.chrome.driver","./src/test/java/Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://maxipelis24.info/");
        driver.manage().window().maximize();
    }

    @After

    public void Final(){

        System.out.println("El escenario numero" + numerodecaso + "se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return driver;
    }
}
