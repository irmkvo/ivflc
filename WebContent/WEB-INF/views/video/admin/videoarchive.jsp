<%-- 
    Document   : video
    Created on : 02.03.2015, 12:05:22
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/WEB-INF/views/admin/header.jsp" />  

<div class="col-md-9 column">
    <jsp:include page="/WEB-INF/views/admin/top_bar.jsp" />

    <div class="content-block-center">
        <div id="page_title" class="content-block-center-head">
            <span>Видео материалы</span>
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
                <script type='text/javascript' src='jwplayer.js'></script>    

                <script type='text/javascript' src='${pageContext.request.contextPath}/resources/player/jwplayer.js'></script>

                <div id='mediaspace1'>Онлайн видео трансляция</div>

                <script type='text/javascript'>
                    jwplayer('mediaspace1').setup({
                        'flashplayer': '${pageContext.request.contextPath}/resources/player/player.swf',
                        'file': 'ib1',
                        'streamer': 'rtmp://192.168.112.60/live/',
                        'controlbar': 'bottom',
                        'bufferlength': '1',
                        'width': '435',
                        'height': '400'
                    });
                </script>
            </div>
        </div>
    </div>


</div>

<jsp:include page="/WEB-INF/views/admin/footer.jsp" />  
