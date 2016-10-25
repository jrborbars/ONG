<%-- 
    Document   : Doacao
    Created on : 18/10/2016, 09:05:07
    Author     : 0589144
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doação</title>
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
    </head>
    <body>
         <nav id="navigation" class="clearfix">
            <ul>
                <li><a href="Doador.jsp">Cadastro de Doadores</a></li>
                <li><a href="Doacao.jsp"> Doe aqui</a></li>
            </ul>
        </nav>
        <br><br>
        <h1>Selecione o doador da lista</h1>
            <div class="switch-field">
                <input onclick="tipoPessoaSel();" type="radio" id="opt-pf" name="switch_2" value="fisica" checked/>
                <label for="opt-pf"> Pessoa Física</label>
                <input onclick="tipoPessoaSel();" type="radio" id="opt-pj" name="switch_2" value="juridica" />
                <label for="opt-pj"> Pessoa Jurídica</label>
            </div>
             
            
            <div id="pf">
                <form method="post" action="DoadorServlet">
                    <fieldset><legend>Dados Pessoas</legend>
                        <p><label>Nome Completo:</label>
                        <input name="nome" required value="${doador.nome}" /></p>
                    <p><label>CPF</label>
                        <input name="cpf" required value="${doador.cpf}" /></p> 
                    <p><label>E-mail:</label>
                         <input type="email" name="email" required value="${doador.email}" size="20" maxlength="30" placeholder="exemplo@exemplo.com.br" /> </p>
                    <p><label>Data de Nascimento: </label>
                        <input type="date" name="dataNascimento" value="${doador.dataNascimento}"
                                                                placeholder="10/10/2014" class="form-control"/></p>
                    <p><label>Sexo:</label> 
                        <input name="sexo" required value="${doador.sexo}" maxlength="1" placeholder="M ou F" /></p>      
                    <p><label>Logradouro:</label>
                        <input name="logradouro" autofocus="autofocus"   value="${doador.logradouro}" /></p>
                    <p><label>Número:</label>
                        <input name="numero" autofocus="autofocus"   value="${doador.numero}" /></p>
                    <p><label>Complemento:</label>
                        <input name="complemento" autofocus="autofocus"   value="${doador.complemento}" /></p>
                    <p><label>CEP:</label>
                        <input name="cep" autofocus="autofocus" value="${doador.cep}"/></p>
                    <p><label>Telefone:</label>
                        <input name="telefone" autofocus="autofocus" value="${doador.telefone}"/></p>
                    <label>Ação</label> <select name="acao" >
                                <option selected value="Incluir" >Incluir</option>
                                <option value="Alterar">Alterar</option>
                                <option value="Excluir">Excluir</option>
                                <option value="Consultar">Consultar</option>
                            </select><br /> <input type="submit" value="Enviar" > <input
                                type="reset" value="Limpar" >
                    </fieldset>
             </form>  
            </div>
                   
           
            <div id="pj" style="display: none;">
                 <form method="post" action="DoadorServlet">
                <fieldset><legend>Dados da Empresa</legend>
                    <p>CNPJ
                        <input id="cnpj" type="text" name="Cnpj" /></p>
                    <p>Razão social da empresa
                        <input id="nomeempresa" type="text" name="Nome" /></p>
                    <p>Inscrição Estadual
                        <input id="inscricao" type="text" name="Inscricao" /></p>
                    <p>Responsável
                        <input id=responsavel type="text" name="Responsavel" /></p>
                    <p>E-mail:
                         <input type="email" name="tEmail" id="jEmail" size="20" maxlength="30" placeholder="exemplo@exemplo.com.br" /> </p>
                    <p>Logradouro:
                        <input id="enderecopjlg" type="text" name="Endereco" /></p>
                    <p>Número:
                        <input id="enderecopjnum" type="text" name="Endereco" /></p>
                    <p>Sala:
                        <input id="enderecopjcl" type="text" name="Endereco" /></p>
                    <p>CEP: 
                        <input id="ceppj" type="text" name="Ceppj" /></p>
                    <p>Telefone: 
                        <input id="telefonepj" type="text" name="Telefonepj" /></p>
                <label>Ação</label> <select name="acao" required class="form-control">
                                <option selected value="Incluir" >Incluir</option>
                                <option value="Alterar">Alterar</option>
                                <option value="Excluir">Excluir</option>
                                <option value="Consultar">Consultar</option>
                            </select><br /> <input type="submit" value="Enviar">
                    </fieldset>
            </form>
            </div>
        <script src="tipopessoa.js" type="text/javascript"></script>  
    </body>
</html>
