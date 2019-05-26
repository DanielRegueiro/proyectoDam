package data;



import data.RestClient;
import data.RestClientImpl;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;


public class ProyectoDamCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        RestClientImpl restClient = new RestClientImpl();
        
        try {
            
            List<modeloVista.Unidad> unidades = restClient.getAllUnits();
           
            for (modeloVista.Unidad ud : unidades) {
                System.out.println(ud.toString());
            }
             
            
        } catch (IOException ex) {
            Logger.getLogger(ProyectoDamCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
