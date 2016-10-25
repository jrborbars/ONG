/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloServlet;

import Entidade.Doador;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDao.DoadorDAO;

/**
 *
 * @author 0070149
 */
@WebServlet("/DoadorServlet")
public class DoadorServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
 
        @Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
 
        @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		String destino = "sucesso.jsp";
		String mensagem = "";
		List<Doador> lista = new ArrayList<>();
 
 
		Doador doador = new Doador();
		DoadorDAO dao = new DoadorDAO();
 
		try {
 
			//Se a a��o for DIFERENTE de Listar s�o lidos os dados da tela
			if (!acao.equalsIgnoreCase("Listar")) {
				doador.setNome(request.getParameter("nome"));
                                doador.setCpf(Long.parseLong(request.getParameter("cpf")));
				doador.setEmail(request.getParameter("email"));
                                doador.setSexo(request.getParameter("sexo"));
                                doador.setLogradouro(request.getParameter("logradouro"));
                                doador.setNumero(Long.parseLong(request.getParameter("numero")));
                                doador.setComplemento(Long.parseLong(request.getParameter("complemento")));
                                doador.setCep(request.getParameter("cep"));
                                doador.setTelefone(request.getParameter("telefone"));
				
 
				//Faz a leitura da data de cadastro. Caso ocorra um erro de formata��o
				// o sistema utilizar� a data atual
				try {
					DateFormat df = new SimpleDateFormat("dd/MM/yyyy");					
					doador.setDataNascimento(df.parse(request.getParameter("dataNascimento")));
				} catch (Exception e) {
					doador.setDataNascimento(new Date());	
				}
 
			}
 
			if (acao.equalsIgnoreCase("Incluir")) {
				// Verifica se a matr�cula informada j� existe no Banco de Dados
				// Se existir enviar uma mensagem sen�o faz a inclus�o
				if (dao.existe(doador)) {
					mensagem = "Doador informadado ja existe!";
				} else {
					dao.inserir(doador);
                                        if (mensagem.length() == 0) {
			mensagem = "Doador Cadastrado com sucesso!";
		} else {
			destino = "erro.jsp";
		}
				}
			} else if (acao.equalsIgnoreCase("Alterar")) {
				dao.alterar(doador);
			} else if (acao.equalsIgnoreCase("Excluir")) {
				dao.excluir(doador);
			} else if (acao.equalsIgnoreCase("Consultar")) {
				request.setAttribute("doador", doador);
				doador = dao.consultar(doador);
				destino = "Doador.jsp";
			}
		} catch (Exception e) {
			mensagem += e.getMessage();
			destino = "erro.jsp";
			e.printStackTrace();
		}
 
		// Se a mensagem estiver vazia significa que houve sucesso!
		// Sen�o ser� exibida a tela de erro do sistema.
		
 
		// Lista todos os registros existente no Banco de Dados
		lista = dao.listar();
		request.setAttribute("listaDoador", lista);
		request.setAttribute("mensagem", mensagem);
 
 
		//O sistema � direcionado para a p�gina 
		//sucesso.jsp Se tudo ocorreu bem
		//erro.jsp se houver algum problema.
		RequestDispatcher rd = request.getRequestDispatcher(destino);
		rd.forward(request, response);
	}
    
}
