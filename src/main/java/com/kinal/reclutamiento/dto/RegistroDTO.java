package main.java.com.kinal.reclutamiento.dto;

/** Datos enviados desde la vista de registro. */
public record RegistroDTO(String nombreUsuario, String correo, String contrasena,
                          String confirmacion, int idRol) {
}
