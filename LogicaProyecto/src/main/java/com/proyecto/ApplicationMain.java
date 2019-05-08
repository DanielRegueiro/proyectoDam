package com.proyecto;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.proyecto.controlador.VentanaDosController;
import com.proyecto.controlador.VentanaPrincipalController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

@SpringBootApplication
public class ApplicationMain extends Application {
	private Stage stagePrincipal;
	private AnchorPane rootPane;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
		launch(args);

	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApplicationMain.class);
	}
	@Override
	public void start(Stage stagePrincipal) throws Exception {
		this.stagePrincipal = stagePrincipal;
		mostrarVentanaPrincipal();

	}
	public void mostrarVentanaPrincipal() {
		try {
			FXMLLoader loader = new FXMLLoader(Application.class.getResource("/view/Login.fxml"));
			rootPane = (AnchorPane) loader.load();
			Scene scene = new Scene(rootPane);
			stagePrincipal.setTitle("Ventana Principal");
			stagePrincipal.setScene(scene);
			VentanaPrincipalController controller = loader.getController();
			controller.setProgramaPrincipal(this);
			stagePrincipal.show();
		} catch (IOException e) {
			// tratar la excepción.
		}
	}

//	public void mostrarVentanaSecundaria() {
//		try {
//			FXMLLoader loader = new FXMLLoader(ApplicationMain.class.getResource("Lista.fxml"));
//			AnchorPane ventanaDos = (AnchorPane) loader.load();
//			Stage ventana = new Stage();
//			ventana.setTitle("Ventana Dos");
//			ventana.initOwner(stagePrincipal);
//			Scene scene = new Scene(ventanaDos);
//			ventana.setScene(scene);
//			VentanaDosController controller = loader.getController();
//			controller.setStagePrincipal(ventana);
//			ventana.show();
//
//		} catch (Exception e) {
//			// tratar la excepción
//		}
//	}

}
