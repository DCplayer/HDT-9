import java.util.AbstractMap;

/**
 * AbstractFactory: Clase abstracta de la factory a utilizar
 *
 * @author Julio Barahona 141206
 * @author Rafael de Leon 13361
 * @author Diego Castaneda 15151
 */
public abstract class AbstractFactory {

    public abstract <K,V> AbstractMap<K,V> getImp(String Implementation);
}
