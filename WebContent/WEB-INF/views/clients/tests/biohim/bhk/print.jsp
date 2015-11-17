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
        <h1 class="page-header">Биохимический полный анализ крови (БХК)</h1>
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
                                <th rowspan="2">Показатель</th>
                                <th rowspan="2">Значение</th>
                                <th rowspan="2">Ед.измр.</th>
                                <th colspan="2">Нормы</th>
                            </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td>Общий белок</td>
                                <td>${GBA.obhijBelok}</td>
                                <td>г/л</td>
                                <td>65-85</td>
                            </tr> 
                            <tr>
                                <td>Альбумин</td>
                                <td>${GBA.alBumin}</td>
                                <td>г/л</td>
                                <td>35-82</td>
                            </tr> 
                            <tr>
                                <td>Мочевина</td>
                                <td>${GBA.mohevina}</td>
                                <td>ммоль/л</td>
                                <td>2.33-8.32</td>
                            </tr> 
                            <tr>
                                <td>Креатинин</td>
                                <td>${GBA.kreatinin}</td>
                                <td>ммоль/л</td>
                                <td>53-97 (80-115)</td>
                            </tr>
                            <tr>
                                <td>Мочевая кислота</td>
                                <td>${GBA.mohevaqKislota}</td>
                                <td>мкмоль/л</td>
                                <td>53-97 (80-115)</td>
                            </tr>
                            <tr>
                                <td>Глюкоза</td>
                                <td>${GBA.glykoza}</td>
                                <td>мкмоль/л</td>
                                <td>3,05-5,6</td>
                            </tr>
                            <tr>
                                <td>АлаТ</td>
                                <td>${GBA.alat}</td>
                                <td>МЕ/л</td>
                                <td>до 45</td>
                            </tr>
                            <tr>
                                <td>АсаТ</td>
                                <td>${GBA.asat}</td>
                                <td>МЕ/л</td>
                                <td>до 40</td>
                            </tr>
                            <tr>
                                <td>Билирубин (общий)</td>
                                <td>${GBA.bilirubinObhij}</td>
                                <td>мкмоль/л</td>
                                <td>3,4-22,2</td>
                            </tr>
                            <tr>
                                <td>Билирубин (прямой)</td>
                                <td>${GBA.bilirubinPrqmoj}</td>
                                <td>мкмоль/л</td>
                                <td>до 5,1</td>
                            </tr>
                            <tr>
                                <td>Билирубин (непрямой)</td>
                                <td>${GBA.bilirubinNeprqmoj}</td>
                                <td>мкмоль/л</td>
                                <td>до 17,1</td>
                            </tr>
                            <tr>
                                <td>Холестерин</td>
                                <td>${GBA1.fOlesterin}</td>
                                <td>мкмоль/л</td>
                                <td>до 5,20</td>
                            </tr>
                            <tr>
                                <td>Щелочная фосфотаза</td>
                                <td>${GBA.helohnaqFosfotaza}</td>
                                <td>ед/л</td>
                                <td>до 240 (до 270)</td>
                            </tr>
                            <tr>
                                <td>Триглецериды</td>
                                <td>${GBA.triglicerid}</td>
                                <td>ммоль/л</td>
                                <td>0,47-2,36</td>
                            </tr>
                            <tr>
                                <td>ГГТ</td>
                                <td>${GBA.ggt}</td>
                                <td>ед/л</td>
                                <td>до 32 (до 49)</td>
                            </tr>
                            <tr>
                                <td>Сывороточное <br> железо</td>
                                <td>${GBA1.sVorotohnoeGelezo}</td>
                                <td>мкмоль/л</td>
                                <td>10,4-33,6</td>
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
