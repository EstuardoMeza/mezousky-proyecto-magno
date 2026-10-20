-- Base de datos de Reclutamiento (MySQL 8+) - Normalizada hasta 3FN
DROP DATABASE IF EXISTS reclutamiento_db;
CREATE DATABASE reclutamiento_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE reclutamiento_db;

-- Catálogo de roles (un rol puede tener muchos usuarios)
CREATE TABLE rol (
    id_rol  INT         NOT NULL AUTO_INCREMENT,
    nombre  VARCHAR(30) NOT NULL,
    CONSTRAINT pk_rol PRIMARY KEY (id_rol),
    CONSTRAINT uq_rol_nombre UNIQUE (nombre)
) ENGINE=InnoDB;

-- Usuarios del sistema (el rol se referencia por FK, sin repetir texto)
CREATE TABLE usuario (
    id_usuario      INT          NOT NULL AUTO_INCREMENT,
    nombre_usuario  VARCHAR(50)  NOT NULL,
    correo          VARCHAR(100) NOT NULL,
    contrasena_hash VARCHAR(100) NOT NULL,   -- hash BCrypt (60 chars)
    id_rol          INT          NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (id_usuario),
    CONSTRAINT uq_usuario_nombre UNIQUE (nombre_usuario),
    CONSTRAINT uq_usuario_correo UNIQUE (correo),
    CONSTRAINT fk_usuario_rol FOREIGN KEY (id_rol) REFERENCES rol (id_rol)
) ENGINE=InnoDB;

-- Aspirantes (inventario)
CREATE TABLE aspirante (
    id_aspirante INT          NOT NULL AUTO_INCREMENT,
    nombre       VARCHAR(60)  NOT NULL,
    apellido     VARCHAR(60)  NOT NULL,
    correo       VARCHAR(100) NOT NULL,
    telefono     VARCHAR(20)  NOT NULL,
    direccion    VARCHAR(150) NOT NULL,
    edad         TINYINT UNSIGNED NOT NULL,
    CONSTRAINT pk_aspirante PRIMARY KEY (id_aspirante),
    CONSTRAINT uq_aspirante_correo UNIQUE (correo),
    CONSTRAINT ck_aspirante_edad CHECK (edad BETWEEN 18 AND 99)
) ENGINE=InnoDB;

INSERT INTO rol (nombre) VALUES ('ADMINISTRADOR'), ('RECLUTADOR');
