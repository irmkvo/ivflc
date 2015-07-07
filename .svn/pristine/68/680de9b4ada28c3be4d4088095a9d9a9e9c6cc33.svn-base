<%-- 
    Document   : register
    Created on : 14.05.2012, 22:19:50
    Author     : Andrey
--%>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/signin.css" type="text/css" media="screen" title="default" />
        <script src="${pageContext.request.contextPath}/resources/assets/js/ie-emulation-modes-warning.js"></script>
        <title>Регистрация нового посетителя!</title>
    </head>
    <body>
        
        <div class="container">            
            <form:form method="post" action="${pageContext.request.contextPath}/login/register/reg" id="f" commandName="newuser" class="form-horizontal">
                <fieldset>
                    <div id="legend">
                        <legend class="">Регистрация</legend>
                    </div>
                    <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="username">Имя</label>
                        <div class="controls">
                            <form:input path="userFname" id="userFname" placeholder="Иван" class="input-xlarge"></form:input>                            
                            <p class="help-block">Введите имя</p>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- UserLname -->
                        <label class="control-label"  for="userLname">Фамилия</label>
                        <div class="controls">
                            <form:input path="userLname" id="userLname" placeholder="Борсуков"></form:input>
                            <p class="help-block">Введите Фамилию</p>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- UserMname -->
                        <label class="control-label"  for="userMname">Отчество</label>
                        <div class="controls">
                            <form:input path="userMname" id="userMname" placeholder="Александрович"></form:input>
                            <p class="help-block">Введите Отчество</p>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- UserPhone -->
                        <label class="control-label"  for="userPhone">Телефон</label>
                        <div class="controls">
                            <form:input path="userPhone" id="userPhone" placeholder="+7 777 777 77 77"></form:input>
                            <p class="help-block">Введите Телефон</p>
                        </div>
                    </div>
                            
                    <div class="control-group">
                        <!-- E-mail -->
                        <label class="control-label" for="email">E-mail</label>
                        <div class="controls">
                            <form:input path="userMail" id="userMail" placeholder="borsuk@mail.ru"  class="input-xlarge"></form:input>
                            <p class="help-block">Введите e-mail</p>
                        </div>
                    </div>
                        
                    <div class="control-group">
                        <!-- Password-->
                        <label class="control-label" for="password">Пароль</label>
                        <div class="controls">
                            <form:password path="userPassword" id="userPassword"   placeholder="пароль" class="input-xlarge"></form:password>
                            <p class="help-block">Пароль должен содержать не менее 5 символов</p>
                        </div>
                    </div>
                            
                    <div class="control-group">
                        <!-- Password -->
                        <label class="control-label"  for="password_confirm">Повторите пароль)</label>
                        <div class="controls">
                            <input type="password" id="password_confirm" name="password_confirm" placeholder="" class="input-xlarge">
                            <p class="help-block">Пожалуйстав повторите пароль</p>
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- User ROLE-->
                        <label class="control-label" for="password">Роль</label>
                        <div class="controls">
                            <form:select path="userRole">
                                <form:option  value="1" label="Пациент"/>
                                <form:option value="2" label="Студент"/>
                            </form:select>
                            <p class="help-block">Необходимо выбрать роль</p>
                        </div>
                    </div>    
                    <div class="control-group">
                        <!-- Button -->
                        <div class="controls">
                            <button class="btn btn-success">Зарегистрироваться</button>
                        </div>
                    </div>
                </fieldset>
            </form:form>      
        </div> <!-- /container -->        

        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

    </body>
</html>
