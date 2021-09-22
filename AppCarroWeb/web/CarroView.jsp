
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dominio.Carro"%>
<%
    List<Carro> carros = (List<Carro>) request.getSession().getAttribute("carros");
    
    if (carros == null) {
        carros = new ArrayList<>();
    }
    // ver se está querendo gravar
    if (request.getParameter("cadastrar") != null) {
        String placa = request.getParameter("campoPlaca");
        Carro c = new Carro(placa);
        request.setAttribute("car", c);
        carros.add(c);
        request.getSession().setAttribute("carros", carros);
        request.getSession().setAttribute("selecionado", c);
        request.getSession().setAttribute("mensagemErro", "");
    }
    
    if (request.getParameter("selecionar") != null) {
       int index = Integer.parseInt(request.getParameter("selecionar"))-1;
       request.getSession().setAttribute("selecionado", carros.get(index));
    }
    
    if(request.getParameter("ligarDesligar") != null) {
        Carro c = (Carro) request.getSession().getAttribute("selecionado");
        request.getSession().setAttribute("mensagemErro", "");
        try {
            c.power();
        }
        catch(Exception ex) {
            String mensagem = ex.getMessage();
            request.getSession().setAttribute("mensagemErro", mensagem);
        }
    }
    
    if(request.getParameter("acelerar") != null) {
        Carro c = (Carro) request.getSession().getAttribute("selecionado");
        request.getSession().setAttribute("mensagemErro", "");
        try {
            c.acelerar();
        }
        catch(Exception ex) {
            String mensagem = ex.getMessage();
            request.getSession().setAttribute("mensagemErro", mensagem);
        }
    }
    
    if(request.getParameter("desacelerar") != null) {
        Carro c = (Carro) request.getSession().getAttribute("selecionado");
        request.getSession().setAttribute("mensagemErro", "");
        System.out.println(c);
        try {
            c.desacelerar();
        }
        catch(Exception ex) {
            String mensagem = ex.getMessage();
            request.getSession().setAttribute("mensagemErro", mensagem);
        }
    }

%>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle de Carros</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body style="margin: 30px;">
        
        <form method="post">
            <fieldset style="width: 100%">
                <label class="text-center" style="font-weight: bold; font-size: 20px">Placa</label>
                <input class="form-control" type="text" name="campoPlaca" value="${selecionado.placa}"/>
                <br/>
                <button class="btn btn-primary btn-block" type="submit" name="cadastrar" style="margin-bottom: 20px; width: 100%">Cadastrar Carro</button>
                <br/>
                <h3 id="placa" class="text-center font-weight-bold">${selecionado.placa}</h3>
                <p id="ligado" class="text-center">Estado: ${selecionado.retornaEstado()}</p>
                <p id="rpm" class="text-center">RPM: ${selecionado.rpm}</p>
                <p id="marcha" class="text-center">Marcha: ${selecionado.marcha}</p>
                <br/>
                <p class="text-center">${mensagemErro}</p>
                <div class="d-flex justify-content-center">
                    <button class="btn btn-primary" type="submit" name="acelerar">Acelerar</button>
                    <button class="btn btn-primary" type="submit" name="ligarDesligar" style="margin-left: 20px; margin-right: 20px">Ligar/desligar</button>
                    <button class="btn btn-primary" type="submit" name="desacelerar">Desacelerar</button>
                </div>
                <br/>
            </fieldset>
   
        <fieldset>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Placa</th>
                        <th scope="col">Estado</th>
                        <th scope="col">RPM</th>
                        <th scope="col">Marcha</th>
                        <th scope="col">Selecionar</th>
                    </tr>
                </thead>

                <c:forEach items="${sessionScope.carros}" var="c" varStatus="index">
                    <tr>
                        <td>${c.placa}</td> 
                        <td>${c.retornaEstado()}</td>
                        <td>${c.rpm}</td>
                        <td>${c.marcha}</td>
                        <td>
                            <button class="btn btn-secundary" style="padding: unset" type="submit" name="selecionar" value="${index.count}">Selecionar</button> 
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
        
         </form>
    </body>
</html>
