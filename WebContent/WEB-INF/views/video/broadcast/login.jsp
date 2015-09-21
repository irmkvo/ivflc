<%-- 
    Document   : login to video conference
    Created on : 23.08.2015, 16:42:10
    Author     : Kim Vladimir
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/2.css" type="text/css" media="screen" title="default" />

        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
        <title><spring:message code="label.ivf" text="IVF" /></title>
    </head>
    <body>
        <div class="container">
            <c:if test="${not empty login_error}">
                <font color="red">
                    <spring:message code="label.loginerror" text="login error" /><br/><br/>
                </font>
            </c:if>
            <div class="row" id="pwd-container">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <section class="login-form">
                        <form action="/video/login/login" method="GET" >
                            <a href="http://www.ivf.kz">
                                <img src="http://irm.kz/wp-content/themes/irm-template/assets/images/logo2.png" class="img-responsive" alt="" />
                            </a>
                            <input type="HIDDEN" name="meetingId" id="meetingId" class="form-control input-lg" value="${mettingId}" />

                            <input type="text" class="form-control input-lg btn-block" name="login" id="login" />
                            <input type="password" class="form-control input-lg btn-block" name="pass" id="pass" />

                            <div class="pwstrength_viewport_progress"></div>
                            
                            <c:if test="${status == 1}">
                                <button type="submit" class="btn btn-lg btn-primary btn-block">
                                    <spring:message code="label.logining" />
                                </button>
                            </c:if>
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
