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
        <h1 class="page-header">Кариотип</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<div class="row">   
    <div class="col-lg-7">
        <div class="panel panel-default">
            <div class="panel-heading">
                
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover" width="100%">

                        <tbody>
                            <tr>
                                <td>Дата исследования</td>
                                <td>${GBA.dataIssledovaniq}</td>
                            </tr> 
                            <tr>
                                <td>Материал</td>
                                <td>${GBA.material}</td>
                            </tr> 
                            <tr>
                                <td>Кариотип</td>
                                <td>${GBA.kariotip}</td>
                            </tr>
                            <tr>
                                <td>Дополнительное <br> исследование</td>
                                <td>${GBA.dopolnitelNoeIssledovan}</td>
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
