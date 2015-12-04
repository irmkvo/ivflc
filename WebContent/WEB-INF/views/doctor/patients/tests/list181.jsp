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
<c:if test="${DATAS181_1 != null}">
    <div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Гормоны</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
    <div class="col-lg-10">
        <div class="panel panel-default">
            <div class="panel-heading">
                Гормоны                
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
                                <th colspan="3">Нормы</th>
                            </tr>
                            <tr>
                                <th>Муж.</th>
                                <th>Жен.</th>
                                <th>Беременные</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Пролактин</td>
                                <td>${DATAS181_1.prolaktin}</td>
                                <td>мМЕ/л</td>
                                <td>73-764</td>
                                <td>28-636</td>
                                <td>1тр = 365-9500</td>
                            </tr> 
                            <tr>
                                <td>ЛГ</td>
                                <td>${DATAS181_1.kortizol}</td>
                                <td>мМЕ/л</td>
                                <td> <20 </td>
                                <td>1-13</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>ФСГ</td>
                                <td>${DATAS181_1.fsg}</td>
                                <td> МЕ/л</td>
                                <td >2-10</td>
                                <td >2-10</td>
                            </tr>
                            <tr>
                                <td>Эстрадиол</td>
                                <td>${DATAS181_1.estradiol}</td>
                                <td> пМ/л</td>
                                <td>47,7-701</td>
                                <td> 36,7-400</td>
                                <td> 1тр = 1020-13270</td>
                            </tr>
                            <tr>
                                <td>Прогестерон</td>
                                <td>${DATAS181_1.progesteron}</td>
                                <td>нМ/л</td>
                                <td>1Ф = 0,2-4,0<br>2Ф = 6-80 </td>
                                <td>0.32-3.2</td>      
                                <td>5-16 нед=38-205</td>
                            </tr>
                            <tr>
                                <td>Тестостерон</td>
                                <td>${DATAS181_1.testosteron}</td>
                                <td>нМ/л</td>
                                <td>0,2-3,0</td>
                                <td>12-30</td>
                                <td>0,2-3,0</td>

                            </tr>
                            <tr>
                                <td>DHEA-S</td>
                                <td>${DATAS181_1.degidroepiandrosteron}</td>
                                <td>мкг/мл</td>
                                <td>0,4-2,7</td>
                                <td>0,6-2,7</td>
                                <td>0,2-1,2</td>

                            </tr>
                            <tr>
                                <td>Кортизол</td>
                                <td>${DATAS181_1.kortizol}</td>
                                <td>нМ/л</td>
                                <td>138-635</td>
                                <td>138-635</td>
                                <td>1тр=163-1230</td>

                            </tr>
                            <tr>
                                <td>Т3 общий</td>
                                <td>${DATAS181_1.t3Obhij}</td>
                                <td>нМ/л</td>
                                <td>1-2,5</td>
                                <td>1-2,5</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>Т4 общий</td>
                                <td>${DATAS181_1.t4Obhij}</td>
                                <td>нМ/л</td>
                                <td>65-160</td>
                                <td>65-160</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>ТТГ</td>
                                <td>${DATAS181_1.ttg}</td>
                                <td>МЕ/л</td>
                                <td>0,24-4,0</td>
                                <td>0,24-4,0</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>АтТПО</td>
                                <td>${DATAS181_1.aTKHG}</td>
                                <td>Ед/мл</td>
                                <td>0-30</td>
                                <td>0-30</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>АтТГ-1</td>
                                <td>${DATAS181_1.atKTg}</td>
                                <td>Ед/мл</td>
                                <td>0-100</td>
                                <td>0-100</td>
                                <td></td>
                            </tr>
                              <tr>
                                <td>FT3</td>
                                <td>${DATAS181_1.t3Obhij}</td>
                                <td>пг/мл</td>
                                <td>1,4-4,2</td>
                                <td>1,4-4,2</td>
                                <td></td>
                            </tr>
                            
                              <tr>
                                <td>FT4</td>
                                <td>${DATAS181_1.t4Obhij}</td>
                                <td>нг/дл</td>
                                <td>0,8-2,0</td>
                                <td>0,8-2,0</td>
                                <td></td>
                            </tr>
                            
                              <tr>
                                <td>СА-125</td>
                                <td>${DATAS181_1.sa125}</td>
                                <td>ЕД/мл</td>
                                <td>0-40</td>
                                <td></td>
                                <td></td>
                            </tr>

                              <tr>
                                <td>Антимюллеровский<br>гормон</td>
                                <td>${DATAS181_1.antiMyllervskijGormon}</td>
                                <td>нг/мл</td>
                                <td>2,1-7,3<br>
                                <1,1 -сниж ФРЯ<br>
                                <0,8 -рез.сниж ФРЯ
                                </td>
                                <td>3,6-4,8</td>
                                <td>2,1-7,3<br>
                                <1,1 -сниж ФРЯ<br>
                                <0,8 -рез.сниж ФРЯ
                                </td>
                            </tr>
                            <tr>
                                <td>Свободный<br> тестостерон</td>
                                <td>${DATAS181_1.svobodnJTestosteron}</td>
                                <td>пг/мл</td>
                                <td> <4.1 </td>
                                <td>4.5-42.0</td>
                                <td></td>
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
<c:if test="${DATAS181_2 != null}">
    <div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Гормон ХГЧ</h1>
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
                                <td rowspan="8">200</td>
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
</c:if>
<c:if test="${DATAS181_3 != null}">
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
                                <td>${DATAS181_3.toksoplazmaIgm}</td>
                                <td>${DATAS181_3.toksoplazmaIgm1}</td>
                                <td>${DATAS181_3.toksoplazmaIgm2}</td>
                            </tr> 
                            <tr>
                                <td>Токсоплазма lgG</td>
                                <td>${DATAS181_3.toksoplazmaIgg}</td>
                                <td>${DATAS181_3.toksoplazmaIgg1}</td>
                                <td>${DATAS181_3.toksoplazmaIgg2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ lgM</td>
                                <td>${DATAS181_3.vpgIgm}</td>
                                <td>${DATAS181_3.vpgIgm1}</td>
                                <td>${DATAS181_3.vpgIgm2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 1 lgG</td>
                                <td>${DATAS181_3.vpgIIgg}</td>
                                <td>${DATAS181_3.vpgIIgg1}</td>
                                <td>${DATAS181_3.vpgIIgg2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 2 lgG</td>
                                <td>${DATAS181_3.vpgIiIgg}</td>
                                <td>${DATAS181_3.vpgIiIgg1}</td>
                                <td>${DATAS181_3.vpgIiIgg2}</td>
                            </tr> 
                            <tr>
                                <td>Краснуха lgM</td>
                                <td>${DATAS181_3.krasnuAIgm}</td>
                                <td>${DATAS181_3.krasnuAIgm11}</td>
                                <td>${DATAS181_3.krasnuAIgm1}</td>
                            </tr>
                            <tr>
                                <td>Краснуха lgG</td>
                                <td>${DATAS181_3.krasnuAIgg}</td>
                                <td>${DATAS181_3.krasnuAIgg1}</td>
                                <td>${DATAS181_3.krasnuAIgg2}</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgM</td>
                                <td>${DATAS181_3.citomegalovirusIgm}</td>
                                <td>${DATAS181_3.citomegalovirusIgm1}</td>
                                <td>${DATAS181_3.citomegalovirusIgm2}</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgG</td>
                                <td>${DATAS181_3.citomegalovirusIgg}</td>
                                <td>${DATAS181_3.citomegalovirusIgg1}</td>
                                <td>${DATAS181_3.citomegalovirusIgg2}</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgM</td>
                                <td>${DATAS181_3.toOM1}</td>
                                <td>${DATAS181_3.toOM11}</td>
                                <td>${DATAS181_3.toOM2}</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgG</td>
                                <td>${DATAS181_3.toOG1}</td>
                                <td>${DATAS181_3.toOG11}</td>
                                <td>${DATAS181_3.toOG2}</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgM</td>
                                <td>${DATAS181_3.vpgM1}</td>
                                <td>${DATAS181_3.vpgM11}</td>
                                <td>${DATAS181_3.vpgM2}</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgG</td>
                                <td>${DATAS181_3.ureaplazmaG1}</td>
                                <td>${DATAS181_3.ureaplazmaG11}</td>
                                <td>${DATAS181_3.ureaplazmaG2}</td>
                            </tr>
                            <tr>
                                <td>Микоплазма lgM</td>
                                <td>${DATAS181_3.mikoplazmaM}</td>
                                <td>${DATAS181_3.mikoplazmaM1}</td>
                                <td>${DATAS181_3.mikoplazmaM2}</td>
                            </tr>
                            <tr>
                               <td>Микоплазма lgM</td>
                                <td>${DATAS181_3.mikoplazmaG}</td>
                                <td>${DATAS181_3.mikoplazmaG1}</td>
                                <td>${DATAS181_3.mikoplazmaG2}</td>
                            </tr>
                            <tr>
                                <td>Бруцелез lgG</td>
                                <td>${DATAS181_3.brucelezG}</td>
                                <td>${DATAS181_3.brucelezG1}</td>
                                <td>${DATAS181_3.brucelezG2}</td>
                            </tr>
                            <tr>
                                <td>Листериоз lgG</td>
                                <td>${DATAS181_3.listereozG}</td>
                                <td>${DATAS181_3.listereozG1}</td>
                                <td>${DATAS181_3.listereozG2}</td>
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
