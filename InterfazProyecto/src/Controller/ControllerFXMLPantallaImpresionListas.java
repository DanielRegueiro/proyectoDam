package controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import data.LogicaPrincipal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modeloVista.Lista;

public class ControllerFXMLPantallaImpresionListas {
	private ControllerPantallaSeleccionListas controller;
	@FXML
	private Button botonPdf;
	@FXML
	private ListView<modeloVista.Unidad> listas;
	private List<modeloVista.Unidad> listaUnidades;
	List<modeloVista.Lista> listaUsuario;
	
	void initData(List<Lista>listasUsuarioEntrante,List<modeloVista.Unidad> lista) {
		
		listaUsuario=listasUsuarioEntrante;
		listaUnidades = lista;
		ObservableList<modeloVista.Unidad> data = FXCollections.observableArrayList();
		data.addAll(listaUnidades);
		listas.getItems().addAll(data);
		listas.setCellFactory(unidadesListView -> new CustomListCell());
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
			controller = fxmlLoader.<ControllerPantallaSeleccionListas>getController();
			controller.initData(listaUsuario,null);
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

	private class CustomListCell extends ListCell<modeloVista.Unidad> {
		private HBox content;
		private Text name;
		private Text price;
		private Text tipo;
		private Text textMovimiento;
		private Text textHabilidadAtaque;
		private Text textHabilidadProyectiles;
		private Text textFuerza;
		private Text textResistencia;
		private Text textHeridas;
		private Text textAtaques;
		private Text textLiderazgo;
		private Text textSalvacion;
		private Text textMovimientoInicial;
		private Text textHabilidadAtaqueInicial;
		private Text textHabilidadProyectilesInicial;
		private Text textFuerzaInicial;
		private Text textResistenciaInicial;
		private Text textHeridasInicial;
		private Text textAtaquesInicial;
		private Text textLiderazgoInicial;
		private Text textSalvacionInicial;
		private ImageView imagen;

		public CustomListCell() {
			super();

			name = new Text();
			name.setFont(Font.font(20));
			price = new Text();
			price.setFont(Font.font(20));
			tipo = new Text();
			tipo.setFont(Font.font(18));
			textMovimiento = new Text();
			textMovimiento.setFont(Font.font(16));
			textHabilidadAtaque = new Text();
			textHabilidadAtaque.setFont(Font.font(16));
			textHabilidadProyectiles = new Text();
			textHabilidadProyectiles.setFont(Font.font(16));
			textFuerza = new Text();
			textFuerza.setFont(Font.font(16));
			textResistencia = new Text();
			textResistencia.setFont(Font.font(16));
			textHeridas = new Text();
			textHeridas.setFont(Font.font(16));
			textAtaques = new Text();
			textAtaques.setFont(Font.font(16));
			textLiderazgo = new Text();
			textLiderazgo.setFont(Font.font(16));
			textSalvacion = new Text();
			textSalvacion.setFont(Font.font(16));
			textMovimientoInicial = new Text("M");
			textMovimientoInicial.setFont(Font.font(16));
			textHabilidadAtaqueInicial = new Text("HA");
			textHabilidadAtaqueInicial.setFont(Font.font(16));
			textHabilidadProyectilesInicial = new Text("HP");
			textHabilidadProyectilesInicial.setFont(Font.font(16));
			textFuerzaInicial = new Text("F");
			textFuerzaInicial.setFont(Font.font(16));
			textResistenciaInicial = new Text("R");
			textResistenciaInicial.setFont(Font.font(16));
			textHeridasInicial = new Text("H");
			textHeridasInicial.setFont(Font.font(16));
			textAtaquesInicial = new Text("A");
			textAtaquesInicial.setFont(Font.font(16));
			textLiderazgoInicial = new Text("L");
			textLiderazgoInicial.setFont(Font.font(16));
			textSalvacionInicial = new Text("S");
			textSalvacionInicial.setFont(Font.font(16));

			HBox hBoxIniciales = new HBox(new VBox(textMovimientoInicial, textMovimiento),
					new VBox(textHabilidadAtaqueInicial, textHabilidadAtaque),
					new VBox(textHabilidadProyectilesInicial, textHabilidadProyectiles),
					new VBox(textFuerzaInicial, textFuerza), new VBox(textResistenciaInicial, textResistencia),
					new VBox(textHeridasInicial, textHeridas), new VBox(textAtaquesInicial, textAtaques),
					new VBox(textLiderazgoInicial, textLiderazgo), new VBox(textSalvacionInicial, textSalvacion));
			hBoxIniciales.setSpacing(10);
			VBox vBox = new VBox(name, tipo);

			content = new HBox(vBox, hBoxIniciales, price);
			content.setSpacing(30);
		}

		@Override
		protected void updateItem(modeloVista.Unidad item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) { // <== test for null item and empty parameter
				String rutaImagen = "/img/iconos/";
				String extension = ".png";
				item.setImagen(rutaImagen + String.valueOf(item.getTipoUnidad().getIdTipoUnidad()) + extension);
				imagen = new ImageView(item.getImagen());
				name.setText(item.getNombre());
				tipo.setText(item.getTipoUnidad().getDescripcion());
				price.setText(String.format("%d Puntos", item.getPuntos()));
				textMovimiento.setText(String.valueOf(item.getMovimiento()));
				textHabilidadAtaque.setText(String.valueOf(item.getHabilidad_ataque()));
				textHabilidadProyectiles.setText(String.valueOf(item.getHabilidad_proyectiles()));
				textFuerza.setText(String.valueOf(item.getFuerza()));
				textResistencia.setText(String.valueOf(item.getResistencia()));
				textHeridas.setText(String.valueOf(item.getHeridas()));
				textAtaques.setText(String.valueOf(item.getAtaques()));
				textLiderazgo.setText(String.valueOf(item.getLiderazgo()));
				textSalvacion.setText(String.valueOf(item.getSalvacion()));
				HBox celda = new HBox(imagen, content);
				celda.setSpacing(5);
				setGraphic(celda);
			} else {
				setGraphic(null);
			}
		}
	}
}
