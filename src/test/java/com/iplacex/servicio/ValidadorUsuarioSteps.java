

        package com.iplacex.servicio;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidadorUsuarioSteps {

    private String email;
    private String password;
    private boolean resultadoEmail;
    private boolean resultadoPassword;
    private final ValidadorUsuario validador = new ValidadorUsuario();

    @Dado("que el usuario ingresa el correo {string}")
    public void queElUsuarioIngresaElCorreo(String email) {
        this.email = email;
    }

    @Cuando("se ejecuta la validación del correo")
    public void seEjecutaLaValidacionDelCorreo() {
        this.resultadoEmail = validador.validarEmail(this.email);
    }

    @Entonces("el resultado del correo debe ser {string}")
    public void elResultadoDelCorreoDebeSer(String resultadoEsperado) {
        boolean esperado = Boolean.parseBoolean(resultadoEsperado);
        assertEquals(esperado, this.resultadoEmail);
    }

    @Dado("que el usuario ingresa la contraseña {string}")
    public void queElUsuarioIngresaLaContrasena(String password) {
        this.password = password;
    }

    @Cuando("se ejecuta la validación de la contraseña")
    public void seEjecutaLaValidacionDeLaContrasena() {
        this.resultadoPassword = validador.validarPassword(this.password);
    }

    @Entonces("el resultado de la contraseña debe ser {string}")
    public void elResultadoDeLaContrasenaDebeSer(String resultadoEsperado) {
        boolean esperado = Boolean.parseBoolean(resultadoEsperado);
        assertEquals(esperado, this.resultadoPassword);
    }
}