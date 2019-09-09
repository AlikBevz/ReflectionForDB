package deprecated;

import dataBaseTools.ProduceProxyForDataBase;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class ConnectorForHolderDeprecateAnnotation {

    public void connect(Object o, Class c){

        Field[] fields=c.getDeclaredFields();

        for (Field field : fields) {

            Annotation[] annotations =field.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {

                if (annotation.annotationType().equals(java.lang.Deprecated.class))  {new ProduceProxyForDataBase().proxyProduce().connector();}
            }
        }

    }
}
