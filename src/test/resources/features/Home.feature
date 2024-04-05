Feature: interaccion con el home,
  Como un usuario de la aplicacion, yo deseo interactuar con las funcionalidades del Home


  @interactuar-home
  Scenario: Interaccion con elementos del Home
    Given ell usuario Manuel esta en App Deezer
    When  completo el registro con los datos user: pruebacastor42@gmail.com and password: 12345678
    And   selecciono la lista de artistas
    When  Interactua con el tab bar inferior
    And Interactua con el boton de notificaciones
    And Interactua con el boton del perfil
    Then debe haber encontrado todos los elementos