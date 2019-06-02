
package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modeloVista.Unidad;
import modeloVista.Usuario;

import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClientImpl {

    private RestClient restClient;
	private Gson gson;

    public RestClientImpl() {
       gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
//                .registerTypeAdapter(Unidad.class, new DeserializerUnidad())
//                .registerTypeAdapter(TipoUnidad.class, new DeserializerTipoUnidad())
//                .registerTypeAdapter(Arma.class, new DeserializerArma())
//                .registerTypeAdapter(TipoArma.class, new DeserializerTipoArma())
//                .registerTypeAdapter(Habilidad.class, new DeserializerHabilidad())
//                .registerTypeAdapter(Reliquia.class, new DeserializerReliquia())
                .serializeNulls()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetKeys.Paths.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        this.restClient = retrofit.create(RestClient.class);
    }
    
    
    public List<Unidad> getAllUnits() throws IOException {
        Call<List<Unidad>> call = this.restClient.getAllUnits();
        return call.execute().body();
    }

    public Unidad getUnit(String idUnidad) throws IOException {
        Call<Unidad> call = this.restClient.getUnit(idUnidad);
        return call.execute().body();
    }
    
    
    public Usuario getUsuario(String nombre) throws IOException {
        Call<Usuario> call = this.restClient.getUsuario(nombre);
        return call.execute().body();
    }
    
    public boolean postUsuario(Usuario usuario) throws IOException {
    	String jsonUsuario = gson.toJson(usuario);
    	System.out.println("Usuario json: "+jsonUsuario);
    	
    	Call<String> call = this.restClient.postUsuarioString(jsonUsuario);
    	System.out.println("Request usuario: "+call.request().toString());
    	
    	//Call<Usuario> call = this.restClient.postUsuario(usuario);
    	//System.out.println(call.request().body());
    	
    	 return call.execute().body()!=null;
    }
    
    
    
    
}
