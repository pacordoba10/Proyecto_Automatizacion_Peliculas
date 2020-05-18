package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class PaginaContacto extends BasePage {

   //Pagina contacto
   By LocalizadorUrlPaginaContacto = By.linkText("Contacto");
   private String UrlPaginaContacto = "https://maxipelis24.info/contacto";

   //Formulario contacto
   By LocalizadorNombre = By.name("your-name");
   By LocalizadorCorreo = By.name("your-email");
   By LocalizadorAsunto = By.name("your-subject");
   By LocalizadorMensaje = By.name("your-message");
   By BotonEnviar = By.xpath("//*[@id=\"wpcf7-f27341-p17148-o1\"]/form/p[5]/input");


    private String MensajeExitoso = "Gracias por tu mensaje. Ha sido enviado";


    public PaginaContacto (WebDriver driver){

        super(driver);
    }


    public boolean PaginaContactoDesplegada () throws Exception {
        return this.isDisplayed(LocalizadorUrlPaginaContacto) && this.getUrl(LocalizadorUrlPaginaContacto).equals(UrlPaginaContacto);
    }

    public void DiligenciarFormulario (){
        this.setFields("Paola",LocalizadorNombre);
        this.setFields("paola10@gmail.com",LocalizadorCorreo);
        this.setFields("Sugere",LocalizadorAsunto);
        this.setFields("sfdhfkjshkjdhfkjshdkfh",LocalizadorMensaje);
    }

    public void DarClicBotonEnviar () throws Exception{
        this.click(BotonEnviar);
    }

    public boolean MensajeEnviado (String arg1) throws Exception {
        return this.isDisplayed(LocalizadorUrlPaginaContacto)&& arg1.equals(MensajeExitoso);
    }


}
