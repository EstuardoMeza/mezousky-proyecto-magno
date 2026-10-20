package main.java.com.kinal.reclutamiento.controller;

import main.java.com.kinal.reclutamiento.dto.LoginDTO;
import main.java.com.kinal.reclutamiento.dto.UsuarioDTO;
import main.java.com.kinal.reclutamiento.exception.AppException;
import main.java.com.kinal.reclutamiento.exception.ValidacionException;
import main.java.com.mezousky.proyects.service.AuthService;
import main.java.com.kinal.reclutamiento.util.AlertaUtil;
import main.java.com.kinal.reclutamiento.util.SceneManager;
import main.java.com.kinal.reclutamiento.util.SesionUsuario;
import main.java.com.kinal.reclutamiento.util.Vista;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    private final AuthService authService;
    private final SceneManager sceneManager;
    private final SesionUsuario sesion;

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContrasena;

    public LoginController(AuthService authService, SceneManager sceneManager, SesionUsuario sesion) {
        this.authService = authService;
        this.sceneManager = sceneManager;
        this.sesion = sesion;
    }

    @FXML
    private void iniciarSesion() {
        try {
            UsuarioDTO usuario = authService.iniciarSesion(
                    new LoginDTO(txtUsuario.getText(), txtContrasena.getText()));
            sesion.iniciar(usuario);
            sceneManager.mostrar(Vista.INVENTARIO);
        } catch (ValidacionException e) {
            AlertaUtil.advertencia(e.getMessage());
        } catch (AppException e) {
            AlertaUtil.error(e.getMessage());
        }
    }

    @FXML
    private void irARegistro() {
        sceneManager.mostrar(Vista.REGISTRO);
    }
}
