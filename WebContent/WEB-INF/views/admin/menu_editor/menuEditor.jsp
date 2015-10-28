<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Редактор меню</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Редактирование меню
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_edit/save" commandName="menuEdit" role="form">
                        <div class="form-group">
                            <form:hidden path="menuid" class="inp-form" />
                            <label for="menutitle">Наименование:</label>
                            <form:input path="menutitle" class="form-control"></form:input>
                                <label for="menuposition">Позиция:</label>    
                            <form:input path="menuposition" class="form-control"></form:input>
                                <label for="menudescription">Описание:</label>    
                            <form:input path="menudescription" class="form-control"></form:input>  
                            </div>
                            <input type="submit"  value="Сохранить" class="btn btn-success" />
                            <input type="button" value="Отмена" class="btn btn-danger" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_list'">
                    </form:form>
                </div>                    
            </div>
        </div>
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Редактирование пунктов меню
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="dataTable_wrapper">
                        <table class="table table-striped table-hover" cellspasing="0" cellpadding="0" border="0">
                            <thead>
                                <tr>
                                    <th>Роль</th>
                                    <th>Действие</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${userRoles}" var="roles">
                                    <tr>
                                        <td><c:out value="${roles.roleTitle}" /></td>
                                        <td>
                                            <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_item_list/${menuEdit.menuid}/${roles.id}'" >Редактировать</button>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>                    
                </div>
            </div>
        </div>
        <!-- /.row -->




