/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import Controller.FXMLControllerLogin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author daniel
 */
public class FXMLControllerSeleccionEjercito {

	@FXML
	private ImageView lobos;

	@FXML
	private Button botonlobos;



	public void handleButtonAction(ActionEvent event) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaSeleccionTropasAUsar.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.initStyle( StageStyle.UNDECORATED );
			stage.centerOnScreen();
			stage.show();

		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
		}
		Stage stagePrincipal = (Stage) botonlobos.getScene().getWindow();

		stagePrincipal.close();
	}

	

}
