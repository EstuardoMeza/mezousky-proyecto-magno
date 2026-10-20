package main.java.com.kinal.reclutamiento.exception;

/** Falla al acceder a la base de datos. */
public class PersistenciaException extends AppException {

    public PersistenciaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
