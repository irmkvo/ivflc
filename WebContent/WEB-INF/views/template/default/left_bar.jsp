<%-- 
    Document   : left_bar
    Created on : 02.03.2015, 11:53:39
    Author     : Kimboo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
                                <div class="left-block-content-profile-item-left-photo" style='background-image: url("${pageContext.request.contextPath}/resources/media/profile_images/"), url("");'>
                                    
                                </div>
                            </a>
                        </div>
                    </div>
                    <!-- PERSONAL INFORMATION PHOTO END -->
                    <!-- PERSONAL INFORMATION F.L. NAME AND ROLE START -->
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
                        Студент
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
                            <ul>
                                <li>
                                    <a title="Моя страница" target="_parent" href="#" style="color: #fff;display: block;font-size: 12px;line-height: 24px;padding-left: 5px;text-align: left;text-decoration: none;">
                                        Моя страница
                                    </a>
                                </li>
                                <li>
                                    <a title="Все врачи" target="_parent" href="#" style="color: #fff;display: block;font-size: 12px;line-height: 24px;padding-left: 5px;text-align: left;text-decoration: none;">
                                        Анализы                                            
                                    </a>
                                </li>
                                <li>
                                    <a title="Личные сообщения" target="_parent" href="#" style="color: #fff;display: block;font-size: 12px;line-height: 24px;padding-left: 5px;text-align: left;text-decoration: none;">
                                        Личные сообщения                                            
                                    </a>
                                </li>
                                <li>
                                    <a title="Интересное" target="_parent" href="#" style="color: #fff;display: block;font-size: 12px;line-height: 24px;padding-left: 5px;text-align: left;text-decoration: none;">
                                        Интересное
                                    </a>
                                </li>
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
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Главная лента" target="_parent" href="#">Главная лента</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Календарь мероприятий" target="_parent" href="#">Календарь мероприятий</a>
                    </span>
                    <div class="left-block-content-links-item-count">
                        <span>1</span>
                    </div>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Он-лайн трансляция" target="_parent" href="${pageContext.request.contextPath}/video">Онлайн трансляция</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Видеоматериалы" target="_parent" href="${pageContext.request.contextPath}/video/archive">Видеоматериалы</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Фотогалерея" target="_parent" href="#">Фотогалерея</a>
                    </span>
                </div>
                <div class="left-block-content-links-item break" style="">
                    <span>
                        <a title="Группы" target="_parent" href="#">Группы</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Новое в моих группах" target="_parent" href="#">Новое в моих группах</a>
                    </span>
                </div>
                <div class="left-block-content-links-item break">
                    <span>
                        <a title="Резюме и вакансии" target="_parent" href="#">Резюме и вакансии</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Опросы и исследования" target="_parent" href="#">Опросы и исследования</a>
                    </span>
                </div>
                <div class="left-block-content-links-item">
                    <span>
                        <a title="Книги и журналы" target="_parent" href="#">Книги и журналы</a>
                    </span>
                </div>
                <div class="left-block-content-links-item break">
                    <span>
                        <a title="Наши партнеры" target="_parent" href="#">Наши партнеры</a>
                    </span>
                </div>
            </div>
            <!-- MAIN MENU END -->
        </div> 
        <!-- LEFT PANEL END -->
    </div>