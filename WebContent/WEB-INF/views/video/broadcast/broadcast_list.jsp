<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

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
                <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/menu_editor/menu_edit/654654'" />
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
                                    <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${brdc.joinURL}'" >
                                        <spring:message code="label.logining" />
                                    </button>                                    
                                </td>
                            </tr>
                        </c:forEach>   
                    </tbody>
                </table>
            </div>
        </div>
    </div>
        
</div>   

