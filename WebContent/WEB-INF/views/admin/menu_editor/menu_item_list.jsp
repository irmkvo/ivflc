<%-- 
    Document   : menu_item_list
    Created on : 17.06.2015, 12:12:22
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Редактор пунктов меню</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список пунктов меню
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_item_edit/654654'" />
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
    </div>
    <!-- /.row -->


