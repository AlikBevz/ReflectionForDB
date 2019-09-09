package dataBaseTools;

import java.sql.*;

public class DatabaseCRUD implements ProxyDatabaseCRUDInterface {
    private static final String URL = "jdbc:mysql://localhost:3306/customerdemo?serverTimezone=UTC&useSSL=false ";
    private static final String USERNAME = "root1";
    private static final String PASSWORD = "root";
    private static final String driverClassName = "com.mysql.cj.jdbc.Driver";

    private Statement statement;


    public DatabaseCRUD(){}

    public DatabaseCRUD(Statement statement){

        this.statement = statement;
    }


    public DatabaseCRUD connector(){

       try {
        Class.forName(driverClassName);

        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        this.statement = connection.createStatement();

           System.out.println("We are connected");


       }

       catch (ClassNotFoundException e) {

           System.out.println("Class not found");
       }

       catch(Exception e) {}

       return new DatabaseCRUD(statement);
    }

    public ResultSet print() {

        try{

        ResultSet resultSet = statement.executeQuery("select * from cars");

        while (resultSet.next()) {
            System.out.print(resultSet.getString("id"));
            System.out.print("      ");
            System.out.print(resultSet.getString("corporate_name"));
            System.out.print("      ");
            System.out.print(resultSet.getString("model"));
            System.out.print("      ");
            System.out.println(resultSet.getString("year"));

            System.out.println("------------------------------------------");
        }

            return resultSet;
        }

    catch (SQLException e) {}


      return null;
    }

    public int insert(){

        try {
            this.statement.executeUpdate("insert into cars (corporate_name, model, year ) values ('Audi   ', 'A4', 2015)");
        }

        catch (SQLException e) {}

      return 0;
    }

    public int delete(){
        try{
            statement.executeUpdate("delete from cars where id>2");
        }

        catch (SQLException e) {}

        return 0;
    }


}
