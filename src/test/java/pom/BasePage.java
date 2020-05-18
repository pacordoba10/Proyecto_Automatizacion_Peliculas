package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }


    public void click(By element) throws Exception {

        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se puede realizar click sobre el elemento" + element);
        }
    }

    public boolean isDisplayed (By element) throws Exception {

        try {
            return driver.findElement(element).isDisplayed();
        } catch (Exception e) {
            throw new Exception("No se pudo encontrar el elemento" + element);
        }
    }

    public String getText(By element) throws Exception {

        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se obtiene el elemento" + element);
        }
    }

    public String getTitle() throws Exception {

        try {
            return driver.getTitle();
        } catch (Exception e) {
            throw new Exception("No se pudo obtener el titulo de la pagina" );
        }
    }

    public String getUrl (By element) throws Exception {
        try {
            return driver.findElement(element).getAttribute("href");
        } catch (Exception e) {
            throw new Exception("No se obtiene el elemento" + element);
        }
    }

    public void setFields (String inputText, By element){
        driver.findElement(element).sendKeys(inputText);
    }

}
