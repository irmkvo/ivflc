<%-- 
    Document   : print
    Created on : Oct 8, 2015, 8:17:00 PM
    Author     : swat
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Гормоны</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Анализ выполнен на анализаторе  <%= new java.util.Date() %>
                
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
                                <td>${GG.prolaktin1}</td>
                                <td>мМЕ/л</td>
                                <td>73-764</td>
                                <td>28-636</td>
                                <td>1тр = 365-9500</td>
                            </tr> 
                            <tr>
                                <td>ЛГ</td>
                                <td>${GG.kortizol1}</td>
                                <td>мМЕ/л</td>
                                <td> <20 </td>
                                <td>1-13</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>ФСГ</td>
                                <td>${GBA.cvetnojPokazatel}</td>
                                <td> МЕ/л</td>
                                <td >2-10</td>
                                <td >2-10</td>
                            </tr>
                            <tr>
                                <td>Эстрадиол</td>
                                <td>${GBA.lejkocit}</td>
                                <td> пМ/л</td>
                                <td>47,7-701</td>
                                <td> 36,7-400</td>
                                <td> 1тр = 1020-13270</td>
                            </tr>
                            <tr>
                                <td>Прогестерон</td>
                                <td>${GBA.granulocit}</td>
                                <td>нМ/л</td>
                                <td>1Ф = 0,2-4,0<br>2Ф = 6-80 </td>
                                <td>0.32-3.2</td>      
                                <td>5-16 нед=38-205</td>
                            </tr>
                            <tr>
                                <td>Тестостерон</td>
                                <td>${GBA.monocit}</td>
                                <td>нМ/л</td>
                                <td>0,2-3,0</td>
                                <td>12-30</td>
                                <td>0,2-3,0</td>

                            </tr>
                            <tr>
                                <td>DHEA-S</td>
                                <td>${GBA.limfocit}</td>
                                <td>мкг/мл</td>
                                <td>0,4-2,7</td>
                                <td>0,6-2,7</td>
                                <td>0,2-1,2</td>

                            </tr>
                            <tr>
                                <td>Кортизол</td>
                                <td>${GG.kortizol1}</td>
                                <td>нМ/л</td>
                                <td>138-635</td>
                                <td>138-635</td>
                                <td>1тр=163-1230</td>

                            </tr>
                            <tr>
                                <td>Т3 общий</td>
                                <td>${GBA.soe}</td>
                                <td>нМ/л</td>
                                <td>1-2,5</td>
                                <td>1-2,5</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>Т4 общий</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>нМ/л</td>
                                <td>65-160</td>
                                <td>65-160</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>ТТГ</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>МЕ/л</td>
                                <td>0,24-4,0</td>
                                <td>0,24-4,0</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>АтТПО</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>Ед/мл</td>
                                <td>0-30</td>
                                <td>0-30</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>АтТГ-1</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>Ед/мл</td>
                                <td>0-100</td>
                                <td>0-100</td>
                                <td></td>
                            </tr>
                              <tr>
                                <td>FT3</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>пг/мл</td>
                                <td>1,4-4,2</td>
                                <td>1,4-4,2</td>
                                <td></td>
                            </tr>
                            
                              <tr>
                                <td>FT4</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>нг/дл</td>
                                <td>0,8-2,0</td>
                                <td>0,8-2,0</td>
                                <td></td>
                            </tr>
                            
                              <tr>
                                <td>СА-125</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
                                <td>ЕД/мл</td>
                                <td>0-40</td>
                                <td></td>
                                <td></td>
                            </tr>

                              <tr>
                                <td>Антимюллеровский<br>гормон</td>
                                <td>${GBA.gemotokritnoeHislo}</td>
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
                                <td>${GBA.gemotokritnoeHislo}</td>
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
