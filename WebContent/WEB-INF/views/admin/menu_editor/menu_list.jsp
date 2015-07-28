<%-- 
    Document   : menu_list
    Created on : 17.06.2015, 12:11:29
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/WEB-INF/views/template/default/header.jsp" />  

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/template/default/top_bar.jsp" />

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
                    <span>Список меню</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/menu_editor/menu_edit/654654'" />
                <table class="table table-striped table-hover" cellspasing="0" cellpadding="0" border="0">
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
            </div>
        </div>
    </div>

    <c:if test="${!empty RightPanel}">
        <c:if test="${RightPanel == 1}">
            <jsp:include page="/WEB-INF/views/template/default/right_bar.jsp" />
        </c:if>
    </c:if>
</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" />  


        
