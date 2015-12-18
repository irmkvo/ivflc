<%-- 
    Document   : useredit
    Created on : 15.05.2012, 11:26:49
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Редактор страниц</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список страниц
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <form:form method="post" action="${pageContext.request.contextPath}/admin/user_editor/save" commandName="userObj" role="form">
                        <div class="form-group">
                            <form:hidden path="id" class="inp-form" />
                            <label for="userLogin">Логин:</label>
                            <form:input path="userLogin" class="form-control"></form:input>
                            <label for="userPassword">Пароль:</label>
                            <form:input path="userPassword" class="form-control"></form:input>
                            <label for="userFname">Имя:</label>
                            <form:input path="userFname" class="form-control"></form:input>
                            <label for="userLname">Фамилия:</label>
                            <form:input path="userLname" class="form-control"></form:input>
                            <label for="userMname">Отчество:</label>
                            <form:input path="userMname" class="form-control"></form:input>
                            <label for="userMail">Email:</label>
                            <form:input path="userMail" class="form-control"></form:input>
                            <label for="userPhone">Телефон:</label>
                            <form:input path="userPhone" class="form-control"></form:input>
                            <label for="IIN">ИИН:</label>
                            <form:input path="IIN" class="form-control"></form:input>
                            
                            <label for="role">Роль:</label>
                            <form:select path="role" items="${userRoles}" itemValue="id" class="form-control">
                            </form:select>
                            
                            <label for="brdc">Ведет вебинар:</label>
                            <form:select path="brdc" items="${brdcList}" itemValue="id" class="form-control">
                            </form:select>                            
                                                        
                            <label for="patientId">Номер ЭМК:</label>    
                            <form:input path="patientId" class="form-control"></form:input>
                                                        
                            <div class="checkbox">
                                    <label>
                                    <form:checkbox path="accountNonExpired" />
                                    Аккаунт не истек
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <form:checkbox path="accountNonLocked" />
                                    Аккаут не блокирован
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <form:checkbox path="credentialsNonExpired" />
                                    Доступ не истек
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <form:checkbox path="enabled" />
                                    Активный
                                </label>
                            </div>
                        </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />
                        <input type="button" value="Отмена" class="btn btn-danger" onClick="window.location = '${pageContext.request.contextPath}/admin/user_list'">
                    </form:form> 
                </div>                    
            </div>
        </div>
    </div>
    <!-- /.row -->