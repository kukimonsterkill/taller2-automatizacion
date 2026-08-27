# language: es
Característica: Validación de credenciales de usuario

  Esquema del escenario: Validar formato de correo electrónico
    Dado que el usuario ingresa el correo "<email>"
    Cuando se ejecuta la validación del correo
    Entonces el resultado del correo debe ser "<resultado>"

    Ejemplos:
      | email               | resultado |
      | usuario@dominio.com | true      |
      | usuario-sin-arroba  | false     |
      | @dominio.com        | false     |

  Esquema del escenario: Validar longitud de la contraseña
    Dado que el usuario ingresa la contraseña "<password>"
    Cuando se ejecuta la validación de la contraseña
    Entonces el resultado de la contraseña debe ser "<resultado>"

    Ejemplos:
      | password   | resultado |
      | 12345678   | true      |
      | 1234       | false     |
