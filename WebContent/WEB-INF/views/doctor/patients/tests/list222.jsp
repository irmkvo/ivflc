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
<c:if test="${DATAS222_1 != null}">
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
                                    <td>${DATAS222_1.eritrocit}</td>
                                    <td>10 12/л</td>
                                    <td>4,0-5,0</td>
                                    <td>3,9-4,7</td>
                                </tr> 
                                <tr>
                                    <td>Гемоглобин</td>
                                    <td>${DATAS222_1.gemoglobin}</td>
                                    <td></td>
                                    <td>130,0-160,0</td>
                                    <td>120,0-140,0</td>
                                </tr>
                                <tr>
                                    <td>Цветной показатель</td>
                                    <td>${DATAS222_1.cvetnojPokazatel}</td>
                                    <td></td>
                                    <td colspan="2">0,85-1,05</td>
                                </tr>
                                <tr>
                                    <td>Лейкоциты</td>
                                    <td>${DATAS222_1.lejkocit}</td>
                                    <td>10 9/л</td>
                                    <td colspan="2">4,0-9,0</td>
                                </tr>
                                <tr>
                                    <td>Гранулоциты</td>
                                    <td>${DATAS222_1.granulocit}</td>
                                    <td>%</td>
                                    <td colspan="2">48-82</td>
                                </tr>
                                <tr>
                                    <td>Моноциты</td>
                                    <td>${DATAS222_1.monocit}</td>
                                    <td>%</td>
                                    <td colspan="2">2-9(0,09-0,60)</td>
                                </tr>
                                <tr>
                                    <td>Лимфоциты</td>
                                    <td>${DATAS222_1.limfocit}</td>
                                    <td>%</td>
                                    <td colspan="2">18-40(1,20-3,00)</td>
                                </tr>
                                <tr>
                                    <td>Тромбоциты</td>
                                    <td>${DATAS222_1.trombocT}</td>
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
                                    <td>${DATAS222_1.gemotokritnoeHislo}</td>
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
</c:if>
<c:if test="${DATAS222_2 != null}">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Анализ мочи по Зимницкому</h1>
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
                        <div class="col-lg-6">
                            <table class="table table-striped table-bordered table-hover" width="100%">

                                <thead>

                                    <tr>
                                        <th>Порций</th>
                                        <th>Кол-в в мл</th>
                                        <th>Удельный вес</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>${DATAS222_2.poZimnickomuKol1}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes1}</td>
                                    </tr> 
                                    <tr>
                                        <td>2</td>
                                        <td>${DATAS222_2.poZimnickomuKol2}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes2}</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>${DATAS222_2.poZimnickomuKol3}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes3}</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>${DATAS222_2.poZimnickomuKol4}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes4}</td>
                                    </tr>
                                    <tr>
                                        <td>5</td>
                                        <td>${DATAS222_2.poZimnickomuKol5}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes5}</td>
                                    </tr>
                                    <tr>
                                        <td>6</td>
                                        <td>${DATAS222_2.poZimnickomuKol6}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes6}</td>
                                    </tr>
                                    <tr>
                                        <td>7</td>
                                        <td>${DATAS222_2.poZimnickomuKol7}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes7}</td>
                                    </tr>
                                    <tr>
                                        <td>8</td>
                                        <td>${DATAS222_2.poZimnickomuKol8}</td>
                                        <td>${DATAS222_2.poZimnickomuUdVes8}</td>
                                    </tr>
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
</c:if>
<c:if test="${DATAS222_3 != null}">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Биохимический полный анализ крови (БХК)</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div class="row">

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
                                        <td>${DATAS222_3.obhijBelok}</td>
                                    <td>г/л</td>
                                    <td>65-85</td>
                                </tr> 
                                <tr>
                                    <td>Альбумин</td>
                                    <td>${DATAS222_3.alBumin}</td>
                                    <td>г/л</td>
                                    <td>35-82</td>
                                </tr> 
                                <tr>
                                    <td>Мочевина</td>
                                    <td>${DATAS222_3.mohevina}</td>
                                    <td>ммоль/л</td>
                                    <td>2.33-8.32</td>
                                </tr> 
                                <tr>
                                    <td>Креатинин</td>
                                    <td>${DATAS222_3.kreatinin}</td>
                                    <td>ммоль/л</td>
                                    <td>53-97 (80-115)</td>
                                </tr>
                                <tr>
                                    <td>Мочевая кислота</td>
                                    <td>${DATAS222_3.mohevaqKislota}</td>
                                    <td>мкмоль/л</td>
                                    <td>53-97 (80-115)</td>
                                </tr>
                                <tr>
                                    <td>Глюкоза</td>
                                    <td>${DATAS222_3.glykoza}</td>
                                    <td>мкмоль/л</td>
                                    <td>3,05-5,6</td>
                                </tr>
                                <tr>
                                    <td>АлаТ</td>
                                    <td>${DATAS222_3.alat}</td>
                                    <td>МЕ/л</td>
                                    <td>до 45</td>
                                </tr>
                                <tr>
                                    <td>АсаТ</td>
                                    <td>${DATAS222_3.asat}</td>
                                    <td>МЕ/л</td>
                                    <td>до 40</td>
                                </tr>
                                <tr>
                                    <td>Билирубин (общий)</td>
                                    <td>${DATAS222_3.bilirubinObhij}</td>
                                    <td>мкмоль/л</td>
                                    <td>3,4-22,2</td>
                                </tr>
                                <tr>
                                    <td>Билирубин (прямой)</td>
                                    <td>${DATAS222_3.bilirubinPrqmoj}</td>
                                    <td>мкмоль/л</td>
                                    <td>до 5,1</td>
                                </tr>
                                <tr>
                                    <td>Билирубин (непрямой)</td>
                                    <td>${DATAS222_3.bilirubinNeprqmoj}</td>
                                    <td>мкмоль/л</td>
                                    <td>до 17,1</td>
                                </tr>
                                <tr>
                                    <td>Холестерин</td>
                                    <td>${DATAS222_3.folesterin}</td>
                                    <td>мкмоль/л</td>
                                    <td>до 5,20</td>
                                </tr>
                                <tr>
                                    <td>Щелочная фосфотаза</td>
                                    <td>${DATAS222_3.helohnaqFosfotaza}</td>
                                    <td>ед/л</td>
                                    <td>до 240 (до 270)</td>
                                </tr>
                                <tr>
                                    <td>Триглецериды</td>
                                    <td>${DATAS222_3.triglicerid}</td>
                                    <td>ммоль/л</td>
                                    <td>0,47-2,36</td>
                                </tr>
                                <tr>
                                    <td>ГГТ</td>
                                    <td>${DATAS222_3.ggt}</td>
                                    <td>ед/л</td>
                                    <td>до 32 (до 49)</td>
                                </tr>
                                <tr>
                                    <td>Сывороточное <br> железо</td>
                                    <td>${DATAS222_3.svorotohnoeGelezo}</td>
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
</c:if>
<c:if test="${DATAS222_4 != null}">
    НЕТ ШАБЛОНА
</c:if>
    <c:if test="${DATAS222_5 != null}">
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
                                            <td>${DATAS222_5.lejkocit}</td>
                                            <td>до 4000 в 1 мл</td>
                                        </tr> 
                                        <tr>
                                            <td>Эритроциты</td>
                                            <td>${DATAS222_5.eritrocit}</td>
                                            <td>до 1000 в 1 мл</td>
                                        </tr> 
                                        <tr>
                                            <td>Цилиндры</td>
                                            <td>${DATAS222_5.cilindr}</td>
                                            <td>до 20 в 1 мл</td>
                                        </tr> 
                                        <tr>
                                            <td>Бактерии</td>
                                            <td>${DATAS222_5.bakterii}</td>
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
        </c:if>
    <c:if test="${DATAS222_6 != null}">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Коагулограмма</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <div class="row"> 
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
                                        <td>${DATAS222_6.vremqSvertVaniqPoSuA}</td>
                                        <td>10 12/л</td>
                                        <td>4,0-5,0</td>
                                    </tr> 
                                    <tr>
                                        <td>АЧТВ<br>(актив. част. тромб. время)</td>
                                        <td>${DATAS222_6.ahtvAktivHastTrombVre}</td>
                                        <td>сек</td>
                                        <td>28-38</td>
                                    </tr> 
                                    <tr>
                                        <td>Тромбиновое время</td>
                                        <td>${DATAS222_6.trombinovoeVremqTv}</td>
                                        <td>сек</td>
                                        <td>15-18</td>
                                    </tr> 
                                    <tr>
                                        <td>Протромбиновое время</td>
                                        <td>${DATAS222_6.protrombinovoeVremq}</td>
                                        <td>сек</td>
                                        <td>13-18</td>
                                    </tr>   <tr>
                                        <td>МНО</td>
                                        <td>${DATAS222_6.mno}</td>
                                        <td> </td>
                                        <td>0,8-1,14</td>
                                    </tr> 
                                    <tr>
                                        <td>Протромбиновое время<br>% по Квику  </td>
                                        <td>${DATAS222_6.protrombinovoeVremqPoK}</td>
                                        <td>%</td>
                                        <td>Более 70</td>
                                    </tr> 
                                    <tr>
                                        <td>Фибриноген <br>(по Клауссу)  </td>
                                        <td>${DATAS222_6.fibrinogenPoKlaussu}</td>
                                        <td>г/л</td>
                                        <td>2-4
                                            <br>I тр 2,3-5,0
                                            <br>II тр 2,4-5,1
                                            <br>III тр 3,7-6,2
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td>РФМК</td>
                                        <td>${DATAS222_6.rfmk}</td>
                                        <td></td>
                                        <td>3,38-4,0
                                            <br>I тр до 7
                                            <br>II тр до 9
                                            <br>III тр до 11
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td>Д-димер </td>
                                        <td>${DATAS222_6.ddimer}</td>
                                        <td>нг/мл</td>
                                        <td>
                                            I тр до 250
                                            <br>II тр до 550
                                            <br>III тр до 1050
                                        </td>
                                    </tr> 
                                    <tr>
                                        <td>Скрининг на ВА </td>
                                        <td>${DATAS222_6.skrinningVolhanohnJ}</td>
                                        <td>сек</td>
                                        <td>25,6-41,8</td>
                                    </tr>
                                    <tr>
                                        <td>Подтверждение на ВА </td>
                                        <td>${DATAS222_6.podtvergdenieVolhanohnJ}</td>
                                        <td>сек</td>
                                        <td>26,4-38,4</td>
                                    </tr>
                                    <tr>
                                        <td>Отношение скрининга на<br>подтверждение ВА </td>
                                        <td>${DATAS222_6.volhanAntikoagul}</td>
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
    </c:if>
    <c:if test="${DATAS222_7 != null}">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Кровь на сахар</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <div class="row">   
            <div class="col-lg-5">
                <div class="panel panel-default">
                    <div class="panel-heading">Дата анализа: ${DATAS222_7.dataAnaliza}
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover" width="100%">
                                <thead>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>Результат</td>
                                        <td>${DATAS222_7.krovNaSaAr}</td>
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
    </c:if>
    <c:if test="${DATAS222_8 != null}">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Электролиты</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <div class="row">
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
                                        <td>${DATAS222_8.kalij}</td>
                                        <td>ммоль/л</td>
                                        <td>3,5-5,5</td>
                                    </tr> 
                                    <tr>
                                        <td>Кальций</td>
                                        <td>${DATAS222_8.kalCij}</td>
                                        <td>ммоль/л</td>
                                        <td>2,15-2,70</td>
                                    </tr> 
                                    <tr>
                                        <td>Натрий</td>
                                        <td>${DATAS222_8.natrij}</td>
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
    </c:if>
