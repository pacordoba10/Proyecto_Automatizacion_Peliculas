package Seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.PaginaContacto;
import pom.PaginaEstrenos;
import pom.PaginaInicio;

public class ValidarEstrenosBase {

    protected WebDriver driver = Hooks.getDriver();
    protected PaginaInicio inicio = new PaginaInicio(driver);
    protected PaginaEstrenos estrenos = new PaginaEstrenos(driver);
    protected PaginaContacto contacto = new PaginaContacto(driver);


}
