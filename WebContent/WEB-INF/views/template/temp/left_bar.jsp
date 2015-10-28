<%-- 
    Document   : left_bar
    Created on : 02.03.2015, 11:53:39
    Author     : Kimboo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <div class="col-md-3 column hidden-xs hidden-sm">
        <!-- LEFT PANEL START -->
        <div class="left-block-content">
            <!-- LOGO START -->
            <div class="left-block-content-logo" style="padding-left:10px;width:240px;padding-right:10px;">
                <a title="На главную" href="#">
                    <img alt="Врачи Вместе" src="http://irm.kz/wp-content/themes/irm-template/assets/images/logo2.png"   height="90px" />
                  
                </a>
            </div>
            <!-- LOGO END -->
            <div class="left-block-content-profile">
                <div class="left-block-content-line-1"></div>
                <!-- PERSONAL INFORMATION START -->
                <div class="left-block-content-profile-item">
                    <!-- PERSONAL INFORMATION PHOTO START -->
                    <div class="left-block-content-profile-item-left">
                        <div class="left-block-content-profile-item-left-photo-bg">
                            <a href="#" style='color: #e1523d;text-decoration: underline;'>
                                <div class="left-block-content-profile-item-left-photo"> 
                                     
<!--                                     style='
                                     background-image: url("${pageContext.request.contextPath}/resources/media/profile_images/"), url("");'
                                     >-->
                                    
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- PERSONAL INFORMATION PHOTO END -->
                    <!-- PERSONAL INFORMATION F.L. NAME AND ROLE START -->
                    <tiles:importAttribute name="UserData" />
                    <div class="left-block-content-profile-item-right">
                        <a style="text-decoration: none;" href="#">
                            <p>
                                ${UserData.userFname}
                                <br>
                                ${UserData.userLname}
                                <br>
                                ${UserData.userMname}
                            </p>
                        </a>
                        ${UserData.role.roleTitle}
                        <div class="left-block-content-profile-item-right-exit">
                            <a title="Выход" target="_parent" href='<c:url value="j_spring_security_logout" />' style='color: #e1523d;text-decoration: underline;'>
                                выход
                            </a>
                        </div>
                    </div>
                    
                    <!-- PERSONAL INFORMATION F.L. NAME AND ROLE END -->
                </div>
                <!-- PERSONAL INFORMATION END -->
                <div class="left-block-content-line-1"></div>
                <!-- PROFILE MENU START -->
                <div class="left-block-content-profile-links">
                    <div class="left-block-content-profile-links-item">
                        <div style="position:relative">
                            <tiles:importAttribute name="UserMenu" />
                            <ul>
                                <c:forEach items="${UserMenu}" var="userMenuItem">
                                    <c:if test="${userMenuItem.menuItemEnabled}">
                                        <li>
                                            <a title="${userMenuItem.menuItemtitle}" target="_parent" href="${pageContext.request.contextPath}${userMenuItem.page.pageurl}" style="color: #fff;display: block;font-size: 12px;line-height: 24px;padding-left: 5px;text-align: left;text-decoration: none;">
                                                ${userMenuItem.menuItemtitle}
                                            </a>
                                        </li> 
                                    </c:if>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- PROFILE MENU END -->
            </div>
            <div class="left-block-content-line-2"></div>
            <!-- INVITATION START -->
            <div class="left-block-content-invitation">
                <div class="left-block-content-invitation-item">
                    <span id="invitation-1" onclick="$('div.left-block-content-invitation-item-form').slideDown();$('#invitation-1').hide();$('#invitation-2').show();" title="Пригласить коллегу на 'ИРМ'" style="display: inline;">
                        Пригласить на сайт "ИРМ"
                    </span>
                    <span id="invitation-2" onclick="$('div.left-block-content-invitation-item-form').slideUp();$('#invitation-2').hide();$('#invitation-1').show();" title="Скрыть форму" style="display: none;">
                        Скрыть форму
                    </span>
                    <div class="left-block-content-invitation-item-form">
                        <form>
                            <input id="emails" class="form-filed-1" type="text" placeholder="Введите E-mail через запятую" name="emails">
                            <br>
                            Поле для редактирования текста
                            <br>
                            для вашего приглашения
                            <br>
                            <textarea class="form-filed-2" style="resize: none; overflow-y: hidden; position: absolute; top: 0px; left: -9999px; height: 50px; width: 190px; line-height: 13px; text-decoration: none; letter-spacing: 0px;" tabindex="-1">Уважаемый коллега, приглашаю Вас в социальную сеть для врачей "ИРМ"!
                            </textarea>
                            <textarea id="text" class="form-filed-2" name="text" style="resize: none; overflow-y: hidden;">Уважаемый коллега, приглашаю Вас в социальную сеть для врачей "ИРМ"!
                            </textarea>
                            <br>
                            <script>

                                            function InviteCollegue() {
                                              Dajaxice.lichnie.InviteCollegue(Dajax.process, {'emails': $("input[name='emails']").val(), 'message': $("textarea[name='text']").val()});
                                            }

                            </script>
                            <input class="form-key-1" type="submit" onclick="InviteCollegue(); return false;" value="отправить">
                        </form>
                    </div>
                </div>
            </div>
            <!-- INVITATION END -->
            <div class="left-block-content-line-2"></div>
            <!-- MAIN MENU START -->
            <div class="left-block-content-links">
                <tiles:importAttribute name="MainMenu" />
                <c:forEach items="${MainMenu}" var="mainMenuItem">
                    <c:if test="${mainMenuItem.menuItemEnabled}">
                        <div class="left-block-content-links-item <c:if test="${mainMenuItem.menuItemBreak}">break</c:if>">
                                <span>
                                    <a title="${mainMenuItem.menuItemtitle}" target="_parent" href="${pageContext.request.contextPath}${mainMenuItem.page.pageurl}">
                                    ${mainMenuItem.menuItemtitle}
                                </a>
                            </span>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <!-- MAIN MENU END -->
        </div> 
        <!-- LEFT PANEL END -->
    </div>