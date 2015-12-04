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
        <h1 class="page-header">Гормон ХГЧ</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
    <div class="col-lg-8">
        <div class="panel panel-default">
            <div class="panel-heading">
                Анализ выполнен на анализаторе 
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">
                        <thead>
                            <tr>
                                <th rowspan="2">Значение</th>
                                <th rowspan="2">Ед. измерения</th>
                                <th rowspan="2">Значение нормы<br> 0-5 МЕ/л</th>
                                <th colspan="2">Нормы для беременных</th>
                            </tr>
                            <tr>
                                <th>срок беременности</th>
                                <th>кол-во ХГЧ</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td rowspan="8">${GBA.fgh}</td>
                                <td rowspan="8">МЕ/л</td>
                                <td rowspan="8">Пограничное <br>значение 5-10 МЕ/л</td>
                                <td >1 нед.</td>
                                <td>до 50</td>
                            </tr> 
                            <tr>
                                <td>2 нед.</td>
                                <td>до 400</td>
                            </tr>
                            <tr>
                                <td>3 нед.</td>
                                <td>1000-4000</td>
                            </tr>
                            <tr>
                                <td>4 нед.</td>
                                <td>1000-20000</td>
                            </tr>
                            <tr>
                                <td>5-8 нед.</td>
                                <td>40000-130000</td>
                            </tr>
                            <tr>
                                <td>9-12 нед.</td>
                                <td>40000-200000</td>
                            </tr>
                            <tr>
                                <td>13-24 нед.</td>
                                <td>7000-120000</td>
                            </tr>
                            <tr>
                                <td>25-40 нед.</td>
                                <td>1000-80000</td>
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
