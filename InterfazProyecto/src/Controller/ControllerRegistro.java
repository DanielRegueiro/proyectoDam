package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.RestClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modeloVista.Usuario;

public class ControllerRegistro {

	@FXML
	private PasswordField textContrasena;

	@FXML
	private TextField textUsuario;

	@FXML
	private Button buttonRegistrarse;

	@FXML
	private Button buttonVolver;
	@FXML
	private Button botonCerrar;

	@FXML
	void cerrar(ActionEvent event) {
		Stage stage = (Stage) botonCerrar.getScene().getWindow();
		stage.close();
	}

	@FXML
	void cambioPantalla(ActionEvent event) {

		Usuario usuario;
		boolean registroOk = false;

		try {
			// Buscamos el usuario en la base de datos para comprobar si existe
			usuario = RestClient.getUsuario(textUsuario.getText());
			if (usuario != null) {
				System.out.println("El usuario ya existe en la base de datos: " + usuario.getNombre());
				registroOk = false;
			}

		} catch (IOException e) {

			// Si el usuario no existe va a entrar en el catch (porque intenta parsear un
			// null y no sabe)

			usuario = new Usuario();
			usuario.setNombre(textUsuario.getText());
			usuario.setContasena(textContrasena.getText());

			try {
				// Guardamos el usuario en la base de datos
				RestClient.postUsuario(usuario);
				registroOk = true;

			} catch (IOException e1) {
				System.out.println("Error en post usuario en registro");
			}

			if (!registroOk) {
				System.out.println("No se ha podido realizar el registro");

			} else {
				System.out.println("Usuario registrado correctamente en la base de datos");

				// Cambiar de pantalla
				try {
					FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Pantallalogos.fxml"));
					Parent root1 = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setScene(new Scene(root1));
					stage.initStyle(StageStyle.UNDECORATED);
					stage.setResizable(false);
					stage.centerOnScreen();
					stage.show();

				} catch (IOException ex) {
					Logger.getLogger(ControllerFXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
				}
				Stage stage2 = (Stage) buttonRegistrarse.getScene().getWindow();

				stage2.close();

			}

		}

	}

	@FXML
	void initialize() {
		assert textContrasena != null : "fx:id=\"textContrasena\" was not injected: check your FXML file 'Registro.fxml'.";
		assert textUsuario != null : "fx:id=\"textUsuario\" was not injected: check your FXML file 'Registro.fxml'.";
		assert buttonRegistrarse != null : "fx:id=\"buttonRegistrarse\" was not injected: check your FXML file 'Registro.fxml'.";
		assert buttonVolver != null : "fx:id=\"buttonVolver\" was not injected: check your FXML file 'Registro.fxml'.";

	}

	@FXML
	void volver(ActionEvent event) {

	}

}
