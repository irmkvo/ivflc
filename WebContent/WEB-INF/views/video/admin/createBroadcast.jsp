<%-- 
    Document   : createBroadcast
    Created on : Aug 26, 2015, 6:32:01 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/WEB-INF/views/template/default/header.jsp" /> 

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery.datetimepicker.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.datetimepicker.js"></script> 

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/template/default/top_bar.jsp" />

    <div class="content-block-center">
        <div id="page_title" class="content-block-center-head">
            <span><spring:message code="label.broadcast" /></span>
        </div>
        <div class="content-block-center-item">
            <div class="content-block-center-item-head">
                <div class="content-block-center-item-head-autor">
                    
                </div>
                <div class="content-block-center-item-head-theme">
                    <span><spring:message code="label.broadcast" /></span>
                </div>
            </div>
            <div class="content-block-center-item-content">
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
                        <form:hidden path="joinURL" class="inp-form" />                        
                    </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />                  
                </form:form>
                <ckeditor:replace replace="editor1" basePath="${pageContext.request.contextPath}/resources/ckeditor/" />
            </div>
        </div>
    </div>
<script type="text/javascript">
    $(function() {jQuery('#datetime').datetimepicker();jQuery('#datetime2').datetimepicker();});
</script>

</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" /> 
