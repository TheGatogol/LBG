Feature: Yo como usuario,
  Quiero registrar un empleado orangehrmlive

  Background: Ingresamos URL
    Given Ingresamos a OrangeHRM

  @selenide
  Scenario Outline: Registramos a un usuario y lo verificamos
    When Hacemos login
      | <username> | <password> |
    Then Seleccionamos Admin en Dashboard
    When Registro un usuario
    | <statusAdd> | <passwordAdd> | <confirmPasswordAdd> | <usernameAdd> | <employeeNameAdd> |
    Then Buscar un usuario
    | <usernameSearch> | <employeeNameSearch> | <statusSearch> |
    And Validamos Record Found
    | <recordFound> |
    And Cerramos Sesion
    And Esperamos cinco segundos

    Examples:
      | username  | password  | statusAdd | passwordAdd  | confirmPasswordAdd | usernameAdd | employeeNameAdd | usernameSearch | recordFound      |
      | Admin     | admin123  | Enabled   | 1!qazwsx     | 1!qazwsx           | FINDEP      | Odis            | FINDEP         | (1) Record Found |