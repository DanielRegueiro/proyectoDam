
package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modeloVista.Unidad;

import java.io.IOException;
import java.util.List;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClientImpl {

    private RestClient restClient;

    public RestClientImpl() {
        Gson gson = new GsonBuilder()
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
    
}
