<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<jsp:include page="/WEB-INF/views/admin/header.jsp" />        
    
<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/admin/top_bar.jsp" />
    <jsp:include page="/WEB-INF/views/admin/content.jsp" />
    <jsp:include page="/WEB-INF/views/admin/right_bar.jsp" />
</div>

<jsp:include page="/WEB-INF/views/admin/footer.jsp" />        

