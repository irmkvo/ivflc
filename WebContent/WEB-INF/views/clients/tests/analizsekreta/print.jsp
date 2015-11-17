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
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
    <div class="col-lg-12">
        <h1 class="page-header">Секрет простатной железы</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Секрет простатной железы №${GBA.registrator}
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">                        
                        <tbody>
                            <tr>
                                <td>Лейкоциты</td>
                                <td>${GBA.lejkocit}</td>
                            </tr> 
                            <tr>
                                <td>Эпителиальные клетки</td>
                                <td>${GBA.epitelialNEKletki}</td>
                            </tr>
                            <tr>
                                <td>Слизь</td>
                                <td>${GBA.sliz}</td>
                            </tr>
                            <tr>
                                <td>Лецитиновые зерны</td>
                                <td>${GBA.lecitinovEZerna}</td>
                            </tr>
                            <tr>
                                <td>Амилоидные тельца</td>
                                <td>${GBA.amiloidnETelCa}</td>
                            </tr>
                            <tr>
                                <td>Эритроциты</td>
                                <td>${GBA.eritrocit}</td>
                            </tr>
                            <tr>
                                <td>Бактерии</td>
                                <td>${GBA.bakterii}</td>
                            </tr>
                            <tr>
                                <td>Гонококк</td>
                                <td>${GBA.gonokokk}</td>
                            </tr>
                            <tr>
                                <td>Трихомонады</td>
                                <td>${GBA.triOmonad}</td>
                            </tr>
                            <tr>
                                <td>Гарднареллы</td>
                                <td>${GBA.gardnarell}</td>                                
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
