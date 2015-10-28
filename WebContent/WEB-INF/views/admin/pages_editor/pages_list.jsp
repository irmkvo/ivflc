<%-- 
    Document   : menu_list
    Created on : 17.06.2015, 12:11:29
    Author     : Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Редактор страниц</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список страниц
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/pages_editor/page_edit/654654'" />
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
    </div>
    <!-- /.row -->    
