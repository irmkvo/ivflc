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

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/template/default/top_bar.jsp" />

    <div class="content-block-center">
        <div id="page_title" class="content-block-center-head">
            <span>Онлайн трансляция</span>
        </div>
        <div class="content-block-center-item">
            <div class="content-block-center-item-head">
                <div class="content-block-center-item-head-autor">
                    
                </div>
                <div class="content-block-center-item-head-theme">
                    <span>Трансляция</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <div id='mediaspace1'>Онлайн видео трансляция</div>
                <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_edit/save" commandName="broadcast" role="form">
                    <div class="form-group">
                        <form:hidden path="id" class="inp-form" />
                        <label for="image"> <spring:message code="label.image" />:</label>
                        <form:input path="image" class="form-control"></form:input>
                        <label for="author"> <spring:message code="label.image" />:</label>
                        <form:input path="author" class="form-control"></form:input>
                        <label for="title"> <spring:message code="label.image" />:</label>
                        <form:input path="title" class="form-control"></form:input>
                        <label for="meetingID"> <spring:message code="label.image" />:</label>
                        <form:input path="meetingID" class="form-control"></form:input>
                        <label for="description"> <spring:message code="label.description" />:</label>
                        <form:textarea id="editor1" path="description" class="form-control"/>
                        <label for="creationDate"> <spring:message code="label.image" />:</label>
                        <form:input path="creationDate" class="form-control"></form:input>
                        <form:hidden path="startDate" class="inp-form" />
                        <form:hidden path="endDate" class="inp-form" />
                        <form:hidden path="startURL" class="inp-form" />
                        <form:hidden path="joinURL" class="inp-form" />                        
                    </div>
                </form:form>
                <ckeditor:replace replace="editor1" basePath="${pageContext.request.contextPath}/resources/ckeditor/" />
                
            </div>
        </div>
    </div>


</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" /> 
