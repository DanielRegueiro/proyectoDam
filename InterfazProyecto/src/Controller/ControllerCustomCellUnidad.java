package controller;

import javafx.scene.control.ListCell;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class ControllerCustomCellUnidad extends ListCell<modeloVista.Unidad> {

	





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
		
			
			VBox v=new VBox(nombreUnidad,tipoUnidad);
			v.setSpacing(10);
			HBox p=new HBox(v,puntos);
			p.getChildren().
			p.setSpacing(120);			
			HBox h=new HBox(imagen,p);
			h.setSpacing(20);
			
			
			setText(null);
			setGraphic(h);
			
		} else {
			setText(null);
			setGraphic(null);
		}
	}

}
