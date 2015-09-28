<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ include file="/WEB-INF/included.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" title="default" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/leftbar.css" type="text/css" title="default" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery.mCustomScrollbar.css" type="text/css" title="default" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" title="default" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/calendar.css">
        
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/inji_inversion_menu.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.mCustomScrollbar.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
        
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/bg-BG.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/nl-NL.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/fr-FR.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/de-DE.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/el-GR.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/it-IT.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/hu-HU.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/pl-PL.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/pt-BR.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/ro-RO.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/es-CO.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/es-MX.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/es-ES.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/ru-RU.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/sk-SR.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/sv-SE.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/zh-CN.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/cs-CZ.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/ko-KR.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/zh-TW.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/id-ID.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/language/th-TH.js"></script>
        
        <title>Личный кабинет</title>
    </head>
    <body>        
        <div class="container">
            <c:if test="${!empty LeftPanel}">
                <c:if test="${LeftPanel == 1}">
                    <jsp:include page="/WEB-INF/views/template/default/left_bar.jsp" />
                </c:if>
            </c:if>