package controller;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import modeloVista.Arma;
import modeloVista.Unidad;

public class ControllerCustomCellUnidad extends ListCell<modeloVista.Unidad> {

private	ListView<modeloVista.Unidad> listaUnidadesSeleccionadas;
private int costeLista;
private StringProperty prueba;



	public ControllerCustomCellUnidad(ListView<Unidad> listaUnidadesSeleccionadas, int costeLista,StringProperty prueba) {
	super();
	this.prueba=prueba;
	this.costeLista=costeLista;
	this.listaUnidadesSeleccionadas = listaUnidadesSeleccionadas;
}





	@Override
	protected void updateItem(modeloVista.Unidad item, boolean empty) {
		super.updateItem(item, empty);
	
		if (item != null && !empty) {
			
			
			
			ImageView imagen = new ImageView(item.getImagen());
			Text nombreUnidad = new Text(item.getNombre());
			nombreUnidad.setFont(Font.font(20));
			Text tipoUnidad = new Text(item.getTipoUnidad().getDescripcion());
			tipoUnidad.setFont(Font.font(16));
			Text puntos = new Text(String.valueOf(item.getPuntos())+" Puntos");
			puntos.setFont(Font.font(25));		
			Button botonEliminar = new Button("Eliminar");
			
			VBox v=new VBox(nombreUnidad,tipoUnidad);
			v.setSpacing(10);
			HBox p=new HBox(v);
			p.setSpacing(10);
			
			VBox r=new VBox(puntos,botonEliminar);
			botonEliminar.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
				listaUnidadesSeleccionadas.getItems().remove(item);
				costeLista=Integer.parseInt(prueba.getValue())-item.getPuntos();

				for (Arma i : item.getArmas()) {

						costeLista -= i.getPuntos();

				}
				prueba.setValue(String.valueOf(costeLista));
				}
			});
			HBox h=new HBox(imagen,p,r);

			h.setSpacing(20);
		
			
			setText(null);
			setGraphic(h);
			
		} else {
			setText(null);
			setGraphic(null);
		}
	}

}
