package data;

import java.io.IOException;

import controller.ControllerDialogoAlerta;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modeloVista.Usuario;

public class LogicaPrincipal {
	private static LogicaPrincipal gestor;
	private Usuario usuario;
	private RestClientImpl restClient;

	private LogicaPrincipal() {
		restClient = new RestClientImpl();
		this.usuario = new Usuario();

	}

	private synchronized static void createInstance() {
		if (gestor == null) {
			gestor = new LogicaPrincipal(); // creauna instance para llamar solo a un objeto de esta clase 
											
		}
	}

	public static LogicaPrincipal getInstance() {
		if (gestor == null) {
			createInstance();
		}
		return gestor;
	}

	public void recuperarUsuario(String nombre) {

		try {
			this.usuario = restClient.getUsuario(nombre);
		} catch (IOException e) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaDialogoAlerta.fxml"));

			try {
				Parent root1 = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				ControllerDialogoAlerta controller = fxmlLoader.<ControllerDialogoAlerta>getController();

				controller.cambiarTexto("El usuario no exite");

				stage.setScene(new Scene(root1));
				stage.setResizable(false);
				stage.initStyle(StageStyle.UNDECORATED);
				stage.centerOnScreen();
				stage.show();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}

	}

	public Usuario getUser() {

		return usuario;
	}
	
	
	

}
