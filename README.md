# Sistema de Reclutamiento (JavaFX + JDBC + Ant)

Aplicación base para una empresa de reclutamiento: registro e inicio de sesión de usuarios y
CRUD de aspirantes.

## Tecnologías
Java 21, Apache Ant (proyecto NetBeans), JDBC (MySQL), JavaFX (vistas FXML hechas para Scene Builder), jBCrypt.

## Arquitectura
```
Vista (FXML) -> Controller -> Service (DTOs) -> Repository (entidades, JDBC) -> MySQL
```
- `controller`: solo manejan la UI y muestran `Alert` ante las excepciones.
- `service`: validaciones y reglas de negocio; convierten entidades <-> DTOs.
- `repository`: acceso a datos con `PreparedStatement` y `try-with-resources`.
- `dto` / `model`: los DTOs viajan hacia la vista; las entidades nunca salen del servicio.
- `exception`: `AppException`, `AuthException`, `ValidacionException`, `AspiranteException`, `PersistenciaException`.
- `util/SceneManager`: orquesta la navegación; `Main` es la raíz de composición (inyección por constructor).

## Base de datos (3FN)
`rol (1) ──< usuario` y `aspirante`. Script: `sql/reclutamiento.sql`.

## Requisitos
1. MySQL/MariaDB con el script ejecutado: `mysql -u root -p < sql/reclutamiento.sql`
2. JARs ya incluidos en `lib/`: `mysql-connector-j.jar` y `jbcrypt-0.4.jar`.
3. SDK de JavaFX 21. Edite en `nbproject/project.properties` la línea `javafx.sdk.lib=` con la ruta de su SDK (usar `/`).

## Abrir y ejecutar
- **NetBeans:** File > Open Project > carpeta `reclutamiento` > Run (F6).
- **Consola:** `ant -Djavafx.sdk.lib=/ruta/javafx-sdk-21/lib run`

Credenciales de BD por defecto: `root` / `root`. Se cambian con las variables de entorno
`DB_URL`, `DB_USER`, `DB_PASSWORD`.

## Uso
1. "Crear una cuenta" para registrar un usuario (elige rol ADMINISTRADOR o RECLUTADOR).
2. Iniciar sesión y gestionar aspirantes: seleccione una fila para editarla/eliminarla.
