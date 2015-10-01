<%-- 
    Document   : menu_list
    Created on : 17.06.2015, 12:11:29
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
                    <span>Список страниц</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/pages_editor/page_edit/654654'" />
                <table class="table table-striped table-hover" cellspasing="0" cellpadding="0" border="0">
                    <c:forEach items="${pagesList}" var="page" >
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/admin/pages_editor/page_edit/${page.pageid}" >
                                    <c:out value="${page.pageid}" />
                                </a>
                            </td>
                            <td>
                                <c:out value="${page.pagetitle}" />
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
