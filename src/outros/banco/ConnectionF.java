package outros.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionF {

public static String status = "N�o conectou...";
    
//M�todo Construtor da Classe//

public ConnectionF() {

}



//M�todo de Conex�o//

public static java.sql.Connection getConexaoMySQL() {

Connection connection = null;          //atributo do tipo Connection



try {

//Carregando o JDBC Driver padr�o

String driverName = "com.mysql.jdbc.Driver";                        

Class.forName(driverName);



//Configurando a nossa conex�o com um banco de dados//

String serverName = "localhost";    //caminho do servidor do BD

String mydatabase = "teste";        //nome do seu banco de dados

String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

String username = "root";        //nome de um usu�rio de seu BD      

String password = "1234";      //sua senha de acesso

connection = DriverManager.getConnection(url, username, password);



//Testa sua conex�o//  

if (connection != null) {

    status = ("STATUS--->Conectado com sucesso!");

} else {

    status = ("STATUS--->N�o foi possivel realizar conex�o");

}



return connection;



} catch (ClassNotFoundException e) {  //Driver n�o encontrado



    System.out.println("O driver expecificado nao foi encontrado.");

    return null;

} catch (SQLException e) {

//N�o conseguindo se conectar ao banco

    System.out.println("Nao foi possivel conectar ao Banco de Dados.");

    return null;

}



}



//M�todo que retorna o status da sua conex�o//

public static String statusConection() {

return status;

}



//M�todo que fecha sua conex�o//

public static boolean FecharConexao() {

try {

	ConnectionF.getConexaoMySQL().close();

    return true;

} catch (SQLException e) {

    return false;

}



}



//M�todo que reinicia sua conex�o//

public static java.sql.Connection ReiniciarConexao() {

FecharConexao();



return ConnectionF.getConexaoMySQL();

}

}
//	    private static final String DRIVER = "com.mysql.jdbc.Driver";
//	    private static final String URL = "jdbc:mysql://localhost:3306/teste";
//	    private static final String USER = "root";
//	    private static final String PASS = "1234";
//
//	    public static Connection getConnection() {
//
//	        try {
//	            Class.forName(DRIVER);
//	            return DriverManager.getConnection(URL, USER, PASS);
//	        } catch (ClassNotFoundException | SQLException ex) {
//	            throw new RuntimeException("Erro na conex�o: ", ex);
//	        }
//	    }
//
//	    public static void closeConnection(Connection con) {
//	        try {
//	            if (con != null) {
//	                con.close();
//	            }
//	        } catch (SQLException ex) {
//	            System.err.println("Erro ao fechar" + ex);
//	        }
//	    }
//
//	    public static void closeConnection(Connection con, PreparedStatement stmt) {
//
//	        closeConnection(con);
//	        try {
//	            if (stmt != null) {
//	                stmt.close();
//	            }
//	        } catch (SQLException ex) {
//	           System.err.println("Erro ao fechar" + ex);
//	        }
//	    }
//
//	    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
//
//	        closeConnection(con, stmt);
//	        try {
//	            if (rs != null) {
//	                rs.close();
//	            }
//	        } catch (SQLException ex) {
//	            System.err.println("Erro ao fechar" + ex);
//	        }
//
//	    }
