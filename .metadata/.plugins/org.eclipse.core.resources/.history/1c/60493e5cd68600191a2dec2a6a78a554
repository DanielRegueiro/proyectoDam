package controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ControllerFXMLSeleccionTropasUsuario {

    @FXML
    private ImageView hielo;

    @FXML
    private ImageView lobo;
    @FXML
    private Button botonPropias;

    @FXML
    private Button botonTodas;

 

    @FXML
    void abrirPropias(ActionEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaSeleccionTropasUsuario.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonPropias.getScene().getWindow();
			stage.setScene(new Scene(root2));
			stage.setResizable(false);
			stage.centerOnScreen();
			
		} catch (IOException ex) {
			Logger.getLogger(ControllerFXMLSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}
    }

    @FXML
    void abrirTodas(ActionEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaSeleccionunidad.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonPropias.getScene().getWindow();
			stage.setScene(new Scene(root2));
			stage.setResizable(false);
			stage.centerOnScreen();

		} catch (IOException ex) {
			Logger.getLogger(ControllerFXMLSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}
    }

}
