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

<jsp:include page="/WEB-INF/views/template/default/header.jsp" />  

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/template/default/top_bar.jsp" />

    <div class="content-block-center">
        <div id="page_title" class="content-block-center-head">
            <span><spring:message code="label.broadcast" /></span>
        </div>
        <div class="content-block-center-item">
            <div class="content-block-center-item-head">
                <div class="content-block-center-item-head-autor">
                    <span>
                        <strong>
                            <a title="На страницу автора" target="_parent" href="/lichnie/lichnie2/33096">

                                <br>

                            </a>
                        </strong>
                        <br>

                    </span>
                </div>
                <div class="content-block-center-item-head-theme">
                    <span><spring:message code="label.broadcast" /></span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/broadcast/create/654654'" />
                </sec:authorize>
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

                                    <a href="${brdc.joinURL}" >
                                        ${brdc.description}
                                    </a>
                                </td>
                                <td>
                                    <button type="button" class="btn btn-success btn-xs btn-block" value="<spring:message code="label.logining" />" onClick="window.location = '${brdc.joinURL}'" ><spring:message code="label.logining" /></button>
                                    <sec:authorize access="hasRole('ROLE_ADMIN')">
                                        <button type="button" class="btn btn-primary btn-xs btn-block" value="<spring:message code="label.brdcstart" />" onClick="window.location = '${brdc.startURL}'" ><spring:message code="label.brdcstart" /></button>
                                        <button type="button" class="btn btn-danger btn-xs btn-block" value="<spring:message code="label.delete" />" onClick="window.location = '${pageContext.request.contextPath}/admin/broadcast/delete/${brdc.id}'" ><spring:message code="label.delete" /></button>
                                    </sec:authorize>
                                    <button type="button" class="btn btn-primary btn-xs btn-block" value="<spring:message code="label.brdcstart" />" onClick="window.location = '${brdc.loginURL}'" ><spring:message code="label.logining" /></button>
                                </td>
                            </tr>
                        </c:forEach>   
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" />  
