package modeloDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {

    public Connection getConexao() throws SQLException {
        Connection conexao = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.inf.poa.ifrs.edu.br:1521:XE", "carlos", "tadeu");
           
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Não foi possível conectar ao banco " + e.getMessage());
        }
        return conexao;
    }
}

