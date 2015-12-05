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
<c:if test="${DATAS180_1 != null}">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Секрет простатной железы</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div class="row">   
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Секрет простатной железы №${DATAS180_1.registrator}
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" width="100%">                        
                            <tbody>
                                <tr>
                                    <td>Лейкоциты</td>
                                    <td>${DATAS180_1.lejkocit}</td>
                                </tr> 
                                <tr>
                                    <td>Эпителиальные клетки</td>
                                    <td>${DATAS180_1.epitelialNEKletki}</td>
                                </tr>
                                <tr>
                                    <td>Слизь</td>
                                    <td>${DATAS180_1.sliz}</td>
                                </tr>
                                <tr>
                                    <td>Лецитиновые зерны</td>
                                    <td>${DATAS180_1.lecitinovEZerna}</td>
                                </tr>
                                <tr>
                                    <td>Амилоидные тельца</td>
                                    <td>${DATAS180_1.amiloidnETelCa}</td>
                                </tr>
                                <tr>
                                    <td>Эритроциты</td>
                                    <td>${DATAS180_1.eritrocit}</td>
                                </tr>
                                <tr>
                                    <td>Бактерии</td>
                                    <td>${DATAS180_1.bakterii}</td>
                                </tr>
                                <tr>
                                    <td>Гонококк</td>
                                    <td>${DATAS180_1.gonokokk}</td>
                                </tr>
                                <tr>
                                    <td>Трихомонады</td>
                                    <td>${DATAS180_1.triOmonad}</td>
                                </tr>
                                <tr>
                                    <td>Гарднареллы</td>
                                    <td>${DATAS180_1.gardnarell}</td>                                
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
<c:if test="${DATAS180_2 != null}">
    <div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Мазки флоры</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
        <div class="col-lg-10">
        <div class="panel panel-default">

            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">
                        <thead>
                            <tr>
                                <th ></th>
                                <th >Ur</th>
                                <th >CER</th>
                                <th >VAG</th>

                            </tr>

                        </thead>
                        <tbody>
                            <tr>
                                <td>Лейкоциты</td>
                                <td>${DATAS180_2.dyn11371291}</td>
                                <td>${DATAS180_2.dyn11361291}</td>
                                <td>${DATAS180_2.dyn11391291}</td>
                            </tr> 
                             <tr>
                                <td>Эпителии</td>
                                <td>${DATAS180_2.dyn11371290}</td>
                                <td>${DATAS180_2.dyn11361290}</td>
                                <td>${DATAS180_2.dyn11381290}</td>
                            </tr> 
                             <tr>
                                <td>Слизь</td>
                                <td>${DATAS180_2.dyn11371292}</td>
                                <td>${DATAS180_2.dyn11361292}</td>
                                <td>${DATAS180_2.dyn11381292}</td>
                            </tr> 
                            <tr>
                                <td>Гонококк</td>
                                <td colspan="3">${DATAS180_2.dyn11371295}</td>

                            </tr> 
                            <tr>
                                <td>Трихомонады</td>
                                <td colspan="3">${DATAS180_2.dyn11371294}</td>

                            </tr> 
                            <tr>
                                <td>Гарднереллы</td>
                                <td colspan="3">${DATAS180_2.gardnarell}</td>
                            </tr> 
                            <tr>
                                <td>Дрожжи</td>
                                <td colspan="3">${DATAS180_2.droggi}</td>
                            </tr>
                             <tr>
                                <td>Флора</td>
                                <td colspan="3">${DATAS180_2.dyn11361293}</td>
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
<c:if test="${DATAS180_3 != null}">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Проба Шуварского</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <div class="row">
        <div class="col-lg-5">
            <div class="panel panel-default">
                <div class="panel-heading">

                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped table-bordered table-hover" width="100%">                        
                            <thead>

                                <tr>
                                    <th></th>
                                    <th>Подвижность сперматазоидов</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>CER</td>
                                    <td>${DATAS180_3.cerPodvignostSpermatozo}</td>
                                </tr> 
                                <tr>
                                    <td>VAG</td>
                                    <td>${DATAS180_3.vagPodvignostSpermatozo}</td>
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
