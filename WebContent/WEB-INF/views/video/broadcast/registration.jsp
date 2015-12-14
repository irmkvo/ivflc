<%-- 
    Document   : registration
    Created on : Dec 7, 2015, 3:56:45 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min4.css" />        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/2.css" type="text/css" media="screen" title="default" />

        <style type="text/css">
            html { 
                background: url(${pageContext.request.contextPath}/resources/images/family.jpg) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }
        </style>

        <title><spring:message code="label.ivf" text="IVF" /></title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Онлайн трансляция</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">   
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Информация
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                ${brdcInfo}                                            
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
            <div class="row">   
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Регистрация
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <c:if test="${brdcSucces == null}">
                                    <c:if test="${brdcError != null}">
                                        <p class="text-danger">${brdcError}</p>
                                    </c:if>
                                    <c:if test="${brdcReg != null}">
                                        <form:form method="post" action="${pageContext.request.contextPath}/video/registration/save" commandName="brdcReg" role="form">
                                            <form:hidden path="id" class="inp-form" />
                                            <form:hidden path="block" class="inp-form" />
                                            <form:hidden path="brdc.id" class="inp-form" />
                                            <label for="login">Логин:</label>
                                            <form:input path="login" required="true" class="form-control"></form:input>
                                                <label for="pass">Пароль:</label>
                                            <form:input path="pass" required="true" class="form-control"></form:input>
                                                <label for="lname">Фамилия:</label>
                                            <form:input path="lname" class="form-control"></form:input>    
                                                <label for="fname">Имя:</label>
                                            <form:input path="fname" required="true" class="form-control"></form:input>                                                
                                                <label for="mname">Отчество:</label>
                                            <form:input path="mname" class="form-control"></form:input>
                                                <label for="email">Email:</label>
                                            <form:input path="email" required="true" class="form-control"></form:input>
                                                <label for="phone">Контактный телефон:</label>
                                            <form:input path="phone" class="form-control"></form:input>
                                                <label for="description">Коментарий:</label>
                                            <form:input path="description" class="form-control"></form:input>
                                                <br />
                                                <input type="submit"  value="Регистрация" class="btn btn-success btn-lg btn-block" />
                                        </form:form>
                                    </c:if>  
                                </c:if>
                                <c:if test="${brdcSucces != null}">
                                    <p class="text-success">${brdcSucces}</p>
                                </c:if>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
        </div>        
    </body>
</html>
