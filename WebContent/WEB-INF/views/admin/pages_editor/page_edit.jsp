<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
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
                Редактирование страницы
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <form:form method="post" action="${pageContext.request.contextPath}/admin/pages_editor/page_edit/save" commandName="pageEdit" role="form">
                        <div class="form-group">
                            <form:hidden path="pageid" class="inp-form" />
                            <label for="pagetitle">Наименование:</label>
                            <form:input path="pagetitle" class="form-control"></form:input>
                                <label for="pagedescription">Позиция:</label>    
                            <form:input path="pagedescription" class="form-control"></form:input>
                                <label for="pageurl">Ссылка:</label>    
                            <form:input path="pageurl" class="form-control"></form:input>  
                                <div class="checkbox">
                                    <label>
                                    <form:checkbox path="pagemainpage" />
                                    Главная страница
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <form:checkbox path="loginPage" />
                                    Страница авторизации
                                </label>
                            </div>
                        </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />
                        <input type="button" value="Отмена" class="btn btn-danger" onClick="window.location = '${pageContext.request.contextPath}/admin/pages_list'">
                    </form:form> 
                </div>                    
            </div>
        </div>
    </div>
    <!-- /.row -->


