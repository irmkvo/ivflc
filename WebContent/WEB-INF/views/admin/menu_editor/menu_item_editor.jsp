<%-- 
    Document   : menu_item_editor
    Created on : 17.06.2015, 12:12:38
    Author     : kvo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="content-block-center">
    <div id="page_title" class="content-block-center-head">
        <span>Редактор меню</span>
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
            <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_item_edit/save" commandName="menuItemEdit" role="form">
                <div class="form-group">
                    <form:hidden path="menuItemid" class="inp-form" />
                    <label for="menu">Меню:</label>
                    <form:select path="menu" class="form-control">
                        <form:options items="${menus}" />
                    </form:select>
                    <label for="page">Страница:</label>
                    <form:select path="page" class="form-control">
                        <form:options items="${pages}" />
                    </form:select>
                    <label for="role">Роль:</label>
                    <form:select path="role" class="form-control">
                        <form:options items="${userRoles}" />
                    </form:select>

                    <label for="menuItemtitle">Наименование:</label>
                    <form:input path="menuItemtitle" class="form-control"></form:input>
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
