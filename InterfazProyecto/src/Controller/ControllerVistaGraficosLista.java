package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import modeloVista.Unidad;

public class ControllerVistaGraficosLista {
	ListView<Unidad> listaUnidades;
	@FXML
	private Button botonImprimir;

	@FXML
	private PieChart graficoQuesito;

	@FXML
	private CategoryAxis fuerza;

	@FXML
	private PieChart graficoQuesitoCoste;

	@FXML
	private BarChart<String, Integer> graficoBarras;

	private ObservableList<String> estadisticasUnidades = FXCollections.observableArrayList();

	@FXML
	void crearLista(ActionEvent event) {

	}

	void initData(ListView<Unidad> listaUnidades) {
		this.listaUnidades = listaUnidades;
		rellenarGraficoBarrasFuerza();
		rellenarGraficoQuesito();
		rellenarGraficoQuesitoCostes();
	}

	private void rellenarGraficoQuesito() {
		int cg = 0;
		int elite = 0;
		int linea = 0;
		int ataquer = 0;
		int apoyo = 0;
		int voladoras = 0;

		for (Unidad p : listaUnidades.getItems()) {
			int num = p.getTipoUnidad().getIdTipoUnidad();
			switch (num) {
			case 1:
				cg = cg + 1;
				break;
			case 2:
				linea = linea + 1;
				break;
			case 3:
				elite = elite + 1;
				break;
			case 4:
				ataquer = ataquer + 1;
				break;
			case 5:
				voladoras = voladoras + 1;
				break;
			case 6:
				apoyo = apoyo + 1;
				break;
			default:
				System.out.println("no match");
			}
		}

		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(new PieChart.Data("C.G", cg),
				new PieChart.Data("Elite", elite), new PieChart.Data("Ataque Rapido", 10),
				new PieChart.Data("Linea", linea), new PieChart.Data("Apoyo pesado", apoyo),
				new PieChart.Data("Voladoras", voladoras));
		graficoQuesito.setData(pieChartData);
		graficoQuesito.setTitle("Tipo de tropa");

	}

	private void rellenarGraficoQuesitoCostes() {
		int menor100 = 0;
		int entre100150 = 0;
		int mayor150 = 0;
		int mayor200 = 0;

		for (Unidad p : listaUnidades.getItems()) {
			int num = p.getPuntos();
			if (num < 100) {
				menor100=menor100+1;
			}
			if (num >= 100 && num < 150) {
				entre100150++;
			}
			if (num >= 150 && num < 200) {
				System.out.println("dentro de mayor de 150");
				mayor150++;
			}
			if (num >= 200) {
				mayor200++;
			}
		}

		ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
				new PieChart.Data("Menor de 100", menor100), new PieChart.Data("Entre 100 y 149", entre100150),
				new PieChart.Data("Entre 150 y 199", mayor150), new PieChart.Data("Mayor de 200", mayor200));
		graficoQuesitoCoste.setData(pieChartData);
		graficoQuesitoCoste.setTitle("Costes");

	}

	private void rellenarGraficoBarrasFuerza() {
		int[] fuerzaCounter = new int[10];
		int[] resistenciaCounter = new int[10];
		int[] ataquesCounter = new int[10];
		int[] proyectilesCounter = new int[10];
		for (Unidad p : listaUnidades.getItems()) {
			int fuerza = p.getFuerza() - 1;
			int resistencia = p.getResistencia() - 1;
			int ataques = p.getAtaques() - 1;
			int proyectiles = p.getHabilidad_proyectiles() - 1;
			fuerzaCounter[fuerza]++;
			resistenciaCounter[resistencia]++;
			ataquesCounter[ataques]++;
			proyectilesCounter[proyectiles]++;
		}

		XYChart.Series<String, Integer> seriesFuerza = new XYChart.Series<>();
		seriesFuerza.setName("Fuerza");

		XYChart.Series<String, Integer> seriesResistencia = new XYChart.Series<>();
		seriesResistencia.setName("Resistencia");

		XYChart.Series<String, Integer> seriesAtaques = new XYChart.Series<>();
		seriesAtaques.setName("Ataques");

		XYChart.Series<String, Integer> seriesProyectiles = new XYChart.Series<>();
		seriesProyectiles.setName("Proyectiles");
		for (int i = 0; i < fuerzaCounter.length; i++) {
			seriesFuerza.getData().add(new XYChart.Data<>(estadisticasUnidades.get(i), fuerzaCounter[i]));
		}
		for (int i = 0; i < resistenciaCounter.length; i++) {
			seriesResistencia.getData().add(new XYChart.Data<>(estadisticasUnidades.get(i), resistenciaCounter[i]));
		}
		for (int i = 0; i < ataquesCounter.length; i++) {
			seriesAtaques.getData().add(new XYChart.Data<>(estadisticasUnidades.get(i), ataquesCounter[i]));
		}
		for (int i = 0; i < proyectilesCounter.length; i++) {
			seriesProyectiles.getData().add(new XYChart.Data<>(estadisticasUnidades.get(i), proyectilesCounter[i]));
		}
		graficoBarras.getData().add(seriesFuerza);
		graficoBarras.getData().add(seriesResistencia);
		graficoBarras.getData().add(seriesAtaques);
		graficoBarras.getData().add(seriesProyectiles);
		graficoBarras.setTitle("Estadisticas de las unidades");
	}

	@FXML
	void initialize() {
		assert botonImprimir != null : "fx:id=\"botonImprimir\" was not injected: check your FXML file 'VistaAnalisisTropas.fxml'.";

		estadisticasUnidades.addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		fuerza.setCategories(estadisticasUnidades);

	}

}
