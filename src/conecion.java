import com.mysql.jdbc.Connection;
import  java.sql.*;

//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conecion {
    public Connection get_connection(){
        Connection connection =null;
        try{
           //connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app/","root","");

           connection= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");

            if (connection!=null) {
                System.out.println("Conexion Exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);

        }
        return connection;


    }
}
