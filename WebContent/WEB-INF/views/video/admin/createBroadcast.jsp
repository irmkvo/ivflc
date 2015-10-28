<%-- 
    Document   : createBroadcast
    Created on : Aug 26, 2015, 6:32:01 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@ taglib uri="http://cksource.com/ckfinder" prefix="ckfinder"%> 
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery.datetimepicker.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.datetimepicker.js"></script>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header"><spring:message code="label.broadcast" /></h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                <spring:message code="label.broadcast" />
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <form:form method="post" action="${pageContext.request.contextPath}/admin/broadcast/create/save" commandName="broadcast" role="form">
                        <div class="form-group">
                            <form:hidden path="id" class="inp-form" />
                            <label for="image"> <spring:message code="label.image" />:</label>
                            <div class="input-group">
                                <form:input path="image" class="form-control"></form:input>
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button"><spring:message code="label.upload" /></button>
                                </span>
                            </div>
                            <label for="author"> <spring:message code="label.author" />:</label>
                            <form:input path="author" class="form-control"></form:input>
                            <label for="title"> <spring:message code="label.title" />:</label>
                            <form:input path="title" class="form-control"></form:input>
                            <label for="meetingID"> <spring:message code="label.meetingID" />:</label>
                            <form:input path="meetingID" class="form-control"></form:input>
                            <label for="description"> <spring:message code="label.description" />:</label>
                            <form:textarea id="editor1" path="description" class="form-control"/>
                            <label for="creationDate"> <spring:message code="label.date" />:</label>
                            <form:input id="datetime" path="creationDate" class="form-control"></form:input>
                            <label for="startDate"> <spring:message code="label.startdate" />:</label>
                            <form:input id="datetime2" path="startDate" class="form-control"></form:input>
                            <form:hidden path="endDate" class="inp-form" />
                            <form:hidden path="startURL" class="inp-form" />
                            <form:hidden path="loginURL" class="inp-form" />
                            <form:hidden path="joinURL" class="inp-form" />                        
                        </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />                  
                    </form:form>    
                    <ckfinder:setupCKEditor editor="editor1" basePath="/resources/ckfinder/" />
                    <ckeditor:replace replace="editor1" basePath="/resources/ckeditor/" />
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

<script type="text/javascript">
    $(function () {
        jQuery('#datetime').datetimepicker();
        jQuery('#datetime2').datetimepicker();
    });
</script>
