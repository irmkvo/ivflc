<%-- 
    Document   : login to video conference
    Created on : 23.08.2015, 16:42:10
    Author     : Kim Vladimir
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8"); 
	response.setCharacterEncoding("UTF-8"); 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/ui.jqgrid.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.validate.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/grid.locale-en.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.jqGrid.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.xml2json.js" type="text/javascript"></script>
	<title><spring:message code="label.ivf" /></title>
	<style type="text/css">
	 #formcreate{
		margin-bottom:30px;
	 }
	 #formcreate label.labform{
	 	display:block;
	 	float:left;
	 	width:100px;
	 	text-align:right;
		margin-right:5px;
	 }
	 #formcreate div{
		margin-bottom:5px;
		clear:both;
	 }
	 #formcreate .submit{
		margin-left:100px;
		margin-top:15px;
	 }
	 #descript{
	 	vertical-align:top;
	 }
	 #meta_description , #username1{
		float:left;
	 }
	 .ui-jqgrid{
		font-size:0.7em
	}
	label.error{
		float: none; 
		color: red; 
		padding-left: .5em; 
		vertical-align: top;
		width:200px;
		text-align:left;
	}
	</style>
</head>
<body>

    <%@ include file="api.jsp"%>
    <%@ page import="java.util.regex.*"%>

    <%
            if (request.getParameterMap().isEmpty()) {
    %>
    <form id="formcreate" name="formcreate" method="get" action=""> 		
        <div>
            <label class="labform" for="meetingID">
                <spring:message code="label.broadcast" />:
            </label>
            <select name="meetingID" onchange="onChangeMeeting(this.value);">
                <option value="Operation room 1">Operation room 1</option>
            </select>
        </div>
        <div>
            <label class="labform" id="descript" for="meta_description">
                <spring:message code="label.description" />:
            </label>
            <textarea id="meta_description" name="meta_description" cols="50" rows="6" autofocus required></textarea>
        </div>
        <div>
            <label class="labform" for="meta_email">
                <spring:message code="label.login" />:
            </label>
            <input id="meta_email" name="meta_email" type="text" required size="30" />
        </div>	
        <div style="clear:both"></div>
        <input class="submit" type="submit" value="Join" >
        <input type="hidden" name="action" value="create" />
    </form>


    <table id="recordgrid"></table>
    <div id="pager"></div> 

    <script>
    function onChangeMeeting(meetingID){
            isRunningMeeting(meetingID);
    }	
	
    function isRunningMeeting(meetingID) {
            $.ajax({
                    type: "GET",
                    url: 'demo10_helper.jsp',
                    data: "command=isRunning&meetingID="+meetingID,
                    dataType: "xml",
                    cache: false,
                    success: function(xml) {
                            response = $.xml2json(xml);
                            if(response.running=="true"){
                                    $("#meta_description").val("An active session exists for "+meetingID+". This session is being recorded.");
                                    $("#meta_description").attr("readonly","readonly");
                                    $("#meta_description").attr("disabled","disabled");
                            }else{
                                    $("#meta_description").val("");
                                    $("#meta_description").removeAttr("readonly");
                                    $("#meta_description").removeAttr("disabled");
                            }
				
                    },
                    error: function() {
                            alert("Failed to connect to API.");
                    }
            });
    }
    var meetingID="Operation room 1";    

    </script>
    <%
            } else if (request.getParameter("action").equals("create")) {
		
                    String meetingID = request.getParameter("meetingID");
                    String username = request.getParameter("meta_email");
		
                    //metadata
                    Map<String,String> metadata=new HashMap<String,String>();
		
                    metadata.put("description", request.getParameter("meta_description"));
                    metadata.put("email", request.getParameter("meta_email"));

                    metadata.put("title", request.getParameter("meetingID"));

                    String welcomeMsg = "<spring:message code="label.broadcastwelcome" />";
                    String joinURL = getJoinURL(username, meetingID, "true", welcomeMsg, metadata, null);
                    if (joinURL.startsWith("http://")) {
    %>
    <script language="javascript" type="text/javascript">
        window.location.href = "<%=joinURL%>";
    </script>
    <%
                    }else{
    %>
    Error: getJoinURL() failed
    <p /><%=joinURL%> <%
                    }
            }
    %> 


</body>
</html>
