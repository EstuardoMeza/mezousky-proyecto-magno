package main.java.com.kinal.reclutamiento.dto;

/** Datos de un aspirante que viajan entre servicio y controlador. */
public record AspiranteDTO(Integer id, String nombre, String apellido, String correo,
                           String telefono, String direccion, int edad) {
}
