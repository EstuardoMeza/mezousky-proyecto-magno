package main.java.com.kinal.reclutamiento.exception;

/** Excepción base del dominio. Su mensaje es apto para mostrarse al usuario. */
public class AppException extends RuntimeException {

    public AppException(String mensaje) {
        super(mensaje);
    }

    public AppException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
