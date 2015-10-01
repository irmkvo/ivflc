<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

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
            <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_edit/654654'" />
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
                                <button type="button" class="btn btn-primary btn-xs btn-block" onClick="window.location = '${brdc.startURL}'" >
                                    <spring:message code="label.brdcstart" />
                                </button> 
                                <button type="button" class="btn btn-info btn-xs btn-block" onClick="window.location = '${brdc.loginURL}'" >
                                    <spring:message code="label.brdcjoinUrl" />
                                </button> 
                                <button type="button" class="btn btn-danger btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/broadcast/delete/${brdc.id}'" >
                                    <spring:message code="label.delete" />
                                </button> 
                            </td>
                        </tr>
                    </c:forEach>   
                </tbody>
            </table>
        </div>
    </div>
</div>


