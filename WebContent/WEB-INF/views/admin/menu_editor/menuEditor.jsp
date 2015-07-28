<%-- 
    Document   : menuEditor
    Created on : 17.06.2015, 12:11:46
    Author     : Shah
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
            <span>Редактор меню</span>
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
                    <span>Редактирование</span>
                </div>
            </div>
            <div class="content-block-center-item-content">
                <form:form method="post" action="${pageContext.request.contextPath}/admin/menu_editor/menu_edit/save" commandName="menuEdit" role="form">
                    <div class="form-group">
                        <form:hidden path="menuid" class="inp-form" />
                        <label for="menutitle">Наименование:</label>
                        <form:input path="menutitle" class="form-control"></form:input>
                        <label for="menuposition">Позиция:</label>    
                        <form:input path="menuposition" class="form-control"></form:input>
                        <label for="menudescription">Описание:</label>    
                        <form:input path="menudescription" class="form-control"></form:input>  
                    </div>
                        <input type="submit"  value="Сохранить" class="btn btn-success" />
                        <input type="button" value="Отмена" class="btn btn-danger" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_list'">
                </form:form>
            </div>
        </div>
    </div>

    <c:if test="${!empty RightPanel}">
        <c:if test="${RightPanel == 1}">
            <jsp:include page="/WEB-INF/views/template/default/right_bar.jsp" />
        </c:if>
    </c:if>
</div>

<jsp:include page="/WEB-INF/views/template/default/footer.jsp" /> 

</div>