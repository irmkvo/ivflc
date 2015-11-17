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
        <h1 class="page-header">Анализ мочи по Зимницкому</h1>
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
                                    <td>${GBA.poZimnickomuKol1}</td>
                                    <td>${GBA.poZimnickomuUdVes1}</td>
                                </tr> 
                                <tr>
                                    <td>2</td>
                                    <td>${GBA.poZimnickomuKol2}</td>
                                    <td>${GBA.poZimnickomuUdVes2}</td>
                                </tr>
                                <tr>
                                    <td>3</td>
                                    <td>${GBA.poZimnickomuKol3}</td>
                                    <td>${GBA.poZimnickomuUdVes3}</td>
                                </tr>
                                <tr>
                                    <td>4</td>
                                    <td>${GBA.poZimnickomuKol4}</td>
                                    <td>${GBA.poZimnickomuUdVes4}</td>
                                </tr>
                                <tr>
                                    <td>5</td>
                                    <td>${GBA.poZimnickomuKol5}</td>
                                    <td>${GBA.poZimnickomuUdVes5}</td>
                                </tr>
                                <tr>
                                    <td>6</td>
                                    <td>${GBA.poZimnickomuKol6}</td>
                                    <td>${GBA.poZimnickomuUdVes6}</td>
                                </tr>
                                <tr>
                                    <td>7</td>
                                    <td>${GBA.poZimnickomuKol7}</td>
                                    <td>${GBA.poZimnickomuUdVes7}</td>
                                </tr>
                                <tr>
                                    <td>8</td>
                                    <td>${GBA.poZimnickomuKol8}</td>
                                    <td>${GBA.poZimnickomuUdVes8}</td>
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
