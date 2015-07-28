<%-- 
    Document   : testslist
    Created on : Jul 24, 2015, 12:18:02 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<jsp:include page="/WEB-INF/views/template/default/header.jsp" />     

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/template/default/top_bar.jsp" />
    
    
    
    <c:if test="${!empty RightPanel}">
        <c:if test="${RightPanel == 1}">
            <jsp:include page="/WEB-INF/views/template/default/right_bar.jsp" />
        </c:if>
    </c:if>
</div>

    
<jsp:include page="/WEB-INF/views/template/default/footer.jsp" />
