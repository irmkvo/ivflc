<%-- 
    Document   : menu_list
    Created on : 17.06.2015, 12:11:29
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/WEB-INF/views/admin/header.jsp" />  
<jsp:include page="/WEB-INF/views/admin/left_bar.jsp" />
<div class="col-md-9 column">
<div class="content-block-center-admin">    
    <body>        
        <table>
            <input type="button" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/menu_editor/menu_edit/654654'" />
            <c:forEach items="${menuList}" var="menu" >
                <tr>
                    <td>
                        <a href="${pageContext.request.contextPath}/admin/menu_editor/menu_edit/${menu.menuid}" >
                            <c:out value="${menu.menuid}" />
                        </a>
                    </td>
                    <td>
                        <c:out value="${menu.menutitle}" />
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</div>
</div>