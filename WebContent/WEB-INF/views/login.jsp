<%-- 
    Document   : login
    Created on : 15.05.2012, 16:42:10
    Author     : Andrey
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
                        <form method="post" action="<c:url value="/j_spring_security_check" />" role="login">
                            <a href="http://www.ivf.kz">
                                <img src="http://irm.kz/wp-content/themes/irm-template/assets/images/logo2.png" class="img-responsive" alt="" />
                            </a>
                            <input type="email" name="j_username" id="j_username" placeholder="Email" required class="form-control input-lg" value="" />

                            <input type="password" class="form-control input-lg" name="j_password" id="j_password" placeholder="Пароль" required="" />


                            <div class="pwstrength_viewport_progress"></div>


                            <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Войти</button>
                            <div>
                                <a href="${pageContext.request.contextPath}/registration">Регистрация</a> или <a href="#">Восстановление пароля</a>
                            </div>

                        </form>

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
