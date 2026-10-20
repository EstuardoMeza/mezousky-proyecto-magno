package main.java.com.kinal.reclutamiento.util;

import org.mindrot.jbcrypt.BCrypt;

/** Encapsula el hash y la verificación de contraseñas con BCrypt. */
public class PasswordUtil {

    private static final int COSTO = 12;

    public String hashear(String contrasenaPlana) {
        return BCrypt.hashpw(contrasenaPlana, BCrypt.gensalt(COSTO));
    }

    public boolean verificar(String contrasenaPlana, String hash) {
        try {
            return BCrypt.checkpw(contrasenaPlana, hash);
        } catch (IllegalArgumentException e) {
            return false; // hash con formato inválido
        }
    }
}
