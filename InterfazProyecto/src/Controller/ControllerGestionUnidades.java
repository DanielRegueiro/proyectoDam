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
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

public class ControllerGestionUnidades {

	@FXML
	private Button botonContinuar;
	@FXML
	private ListView<modeloVista.Unidad> lista;

	@FXML
	private Button botonAnadir;
	@FXML
	private Button botonVolver;
	Stage stageIndividual;

    @FXML
    void abrirUnidad(MouseEvent event) {
    	if(stageIndividual==null) {
    	stageIndividual=new Stage();
    	  Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Vistas/VistaUnidadIndividual.fxml"));
			   Scene sceneIndividual = new Scene(root);
			   stageIndividual.initStyle( StageStyle.UNDECORATED );
			   stageIndividual.setScene(sceneIndividual);
		          
			   stageIndividual.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}else {
			
			stageIndividual.close();
			stageIndividual=null;
		}

    }
    

 
	@FXML
	void volver(ActionEvent event) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Vistas/PantallaSeleccionLista.fxml"));
			Parent root3 = (Parent) fxmlLoader.load();
			Stage stage = (Stage) botonVolver.getScene().getWindow();
			stage.setScene(new Scene(root3));
			stage.setResizable(false);
		} catch (IOException ex) {
			Logger.getLogger(FXMLControllerSeleccionEjercito.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@FXML
	void initialize() {
		assert botonContinuar != null : "fx:id=\"botonContinuar\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
		assert botonAnadir != null : "fx:id=\"botonAnadir\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
		assert botonVolver != null : "fx:id=\"botonVolver\" was not injected: check your FXML file 'Pantallaseleccionunidad.fxml'.";
		RestClientImpl restClient = new RestClientImpl();
		ObservableList<modeloVista.Unidad> data=FXCollections.observableArrayList();

		try {

			List<modeloVista.Unidad> unidades = restClient.getAllUnits();
			for (modeloVista.Unidad ud : unidades) {
				String imagen="/img/iconos/";
				String extension=".png";
				ud.setImagen(imagen+String.valueOf(ud.getIdUnidad())+extension);
				data.add(ud);
			
			}

		} catch (IOException ex) {
			Logger.getLogger(ProyectoDamCliente.class.getName()).log(Level.SEVERE, null, ex);
		}
	
	
		  lista.getItems().addAll(data);
		   
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
	        public CustomListCell() {
	            super();
	            name = new Text();
	            price = new Text();
	            tipo=new Text();
	            imagen=new ImageView();
	            VBox vBox = new VBox(name, price, tipo);

	            content = new HBox(imagen, vBox);
	            content.setSpacing(20);
	        }

	        @Override
	        protected void updateItem(modeloVista.Unidad item, boolean empty) {
	            super.updateItem(item, empty);
	            if (item != null && !empty) { // <== test for null item and empty parameter
	                name.setText(item.getNombre());   
	                tipo.setText(item.getTipoUnidad().getDescripcion());
	                price.setText(String.format("%d Puntos", item.getPuntos()));
	                imagen= new ImageView(item.getImagen());
	                content = new HBox(imagen,new VBox(name, price, tipo));
	                setGraphic(content);
	            } else {
	                setGraphic(null);
	            }
	        }
	    }
}