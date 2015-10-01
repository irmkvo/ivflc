<%-- 
    Document   : menu_item_list
    Created on : 17.06.2015, 12:12:22
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                    <span>Список меню</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/menu_editor/menu_item_edit/654654'" />
                <table class="table table-striped table-hover" cellspasing="0" cellpadding="0" border="0">
                    <c:forEach items="${menuItemList}" var="menuItem" >
                        <tr>
                            <td>
                                <a href="${pageContext.request.contextPath}/admin/menu_editor/menu_item_edit/${menuItem.menuItemid}" >
                                    <c:out value="${menuItem.menuItemid}" />
                                </a>
                            </td>
                            <td>
                                <c:out value="${menuItem.menuItemtitle}" />
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
