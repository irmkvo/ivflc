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
        <h1 class="page-header">Общий анализ крови</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-10">
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
                                <th colspan="2">Ед.измр.</th>
                            </tr>
                            <tr>
                                <th>Муж.</th>
                                <th>Жен.</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Эритроциты</td>
                                <td>${GBA.eritrocit}</td>
                                <td>10 12/л</td>
                                <td>4,0-5,0</td>
                                <td>3,9-4,7</td>
                            </tr> 
                            <tr>
                                <td>Гемоглобин</td>
                                <td>${GBA.gemoglobin}</td>
                                <td></td>
                                <td>130,0-160,0</td>
                                <td>120,0-140,0</td>
                            </tr>
                            <tr>
                                <td>Цветной показатель</td>
                                <td>${GBA.cvetnojPokazatel}</td>
                                <td></td>
                                <td colspan="2">0,85-1,05</td>
                            </tr>
                            <tr>
                                <td>Лейкоциты</td>
                                <td>${GBA.lejkocit}</td>
                                <td>10 9/л</td>
                                <td colspan="2">4,0-9,0</td>
                            </tr>
                            <tr>
                                <td>Гранулоциты</td>
                                <td>${GBA.granulocit}</td>
                                <td>%</td>
                                <td colspan="2">48-82</td>
                            </tr>
                            <tr>
                                <td>Моноциты</td>
                                <td>${GBA.monocit}</td>
                                <td>%</td>
                                <td colspan="2">2-9(0,09-0,60)</td>
                            </tr>
                            <tr>
                                <td>Лимфоциты</td>
                                <td>${GBA.limfocit}</td>
                                <td>%</td>
                                <td colspan="2">18-40(1,20-3,00)</td>
                            </tr>
                            <tr>
                                <td>Тромбоциты</td>
                                <td>${GBA.trombocT}</td>
                                <td>10 9/л</td>
                                <td colspan="2">180-320</td>
                            </tr>
                            <tr>
                                <td>СОЭ</td>
                                <td>${GBA.soe}</td>
                                <td>мм/час</td>
                                <td>2-10</td>
                                <td>2-15</td>
                            </tr>
                            <tr>
                                <td>Гематокритное число</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>%</td>
                                <td>40-48</td>
                                <td>36-42</td>
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
