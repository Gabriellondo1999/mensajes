import java.sql.Connection;
import  java.sql.*;

public class Inicio {
    public static void main (String[] args){
        conecion conexion = new conecion();
        try (Connection conx= conexion.get_connection()){

        }catch(Exception e){
            System.out.println(e);

        }
    }
}
