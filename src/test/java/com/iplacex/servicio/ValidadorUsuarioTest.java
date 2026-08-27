package com.iplacex.servicio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

    private ValidadorUsuario validador;

    @BeforeEach
    public void setUp() {
        validador = new ValidadorUsuario();
    }

    @Test
    @DisplayName("Debe retornar true para un email válido")
    public void testValidarEmailValido() {
        boolean resultado = validador.validarEmail("usuario@ejemplo.com");
        assertTrue(resultado, "El email debería ser válido");
    }

    @Test
    @DisplayName("Debe retornar false para un email sin arroba")
    public void testValidarEmailSinArroba() {
        boolean resultado = validador.validarEmail("usuarioejemplo.com");
        assertFalse(resultado, "El email debería ser inválido por falta de '@'");
    }

    @Test
    @DisplayName("Debe retornar true para una contraseña con 8 o más caracteres")
    public void testValidarPasswordValida() {
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "La contraseña debería ser válida");
    }

    @Test
    @DisplayName("Debe retornar false para una contraseña corta")
    public void testValidarPasswordCorta() {
        boolean resultado = validador.validarPassword("1234");
        assertFalse(resultado, "La contraseña corta debería ser inválida");
    }
}