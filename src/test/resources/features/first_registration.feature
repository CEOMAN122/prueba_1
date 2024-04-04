Feature: Como usuario de la aplicación deseo registrarme por primera vez

  @register
  Scenario: registro exitoso
    Given el usuario Manuel esta en App Deezer
    When  completa el registro con los datos user: pruebacastor@gmail.com and password: 12345678
    Then  debe ver la pantalla de bienvenida