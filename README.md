# Mezousky Proyectos — versión corregida

## Correcciones aplicadas
- Se normalizaron los paquetes e imports a `com.mezousky.proyects`.
- Se corrigió la clase de entrada para que sea `Main`.
- Se corrigió `RegistroController`, que tenía imports y texto de código corruptos.
- Se añadieron utilidades referenciadas por los controladores (`AlertaUtil`, `SceneManager`, `SesionUsuario`, `Vista`, `PasswordUtil`).
- Se cambió la conexión JDBC para crear una conexión nueva por operación; los repositorios usan try-with-resources y cierran cada conexión.
- Se configuró el proyecto para Java 17, compatible con `record` y `Stream.toList()`.

## Importante: partes que faltan del proyecto original
El ZIP que recibí no contenía archivos FXML ni una dependencia JavaFX configurada. Por eso el proyecto no puede mostrar las pantallas todavía. `SceneManager.mostrar(Vista)` deja un mensaje explícito hasta que se agreguen las vistas `login.fxml`, `registro.fxml` e `inventario.fxml`. No se inventaron archivos FXML que no estaban en el original.

## Configuración
Variables de entorno requeridas:
- `URL_MYSQL_DB`: URL base, por ejemplo `jdbc:mysql://localhost:3306`
- `USER_MYSQL_DB`: usuario MySQL
- `PASS_DB`: contraseña MySQL

La aplicación agrega a la URL la base `mezitas_proyect_in4bm`. Si la base tiene otro nombre, cambia `Credentials.java`.

## Esquema de base de datos esperado
Las consultas Java esperan las tablas `rol`, `usuario` y `aspirante` con las columnas indicadas en `schema.sql`.

## NetBeans
1. Abrir la carpeta del proyecto.
2. Instalar/configurar JDK 17 o superior.
3. Agregar JavaFX SDK a las bibliotecas del proyecto (los controladores usan `javafx.fxml`, `javafx.controls`).
4. Agregar el driver JDBC de MySQL al classpath.
5. Crear las tablas con `schema.sql` y configurar las variables de entorno.
6. Crear las vistas FXML y conectarlas a `SceneManager` antes de ejecutar la interfaz.
# mezousky-proyecto-magno
