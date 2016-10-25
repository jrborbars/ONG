/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0070149
 */

import Entidade.Doador; 
public class DoadorDAO extends DAO {
    
    public void alterar(Doador doador) {
		try {
			Connection conexao = getConexao();
 
			PreparedStatement pstmt = conexao
					.prepareStatement("Update ssi_0070149_doador SET nome = ?,email = ? , datanascimento = ?,sexo = ?"
                                                        + ",logradouro = ? numero = ?,complemento = ?,cep = ?,telefone = ?"
							+ " WHERE cpf = ? ");
			pstmt.setString(1, doador.getNome());
                        pstmt.setString(2, doador.getEmail());
			pstmt.setDate(3, new java.sql.Date(doador.getDataNascimento().getTime()));
                       // pstmt.setDate(3, (java.sql.Date) doador.getDataNascimento());
			pstmt.setString(4, doador.getSexo());
                        pstmt.setString(5, doador.getLogradouro());
                        pstmt.setLong(6, doador.getNumero());
                        pstmt.setLong(7, doador.getComplemento());
                        pstmt.setString(8, doador.getCep());
                        pstmt.setString(9, doador.getTelefone());
                        pstmt.setLong(10, doador.getCpf());
			pstmt.execute();
			pstmt.close();
			conexao.close();
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public void excluir(Doador doador) {
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Delete from ssi_0070149_doador where cpf = ? ");
			pstm.setLong(1, doador.getCpf());
			pstm.execute();
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public boolean existe(Doador doador) {
		boolean achou = false;
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Select * from ssi_0070149_doador where cpf =	?");
			pstm.setLong(1, doador.getCpf());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				achou = true;
			}
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return achou;
	}
    
    	public void inserir(Doador doador) {
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Insert into	ssi_0070149_doador (nome, cpf, email, datanascimento,sexo,logradouro,numero,complemento,cep,telefone) values	(?,?,?,?,?,?,?,?,?,?)");
			pstm.setString(1, doador.getNome());
			pstm.setLong(2, doador.getCpf());
			pstm.setString(3, doador.getEmail());
			pstm.setDate(4, new java.sql.Date(doador.getDataNascimento()
					.getTime()));
                        //pstm.setDate(4, (java.sql.Date) doador.getDataNascimento());
                        pstm.setString(5, doador.getSexo());
                        pstm.setString(6, doador.getLogradouro());
                        pstm.setLong(7,  doador.getNumero());
                        pstm.setLong(8,  doador.getComplemento());
                        pstm.setString(9,  doador.getCep());
                        pstm.setString(10, doador.getTelefone());
			pstm.execute();
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


public List<Doador> listar() {
		List<Doador> lista = new ArrayList<>();
		try {
			Connection conexao = getConexao();
			Statement stm = conexao.createStatement();
			ResultSet rs = stm.executeQuery("Select * from ssi_0070149_doador");
			while (rs.next()) {
				Doador doador = new Doador();
				//doador.setMatricula(rs.getLong("matricula"));
				doador.setNome(rs.getString("nome"));
				doador.setCpf(rs.getLong("cpf"));
                                doador.setEmail(rs.getString("email"));
                                doador.setDataNascimento(new java.util.Date(rs.getDate("datanascimento").getTime()));
                                //doador.setDataNascimento( (java.sql.Date)rs.getDate("datanascimento"));
                                doador.setSexo(rs.getString("sexo"));
                                doador.setLogradouro(rs.getString("logradouro"));
                                doador.setNumero(rs.getLong("numero"));
                                doador.setComplemento(rs.getLong("complemento"));
                                doador.setCep(rs.getString("cep"));
                                doador.setTelefone(rs.getString("telefone"));
				
				lista.add(doador);
			}
			stm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
 
	public Doador consultar(Doador doador) {
		try {
			Connection conexao = getConexao();
			PreparedStatement pstm = conexao
					.prepareStatement("Select * from ssi_0070149_doador where cpf =	?");
			pstm.setLong(1, doador.getCpf());
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				//doador.setMatricula(rs.getLong("matricula"));
				doador.setNome(rs.getString("nome"));
				doador.setCpf(rs.getLong("cpf"));
                                doador.setEmail(rs.getString("email"));
                                doador.setDataNascimento(new java.util.Date(rs.getDate("datanascimento").getTime()));
                                //doador.setDataNascimento( (java.sql.Date)rs.getDate("datanascimento"));
                                doador.setSexo(rs.getString("sexo"));
                                doador.setLogradouro(rs.getString("logradouro"));
                                doador.setNumero(rs.getLong("numero"));
                                doador.setComplemento(rs.getLong("complemento"));
                                doador.setCep(rs.getString("cep"));
                                doador.setTelefone(rs.getString("telefone"));
			}
			pstm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doador;
	}
    
}
