<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/WEB-INF/views/admin/header.jsp" />  
<jsp:include page="/WEB-INF/views/admin/left_bar.jsp" />

<div class="col-md-9 column">
<div class="content-block-center-admin">      
   
    <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_edit/save" commandName="menuEdit">
            <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
                <tr>
                    <td>
                        <form:hidden path="menuid" class="inp-form" />
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>Наименование:</td>
                    <td><form:input path="menutitle"></form:input></td>
                    </tr>
                    <tr>
                        <td>Позиция:</td>
                        <td><form:input path="menuposition"></form:input></td>
                    </tr>
                    <tr>
                        <td>Описание:</td>
                        <td><form:input path="menudescription"></form:input></td>
                    </tr> 
                    <tr>
                    <td>
                        <input type="submit"  value="Сохранить" class="btn" />
                    </td>
                    <td>
                        <input type="button" value="Отмена" onClick="window.location='${pageContext.request.contextPath}/admin/menu_editor/menu_list'">
                    </td>
                </tr>
                </table>
        </form:form>
</div>
    </div>