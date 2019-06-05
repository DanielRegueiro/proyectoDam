package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.proyecto.destacamento.DestacamentoInterface;
import com.proyecto.destacamento.impl.BatallonDestacamento;

import data.RestClientImpl;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modeloVista.Unidad;

public class ControllerListaTropasPoseidasPorUsuario {
	@FXML
	private CheckBox check;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private ImageView hielo;

	@FXML
	private Button botonTodas;

	@FXML
	private Button botonSeleccionar;

	@FXML
	private ListView<Unidad> listaTropasPoseidas;
	private List<Unidad> tropasSeleccionadas;
	private DestacamentoInterface destacamento;

	@FXML
	void Volver(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaSeleccionTropasAUsar.fxml"));
			Parent root3 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonTodas.getScene().getWindow();
			stage.setScene(new Scene(root3));
			stage.setResizable(false);
			stage.centerOnScreen();
		} catch (IOException ex) {
			Logger.getLogger(ControllerListaTropasPoseidasPorUsuario.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@FXML
	void abrirGeneradorListas(ActionEvent event) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaSeleccionunidad.fxml"));
			Parent root2 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonTodas.getScene().getWindow();

			stage.setScene(new Scene(root2));
			stage.setResizable(false);
			stage.centerOnScreen();
			ControllerGestionUnidades controller = fxmlLoader.<ControllerGestionUnidades>getController();

			controller.initData(tropasSeleccionadas, destacamento);
		} catch (IOException ex) {
			Logger.getLogger(ControllerListaTropasPoseidasPorUsuario.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	void initData(DestacamentoInterface destacamento) {
		this.destacamento = destacamento;

	}

	@FXML
	void initialize() {
		assert hielo != null : "fx:id=\"hielo\" was not injected: check your FXML file 'VistaSeleccionTropasUsuario.fxml'.";
		assert botonTodas != null : "fx:id=\"botonTodas\" was not injected: check your FXML file 'VistaSeleccionTropasUsuario.fxml'.";
		assert botonSeleccionar != null : "fx:id=\"botonSeleccionar\" was not injected: check your FXML file 'VistaSeleccionTropasUsuario.fxml'.";
		assert listaTropasPoseidas != null : "fx:id=\"listaTropasPoseidas\" was not injected: check your FXML file 'VistaSeleccionTropasUsuario.fxml'.";
		RestClientImpl restClient = new RestClientImpl();
		tropasSeleccionadas = new ArrayList<Unidad>();
		ObservableList<modeloVista.Unidad> data = FXCollections.observableArrayList();
		try {

			List<modeloVista.Unidad> unidades = restClient.getAllUnits();
			data.addAll(unidades);

		} catch (IOException ex) {
			Logger.getLogger(ControllerListaTropasPoseidasPorUsuario.class.getName()).log(Level.SEVERE, null, ex);
		}

		listaTropasPoseidas.getItems().addAll(data);
		listaTropasPoseidas.setCellFactory(unidadesListView -> new CustomListCellTropasPoseidas());

	}

	private class CustomListCellTropasPoseidas extends ListCell<modeloVista.Unidad> {
		private HBox content;
		private Text name;

		public CustomListCellTropasPoseidas() {
			super();
			name = new Text();

		}

		@Override
		protected void updateItem(modeloVista.Unidad item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) { // <== test for null item and empty parameter
				name.setText(item.getNombre());
				check = new CheckBox("Seleccionar");
				HBox caja1 = new HBox(name);
				HBox caja2 = new HBox(check);
				caja2.setAlignment(Pos.BOTTOM_RIGHT);
				caja2.setAlignment(Pos.BASELINE_RIGHT);
				content = new HBox(caja1, caja2);
				content.setSpacing(30);

				this.selectedProperty().addListener(new ChangeListener<Boolean>() {
					@Override
					public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue,
							Boolean newValue) {
						check.setSelected(!newValue);
					}
				});

				EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						if (event.getSource() instanceof CheckBox) {
							CheckBox chk = (CheckBox) event.getSource();
							if ("Seleccionar".equals(chk.getText())) {
								if (tropasSeleccionadas.contains(item)) {
									tropasSeleccionadas.remove(item);
								} else {
									tropasSeleccionadas.add(item);
								}

							}
						}
					}
				};

				check.setOnAction(eh);

				setGraphic(content);
			} else {
				setGraphic(null);
			}
		}
	}
}
