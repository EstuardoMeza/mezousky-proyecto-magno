package main.java.com.kinal.reclutamiento.util;

/** Vistas de la aplicación y su archivo FXML. */
public enum Vista {

    LOGIN("/main/resources/fxml/login.fxml", "Reclutamiento - Iniciar sesión"),
    REGISTRO("/main/resources/fxml/registro.fxml", "Reclutamiento - Registro"),
    INVENTARIO("/main/resources/fxml/inventario.fxml", "Reclutamiento - Inventario de aspirantes");

    private final String ruta;
    private final String titulo;

    Vista(String ruta, String titulo) {
        this.ruta = ruta;
        this.titulo = titulo;
    }

    public String getRuta() { return ruta; }
    public String getTitulo() { return titulo; }
}
