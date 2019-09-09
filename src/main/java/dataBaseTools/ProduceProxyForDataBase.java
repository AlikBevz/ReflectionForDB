package dataBaseTools;

import dataBaseTools.DatabaseCRUD;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProduceProxyForDataBase {

    public ProxyDatabaseCRUDInterface proxyProduce() {

        ProxyDatabaseCRUDInterface proxyDatabaseCRUD = (ProxyDatabaseCRUDInterface) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{ProxyDatabaseCRUDInterface.class},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        switch (method.getName()) {

                            case "connector":

                                return new DatabaseCRUD().connector();

                            case "print":
                                return new DatabaseCRUD().connector().print();

                            case "insert":
                                return new DatabaseCRUD().connector().insert();

                            case "delete":
                                return new DatabaseCRUD().connector().delete();



                            default:
                                throw new UnsupportedOperationException();
                        }

                    }
                }
        );
        return proxyDatabaseCRUD;

    }
}
