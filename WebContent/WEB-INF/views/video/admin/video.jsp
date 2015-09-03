<%-- 
    Document   : video
    Created on : 02.03.2015, 12:05:22
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
                    <span>Трансляция</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <input type="button" class="btn btn-primary btn-lg btn-block" value="Добавить" id="" name="" onClick="window.location='${pageContext.request.contextPath}/admin/broadcast/create/654654'" />
                <table class="table table-striped table-hover" cellspasing="0" cellpadding="0" border="0">
                    <c:forEach items="${Broadcasts}" var="brdc" >
                        <tr>
                            <td>
                                <a href="${brdc.getJoinURL()}" >
                                    <c:out value="${brdc.getDescription()}" />
                                </a>
                            </td>
                            <td>
                                <c:out value="${brdc.getTitle()}" />
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>


</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" />  
