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
        <h1 class="page-header">Мазки флора</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">
    <jsp:include page="/WEB-INF/views/clients/tests/test_header.jsp"></jsp:include>
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
                                    <td>${GBA.cerPodvignostSpermatozo}</td>
                                </tr> 
                                <tr>
                                    <td>VAG</td>
                                    <td>${GBA.vagPodvignostSpermatozo}</td>
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
