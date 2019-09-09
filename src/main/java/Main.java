import dataBaseTools.ProduceProxyForDataBase;
import deprecated.ConnectorForHolderDeprecateAnnotation;
import deprecated.HolderDeprecateAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class Main {


    public static void main(String[] args) {

        ProduceProxyForDataBase produceProxyForDataBase = new ProduceProxyForDataBase();

         produceProxyForDataBase.proxyProduce().print();

         produceProxyForDataBase.proxyProduce().insert();

         produceProxyForDataBase.proxyProduce().delete();


        HolderDeprecateAnnotation holderDeprecateAnnotation =  new HolderDeprecateAnnotation();

        ConnectorForHolderDeprecateAnnotation connectorForHolderDeprecateAnnotation = new ConnectorForHolderDeprecateAnnotation();

        connectorForHolderDeprecateAnnotation.connect(holderDeprecateAnnotation, holderDeprecateAnnotation.getClass());



    }
   }






