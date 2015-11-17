<%-- 
    Document   : print
    Created on : Oct 8, 2015, 8:17:00 PM
    Author     : kvo
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Электролиты</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Анализ выполнен на анализаторе "Swelab Alfa 3-diff"
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">
                        <thead>
                            <tr>
                                <th rowspan="2">Показатель</th>
                                <th rowspan="2">Значение</th>
                                <th rowspan="2">Ед.измр.</th>
                                <th colspan="2">Нормы</th>
                            </tr>
                            
                        </thead>
                        <tbody>
                            <tr>
                                <td>Калий</td>
                                <td>${GBA.kalij}</td>
                                <td>ммоль/л</td>
                                <td>3,5-5,5</td>
                            </tr> 
                            <tr>
                                <td>Кальций</td>
                                <td>${GBA.kalCij}</td>
                                <td>ммоль/л</td>
                                <td>2,15-2,70</td>
                            </tr> 
                            <tr>
                                <td>Натрий</td>
                                <td>${GBA.natrij}</td>
                                <td>ммоль/л</td>
                                <td>130-145</td>
                            </tr> 

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
