/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.deserializadores;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import modelo.Arma;
import modeloVista.TipoArma;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author daniel
 */
public class DeserializadorArmas implements JsonDeserializer<Arma> {

    @Override
    public Arma deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        Logger logger = Logger.getAnonymousLogger();
        Arma arma = new Arma();
        JsonObject jsonArma = je.getAsJsonObject();
        try {
            /*       
            private TipoArma tipoArma;
       ;*/

            arma.setDescripcion(jsonArma.getAsJsonPrimitive("descripcion").getAsString());

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
        try {

            arma.setIdArma(jsonArma.getAsJsonPrimitive("idArma").getAsLong());

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }

        try {

            arma.setPuntos(jsonArma.getAsJsonPrimitive("puntos").getAsInt());

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
        
             try {
                 
//                TipoArma tipoArma = jsonArma.getAsJsonObject("tipoArma");
//        
//            arma.setTipoArma( jsonArma.getAsJsonObject("tipoArma"));

        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
        return arma;
    }

}