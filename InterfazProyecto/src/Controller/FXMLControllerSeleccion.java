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
public class FXMLControllerSeleccion {

	@FXML
	private ImageView lobos;

	@FXML
	private Button botonlobos;



	public void handleButtonAction(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Pantallaseleccionunidad.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonlobos.getScene().getWindow();
			stage.setScene(new Scene(root2));
			stage.initStyle( StageStyle.UNDECORATED );
			stage.setResizable(false);
	

		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerSeleccion.class.getName()).log(Level.SEVERE, null, ex);
		}
	
	}

//	public void handleButtonAction(ActionEvent event) {
//		try {
//			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Pantallaseleccionunidad.fxml"));
//			Parent root2 = (Parent) fxmlLoader.load();
//			Stage stage2 = new Stage();
//
//			stage2.setScene(new Scene(root2));
//			stage2.setResizable(false);
//			stage2.show();
//
//		} catch (IOException ex) {
//			Logger.getLogger(FXMLControllerSeleccion.class.getName()).log(Level.SEVERE, null, ex);
//		}
//		Stage stagePrincipal1 = (Stage) botonlobos.getScene().getWindow();
//		stagePrincipal1.close();
//	}

}
