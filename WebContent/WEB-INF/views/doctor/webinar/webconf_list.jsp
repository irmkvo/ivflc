<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!-- DataTables JavaScript -->
<script src="${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

<script type="text/javascript">
    fnServerObjectToArray = function (aElements)
    {
        return function (sSource, aoData, fnCallback) {
            $.ajax({
                "dataType": 'json',
                "type": "POST",
                "url": sSource,
                "data": aoData,
                "success": function (json) {
                    var a = [];
                    for (var i = 0, iLen = json.aaData.length; i < iLen; i++) {
                        var inner = [];
                        for (var j = 0, jLen = aElements.length; j < jLen; j++) {
                            inner.push(json.aaData[i][aElements[j]]);
                        }
                        a.push(inner);
                    }
                    json.aaData = a;
                    fnCallback(json);
                }
            });
        }
    }

    $(document).ready(function () {
        $('#dataTables').dataTable({
            "responsive": true,
            "bProcessing": true,
            "language": {
                "url": "${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/locale/dataTables.russian.lang"},
            "columnDefs": [{"className": "hidden-xs", "aTargets": [2]}],
            "sAjaxSource": '${pageContext.request.contextPath}/med/broadcast/archiv/json',
            "aoColumns": [
                {"mData": "recordID"},
                {"mData": "name"},
                {"mData": "starttime"},
                {"mData": null, "bSortable": false, "mRender": function (o) {
                        return "<a href='http://my.ivf.kz/playback/presentation/0.9.0/playback.html?meetingId=" + o.recordID + "' target='_blank'>Просмотр</a>";
                    }
                }
            ]
        });
        $('#dataTablesUser').dataTable({
            "responsive": true,
            "bProcessing": true,
            "language": {
                "url": "${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/locale/dataTables.russian.lang"},
            "columnDefs": [{"className": "hidden-xs", "aTargets": [2]}],
            "sAjaxSource": '${pageContext.request.contextPath}/med/broadcast/user/json',
            "aoColumns": [
                {"mData": "fname"},
                {"mData": "email"},
                {"mData": null, "bSortable": false, "mRender": function (o) {
                        return "<a href='#' target='_blank'>Блокировать</a>";
                    }
                }
            ]
        });
    });

</script>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Вебинары</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список вебинаров
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">                    
                    <table class="table table-hover">
                        <thead></thead>
                        <tbody>
                            <c:forEach items="${brdcList}" var="brdc" >
                                <tr>                                    
                                    <td>
                                        <c:out value="${brdc.loginURL}" />

                                        ${brdc.description}

                                    </td>
                                    <td>
                                        <button type="button" class="btn btn-primary btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/video/start/${brdc.meetingID}'" >
                                            <spring:message code="label.brdcstart" />
                                        </button> 
                                        <button type="button" class="btn btn-info btn-xs btn-block" onClick="window.location = '${brdc.loginURL}'" >
                                            <spring:message code="label.brdcjoinUrl" />
                                        </button>                                         
                                    </td>
                                </tr>
                            </c:forEach>   
                        </tbody>
                    </table>
                </div>
                <!-- /.table-responsive -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-6 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Управление
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <!-- Nav tabs -->
                <ul class="nav nav-pills">
                    <li class="active"><a href="#home-pills" data-toggle="tab" aria-expanded="true">Записи</a>
                    </li>
                    <li class=""><a href="#profile-pills" data-toggle="tab" aria-expanded="false">Участники</a>
                    </li>
                    <li class=""><a href="#messages-pills" data-toggle="tab" aria-expanded="false">Расписание</a>
                    </li>                                
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div class="tab-pane fade active in" id="home-pills">
                        <h4>Записи</h4>
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables" width="100%">
                                <thead>
                                    <tr>
                                        <th>№</th>
                                        <th>Название</th>
                                        <th class="hidden-xs">Начало</th>
                                        <th class="hidden-xs">Просмотр</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <div class="tab-pane fade" id="profile-pills">
                        <h4>Участники</h4>
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTablesUser" width="100%">
                                <thead>
                                    <tr>
                                        <th>Ф.И.О.</th>
                                        <th class="hidden-xs">Email</th>
                                        <th class="hidden-xs">Блокировать</th>
                                    </tr>
                                </thead>
                                <tbody>

                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="tab-pane fade" id="messages-pills">
                        <h4>Расписание</h4>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                    </div>                                
                </div>
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->


