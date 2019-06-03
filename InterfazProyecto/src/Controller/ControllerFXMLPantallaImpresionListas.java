package controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.LogicaPrincipal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import modeloVista.Lista;
import modeloVista.Unidad;
import modeloVista.UnidadesSel;



public class ControllerFXMLPantallaImpresionListas {

    @FXML
    private Button botonPdf;
    @FXML
    private ListView<modeloVista.Unidad> listas;
	private List<modeloVista.Unidad> listaUnidades;
    
    void initData(Lista lista) {
    listaUnidades=	LogicaPrincipal.getInstance().listaToUnidades(lista);
    	
    }


	@FXML
	void imprimirAPdf(ActionEvent event) {
		
		
	}


    @FXML
    void volver(ActionEvent event) {
    	try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaSeleccionLista.fxml"));
			Parent root3 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonPdf.getScene().getWindow();
			stage.setScene(new Scene(root3));
			stage.setResizable(false);
		} catch (IOException ex) {
			Logger.getLogger(ControllerFXMLSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}
    }
    @FXML
    void initialize() {
        assert botonPdf != null : "fx:id=\"botonPdf\" was not injected: check your FXML file 'VistaListaDesplegada.fxml'.";
        assert listas != null : "fx:id=\"listas\" was not injected: check your FXML file 'VistaListaDesplegada.fxml'.";

    }
}