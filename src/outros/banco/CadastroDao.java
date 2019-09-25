package outros.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CadastroDao {

	public static void main(String[] args) {
		Connection con = ConnectionF.getConexaoMySQL();
		
		String sql = ("INSERT INTO usuarios(nome, cep, endereco, numero, bairro, cidade, uf, complemento, telefone, email, senha)VALUES(?,?,?,?,?,?,?,?,?,?,md5(?))");

		PreparedStatement stmt = null;

		try {
			stmt = con.prepareStatement(sql);

			stmt.setString(1, "marcilio");
			stmt.setInt(2, 54430170);
			stmt.setString(3, "Rua");
			stmt.setInt(4, 9);
			stmt.setString(5, "Bairro");
			stmt.setString(6, "Cidade");
			stmt.setString(7, "PE");
			stmt.setString(8, "Complemento");
			stmt.setInt(9, 111111);
			stmt.setString(10, "JAVA");
			stmt.setString(11, "aaaaaaa");
			
			stmt.executeUpdate();

		} catch (SQLException ex) {
			System.err.println("ERRO!" + ex);
	
		} finally {
//			ConnectionF.close();
		}

	}
}
