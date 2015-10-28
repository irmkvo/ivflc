<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Видео чат</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список чатов
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">

                    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/chat/create/654654'" />
                    <table class="table table-hover">
                        <thead></thead>
                        <tbody>
                            <c:forEach items="${brdcList}" var="brdc" >
                                <tr>
                                    <td>          
                                        <img src="${pageContext.request.contextPath}/resources/images/logo.png" class="img-thumbnail" width="100" height="100"/>                            
                                    </td>
                                    <td>
                                        <c:out value="${brdc.title}" />

                                        <a href="${pageContext.request.contextPath}/admin/broadcast/create/${brdc.id}" >
                                            ${brdc.description}
                                        </a>
                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${brdc.joinURL}'" >
                                            <spring:message code="label.logining" />
                                        </button>    
                                        <button type="button" class="btn btn-primary btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/video/start/${brdc.meetingID}'" >
                                            <spring:message code="label.brdcstart" />
                                        </button> 
                                        <button type="button" class="btn btn-info btn-xs btn-block" onClick="window.location = '${brdc.loginURL}'" >
                                            <spring:message code="label.brdcjoinUrl" />
                                        </button> 
                                        <button type="button" class="btn btn-danger btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/broadcast/delete/${brdc.id}'" >
                                            <spring:message code="label.delete" />
                                        </button> 
                                    </td>
                                </tr>
                            </c:forEach>   
                        </tbody>
                    </table>
                </div>
                <!-- /.table-responsive -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-6 -->
</div>
<!-- /.row -->


