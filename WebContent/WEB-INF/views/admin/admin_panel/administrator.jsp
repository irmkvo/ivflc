<%-- 
    Document   : index
    Created on : 12.02.2015, 11:36:06
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<div class="content-block-center">
    <div id="page_title" class="content-block-center-head">
        <span>Администрирование</span>
    </div>
    <div class="content-block-center-item">
        <div class="content-block-center-item-head">
            <div class="content-block-center-item-head-autor">
                <span>
                    <strong>
                        <a title="На страницу автора" target="_parent" href="/lichnie/lichnie2/33096">

                            <br>

                        </a>
                    </strong>
                    <br>

                </span>
            </div>
            <div class="content-block-center-item-head-theme">
                <span>Панель администратора</span>
            </div>
        </div>
        <div class="content-block-center-item-content">
            <table class="table table-hover">
                <thead></thead>
                <tbody>
                    <tr>
                        <td>
                            <button type="button" class="btn btn-danger btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/load_main_data/load'" >
                                Загрузка стартовых данных
                            </button>
                        </td>
                        <td>
                            <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/user_list'" >
                                Пользователи
                            </button>
                        </td>
                        <td>
                            <button type="button" class="btn btn-success btn-xs btn-block" onClick="window.location = '${pageContext.request.contextPath}/admin/menu_editor/menu_list'" >
                                Редактор меню
                            </button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>



