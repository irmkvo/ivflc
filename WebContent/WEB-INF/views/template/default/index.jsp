<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<tiles:insertAttribute name="header" />    

<c:if test="${!empty LeftPanel}">
    <c:if test="${LeftPanel == 1}">
        <tiles:insertAttribute name="leftbar" />
    </c:if>
</c:if>

<div class="col-md-9 column">
    <tiles:insertAttribute name="topbar" />
    
    <jsp:include page="${loadContent}" />
    
    <c:if test="${!empty RightPanel}">
        <c:if test="${RightPanel == 1}">
            <tiles:insertAttribute name="rightbar" />
        </c:if>
    </c:if>
</div>

    
<jsp:include page="/WEB-INF/views/template/default/footer.jsp" />        

