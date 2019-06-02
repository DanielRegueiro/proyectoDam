/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import controller.ControllerFXMLLogin;
import data.LogicaPrincipal;
import data.RestClient;
import data.RestClientImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modeloVista.Lista;
import modeloVista.Unidad;
import modeloVista.UnidadesSel;
import modeloVista.Usuario;

/**
 *
 * @author daniel
 */
public class ControllerFXMLLogin implements Initializable {

	@FXML
	private PasswordField textContrasena;

	@FXML
	private TextField textUsuario;

	@FXML
	private Button buttonLogin;

	@FXML
	private Button buttonRegistro;
	@FXML
	private Button botonCerrar;

	private Usuario usuario;

	@FXML
	void cerrar(ActionEvent event) {
		Stage stage = (Stage) botonCerrar.getScene().getWindow();
		stage.close();
	}

	@FXML
	void registrarse(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Registro.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) buttonRegistro.getScene().getWindow();
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.show();

		} catch (IOException ex) {
			Logger.getLogger(ControllerFXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@FXML
	void volver(ActionEvent event) {

	}

	@FXML
	private void handleButtonAction(ActionEvent event) {

		LogicaPrincipal.getInstance().recuperarUsuario(textUsuario.getText());
		usuario = LogicaPrincipal.getInstance().getUser();

		if (usuario.getNombre().equals(textUsuario.getText())
				&& usuario.getContasena().equals(textContrasena.getText())) {
			try {

				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Pantallalogos.fxml"));
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setScene(new Scene(root1));
				stage.setResizable(false);
				stage.initStyle(StageStyle.UNDECORATED);
				stage.centerOnScreen();
				stage.show();

			} catch (IOException ex) {
				Logger.getLogger(ControllerFXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
			}
			Stage stagePrincipal = (Stage) buttonLogin.getScene().getWindow();
			stagePrincipal.close();
		} else {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaDialogoAlerta.fxml"));

			try {
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				ControllerDialogoAlerta controller = fxmlLoader.<ControllerDialogoAlerta>getController();
				controller.cambiarTexto("La contraseņa no es correcta");
				stage.setScene(new Scene(root1));
				stage.setResizable(false);
				stage.initStyle(StageStyle.UNDECORATED);
				stage.centerOnScreen();
				stage.show();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}

}
