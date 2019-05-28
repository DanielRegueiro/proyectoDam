package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Callback;
import modeloVista.Arma;
import modeloVista.Habilidad;
import modeloVista.Reliquia;
import modeloVista.Unidad;

public class UnidadIndividual {

	@FXML
	private Button botonEliminar;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private GridPane panelDatos;

	@FXML
	private Text textMovimiento;

	@FXML
	private Text textHabilidadAtaque;

	@FXML
	private Text textHabilidadProyectiles;

	@FXML
	private Text textFuerza;

	@FXML
	private Text textResistencia;

	@FXML
	private Text textHeridas;

	@FXML
	private Text textAtaques;

	@FXML
	private Text textLiderazgo;

	@FXML
	private ImageView fotoUnidad;

	@FXML
	private Text textSalvacion;

	@FXML
	private Button anadir;

	@FXML
	private ListView<Arma> listaArmas;

	@FXML
	private ListView<Habilidad> listaHabilidades;

	@FXML
	private ListView<Reliquia> listaReliquias;

	private Unidad unidadLocal;
	private ControllerGestionUnidades controllerLocal;
	void initData(Unidad unidad, ControllerGestionUnidades controller) {
		unidadLocal = unidad;
		controllerLocal=controller;
		textMovimiento.setText(String.valueOf(unidad.getMovimiento()));
		textHabilidadAtaque.setText(String.valueOf(unidad.getHabilidad_ataque()));
		textHabilidadProyectiles.setText(String.valueOf(unidad.getHabilidad_proyectiles()));
		textFuerza.setText(String.valueOf(unidad.getFuerza()));
		textResistencia.setText(String.valueOf(unidad.getResistencia()));
		textHeridas.setText(String.valueOf(unidad.getHeridas()));
		textAtaques.setText(String.valueOf(unidad.getAtaques()));
		textLiderazgo.setText(String.valueOf(unidad.getLiderazgo()));
		textSalvacion.setText(String.valueOf(unidad.getSalvacion()));
		listaArmas.getItems().addAll(unidad.getArmas());

		listaArmas.setCellFactory(new Callback<ListView<modeloVista.Arma>, ListCell<modeloVista.Arma>>() {
			@Override
			public ListCell<modeloVista.Arma> call(ListView<modeloVista.Arma> listView) {
				return new CustomListCellArmas();
			}
		});
		listaHabilidades.getItems().addAll(unidad.getHabilidades());
		listaHabilidades
				.setCellFactory(new Callback<ListView<modeloVista.Habilidad>, ListCell<modeloVista.Habilidad>>() {
					@Override
					public ListCell<modeloVista.Habilidad> call(ListView<modeloVista.Habilidad> listView) {
						return new CustomListCellHabilidad();
					}
				});
		listaReliquias.getItems().addAll(unidad.getReliquias());
		listaReliquias.setCellFactory(new Callback<ListView<modeloVista.Reliquia>, ListCell<modeloVista.Reliquia>>() {
			@Override
			public ListCell<modeloVista.Reliquia> call(ListView<modeloVista.Reliquia> listView) {
				return new CustomListCellReliquia();
			}
		});
		fotoUnidad.setImage(new ImageView("img/unidad/"+unidad.getIdUnidad()+".png").getImage());

	}
	@FXML
	void anadirUnidad(ActionEvent event) {
		System.out.println(unidadLocal.getNombre());
		System.out.println(controllerLocal);
		
		controllerLocal.anadirUnidadLista(unidadLocal);
		
	}
	@FXML
	void initialize() {
		assert panelDatos != null : "fx:id=\"panelDatos\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textMovimiento != null : "fx:id=\"textMovimiento\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textHabilidadAtaque != null : "fx:id=\"textHabilidadAtaque\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textHabilidadProyectiles != null : "fx:id=\"textHabilidadProyectiles\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textFuerza != null : "fx:id=\"textFuerza\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textResistencia != null : "fx:id=\"textResistencia\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textHeridas != null : "fx:id=\"textHeridas\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textAtaques != null : "fx:id=\"textAtaques\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textLiderazgo != null : "fx:id=\"textLiderazgo\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert textSalvacion != null : "fx:id=\"textSalvacion\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert listaArmas != null : "fx:id=\"listaArmas\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert listaHabilidades != null : "fx:id=\"listaHabilidades\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";
		assert listaReliquias != null : "fx:id=\"listaReliquias\" was not injected: check your FXML file 'VistaUnidadIndividual.fxml'.";

	}

	private class CustomListCellArmas extends ListCell<modeloVista.Arma> {
		private HBox content;
		private Text name;
		private Text price;
		private Text tipo;

		public CustomListCellArmas() {
			super();
			name = new Text();
			price = new Text();
			tipo = new Text();
			content = new HBox(name, price, tipo);
			content.setSpacing(20);
		}

	

		@Override
		protected void updateItem(modeloVista.Arma item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) { // <== test for null item and empty parameter
				name.setText(item.getDescripcion());
				tipo.setText(item.getTipoArma().getDescripcion());
				price.setText(String.format("%d Puntos", item.getPuntos()));
				botonEliminar = new Button("Eliminar");
				Text espacio = new Text();
				espacio.setText("      ");
				Text espacio1 = new Text();
				espacio1.setText("      ");
				content = new HBox(new VBox(name, price, tipo), new VBox(espacio), new VBox(espacio1, botonEliminar));
				botonEliminar.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						listaArmas.getItems().remove(item);
						unidadLocal.getArmas().remove(item);
					}
				});

				setGraphic(content);
			} else {
				setGraphic(null);
			}
		}

	}

	private class CustomListCellHabilidad extends ListCell<modeloVista.Habilidad> {
		private HBox content;
		private Text name;

		public CustomListCellHabilidad() {
			super();
			name = new Text();
			content = new HBox(name);
			content.setSpacing(20);
		}

		@Override
		protected void updateItem(modeloVista.Habilidad item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) {
				name.setText(item.getDescripcion());
				content = new HBox(new VBox(name));
				setGraphic(content);
			} else {
				setGraphic(null);
			}
		}
	}

	private class CustomListCellReliquia extends ListCell<modeloVista.Reliquia> {
		private HBox content;
		private Text name;

		public CustomListCellReliquia() {
			super();
			name = new Text();
			content = new HBox(name);
			content.setSpacing(20);
		}

		@Override
		protected void updateItem(modeloVista.Reliquia item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) {
				name.setText(item.getDescripcion());
				content = new HBox(new VBox(name));
				setGraphic(content);
			} else {
				setGraphic(null);
			}
		}
	}
}
