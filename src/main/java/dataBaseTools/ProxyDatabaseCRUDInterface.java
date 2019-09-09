package dataBaseTools;

import dataBaseTools.DatabaseCRUD;

import java.sql.ResultSet;

public interface ProxyDatabaseCRUDInterface {

    public DatabaseCRUD connector();
    public ResultSet print();
    public int insert();
    public int delete();


}
