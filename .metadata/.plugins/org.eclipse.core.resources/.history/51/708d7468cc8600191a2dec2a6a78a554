package controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import data.ProyectoDamCliente;
import data.RestClientImpl;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import modeloVista.Arma;
import modeloVista.Unidad;

public class ControllerGestionUnidades {



	@FXML
	private ListView<modeloVista.Unidad> listaUnidadesSeleccionadas;

	@FXML
	private ListView<modeloVista.Unidad> lista;

	@FXML
	private Button botonContinuar;
	@FXML
	private Button botonVolver;
	 @FXML
	    private ImageView fotoDestacamento;

	    @FXML
	    private ComboBox<?> comboDestacamento;

	    @FXML
	    private TextField textNombreLista;

	    @FXML
	    private Text textPuntosCosteLista;

	    @FXML
	    private Text textCgMin;

	    @FXML
	    private Text textEliteMin;

	    @FXML
	    private Text textTropaMin;

	    @FXML
	    private Text textCgMax;

	    @FXML
	    private Text textEliteMax;

	    @FXML
	    private Text TextTropaMax;

	    @FXML
	    private Text textCgDentro;

	    @FXML
	    private Text textEliteDentro;

	    @FXML
	    private Text textTropaDentro;

	    @FXML
	    private Text textAtaqueRapidoMin;

	    @FXML
	    private Text textApoyoMin;

	    @FXML
	    private Text textVoladorasMin;

	    @FXML
	    private Text textAtaqueRapidoMax;

	    @FXML
	    private Text textApoyoMax;

	    @FXML
	    private Text textVoladorasMax;

	    @FXML
	    private Text textAtaqueRapidoDentro;

	    @FXML
	    private Text textApoyoDentro;

	    @FXML
	    private Text textVoladorasDentro;
	    private int costeLista;
	private Stage stageIndividual;
	private ControllerFXMLUnidadIndividual controller;

	@FXML
	void abrirUnidad(MouseEvent event) {

		stageIndividual = new Stage();
		FXMLLoader root;
		try {
			root = new FXMLLoader(getClass().getResource("/Vistas/VistaUnidadIndividual.fxml"));

			Scene sceneIndividual = new Scene(root.load());

			stageIndividual.setScene(sceneIndividual);
			controller = root.<ControllerFXMLUnidadIndividual>getController();
			controller.initData(lista.getItems().get(lista.getSelectionModel().getSelectedIndex()), this);
			stageIndividual.show();

		} catch (IOException e) {

			Logger.getLogger(ControllerFXMLSeleccionEjercito.class.getName()).log(Level.SEVERE, null, e);
		}

	}

	public void anadirUnidadLista(Unidad unidad) {

		listaUnidadesSeleccionadas.getItems().add(unidad);

		listaUnidadesSeleccionadas.refresh();
		costeLista=costeLista+unidad.getPuntos();
		for (Arma i : unidad.getArmas()) {
			costeLista+=i.getPuntos();
		}
		textPuntosCosteLista.setText(String.valueOf(costeLista));
		textPuntosCosteLista.setVisible(false);
		textPuntosCosteLista.setVisible(true);
		//TODO actualizar la pantalla en este punto
		
		
		
	}

	@FXML
	void volver(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/VistaListasAVisualizar.fxml"));
			Parent root3 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonVolver.getScene().getWindow();
			stage.setScene(new Scene(root3));
			stage.setResizable(false);
		} catch (IOException ex) {
			Logger.getLogger(ControllerFXMLSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	void initData(List unidadesUsuario) {
		
		if (unidadesUsuario.size() > 0) {
			System.out.println("dentro del init data");
			lista.getItems().clear();
			ObservableList<modeloVista.Unidad> data = FXCollections.observableArrayList();
			List<modeloVista.Unidad> unidades = unidadesUsuario;
			for (modeloVista.Unidad ud : unidades) {
				String imagen = "/img/iconos/";
				String extension = ".png";
				ud.setImagen(imagen + String.valueOf(ud.getTipoUnidad().getIdTipoUnidad()) + extension);
				data.add(ud);

			}
			lista.getItems().addAll(data);
		}
	}

	@FXML
	void initialize() {
	    assert botonContinuar != null : "fx:id=\"botonContinuar\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert botonVolver != null : "fx:id=\"botonVolver\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert lista != null : "fx:id=\"lista\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert listaUnidadesSeleccionadas != null : "fx:id=\"listaUnidadesSeleccionadas\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert fotoDestacamento != null : "fx:id=\"fotoDestacamento\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert comboDestacamento != null : "fx:id=\"comboDestacamento\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textNombreLista != null : "fx:id=\"textNombreLista\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textPuntosCosteLista != null : "fx:id=\"TextPuntosCosteLista\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textCgMin != null : "fx:id=\"textCgMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textEliteMin != null : "fx:id=\"textEliteMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textTropaMin != null : "fx:id=\"textTropaMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textCgMax != null : "fx:id=\"textCgMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textEliteMax != null : "fx:id=\"textEliteMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert TextTropaMax != null : "fx:id=\"TextTropaMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textCgDentro != null : "fx:id=\"textCgDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textEliteDentro != null : "fx:id=\"textEliteDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textTropaDentro != null : "fx:id=\"TextTropaDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textAtaqueRapidoMin != null : "fx:id=\"textAtaqueRapidoMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textApoyoMin != null : "fx:id=\"TextApoyoMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textVoladorasMin != null : "fx:id=\"TextVoladorasMin\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textAtaqueRapidoMax != null : "fx:id=\"textAtaqueRapidoMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textApoyoMax != null : "fx:id=\"textApoyoMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textVoladorasMax != null : "fx:id=\"textVoladorasMax\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textAtaqueRapidoDentro != null : "fx:id=\"TextAtaqueRapidoDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textApoyoDentro != null : "fx:id=\"textApoyoDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        assert textVoladorasDentro != null : "fx:id=\"textVoladorasDentro\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
        textPuntosCosteLista= new Text("0");
		RestClientImpl restClient = new RestClientImpl();
		ObservableList<modeloVista.Unidad> data = FXCollections.observableArrayList();
		try {

			List<modeloVista.Unidad> unidades = restClient.getAllUnits();
			for (modeloVista.Unidad ud : unidades) {
				String imagen = "/img/iconos/";
				String extension = ".png";
				ud.setImagen(imagen + String.valueOf(ud.getTipoUnidad().getIdTipoUnidad()) + extension);
				data.add(ud);

			}

		} catch (IOException ex) {
			Logger.getLogger(ProyectoDamCliente.class.getName()).log(Level.SEVERE, null, ex);
		}

		lista.getItems().addAll(data);

		// asignacion de customCell con metodo lamda
		listaUnidadesSeleccionadas
				.setCellFactory(unidadesListView -> new ControllerCustomCellUnidad(listaUnidadesSeleccionadas));
		// asignacion de customCell a la manera clasica
		lista.setCellFactory(new Callback<ListView<modeloVista.Unidad>, ListCell<modeloVista.Unidad>>() {
			@Override
			public ListCell<modeloVista.Unidad> call(ListView<modeloVista.Unidad> listView) {
				return new CustomListCell();
			}
		});

	}

	private class CustomListCell extends ListCell<modeloVista.Unidad> {
		private HBox content;
		private Text name;
		private Text price;
		private Text tipo;
		private ImageView imagen;
		private Text separador;

		public CustomListCell() {
			super();
			name = new Text();
			price = new Text();
			tipo = new Text();
			separador = new Text("      ");

			imagen = new ImageView();
			VBox vBox = new VBox(name, price, tipo);
			VBox vbox2 = new VBox(separador);
			content = new HBox(imagen, vbox2, vBox);
			content.setSpacing(100);
		}

		@Override
		protected void updateItem(modeloVista.Unidad item, boolean empty) {
			super.updateItem(item, empty);
			if (item != null && !empty) { // <== test for null item and empty parameter
				name.setText(item.getNombre());
				tipo.setText(item.getTipoUnidad().getDescripcion());
				price.setText(String.format("%d Puntos", item.getPuntos()));
				imagen = new ImageView(item.getImagen());
				content = new HBox(imagen, separador, new VBox(name, price, tipo));
				setGraphic(content);
			} else {
				setGraphic(null);
			}
		}
	}

}