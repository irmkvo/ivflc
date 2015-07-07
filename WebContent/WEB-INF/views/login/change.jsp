<%-- 
    Document   : register
    Created on : 14.05.2012, 22:19:50
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ include file="../../header_clients.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css" />
        <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-1.7.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-responsive.css" type="text/css" media="screen" title="default" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" type="text/css" media="screen" title="default" />
        <script  src="${pageContext.request.contextPath}/resources/js/jquery/jquery.validate.min.js" type="text/javascript" charset="utf-8"></script>
        <script  src="${pageContext.request.contextPath}/resources/js/changePassword.js" type="text/javascript" charset="utf-8"></script>
        <title>PonyExpress</title>
    </head>
    <body>
        <div class="container" style="width: 440px;"> 
            <div class="page-header">
			<center>    <h1>Изменение пароля:</h1></center>
			   
		    </div>
        <form method="post" action="/clients/updatePassword" id="form" class="form-horizontal">
          <fieldset>  
             
                
                                              
                    <div class="control-group">
                      <label class="control-label" for="userPassword">Текущий Пароль:</label> 
                        <div class="controls"><input type="password"  id="userPassword" name="userPassword" placeholder="пароль"/></div>
                    </div> 
                          
                    <div class="control-group">
                      <label class="control-label" for="userNewPassword">Новый Пароль:</label> 
                        <div class="controls"><input type="password"  id="userNewPassword" name="userNewPassword"  placeholder="новый пароль"/></div>
                    </div>                           
                    <div class="control-group">
                      <label class="control-label" for="userRePassword">Повторите новый Пароль:</label> 
                        <div class="controls"><input type="password" id="userRePassword" name="userRePassword"  placeholder="повторите новый пароль"/></div>
                    </div> 
                   
                        
                            <div class="form-actions">
                   <input type="submit"  value="Изменить" class="btn-info"/>
                            </div>
        
          </fieldset>        
    </form>
</div>
</body>
</html>
