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
        <h1 class="page-header">Анализ мочи по Нечипоренко</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
              
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">
                        <thead>
                            <tr>
                                <th rowspan="2">Показатель</th>
                                <th rowspan="2">Результат</th>
                                <th rowspan="2">НОРМА</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Лейкоциты</td>
                                <td>${GBA.lejkocit}</td>
                                <td>до 4000 в 1 мл</td>
                            </tr> 
                            <tr>
                                <td>Эритроциты</td>
                                <td>${GBA.eritrocit}</td>
                                <td>до 1000 в 1 мл</td>
                            </tr> 
                            <tr>
                                <td>Цилиндры</td>
                                <td>${GBA.cilindr}</td>
                                <td>до 20 в 1 мл</td>
                            </tr> 
                            <tr>
                                <td>Бактерии</td>
                                <td>${GBA.bakterii}</td>
                                <td> </td>
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
