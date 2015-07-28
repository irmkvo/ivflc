<%-- 
    Document   : login
    Created on : 15.05.2012, 16:42:10
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/2.css" type="text/css" media="screen" title="default" />

        <title>Институт репродуктивной медицины!</title>
    </head>
    <body>
        <div class="container">
            <c:if test="${not empty login_error}">
                <font color="red">
                Логин или пароль не верны.<br/><br/>
                </font>
            </c:if>
            <div class="row" id="pwd-container">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <section class="login-form">
                        ${newUser}
                        <form:form method="POST" action="${pageContext.request.contextPath}/registration/save" commandName="newUser">
                            <a href="http://www.ivf.kz">
                                <img src="http://irm.kz/wp-content/themes/irm-template/assets/images/logo2.png" class="img-responsive" alt="" />
                            </a>

                            <form:hidden path="id" class="inp-form" />
                            <spring:message code="label.firstname" text="First name" />:
                            <form:input path="userFname"></form:input>
                                Фамилия:
                            <form:input path="userLname"></form:input>
                                Отчество:
                            <form:input path="userMname"></form:input>
                                E-mail:
                            <form:input path="userMail"></form:input>
                                Телефон:
                            <form:input path="userPhone"></form:input>
                                Логин:
                            <form:input path="userLogin"></form:input>
                                Пароль:
                            <form:input path="userPassword"></form:input>
                                Клиент:
                            <form:input path="userRole"/>
                            Код договора:
                            <form:input path="userCode"></form:input>
                            <input type="submit"  value="Сохранить" class="btn" />


                        </form:form>

                        <div class="form-links"></div>
                        
                    </section>  
                </div>
                <div class="col-md-4"></div>
            </div>
            <p>
                <br>
                <br>
            </p>  
        </div>        
    </body>
</html>
