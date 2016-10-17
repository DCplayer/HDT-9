import java.util.HashMap;

/**
 * MapDictionary es la implementacion para el diccionario con mapeo
 *
 * @author Julio Barahona 141206
 * @author Rafael de Leon 13361
 * @author Diego Castaneda 15151
 */
public class MapDictionary<K,V> extends HashMap<K,V>{

    public MapDictionary(int initialCapacity) {
        super(initialCapacity);
    }
}
