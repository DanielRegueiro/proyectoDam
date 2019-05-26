
package data;

import data.NetKeys;
import modeloVista.Unidad;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface RestClient {
    
    @GET(NetKeys.Paths.GET_ALL)
    Call<List<Unidad>> getAllUnits();
    
    @GET(NetKeys.Paths.GET_UNIT)
    Call<Unidad> getUnit(@Query(NetKeys.QueriesParams.ID) String idUnidad);
    
}
