/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

import modeloVista.Arma;
import modeloVista.TipoArma;
import modeloVista.Unidad;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author daniel
 */
public interface IRepository {
    @GET("/principal")
    Call<List<Unidad>> getUnidades();
    
    @GET("/principal/armas")
    Call<List<TipoArma>> getTipoArmas();
}
