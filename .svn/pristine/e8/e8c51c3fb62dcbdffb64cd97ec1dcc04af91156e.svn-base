<%-- 
    Document   : video
    Created on : 02.03.2015, 12:05:22
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/WEB-INF/views/admin/header.jsp" />  

<script type='text/javascript' src='jwplayer.js'></script>
    
<div class="col-md-9 column" style="width: 100% !important;">
    <div style="padding-top: 50px;">
        <script type='text/javascript' src='${pageContext.request.contextPath}/resources/player/jwplayer.js'></script>
  
        <div id='mediaspace1'>Онлайн видео трансляция</div>

        <script type='text/javascript'>
            jwplayer('mediaspace1').setup({
                'flashplayer': '${pageContext.request.contextPath}/resources/player/player.swf',
                'file': 'ib1',
                'streamer': 'rtmp://192.168.112.60/live/',
                'controlbar': 'bottom',
                'bufferlength': '1',
                'width': '1024',
                'height': '600'
            });
        </script>
    </div>
</div>
            
  
         
            
<jsp:include page="/WEB-INF/views/admin/footer.jsp" />   