package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.stage.StageStyle;

public class ControllerPantallaSeleccionListas {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="botonNueva"
    private Button botonNueva; // Value injected by FXMLLoader

    @FXML // fx:id="botonAnadir"
    private Button botonImprimir; // Value injected by FXMLLoader

    @FXML // fx:id="listas"
    private ListView<?> listas; // Value injected by FXMLLoader

    @FXML
    void crearLista(ActionEvent event) {
try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaSeleccionTropasAUsar.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root1));
			stage.setResizable(false);
			stage.initStyle(StageStyle.UNDECORATED );
			stage.centerOnScreen();
			stage.show();

		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
		}
		Stage stagePrincipal = (Stage) botonNueva.getScene().getWindow();

		stagePrincipal.close();
    }

    @FXML
    void imprimirLista(ActionEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaListaDesplegada.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonImprimir.getScene().getWindow();
			stage.setScene(new Scene(root2));
			stage.setResizable(false);
	

		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}
    }

    @FXML
    void volver(ActionEvent event) {
      	try {
    			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaLogos.fxml"));
    			Parent root3 = (Parent) fxmlLoader.load();
    			Stage stage = (Stage) botonNueva.getScene().getWindow();
    			stage.setScene(new Scene(root3));
    			stage.setResizable(false);
    	

    		} catch (IOException ex) {
    			Logger.getLogger(FXMLControllerSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
    		}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert botonNueva != null : "fx:id=\"botonNueva\" was not injected: check your FXML file 'PantallaSeleccionLista.fxml'.";
        assert botonImprimir != null : "fx:id=\"botonAnadir\" was not injected: check your FXML file 'PantallaSeleccionLista.fxml'.";
        assert listas != null : "fx:id=\"listas\" was not injected: check your FXML file 'PantallaSeleccionLista.fxml'.";

    }
}
