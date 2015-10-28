<%-- 
    Document   : menu_item_editor
    Created on : 17.06.2015, 12:12:38
    Author     : kvo
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
                    <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_item_edit/save" commandName="menuItemEdit" role="form">
                        <div class="form-group">
                            <form:hidden path="menuItemid" class="inp-form" />
                            <label for="menu">Меню:</label>
                            <form:select path="menu" items="${menus}" itemValue="menuid" class="form-control">
                            </form:select>
                            <label for="page">Страница:</label>
                            <form:select path="page" items="${pages}" itemValue="pageid" class="form-control">
                            </form:select>
                            <label for="role">Роль:</label>
                            <form:select path="role" items="${userRoles}" itemValue="id" class="form-control">
                            </form:select>

                            <label for="menuItemtitle">Наименование:</label>
                            <form:input path="menuItemtitle" class="form-control"></form:input>
                            <label for="icon">Значек:</label>
                            <form:input path="icon" class="form-control"></form:input>
                                <label for="menuItemPosition">Позиция:</label>    
                            <form:input path="menuItemPosition" class="form-control"></form:input>
                                <label for="menuItemdescription">Описание:</label>    
                            <form:input path="menuItemdescription" class="form-control"></form:input>  
                                <div class="checkbox">
                                    <label>
                                    <form:checkbox path="menuItemEnabled" />
                                    Активный
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <form:checkbox path="menuItemBreak" />
                                    Отступ
                                </label>
                            </div>
                        </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />
                        <input type="button" value="Отмена" class="btn btn-danger" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_item_list/${menuItemEdit.menu.menuid}/${menuItemEdit.role.id}'">
                    </form:form> 
                </div>                    
            </div>
        </div>
    </div>
    <!-- /.row -->


