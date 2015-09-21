<%-- 
    Document   : usershow
    Created on : 15.05.2012, 10:05:39
    Author     : Andrey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

        <c:if test="${!empty userList}">
            <table class="table">
                <tr>
                    <th><a href="">ID</a></th>
                    <th><a href="">Имя</a></th>
                    <th><a href="">Фамилия</a></th>
                    <th><a href="">Отчество</a></th>
                    <th><a href="">Логин</a></th>
                    <th><a href="">Пароль</a></th>
                    <th><a href="">Код договора</a></th>
                    <th><a href="">Клиент</a></th>
                    <th><a href="">E-mail</a></th>
                    <th><a href="">Телефон</a></th>
                    <th ><a href="">Options</a></th>
                </tr>
                <c:forEach items="${userList}" var="users">
                    <tr class="even">
                        <td >${users.id}</td>
                        <td >${users.userFname}</td>
                        <td >${users.userLname}</td>
                        <td >${users.userMname}</td>
                        <td >${users.userLogin}</td>
                        <td >${users.userPassword}</td>
                        <td >${users.userCode}</td>
                    <td >${users.userRole}</td>
                        <td >${users.userMail}</td>
                        <td >${users.userPhone}</td>
                        <td style="width: 70px;text-align: center">
                            <a href="${pageContext.request.contextPath}/admin/usershow/delete/${users.id}" title="Удалить">Удалить</a>
                            <a href="${pageContext.request.contextPath}/admin/useredit/edit/${users.id}" title="Редактировать">Редактировать</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    <a href="${pageContext.request.contextPath}/admin/usershow/add" title="Создать"><input class="btn" align="left" type="submit" value="Создать" /></a>