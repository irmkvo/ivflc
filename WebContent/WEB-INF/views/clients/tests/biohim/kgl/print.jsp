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
        <h1 class="page-header">Коагулограмма</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">

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
                                <td>Время свертываемости <br>по Сухареву</td>
                                <td>${GBA.vremqSvertVaniqPoSuA}</td>
                                <td>10 12/л</td>
                                <td>4,0-5,0</td>
                            </tr> 
                            <tr>
                                <td>АЧТВ<br>(актив. част. тромб. время)</td>
                                <td>${GBA.ahtvAktivHastTrombVre}</td>
                                <td>сек</td>
                                <td>28-38</td>
                            </tr> 
                            <tr>
                                <td>Тромбиновое время</td>
                                <td>${GBA.trombinovoeVremqTv}</td>
                                <td>сек</td>
                                <td>15-18</td>
                            </tr> 
                            <tr>
                                <td>Протромбиновое время</td>
                                <td>${GBA.protrombinovoeVremq}</td>
                                <td>сек</td>
                                <td>13-18</td>
                            </tr>   <tr>
                                <td>МНО</td>
                                <td>${GBA.mno}</td>
                                <td> </td>
                                <td>0,8-1,14</td>
                            </tr> 
                            <tr>
                                <td>Протромбиновое время<br>% по Квику  </td>
                                <td>${GBA.protrombinovoeVremqPoK}</td>
                                <td>%</td>
                                <td>Более 70</td>
                            </tr> 
                            <tr>
                                <td>Фибриноген <br>(по Клауссу)  </td>
                                <td>${GBA.fibrinogenPoKlaussu}</td>
                                <td>г/л</td>
                                <td>2-4
                                    <br>I тр 2,3-5,0
                                    <br>II тр 2,4-5,1
                                    <br>III тр 3,7-6,2
                                </td>
                            </tr> 
                            <tr>
                                <td>РФМК</td>
                                <td>${GBA.rfmk}</td>
                                <td></td>
                                <td>3,38-4,0
                                    <br>I тр до 7
                                    <br>II тр до 9
                                    <br>III тр до 11
                                </td>
                            </tr> 
                            <tr>
                                <td>Д-димер </td>
                                <td>${GBA.ddimer}</td>
                                <td>нг/мл</td>
                                <td>
                                    I тр до 250
                                    <br>II тр до 550
                                    <br>III тр до 1050
                                </td>
                            </tr> 
                            <tr>
                                <td>Скрининг на ВА </td>
                                <td>${GBA.skrinningVolhanohnJ}</td>
                                <td>сек</td>
                                <td>25,6-41,8</td>
                            </tr>
                            <tr>
                                <td>Подтверждение на ВА </td>
                                <td>${GBA.podtvergdenieVolhanohnJ}</td>
                                <td>сек</td>
                                <td>26,4-38,4</td>
                            </tr>
                            <tr>
                                <td>Отношение скрининга на<br>подтверждение ВА </td>
                                <td>${GBA.volhanAntikoagul}</td>
                                <td> </td>
                                <td> <1.2 не обнаружен
                                    <br><1.5 эффект слабо выражен
                                    <br><2.0 эффект умеренно выражен
                                    <br>>2.0 эффект сильно выражен
                                </td>
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
