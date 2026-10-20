package main.java.com.kinal.reclutamiento.exception;

/** Datos de entrada inválidos (campos vacíos, formatos incorrectos). */
public class ValidacionException extends AppException {

    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}
