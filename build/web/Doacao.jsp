<%-- 
    Document   : Doacao
    Created on : 18/10/2016, 10:29:28
    Author     : 0589144
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doação</title>
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/estilo.css">
    </head>
    <body>
       <nav id="navigation" >
            <ul>
                <li><a href="Doador.jsp">Cadastro de Doadores</a></li>
                <li><a href="Doacao.jsp"> Doe aqui</a></li>
                
            </ul>
        </nav>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="col-lg-4"></div>
                    <div class="col-lg-2">
                        <h1>Doação</h1>
                    </div>
                    <div class="col-lg-4"></div>
                </div>
        <div class="row-fluid">
                <div class="col-lg-4"></div>
                <div class="col-lg-2">
                    <form name="form1" method="post" action="#">
                        <div class="switch-field">
                            <input onclick="tipoPessoaSel();" type="radio" id="opt-pf" name="switch_2" value="fisica" checked/>
                            <label for="opt-pf"> Pessoa Física</label>
                            <input onclick="tipoPessoaSel();" type="radio" id="opt-pj" name="switch_2" value="juridica" />
                            <label for="opt-pj"> Pessoa Jurídica</label>
                        </div>

                        <div>
                                <div id="pf">
                                    <fieldset>
                                        <legend>Dados Pessoas</legend>
                                        <p>CPF<input id="cpf" type="text" name="Cpf" /></p>   
                                    </fieldset>
                                </div> 
                                <div id="pj" style="display: none;">      
                                    <fieldset>
                                        <legend>Dados da Empresa</legend>
                                        <p>CNPJ<input id="cnpj" type="text" name="Cnpj" /></p>
                                    </fieldset>
                                </div>

                                <input onclick="tipoDoacaoSel();" type="radio" id="opt-da" name="switch_3"  value="alimento" />
                                <label for="opt-da"> Alimento</label>
                                <input onclick="tipoDoacaoSel();" type="radio" id="opt-dr" name="switch_3"  value="roupas" />
                                <label for="opt-dr"> Roupas</label>
                                <input onclick="tipoDoacaoSel();" type="radio" id="opt-dd" name="switch_3"  value="dinheiro" />
                                <label for="opt-dd"> Dinheiro</label>
                        </div>


                            <div id="da" style="display: none;">
                                <h3>Alimento</h3>
                                <p>Quantidade
                                        <input id="alimento" type="text" name="Alimento" /></p>
                            </div>
                            <div id="dr" style="display: none">
                                <h3>Roupas</h3>
                                <p>Quantidade de Peças
                                        <input id="roupa" type="text" name="Roupa" /></p>

                            </div>
                            <div id="dd" style="display: none">
                                <h3>Dinheiro</h3>
                                <p>Valor em reais
                                        <input id="dinheiro" type="text" name="Dinheiro" /></p> 
                            </div>

                    </form>
                </div>
                <div class="col-lg-4"></div>
        </div>
      </div>
        <script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js" ></script>
        <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
                    <script type="text/javascript">
                        function tipoPessoaSel() {
                            var pf = document.getElementById("opt-pf").checked;
                            if (pf) {
                                document.getElementById("pf").style.display = "block";
                                document.getElementById("pj").style.display = "none";
                            } else {
                                document.getElementById("pf").style.display = "none";
                                document.getElementById("pj").style.display = "block";
                            }
                        }
                        function tipoDoacaoSel() {
                            var da = document.getElementById("opt-da").checked;
                            var dr = document.getElementById("opt-dr").checked;
                            var dd = document.getElementById("opt-dd").checked;

                            if (da) {
                                document.getElementById("da").style.display = "block";
                                document.getElementById("dr").style.display = "none";
                                document.getElementById("dd").style.display = "none";
                            }
                            if (dr) {
                                document.getElementById("da").style.display = "none";
                                document.getElementById("dr").style.display = "block";
                                document.getElementById("dd").style.display = "none";
                            } 
                           if (dd) {
                                document.getElementById("da").style.display = "none";
                                document.getElementById("dr").style.display = "none";
                                document.getElementById("dd").style.display = "block";

                            }
                        }
                    </script>

    </body>
</html>


          