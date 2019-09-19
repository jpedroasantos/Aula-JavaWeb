package br.com.fiap.avenger.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.avenger.conexao.Conexao;
import br.com.fiap.avenger.model.Usuario;

public class UsuarioDAO {
	private Connection con;
	private PreparedStatement stmt;

	public UsuarioDAO() throws Exception {
		con = Conexao.queroConectar();
	}

	public int getUser(String email_usuario, String senha_usuario) throws Exception {
		stmt = con.prepareStatement
				("select * from TBA_USUARIO where EMAIL_USUARIO=? and PWD_USUARIO=? ");
		stmt.setString(1, email_usuario); 
		stmt.setString(2, senha_usuario);
		return stmt.executeUpdate();
	} 
	
	public int addUser(Usuario u) throws Exception{
		stmt = con.prepareStatement("INSERT INTO "
				+ "TBA_USUARIO(ID_USUARIO, NM_USUARIO, EMAIL_USUARIO, PWD_USUARIO)"
				+ "VALUES(c_usuario_seq.nextval,?,?,?)");  
		stmt.setInt(1, u.getId_usuario());
		stmt.setString(2, u.getNome_usuario());
		stmt.setString(3, u.getEmail_usuario()); 
		stmt.setString(4, u.getSenha_usuario());
		return stmt.executeUpdate();
	}

	public int deletarUser(int id_usuario) throws Exception {
		stmt = con.prepareStatement("delete from TBA_USUARIO where ID_USUARIO=?");
		stmt.setInt(1, id_usuario);
		return stmt.executeUpdate();
	}

	public void encerrar() throws Exception {
		con.close();
	}
}
