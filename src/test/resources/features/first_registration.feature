Feature: Como usuario de la aplicación deseo registrarme por primera vez

  @register
  Scenario: registro exitoso por primera vez
    Given el usuario Manuel esta en App Deezer
    When  completa el registro con los datos user: pruebacastor40@gmail.com and password: 12345678
    And   selecciona la lista de artistas
    Then  debe ver la pantalla de bienvenida

