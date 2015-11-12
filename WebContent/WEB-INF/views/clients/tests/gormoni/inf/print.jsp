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
        <h1 class="page-header">Гормон инфекции</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-12">
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
                                <th rowspan="1">Тип инфекции</th>
                                <th rowspan="1">Результат</th>
                                <th rowspan="1">Оптическая плотность<br>образца</th>
                                <th colspan="1">Критическая величина<br>(cut-off)</th>
                            </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td>Токсоплазма lgM</td>
                                <td>${GBA.mikoplazmaG}</td>
                                <td>${GBA.mikoplazmaG12}</td>
                                <td>1</td>
                            </tr> 
                            <tr>
                                <td>Токсоплазма lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr> 
                            <tr>
                                <td>ВПГ lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 1 lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 2 lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr> 
                            <tr>
                                <td>Краснуха lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Краснуха lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Микоплазма lgM</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Микоплазма lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Бруцелез lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
                            </tr>
                            <tr>
                                <td>Листериоз lgG</td>
                                <td>1</td>
                                <td>1</td>
                                <td>1</td>
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
