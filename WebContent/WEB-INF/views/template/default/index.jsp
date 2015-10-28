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
<!DOCTYPE html>

<html>
    <head>
        <tiles:insertAttribute name="header" />  
        <tiles:insertAttribute name="scripts" />
    </head>
    <body> 
        <div id="wrapper">

            <tiles:insertAttribute name="navigation" />

            <div id="page-wrapper">

                <jsp:include page="${loadContent}" />

            </div>     

        </div>        
    </body>
</html>