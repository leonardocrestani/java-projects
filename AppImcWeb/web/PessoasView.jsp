<%-- 
    Document   : PessoasView
    Created on : 1 de set. de 2021, 11:07:58
    Author     : leona
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="util.Imc"%>
<%@page import="dominio.Pessoa"%>
<%
  // pegar a lista da secao
  List<Pessoa> pessoas = (List<Pessoa>) request.getSession().getAttribute("pessoas");
  // se a primeira vez
  if(pessoas == null) {
    pessoas = new ArrayList<>();
  }
  
  // ver se esta gravando
  if(request.getParameter("gravar") != null) {
    String nome = request.getParameter("campoNome");
    int idade = Integer.parseInt(request.getParameter("campoIdade"));
    Double peso = Double.parseDouble(request.getParameter("campoPeso"));
    Double altura = Double.parseDouble(request.getParameter("campoAltura"));
  
    Pessoa p = new Pessoa(nome, idade, peso, altura);
    Imc imc = new Imc();
    imc.calculaImc(p.getPeso(), p.getAltura());
    imc.classificaImc();
    p.setImc(imc);
    request.setAttribute("pes", p);
    // guardar a pessoa na lista da secao
    pessoas.add(p);
    request.getSession().setAttribute("pessoas", pessoas);
  }
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IMC</title>
    </head>
    <body>
        <h1>Calculo IMC</h1>
        <form method="post">
            <fieldset>
                <label> Nome </label>
                <input type="text" name="campoNome">
                <br/>
                <label> Idade </label>
                <input type="text" name="campoIdade">
                <br/>
                <label> Peso </label>
                <input type="text" name="campoPeso">
                <br/>
                <label> Altura(cm) </label>
                <input type="text" name="campoAltura">
                <br/>
                <button type="submit" name="gravar"> Gravar </button>
            </fieldset>
        </form>
        <filedset>
            Dados do IMC:
            <br/>
        </filedset>
        <fieldset>
            <table border="1">
                <c:forEach items="${sessionScope.pessoas}" var="p">
                <tr>
                    <td>
                        ${p.nome}
                    </td>
                    <td>
                        ${p.idade}
                    </td>
                    <td>
                        ${p.peso}
                    </td>
                    <td>
                        ${p.altura}
                    </td>
                    <td>
                        ${p.imc.getImc()}
                    </td>
                    <td>
                        ${p.imc.getClassificacaoImc()}
                    </td>
                </tr>
                </c:forEach>
            </table>
        </fieldset>
    </body>
</html>
