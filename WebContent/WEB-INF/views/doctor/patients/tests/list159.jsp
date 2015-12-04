<%-- 
    Document   : list159
    Created on : Dec 2, 2015, 5:49:19 PM
    Author     : kvo
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">ЭКО лаборатория SPERMA</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Сперма секрет простаты
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
                            <c:forEach items="${DATAS159}" var="DATA159" >
                                <tr>
                                    <td>
                                        
                                    </td>
                                    <td>
                                        <c:out value="${DATA159.pagetitle}" />
                                    </td>
                                    <td class="hidden-xs">
                                        <c:out value="${DATA159.pagetitle}" />
                                    </td>
                                    <td>
                                        <c:out value="${DATA159.pagetitle}" />
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
        <div class="panel panel-default">
            <div class="panel-heading">
                Мазки флоры
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
        <div class="panel panel-default">
            <div class="panel-heading">
                Мазки проба Шуварского
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
