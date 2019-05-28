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
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class PantallaImpresionListas {

    @FXML
    private Button botonImprimir;
    
    @FXML
    private Button botonVolver;
    
    @FXML
    private ListView<?> listas;
	@FXML
	private Button botonCerrar;

	@FXML
	void cerrar(ActionEvent event) {
		Stage stage = (Stage) botonCerrar.getScene().getWindow();
		stage.close();
	}
    @FXML
    void crearLista(ActionEvent event) {

    }

    @FXML
    void volver(ActionEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaSeleccionLista.fxml"));
			Parent root3 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonImprimir.getScene().getWindow();
			stage.setScene(new Scene(root3));
			stage.setResizable(false);
	

		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}
    }

}
