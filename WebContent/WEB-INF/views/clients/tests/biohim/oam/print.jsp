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

    <div class="col-lg-10">

        <h1 class="page-header">Общий анализ мочи</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
    <%@include file="header1.jsp" %>
    <div class="col-lg-10">
        <div class="panel panel-default">
            
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <div class="col-lg-5">
                        <table class="table table-striped table-bordered table-hover" width="100%">

                            <thead>
                                <tr>
                                    <th colspan="2">Физико-химические свойства</th>
                                </tr>
                                <tr>
                                    <th>Показатель</th>
                                    <th>Значение</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Количество</td>
                                    <td>${GBA.kolihestvo}</td>
                                </tr> 
                                <tr>
                                    <td>Цвет</td>
                                    <td>${GBA.cvet}</td>
                                </tr> 
                                <tr>
                                    <td>Относительная<br>плотность</td>
                                    <td>${GBA.otnositelNaqPlotnost}</td>
                                </tr>
                                <tr>
                                    <td>Прозрачность</td>
                                    <td>${GBA.prozrahnost}</td>
                                </tr>
                                <tr>
                                    <td>pH</td>
                                    <td>${GBA.reakciq}</td>
                                </tr>
                                <tr>
                                    <td>Белок</td>
                                    <td>${GBA.belok}</td>
                                </tr>
                                <tr>
                                    <td>Глюкоза</td>
                                    <td>${GBA.glykoza}</td>
                                </tr>
                                <tr>
                                    <td>Билирубин</td>
                                    <td>${GBA.blirubin}</td>
                                </tr>
                                <tr>
                                    <td>Уробилиноиды</td>
                                    <td>${GBA.urobilinoid}</td>
                                </tr>
                                <tr>
                                    <td>Кетон</td>
                                    <td>${GBA.keton}</td>
                                </tr>
                            </tbody>

                        </table>
                    </div>  
                    <div class="col-lg-5">
                        <table class="table table-striped table-bordered table-hover" width="100%">

                            <thead>
                                <tr>
                                    <th colspan="2">Микроскопия осадка</th>
                                </tr>
                                <tr>
                                    <th>Показатель</th>
                                    <th>Значение</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr><th colspan="2">Эпителий</th></tr>
                                <tr>
                                    <td>Плоский</td>
                                    <td>${GBA.poloskiEpitelij}</td>
                                </tr> 
                                <tr>
                                    <td>Переходный</td>
                                    <td>${GBA.epitelijPereOdnJ}</td>
                                </tr> 
                                <tr><th colspan="1">Лейкоциты</th><td>${GBA.lejkocit}</td></tr>
                                <tr>
                                <tr><th colspan="2">Эритроциты</th></tr>
                            <td>Неизмененны</td>        
                            <td>${GBA.eritrocit}</td>
                            </tr>
                            <tr>
                                <td>Измененные</td>
                                <td>${GBA.eritrocitIzmenennE}</td>
                            </tr>

                            <tr><th colspan="2">Цилиндры</th></tr>
                            <tr>
                                <td>Гиалиновые</td>
                                <td>${GBA.cilindr}</td>
                            </tr>
                            <tr>
                                <td>Зернистые</td>
                                <td>${GBA.cilindrZernistE}</td>
                            </tr>
                            <tr><th colspan="1">Слизь</th><td>${GBA.sliz}</td></tr>
                            <tr><th colspan="1">Соли</th><td>${GBA.coli}</td></tr>
                            <tr><th colspan="1">Бактерии</th><td>${GBA.bakterii}</td></tr>
                            </tbody>

                        </table>
                    </div>

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
