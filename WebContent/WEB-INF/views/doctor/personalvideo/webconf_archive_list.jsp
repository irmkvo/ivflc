<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Записи</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                ${confName}
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">                    
                    <table class="table table-hover">
                        <thead>
                            <th>№</th>
                            <th>Название</th>
                            <th class="hidden-xs">Начало</th>
                            <th class="hidden-xs">Просмотр</th>
                        </thead>
                        <tbody>
                            <c:forEach items="${brdcArchive}" var="brdc" >
                                <tr>                                    
                                    <td>
                                        ${brdc.recordID}
                                    </td>
                                    <td>
                                        ${brdc.name}
                                    </td>
                                    <td>
                                        ${brdc.starttime}
                                    </td>
                                    <td>
                                        <a href='http://my.ivf.kz/playback/presentation/0.9.0/playback.html?meetingId=${brdc.recordID}' target='_blank'>Просмотр</a>
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


