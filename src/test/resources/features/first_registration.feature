Feature: Como usuario de la aplicación deseo registrarme por primera vez

  @register
  Scenario: registro exitoso
    Given el usuario Manuel esta en App Deezer
    When  completa el registro con los datos user: pruebacastor2@gmail.com and password: 12345678
    Then  debe ver la pantalla de bienvenida

  @register_playlist
  Scenario: se realizo un registro previo2
    Given el usuario Manuel esta en App Deeze2r
    When  completa el registro con los dat2os user: pruebacastor@gmail.com and password: 123456782
    Then  debe ver la pantalla de bie2nvenida