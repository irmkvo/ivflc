<%-- 
    Document   : useredit
    Created on : 15.05.2012, 11:26:49
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<jsp:include page="/WEB-INF/header_admin.jsp" />
<center>
<div class="main" id="main-two-columns">
    <div><h2 >Список заказов</h2></div>
    <form:form method="post" action="${pageContext.request.contextPath}/admin/useredit/edit" commandName="user">
        <table border="0" cellpadding="0" cellspacing="0"  id="id-form">
            <tr>
                    <form:hidden path="id" class="inp-form" />
                </td><td></td></tr>
            <tr>
                <td>Имя:</td>
                <td><form:input path="userFname"></form:input></td>
                </tr>
                <tr>
                    <td>Фамилия:</td>
                    <td><form:input path="userLname"></form:input></td>
                </tr>
                <tr>
                    <td>Отчество:</td>
                    <td><form:input path="userMname"></form:input></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="userMail"></form:input></td>
                </tr>
                <tr>
                    <td>Телефон:</td>
                    <td><form:input path="userPhone"></form:input></td>
                </tr>
                <tr>
                    <td>Логин:</td>
                    <td><form:input path="userLogin"></form:input></td>
                </tr>                                 
                <tr>
                    <td>Пароль:</td>
                    <td><form:input path="userPassword"></form:input></td>
                </tr>
                <tr>
                    <td>Клиент:</td>
                <td><form:input path="userRole"/></td>
                </tr>
                <tr>
                    <td>Код договора:</td>
                    <td><form:input path="userCode"></form:input></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit"  value="Сохранить" class="btn" />
                    </td><td></td>
                </tr>
            </table>
    </form:form>

</div>
</center>