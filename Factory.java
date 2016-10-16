/**
 * Factory se encarga de devolver la implementacion deseada para el diccionario
 *
 * @author Julio Barahona 141206
 * @author Rafael de Leon 13361
 * @author Diego Castaneda 15151
 */


public class Factory {
    public static final String MAPA = "MAPA";
    public static final String ARBOL = "ARBOL";

    /**
     *@param implementacion parametro que dicta que implementacion se utilizara
     */
    public static Object getFactory(String implementacion){
        if(implementacion.equalsIgnoreCase(MAPA)){
            return new MapDictionary(7500);
        }
        if(implementacion.equalsIgnoreCase(ARBOL)){
            return new SplayBST<String,String>();
        }
        return null;
    }
}

