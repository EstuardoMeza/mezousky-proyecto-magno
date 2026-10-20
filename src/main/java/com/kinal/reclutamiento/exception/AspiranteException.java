package main.java.com.kinal.reclutamiento.exception;

/** El aspirante solicitado no existe o ya existe un aspirante con los mismos datos únicos. */
public class AspiranteException extends AppException {

    public AspiranteException(String mensaje) {
        super(mensaje);
    }
}
