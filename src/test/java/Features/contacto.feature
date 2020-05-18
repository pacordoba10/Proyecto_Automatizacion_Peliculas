Feature: Validar el formulario de contactenos
  Como usuario quiero enviar un mensaje en el formulario de contactenos de la pagina

  Scenario: Ingresar a la pagina de contacto desde el Home
    Given El usuario debe estar en el home de la pagina Maxipelis24
    When Dar clic en el boton Contacto del footer de la pagina
    And Diligenciar los campos del formulario de Contacto
    And Dar clic en Enviar
    Then Se debe dirigir a la pagina de Contacto
    And Se conservara en la pagina de Contacto con un mensaje "Gracias por tu mensaje. Ha sido enviado"
