Feature: Como usuario de la aplicación deseo registrarme por primera vez

  @register
  Scenario: registro exitoso
    Given el "usuario" quiere registrarse por primera vez
    When  ingresa sus credenciales correctas correo: monologuiza80@gmail.com and password: 12345
    And   completa la información solicitada y acepta terminos y condiciones
    Then debe ver la pantalla de bienvenida