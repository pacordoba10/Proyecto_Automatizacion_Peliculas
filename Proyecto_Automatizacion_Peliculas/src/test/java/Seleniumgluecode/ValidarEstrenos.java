package Seleniumgluecode;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.BasePage;
import pom.PaginaInicio;

public class ValidarEstrenos extends ValidarEstrenosBase {

    @Given("^El usuario de estar en el home de la pagina Maxipelis(\\d+)$")
    public void el_usuario_de_estar_en_el_home_de_la_pagina_Maxipelis(int arg1) throws Throwable {

        Assert.assertTrue("No se redirecciono la pagina correctamente", inicio.PaginaInicioDesplegada());
    }

    @When("^Dar clic en el boton estrenos$")
    public void dar_clic_en_el_boton_estrenos() throws Throwable {

        inicio.DarclicBotonEstrenos();

    }

    @Then("^Se debe dirigir a la pagina de estrenos$")
    public void se_debe_dirigir_a_la_pagina_de_estrenos() throws Throwable {

        Assert.assertTrue("No se direcciono la pagina correctamente", estrenos.PaginaEstrenosDesplegada());

    }


}
