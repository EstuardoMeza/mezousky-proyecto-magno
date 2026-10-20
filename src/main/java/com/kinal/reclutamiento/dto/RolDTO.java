package main.java.com.kinal.reclutamiento.dto;

/** Rol disponible para mostrar en el formulario de registro. */
public record RolDTO(int id, String nombre) {

    @Override
    public String toString() {
        return nombre;
    }
}
