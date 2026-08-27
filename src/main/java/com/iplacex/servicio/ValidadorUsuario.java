package com.iplacex.servicio;

public class ValidadorUsuario {

    public boolean validarEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }

    public boolean validarPassword(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8;
    }
}