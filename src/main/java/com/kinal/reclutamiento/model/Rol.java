package main.java.com.kinal.reclutamiento.model;

/** Entidad que mapea la tabla rol. Solo vive en las capas repositorio/servicio. */
public class Rol {

    private int idRoles;
    private String nombre;
    private String description;

    public Rol(int idRoles, String nombre, String description) {
        this.idRoles = idRoles;
        this.nombre = nombre;
        this.description = description;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
    
}
