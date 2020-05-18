package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicio extends BasePage {

    private String TituloPagina = "MaxiPelis24.info - Ver Peliculas Online Estrenos, Descarga Gratis en HD MaxiPelis24";
    private By LocalizadorBotonEstrenos = By.xpath("//*[@id=\"menu-menu-1\"]/li[2]/a");
    private By LocalicadorBotonContacto = By.xpath("//*[@id=\"contenedor\"]/div/div[5]/a[2]");

    public PaginaInicio (WebDriver driver){
        super(driver);

    }


    public boolean PaginaInicioDesplegada() throws Exception{
    return this.getTitle().equals(TituloPagina);

    }

    public void DarclicBotonEstrenos() throws Exception{
        this.click(LocalizadorBotonEstrenos);
    }

    public void DarClicBotonContacto() throws Exception{
        this.click(LocalicadorBotonContacto);
    }


}
