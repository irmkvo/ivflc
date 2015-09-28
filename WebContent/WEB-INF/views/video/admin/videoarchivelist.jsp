<%-- 
    Document   : video
    Created on : 02.03.2015, 12:05:22
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<sec:authorize access="hasRole('ROLE_ADMIN')">
    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/broadcast/create/654654'" />
</sec:authorize>
<table class="table table-hover">
    <thead></thead>
    <tbody>
        <c:forEach items="${brdcRecordsList}" var="brdc" >
            <tr>
                <td>          
                    <img src="${pageContext.request.contextPath}/resources/images/logo.png" class="img-thumbnail" width="100" height="100"/>                            
                </td>
                <td>
                    <c:out value="${brdc.name}" />

                    <a href="#" >
                        ${brdc.description}
                    </a>
                </td>
                <td>
                    <button type="button" class="btn btn-success btn-xs btn-block" value="<spring:message code="label.logining" />" onClick="window.location = '${brdc.playback}'" ><spring:message code="label.logining" /></button>
                </td>
            </tr>
        </c:forEach>   
    </tbody>
</table> 
