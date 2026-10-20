package main.java.com.kinal.reclutamiento.controller;

import main.java.com.kinal.reclutamiento.dto.RegistroDTO;
import main.java.com.kinal.reclutamiento.dto.RolDTO;
import main.java.com.kinal.reclutamiento.exception.AppException;
import main.java.com.kinal.reclutamiento.exception.ValidacionException;
import main.java.com.mezousky.proyects.service.AuthService;
import main.java.com.kinal.reclutamiento.util.AlertaUtil;
import main.java.com.kinal.reclutamiento.util.SceneManager;
import main.java.com.kinal.reclutamiento.util.Vista;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistroController {

    private final AuthService authService;
    private final SceneManager sceneManager;

    @FXML private TextField txtUsuario;
    @FXML private TextField txtCorreo;
    @FXML private PasswordField txtContrasena;
    @FXML private PasswordField txtConfirmacion;
    @FXML private ComboBox<RolDTO> cmbRol;

    public RegistroController(AuthService authService, SceneManager sceneManager) {
        this.authService = authService;
        this.sceneManager = sceneManager;
    }

    @FXML
    private void initialize() {
        try {
            cmbRol.setItems(FXCollections.observableArrayList(authService.listarRoles()));
        } catch (AppException e) {
            AlertaUtil.error(e.getMessage());
        }
    }

    @FXML
    private void registrar() {
        try {
            RolDTO rol = cmbRol.getValue();
            authService.registrar(new RegistroDTO(
                    txtUsuario.getText(), txtCorreo.getText(),
                    txtContrasena.getText(), txtConfirmacion.getText(),
                    rol == null ? 0 : rol.id()));
            AlertaUtil.informacion("Usuario registrado correctamente. Ya puede iniciar sesión.");
            sceneManager.mostrar(Vista.LOGIN);
        } catch (ValidacionException e) {
            AlertaUtil.advertencia(e.getMessage());
        } catch (AppException e) {
            AlertaUtil.error(e.getMessage());
        }
    }

    @FXML
    private void volver() {
        sceneManager.mostrar(Vista.LOGIN);
    }
}
