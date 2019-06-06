
package data;

//import com.google.gson.JsonArray;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//
//import modeloVista.Arma;
//import modeloVista.Habilidad;
//import modeloVista.Reliquia;
//import modeloVista.TipoArma;
//import modeloVista.TipoUnidad;
//import modeloVista.Unidad;
//
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.logging.Logger;



public class Deserializer {
	
//
//    protected static final Logger LOGGER = Logger.getAnonymousLogger();
//
//    public final static class DeserializerHabilidad implements JsonDeserializer<Habilidad> {
//
//        @Override
//        public Habilidad deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject habilidadJson = je.getAsJsonObject();
//            Habilidad habilidad = new Habilidad();
//            habilidad.setIdHabilidad(habilidadJson.getAsJsonPrimitive("id_habilidad").getAsLong());
//            habilidad.setDescripcion(habilidadJson.getAsJsonPrimitive("descripcion").getAsString());
//            return habilidad;
//        }
//
//    }
//
//    public final static class DeserializerReliquia implements JsonDeserializer<Reliquia> {
////
//        @Override
//        public Reliquia deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject reliquiaJson = je.getAsJsonObject();
//            Reliquia reliquia = new Reliquia();
//            reliquia.setIdReliquia(reliquiaJson.getAsJsonPrimitive("id_reliquia").getAsLong());
//            reliquia.setDescripcion(reliquiaJson.getAsJsonPrimitive("descripcion").getAsString());
//            return reliquia;
//        }
//
//    }
//
//    public final static class DeserializerTipoArma implements JsonDeserializer<TipoArma> {
//
//        @Override
//        public TipoArma deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject tipoArmaJson = je.getAsJsonObject();
//            TipoArma tipoArma = new TipoArma();
//            tipoArma.setId_tipo(tipoArmaJson.getAsJsonPrimitive("id_tipo_arma").getAsLong());
//            tipoArma.setDescripcion(tipoArmaJson.getAsJsonPrimitive("descripcion").getAsString());
//            return tipoArma;
//        }
//
//    }
//
//    public final static class DeserializerTipoUnidad implements JsonDeserializer<TipoUnidad> {
//
//        @Override
//        public TipoUnidad deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject tipoUnidadJson = je.getAsJsonObject();
//            TipoUnidad tipoUnidad = new TipoUnidad();
//            tipoUnidad.setIdTipoUnidad(tipoUnidadJson.getAsJsonPrimitive("idtipo").getAsLong());
//            tipoUnidad.setDescripcion(tipoUnidadJson.getAsJsonPrimitive("descripcion").getAsString());
//            return tipoUnidad;
//        }
//
//    }
//
//    public final static class DeserializerUnidad implements JsonDeserializer<Unidad> {
//
//        @Override
//        public Unidad deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject unidadJson = je.getAsJsonObject();
//            Unidad unidad = new Unidad();
//
//            // ATRIBUTOS UNIDAD
//            unidad.setIdUnidad(unidadJson.getAsJsonPrimitive("id_unidad").getAsLong());
//            unidad.setNombre(unidadJson.getAsJsonPrimitive("nombre").getAsString());
//            unidad.setMovimiento(unidadJson.getAsJsonPrimitive("movimiento").getAsByte());
//            unidad.setHabilidadAtaque(unidadJson.getAsJsonPrimitive("habilidad_ataque").getAsByte());
//            unidad.setHabilidadProyectiles(unidadJson.getAsJsonPrimitive("habilidad_proyectiles").getAsByte());
//            unidad.setFuerza(unidadJson.getAsJsonPrimitive("fuerza").getAsByte());
//            unidad.setResistencia(unidadJson.getAsJsonPrimitive("resistencia").getAsByte());
//            unidad.setHeridas(unidadJson.getAsJsonPrimitive("heridas").getAsByte());
//            unidad.setAtaques(unidadJson.getAsJsonPrimitive("ataques").getAsByte());
//            unidad.setLiderazgo(unidadJson.getAsJsonPrimitive("liderazgo").getAsByte());
//            unidad.setSalvacion(unidadJson.getAsJsonPrimitive("salvacion").getAsByte());
//            unidad.setPuntos(unidadJson.getAsJsonPrimitive("puntos").getAsByte());
//            unidad.setPoder(unidadJson.getAsJsonPrimitive("poder").getAsByte());
//
//            // TIPO UNIDAD
//            try {
//                JsonObject tipoUnidadJson = unidadJson.getAsJsonObject("tipoUnidad");
//                TipoUnidad tipoUnidad = new TipoUnidad();
//                tipoUnidad.setIdTipoUnidad(tipoUnidadJson.getAsJsonPrimitive("idtipo").getAsLong());
//                tipoUnidad.setDescripcion(tipoUnidadJson.getAsJsonPrimitive("descripcion").getAsString());
//                unidad.setTipoUnidad(tipoUnidad);
//            } catch (Exception ex) {
//                LOGGER.info(ex.getMessage());
//            }
//            
//            // LISTA ARMAS
//            ArrayList<Arma> listaArmas = new ArrayList<Arma>();
//            JsonArray armasJson = unidadJson.getAsJsonArray("listaArmas");
//            Iterator<JsonElement> itArmas = armasJson.iterator();
//            while (itArmas.hasNext()) {
//                Arma arma = new Arma();
//                
//                try{
//                JsonObject armaJson = itArmas.next().getAsJsonObject();
//                
//                // ATRIBUTOS ARMA
//                arma.setId_arma(armaJson.getAsJsonPrimitive("id_arma").getAsLong());
//                arma.setDescripcion(armaJson.getAsJsonPrimitive("descripcion").getAsString());
//                arma.setPuntos(armaJson.getAsJsonPrimitive("puntos").getAsInt());
//
//                // TIPO ARMA
//                JsonObject tipoArmaJson = armaJson.getAsJsonObject("tipoArma");
//                TipoArma tipoArma = new TipoArma();
//                tipoArma.setId_tipo(tipoArmaJson.getAsJsonPrimitive("id_tipo_arma").getAsLong());
//                tipoArma.setDescripcion(tipoArmaJson.getAsJsonPrimitive("descripcion").getAsString());
//                arma.setTipoArma(tipoArma);
//                }catch(Exception ex){
//                    LOGGER.info(ex.getMessage());
//                }
//                
//                listaArmas.add(arma);
//            }
//            unidad.setListaArmas(listaArmas);
//
//            
//            // LISTA HABILIDADES
//            ArrayList<Habilidad> habilidades = new ArrayList<>();
//            JsonArray habilidadesJson = unidadJson.getAsJsonArray("habilidades");
//            Iterator<JsonElement> itHabilidades = habilidadesJson.iterator();
//            while (itHabilidades.hasNext()) {
//                JsonObject habilidadJson = itHabilidades.next().getAsJsonObject();
//                
//                // HABILIDAD
//                Habilidad habilidad = new Habilidad();
//                habilidad.setId_habilidad(habilidadJson.getAsJsonPrimitive("id_habilidad").getAsLong());
//                habilidad.setDescripcion(habilidadJson.getAsJsonPrimitive("descripcion").getAsString());
//                habilidades.add(habilidad);
//            }
//            unidad.setHabilidades(habilidades);
//           
//            // LISTA RELIQUIAS
//            ArrayList<Reliquia> reliquias = new ArrayList<>();
//            JsonArray reliquiasJson = unidadJson.getAsJsonArray("reliquias");
//            Iterator<JsonElement> itReliquias = reliquiasJson.iterator();
//            while (itReliquias.hasNext()) {
//                JsonObject reliquiaJson = itReliquias.next().getAsJsonObject();
//                
//                // RELIQUIA
//                Reliquia reliquia = new Reliquia();
//                reliquia.setId_reliquia(reliquiaJson.getAsJsonPrimitive("id_reliquia").getAsLong());
//                reliquia.setDescripcion(reliquiaJson.getAsJsonPrimitive("descripcion").getAsString());
//                reliquias.add(reliquia);
//            }
//            unidad.setReliquias(reliquias);
//             
//            return unidad;
//        }
//
//    }
//    
//    public final static class DeserializerArma implements JsonDeserializer<Arma> {
//
//        @Override
//        public Arma deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
//            JsonObject armaJson = je.getAsJsonObject();
//
//            Arma arma = new Arma();
//            arma.setId_arma(armaJson.getAsJsonPrimitive("id_arma").getAsLong());
//            arma.setDescripcion(armaJson.getAsJsonPrimitive("descripcion").getAsString());
//            arma.setPuntos(armaJson.getAsJsonPrimitive("puntos").getAsInt());
//
//            JsonObject tipoArmaJson = armaJson.getAsJsonObject("tipoArma");
//            TipoArma tipoArma = new TipoArma();
//            tipoArma.setId_tipo(tipoArmaJson.getAsJsonPrimitive("id_tipo_arma").getAsLong());
//            tipoArma.setDescripcion(tipoArmaJson.getAsJsonPrimitive("descripcion").getAsString());
//
//            arma.setTipoArma(tipoArma);
//            return arma;
//        }
//
//    }

}
