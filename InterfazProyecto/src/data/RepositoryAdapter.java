/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modeloVista.TipoArma;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author daniel
 */
public class RepositoryAdapter {

    public static final String URL = "http://localhost:8080";
    private IRepository repository;

    public RepositoryAdapter() {

        Gson gson = new GsonBuilder()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        repository = retrofit.create(IRepository.class);
    }

    public List<TipoArma> recuperarTipoArmas() throws IOException {
        Call<List<TipoArma>> call = repository.getTipoArmas();

        return call.execute().body();
    }

}
