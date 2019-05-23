/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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

/**
 *
 * @author daniel
 */
public class FXMLControllerLogin implements Initializable {

    @FXML
    private PasswordField textContrasena;

    @FXML
    private TextField textUsuario;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button buttonRegistro;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/Pantallalogos.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();

            stage.setScene(new Scene(root1));

            stage.show();

        } catch (IOException ex) {
            Logger.getLogger(FXMLControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Stage stagePrincipal = (Stage) buttonRegistro.getScene().getWindow();

        stagePrincipal.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}