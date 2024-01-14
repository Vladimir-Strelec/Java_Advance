package bakery;

import java.lang.invoke.TypeDescriptor;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;

public interface InterfaceBakery {
    void createProduct(LinkedHashMap<Class, LinkedList<String>> map);

    void info(Class info);


}
