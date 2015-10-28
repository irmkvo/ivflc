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
                            lang:"ru",
                            editable: true,
                            events: [
				{
					title: 'Полумисков В.В.',
					start: '2015-10-10'
				},
				{
					title: 'Анализ крови',
					start: '2015-10-18',
					end: '2015-10-19'
				},
				{
					title: 'Анализ',
					start: '2015-10-29T16:10:00'
				},
				{
					title: 'Анализ',
					start: '2015-10-16T16:20:00'
				},
				{
					title: 'Школа ЛАМАС',
					start: '2015-10-01',
					end: '2015-10-05'
				},
				{
					title: 'Школа ЭКО',
					start: '2015-10-22T10:30:00',
					end: '2015-10-22T12:30:00'
				}
			]
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
