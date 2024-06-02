package exercicio9.bd.backend.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:mysql://localhost:3306/atividade9bd";
    private static final String user = "root";
    private static final String password = "root678";

    private static Connection conn;

    public static Connection getConexao() {

        try {
            if(conn == null) {
               conn = DriverManager.getConnection(user, url, password);
               return conn;
           
            }else{
                return conn;
            } 
        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }

    }

}