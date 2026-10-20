package main.java.com.kinal.reclutamiento.dto;

/** Usuario autenticado (nunca incluye la contraseña ni su hash). */
public record UsuarioDTO(int id, String nombreUsuario, String correo, String rol) {
}
