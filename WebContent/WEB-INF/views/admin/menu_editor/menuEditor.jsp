<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
    Author     : Shah
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
