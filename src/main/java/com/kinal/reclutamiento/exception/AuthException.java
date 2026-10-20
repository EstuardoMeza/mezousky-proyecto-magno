package main.java.com.kinal.reclutamiento.exception;

/** Errores de autenticación y registro (credenciales inválidas, usuario duplicado...). */
public class AuthException extends AppException {

    public AuthException(String mensaje) {
        super(mensaje);
    }
}
