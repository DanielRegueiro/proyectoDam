
package data;

import data.NetKeys;
import modeloVista.Unidad;
import modeloVista.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;


public interface RestClient {
    
    @GET(NetKeys.Paths.GET_ALL)
    Call<List<Unidad>> getAllUnits();
    
    @GET(NetKeys.Paths.GET_UNIT)
    Call<Unidad> getUnit(@Query(NetKeys.QueriesParams.ID) String idUnidad);
    
    @GET(NetKeys.Paths.GET_USUARIO)
    Call<Usuario> getUsuario(@Query(NetKeys.QueriesParams.NOMBRE) String nombre);
    
    @POST(NetKeys.Paths.POST_USUARIO)
    Call<Usuario> postUsuario(@Body Usuario usuario);

    @PUT(NetKeys.Paths.POST_USUARIO)
    Call<String> postUsuarioString(@Body String usuario);
}
