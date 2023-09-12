Feature: Yo como usuario,
  Quiero registrar un empleado orangehrmlive

  Background: Ingresamos URL
    Given Ingresamos a OrangeHRM

  @selenide
  Scenario Outline: Registramos a un usuario y lo verificamos
    When Hacemos login
      | <username> | <password> |
    Then Seleccionamos Admin en Dashboard
    When Buscar un usuario
      | <usernameSearch> |
   Then Borramos Usuario
    And Cerramos Sesion
    And Esperamos cinco segundos

    Examples:
      | username  | password  | usernameSearch |
      | Admin     | admin123  | FINDEP         |