<%-- 
    Document   : schedule
    Created on : Sep 21, 2015, 3:38:56 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<link href="${pageContext.request.contextPath}/resources/template/default/dist/css/fullcalendar/fullcalendar.css" rel="stylesheet">

<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/lang-all.js"></script>


<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Расписание</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Расписание
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div id="dataTables_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                        <table class="table">
                            <tr>
                                <c:forEach items="${PLDays}" var="plday">
                                    <c:if test="${plday.enabled}" >
                                        <th>${plday.name}</th>
                                    </c:if>
                                </c:forEach>
                            </tr>
                            <c:forEach items="${PLDays}" var="plday">
                                <tr>
                                    <th>${plday.name}</th>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>                    
                </div>
                <!-- /.table-responsive -->                
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
