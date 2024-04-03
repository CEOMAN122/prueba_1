Feature: Como usuario de la aplicación deseo iniciar sesion

  @login-successful
  Scenario: inicio de sesión exitoso
    Given el "usuario" quiere iniciar sesión en deezer
    When  ingresa sus credenciales correctas user:  and password:
    Then debe ver la pantalla del home

  @login-invalid-user
  Scenario: inicio de sesión exitoso con credenciales invalidas
    Given el "usuario" quiere iniciar sesión en deezer
    When  ingresa usuario invalido user:  and password:
    Then debe ver la alerta de datos incorrectos

  @login-invalid-password
  Scenario: inicio de sesión exitoso con credenciales invalidas
    Given el "usuario" quiere iniciar sesión deezer
    When  ingresa usuario invalido user:  and password:
    Then debe ver la alerta de datos incorrectos

  @login-biometric
  Scenario: inicio de sesión biométrico exitoso
    Given el "usuario" quiere iniciar sesión en presente
    * activa la validación biométrica con user: 1000320551 and password: 1463
    When  ingresa mediante la validación biométrica
    Then debe ver la pantalla del home
    * desactiva la validación biométrica
