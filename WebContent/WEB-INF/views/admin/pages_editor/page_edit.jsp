<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="content-block-center">
    <div id="page_title" class="content-block-center-head">
        <span>Редактор страниц</span>
    </div>
    <div class="content-block-center-item">
        <div class="content-block-center-item-head">
            <div class="content-block-center-item-head-autor">
                <span>
                    <strong>
                        <a title="На страницу автора" target="_parent" href="/lichnie/lichnie2/33096">

                            <br>

                        </a>
                    </strong>
                    <br>

                </span>
            </div>
            <div class="content-block-center-item-head-theme">
                <span>Редактирование</span>
            </div>
        </div>
        <div class="content-block-center-item-content">
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
