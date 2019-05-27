package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import modeloVista.Arma;
import modeloVista.Habilidad;
import modeloVista.Reliquia;
import modeloVista.Unidad;

public class UnidadIndividual {

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
	private Text textSalvacion;

	@FXML
	private ListView<Arma> listaArmas;

	@FXML
	private ListView<Habilidad> listaHabilidades;

	@FXML
	private ListView<Reliquia> listaReliquias;

	void initData(Unidad unidad) {
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
		listaHabilidades.getItems().addAll(unidad.getHabilidades());
		listaReliquias.getItems().addAll(unidad.getReliquias());
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
}
