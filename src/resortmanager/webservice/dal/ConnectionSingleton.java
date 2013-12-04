package resortmanager.webservice.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: ilyasavchenko
 * DateIOHandler: 11/7/13
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionSingleton {

    private static Connection connection = null;

    public static Connection getConnection() {
        //  only for development
        String connectionString = "jdbc:mysql://127.6.205.130:3306/app";                //6.205.130:3306
//        String connectionString = "jdbc:mysql://127.0.0.1:3307/app";                //6.205.130:3306
        String connectionUser = "adminqkjBH5S";
        String connectionPassword = "naaNYLlMJcpI";

        //
        if (connection == null) {
            try {
                String driver = "com.mysql.jdbc.Driver";
                Class.forName(driver).newInstance();
                connection = DriverManager.getConnection(connectionString, connectionUser, connectionPassword);
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (InstantiationException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IllegalAccessException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return connection;
    }
}