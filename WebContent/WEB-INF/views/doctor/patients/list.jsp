<%-- 
    Document   : list
    Created on : Nov 13, 2015, 1:41:18 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

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
            var myTable = $('#dataTables').dataTable({
                "responsive": true,
                "bProcessing": true,
                "bServerSide": true,
                "sort": "position",
                "bStateSave": false,
                "iDisplayLength": 50,
                "iDisplayStart": 0,
                "fnDrawCallback": function () {
                    //Get page numer on client. Please note: number start from 0 So
                    //for the first page you will see 0 second page 1 third page 2...
                    //Un-comment below alert to see page number
                        //alert("Current page number: "+this.fnPagingInfo().iPage);    
                },
                "language": {
                "url": "${pageContext.request.contextPath}/resources/template/default/bower_components/datatables/locale/dataTables.russian.lang"},
                "columnDefs": [{ "className": "hidden-xs", "aTargets": [2] }],
                "sAjaxSource": '${pageContext.request.contextPath}/med/patients/json',
                "fnServerData": fnServerObjectToArray(['patId', 'fio', 'bDate', 'type'])
            });
            $("#dataTables tbody").on('click', 'tr',function(event){
                var id = myTable.fnGetData(this)[0];
                window.location = '${pageContext.request.contextPath}/med/patients/info/' + id;
                console.log(id);
            });
        });
            
</script>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Пациенты</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Список пациентов
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <table class="table table-striped table-bordered table-hover dataTable no-footer" style="cursor:pointer" id="dataTables" width="100%">
                        <thead>
                            <tr>
                                <th>Номер ЭМК</th>
                                <th>Ф.И.О.</th>
                                <th>Дата рождения</th>
                                <th>Пациент-донор</th>
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
