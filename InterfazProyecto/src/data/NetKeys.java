package data;

public class NetKeys {

    /**
     * Constructor privado para evitar la instanciacion
     */
    private NetKeys() {
    }

    /**
     * Endpoints 
     */
    public static final class Paths {

        private Paths() {}

        public static final String BASE_URL = "http://localhost:8080/principal/";
        public static final String GET_ALL = "getall";
        public static final String GET_LISTAS = "getlistas";
        public static final String GET_UNIT = "buscar";
        public static final String GET_USUARIO = "buscarusuario";
        public static final String POST_USUARIO = "grabar/usuario";
    }

    public static final class QueriesParams {
        
        private QueriesParams() {}

        public static final String ID = "idCliente";
        public static final String NOMBRE = "nombre";
        
    }

    public static final class PathFields {
        
        private PathFields() {}
        
    }

}
