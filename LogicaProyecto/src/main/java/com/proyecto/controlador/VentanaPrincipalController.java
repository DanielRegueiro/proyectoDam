package com.proyecto.controlador;
import java.net.URL;
import java.util.ResourceBundle;

import com.proyecto.ApplicationMain;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
 
public class VentanaPrincipalController implements Initializable {
 
    private ApplicationMain ProgramaPrincipal;
 
  
 
    public void setProgramaPrincipal(ApplicationMain ProgramaPrincipal) {
        this.ProgramaPrincipal = ProgramaPrincipal;
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void nuevaVentana(ActionEvent event) {
       // ProgramaPrincipal.mostrarVentanaSecundaria();
    }

}