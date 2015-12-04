<%-- 
    Document   : usershow
    Created on : 15.05.2012, 10:05:39
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Редактор пользователей</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список пользователей
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/user_editor/32135'" />
                    <c:if test="${!empty userList}">
                        <table class="table">
                            <tr>
                                <th><a href="">ID</a></th>
                                <th><a href="">Имя</a></th>
                                <th><a href="">Фамилия</a></th>
                                <th><a href="">Отчество</a></th>
                                <th><a href="">Логин</a></th>
                                <th ><a href="">Options</a></th>
                            </tr>
                            <c:forEach items="${userList}" var="users">
                                <tr class="even">
                                    <td >${users.id}</td>
                                    <td >${users.userFname}</td>
                                    <td >${users.userLname}</td>
                                    <td >${users.userMname}</td>
                                    <td >${users.userLogin}</td>                        
                                    <td style="width: 70px;text-align: center">
                                        <button type="button" class="btn btn-danger btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/usershow/delete/${users.id}'" >
                                            <spring:message code="label.delete" />
                                        </button> 
                                        <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/user_editor/${users.id}'" >
                                            Редактировать
                                        </button>                            
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
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