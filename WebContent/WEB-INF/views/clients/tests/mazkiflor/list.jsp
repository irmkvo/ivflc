<%-- 
    Document   : index
    Created on : 12.02.2015, 11:35:22
    Author     : Kimboo
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- DataTables JavaScript -->
<script src="${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/template/default/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

<script type="text/javascript">    
    fnServerObjectToArray = function ( aElements )
{
    return function ( sSource, aoData, fnCallback ) {
        $.ajax( {
            "dataType": 'json',
            "type": "POST",
            "url": sSource,
            "data": aoData,
            "success": function (json) {
                var a = [];
                for ( var i=0, iLen=json.aaData.length ; i<iLen ; i++ ) {
                    var inner = [];
                    for ( var j=0, jLen=aElements.length ; j<jLen ; j++ ) {
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
                "bProcessing": true,
                "responsive": true,
                "language": {
                "url": "${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/locale/dataTables.russian.lang"},
                "columnDefs": [{ "className": "hidden-xs", "aTargets": [2] }],
                "sAjaxSource": '${pageContext.request.contextPath}/mazok-flora/json/${modelId}',
                            "aoColumns": [
                                {"mData": "dateConsultation"},
                                    {"mData": "module"},
                                    {"mData": "medecins"},
                                    {"mData": null, "bSortable": false, "mRender": function (o) {
                                            return '<a href="${pageContext.request.contextPath}/mazok-flora/print/' + o.motconsuId + '">' + 'Подробно' + '</a>';
                                            }
                                    }
                                    ]
                            });
                            });
            
</script>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Лист анализов</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Анализы
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <table class="table table-striped table-hover" id="dataTables" width="100%">
                        <thead>
                            <tr>
                                <th>Дата приема</th>
                                <th>Описание</th>
                                <th class="hidden-xs">Врач</th>
                                <th>Печать</th>
                            </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
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
