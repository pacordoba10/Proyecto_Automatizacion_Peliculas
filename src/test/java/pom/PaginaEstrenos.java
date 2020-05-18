package pom;

import Seleniumgluecode.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.xpath.XPath;

public class PaginaEstrenos extends BasePage  {

    //String LocalizadorUrlPaginaEstreno  = driver.getCurrentUrl();
    //WebElement LocalizadorPaginaEstreno = driver.findElement(By.cssSelector("page"));
    By LocalizadorUrlPaginaEstrenos = By.linkText("Estrenos✪");
    private String UrlPaginaEstrenos = "https://maxipelis24.info/Categoria/estrenos/";

    public PaginaEstrenos (WebDriver driver){

        super (driver);
    }

    public boolean PaginaEstrenosDesplegada () throws Exception{
        return this.isDisplayed(LocalizadorUrlPaginaEstrenos)&& this.getUrl(LocalizadorUrlPaginaEstrenos).equals(UrlPaginaEstrenos);
    }

}



