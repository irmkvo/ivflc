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
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
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
                                <td>${GBA.toksoplazmaIgm}</td>
                                <td>${GBA.toksoplazmaIgm1}</td>
                                <td>${GBA.toksoplazmaIgm2}</td>
                            </tr> 
                            <tr>
                                <td>Токсоплазма lgG</td>
                                <td>${GBA.toksoplazmaIgg}</td>
                                <td>${GBA.toksoplazmaIgg1}</td>
                                <td>${GBA.toksoplazmaIgg2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ lgM</td>
                                <td>${GBA.vpgIgm}</td>
                                <td>${GBA.vpgIgm1}</td>
                                <td>${GBA.vpgIgm2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 1 lgG</td>
                                <td>${GBA.vpgIIgg}</td>
                                <td>${GBA.vpgIIgg1}</td>
                                <td>${GBA.vpgIIgg2}</td>
                            </tr> 
                            <tr>
                                <td>ВПГ 2 lgG</td>
                                <td>${GBA.vpgIiIgg}</td>
                                <td>${GBA.vpgIiIgg1}</td>
                                <td>${GBA.vpgIiIgg2}</td>
                            </tr> 
                            <tr>
                                <td>Краснуха lgM</td>
                                <td>${GBA.krasnuAIgm}</td>
                                <td>${GBA.krasnuAIgm11}</td>
                                <td>${GBA.krasnuAIgm1}</td>
                            </tr>
                            <tr>
                                <td>Краснуха lgG</td>
                                <td>${GBA.krasnuAIgg}</td>
                                <td>${GBA.krasnuAIgg1}</td>
                                <td>${GBA.krasnuAIgg2}</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgM</td>
                                <td>${GBA.citomegalovirusIgm}</td>
                                <td>${GBA.citomegalovirusIgm1}</td>
                                <td>${GBA.citomegalovirusIgm2}</td>
                            </tr>
                            <tr>
                                <td>Цитомегаловирус lgG</td>
                                <td>${GBA.citomegalovirusIgg}</td>
                                <td>${GBA.citomegalovirusIgg1}</td>
                                <td>${GBA.citomegalovirusIgg2}</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgM</td>
                                <td>${GBA.toOM1}</td>
                                <td>${GBA.toOM11}</td>
                                <td>${GBA.toOM2}</td>
                            </tr>
                            <tr>
                                <td>Хламидии lgG</td>
                                <td>${GBA.toOG1}</td>
                                <td>${GBA.toOG11}</td>
                                <td>${GBA.toOG2}</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgM</td>
                                <td>${GBA.vpgM1}</td>
                                <td>${GBA.vpgM11}</td>
                                <td>${GBA.vpgM2}</td>
                            </tr>
                            <tr>
                                <td>Уреаплазма lgG</td>
                                <td>${GBA.ureaplazmaG1}</td>
                                <td>${GBA.ureaplazmaG11}</td>
                                <td>${GBA.ureaplazmaG2}</td>
                            </tr>
                            <tr>
                                <td>Микоплазма lgM</td>
                                <td>${GBA.mikoplazmaM}</td>
                                <td>${GBA.mikoplazmaM1}</td>
                                <td>${GBA.mikoplazmaM2}</td>
                            </tr>
                            <tr>
                               <td>Микоплазма lgM</td>
                                <td>${GBA.mikoplazmaG}</td>
                                <td>${GBA.mikoplazmaG1}</td>
                                <td>${GBA.mikoplazmaG2}</td>
                            </tr>
                            <tr>
                                <td>Бруцелез lgG</td>
                                <td>${GBA.brucelezG}</td>
                                <td>${GBA.brucelezG1}</td>
                                <td>${GBA.brucelezG2}</td>
                            </tr>
                            <tr>
                                <td>Листериоз lgG</td>
                                <td>${GBA.listereozG}</td>
                                <td>${GBA.listereozG1}</td>
                                <td>${GBA.listereozG2}</td>
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
