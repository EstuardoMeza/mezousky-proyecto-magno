package main.java.com.kinal.reclutamiento.util;

import main.java.com.kinal.reclutamiento.dto.UsuarioDTO;

/** Guarda al usuario autenticado durante la ejecución (inyectada donde se necesite). */
public class SesionUsuario {

    private UsuarioDTO usuario;

    public void iniciar(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public void cerrar() {
        this.usuario = null;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }
}
