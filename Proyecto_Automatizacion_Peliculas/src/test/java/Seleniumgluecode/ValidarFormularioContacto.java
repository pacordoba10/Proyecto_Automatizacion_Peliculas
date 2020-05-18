package Seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pom.PaginaInicio;

public class ValidarFormularioContacto extends ValidarEstrenosBase {

    @Given("^El usuario debe estar en el home de la pagina Maxipelis(\\d+)$")
    public void el_usuario_debe_estar_en_el_home_de_la_pagina_Maxipelis(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("No se encuentra en la pagina Home", inicio.PaginaInicioDesplegada());

    }

    @When("^Dar clic en el boton Contacto del footer de la pagina$")
    public void dar_clic_en_el_boton_Contacto_del_footer_de_la_pagina() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        inicio.DarClicBotonContacto();

    }

    @When("^Diligenciar los campos del formulario de Contacto$")
    public void diligenciar_los_campos_del_formulario_de_Contacto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        contacto.DiligenciarFormulario();

    }

    @When("^Dar clic en Enviar$")
    public void dar_clic_en_Enviar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        contacto.DarClicBotonEnviar();
    }

    @Then("^Se debe dirigir a la pagina de Contacto$")
    public void se_debe_dirigir_a_la_pagina_de_Contacto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("No se direcciono correctamente a la pagina de Contacto",contacto.PaginaContactoDesplegada());
    }

    @Then("^Se conservara en la pagina de Contacto con un mensaje \"([^\"]*)\"$")
    public void se_conservara_en_la_pagina_de_Contacto_con_un_mensaje(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue("No se envio el mensaje correctamente",contacto.MensajeEnviado(arg1));
    }

}
