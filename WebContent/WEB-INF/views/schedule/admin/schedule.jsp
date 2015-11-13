<%-- 
    Document   : schedule
    Created on : Sep 21, 2015, 3:38:56 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="${pageContext.request.contextPath}/resources/template/default/dist/css/fullcalendar/fullcalendar.css" rel="stylesheet">

<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/fullcalendar.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/js/fullcalendar/lang-all.js"></script>


<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Расписание</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Расписание
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <div id="dataTables_wrapper" class="dataTables_wrapper form-inline dt-bootstrap no-footer">
                        <div id='calendar'></div>
                    </div>
                    <script type="text/javascript">
                    $(document).ready(function () {
                        var date = new Date();
                        var d = date.getDate();
                        var m = date.getMonth();
                        var y = date.getFullYear();

                        $('#calendar').fullCalendar({
                            header: {
                            left: 'prev,next today',
                            center: 'title',
                            right: 'month,agendaWeek,agendaDay'
                            },
                            default: 10,
                            minTime: '07:00:00',
                            maxTime: '19:00:00',
                            slotDuration: '00:02:00',
                            lang:"ru",
                            editable: false,
                            events: '${pageContext.request.contextPath}/med/schedule/json'
                        });
                    });
                    </script>
                </div>
                <!-- /.table-responsive -->                
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
