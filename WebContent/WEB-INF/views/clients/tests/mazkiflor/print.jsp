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
        <h1 class="page-header">Мазки флоры</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row"> 
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
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
                                <td>${GBA.dyn11371291}</td>
                                <td>${GBA.dyn11361291}</td>
                                <td>${GBA.dyn11391291}</td>
                            </tr> 
                             <tr>
                                <td>Эпителии</td>
                                <td>${GBA.dyn11371290}</td>
                                <td>${GBA.dyn11361290}</td>
                                <td>${GBA.dyn11381290}</td>
                            </tr> 
                             <tr>
                                <td>Слизь</td>
                                <td>${GBA.dyn11371292}</td>
                                <td>${GBA.dyn11361292}</td>
                                <td>${GBA.dyn11381292}</td>
                            </tr> 
                            <tr>
                                <td>Гонококк</td>
                                <td colspan="3">${GBA.dyn11371295}</td>

                            </tr> 
                            <tr>
                                <td>Трихомонады</td>
                                <td colspan="3">${GBA.dyn11371294}</td>

                            </tr> 
                            <tr>
                                <td>Гарднереллы</td>
                                <td colspan="3">${GBA.gardnarell}</td>
                            </tr> 
                            <tr>
                                <td>Дрожжи</td>
                                <td colspan="3">${GBA.droggi}</td>
                            </tr>
                             <tr>
                                <td>Флора</td>
                                <td colspan="3">${GBA.dyn11361293}</td>
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
