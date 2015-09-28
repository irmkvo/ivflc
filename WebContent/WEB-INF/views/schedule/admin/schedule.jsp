<%-- 
    Document   : schedule
    Created on : Sep 21, 2015, 3:38:56 PM
    Author     : kvo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="content-block-center">
    <div id="page_title" class="content-block-center-head">
        <span>Календарь</span>
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
                <span>Календарь</span>
            </div>
        </div>
        <div class="content-block-center-item-content">
<!--            <div class="row-fluid">
                <select id="first_day" class="span12">
                    <option value="" selected="selected">First day of week language-dependant</option>
                    <option value="2">First day of week is Sunday</option>
                    <option value="1">First day of week is Monday</option>
                </select>
                <select id="language" class="span12">
                    <option value="">Select Language (default: en-US)</option>
                    <option value="bg-BG">Bulgarian</option>
                    <option value="nl-NL">Dutch</option>
                    <option value="fr-FR">French</option>
                    <option value="de-DE">German</option>
                    <option value="el-GR">Greek</option>
                    <option value="hu-HU">Hungarian</option>
                    <option value="id-ID">Bahasa Indonesia</option>
                    <option value="it-IT">Italian</option>
                    <option value="pl-PL">Polish</option>
                    <option value="pt-BR">Portuguese (Brazil)</option>
                    <option value="ro-RO">Romania</option>
                    <option value="es-CO">Spanish (Colombia)</option>
                    <option value="es-MX">Spanish (Mexico)</option>
                    <option value="es-ES">Spanish (Spain)</option>
                    <option value="ru-RU">Russian</option>
                    <option value="sk-SR">Slovak</option>
                    <option value="sv-SE">Swedish</option>
                    <option value="zh-CN">简体中文</option>
                    <option value="zh-TW">繁體中文</option>
                    <option value="ko-KR">한국어</option>
                    <option value="th-TH">Thai (Thailand)</option>
                </select>
                <label class="checkbox">
                    <input type="checkbox" value="#events-modal" id="events-in-modal"> Open events in modal window
                </label>
                <label class="checkbox">
                    <input type="checkbox" id="format-12-hours"> 12 Hour format
                </label>
                <label class="checkbox">
                    <input type="checkbox" id="show_wb" checked> Show week box
                </label>
                <label class="checkbox">
                    <input type="checkbox" id="show_wbn" checked> Show week box number
                </label>
            </div>-->
            
            <div class="span9">
                <div id="calendar"></div>
            </div>
            <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/components/underscore/underscore-min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/calendar.js"></script>
            <script type="text/javascript">
                var calendar = $("#calendar").calendar(
                    {
                        tmpl_path: "${pageContext.request.contextPath}/resources/tmpls/",
                        events_source: function () { return []; },
                        language: 'ru-RU'
                    });            
            </script>           
        </div>
    </div>
</div>
