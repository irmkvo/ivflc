<%-- 
    Document   : top_bar
    Created on : 01.05.2015, 15:30:46
    Author     : Kimboo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="content-block-top">
    <div id="window-filter" class="content-block-top-block-1-window-filter" style="top: 8px; display: none;">
        <div class="content-block-top-block-1-window-filter-content">
            <div class="content-block-top-block-1-window-filter-content-left">
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-1" type="checkbox" hidden="" checked="" value="Все" uri="/videos" name="Видео" />
                    <label for="checkbox-1">Все</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-2" type="checkbox" hidden="" value="Медицинская анимация" name="1" />
                    <label for="checkbox-2">Медицинская анимация</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-3" type="checkbox" hidden="" value="Конференция" name="2" />
                    <label for="checkbox-3">Конференция</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-4" type="checkbox" hidden="" value="Телевизор" name="3" />
                    <label for="checkbox-4">Телевизор</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-5" type="checkbox" hidden="" value="Хирургическая операция" name="4" />
                    <label for="checkbox-5">Хирургическая операция</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-6" type="checkbox" hidden="" value="Вебинар" name="5" />
                    <label for="checkbox-6">Вебинар</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-7" type="checkbox" hidden="" value="Онлайн-трансляция" name="6" />
                    <label for="checkbox-7">Онлайн-трансляция</label>
                </div>
                <div class="content-block-top-block-1-window-filter-content-left-checkbox">
                    <input id="checkbox-8" type="checkbox" hidden="" value="Эксклюзивное интервью" name="7" />
                    <label for="checkbox-8">Эксклюзивное интервью</label>
                </div>
                </div>
                    <div class="content-block-top-block-1-window-filter-content-right">
                    <div class="content-block-top-block-1-window-filter-content-right-text">
                        Воспользуйтесь списком,
                        <br>
                        для того чтобы выбрать
                        <br>
                        нужную Вам специальность
                        <br>
                        материалов в ленте
                    </div>
                    <div class="content-block-top-block-1-window-filter-content-right-list">
                        <div id="list-first" class="content-block-top-block-1-window-filter-content-right-list-all-item">
                            <span>Все специальности</span>
                        </div>
                        <div id="filter-scroll" class="filter-scroll content-block-top-block-1-window-filter-content-right-list-all mCustomScrollbar _mCS_1" style="display: none;">
                            <div id="mCSB_1" class="mCustomScrollBox" style="position:relative; height:100%; overflow:hidden; max-width:100%;">
                                <div class="mCSB_container mCS_no_scrollbar" style="position:relative; top:0;">
                                    <div id="list-" class="filter-scroll-item">
                                        <span>Все специальности</span>
                                    </div>
                                    <div id="list-70" class="filter-scroll-item">
                                        <span>Авиационная и космическая медицина</span>
                                    </div>
                                    <div id="list-216" class="filter-scroll-item">
                                        <span>Акушерство</span>
                                    </div>
                                    <div id="list-1" class="filter-scroll-item">
                                        <span>Акушерство и гинекология</span>
                                    </div>
                                    <div id="list-2" class="filter-scroll-item">
                                        <span>Аллергология и иммунология</span>
                                    </div>
                                    <div id="list-3" class="filter-scroll-item">
                                        <span>Анестезиология-реаниматология</span>
                                    </div>
                                    <div id="list-59" class="filter-scroll-item">
                                        <span>Бактериология</span>
                                    </div>
                                    <div id="list-60" class="filter-scroll-item">
                                        <span>Вирусология</span>
                                    </div>
                                    <div id="list-62" class="filter-scroll-item">
                                        <span>Восстановительная медицина</span>
                                    </div>
                                    <div id="list-219" class="filter-scroll-item">
                                        <span>Врач коммунальной гигиены</span>
                                    </div>
                                    <div id="list-93" class="filter-scroll-item">
                                        <span>Врач общей практики</span>
                                    </div>
                                    <div id="list-138" class="filter-scroll-item">
                                        <span>Врач по гигиене труда</span>
                                    </div>
                                    <div id="list-99" class="filter-scroll-item">
                                        <span>Врач скорой помощи</span>
                                    </div>
                                    <div id="list-242" class="filter-scroll-item">
                                        <span>Врач функциональной диагностики</span>
                                    </div>
                                    <div id="list-4" class="filter-scroll-item">
                                        <span>Гастроэнтерология</span>
                                    </div>
                                    <div id="list-5" class="filter-scroll-item">
                                        <span>Гематология, трансфузиология</span>
                                    </div>
                                    <div id="list-6" class="filter-scroll-item">
                                        <span>Генетика</span>
                                    </div>
                                    <div id="list-82" class="filter-scroll-item">
                                        <span>Гепатология</span>
                                    </div>
                                    <div id="list-7" class="filter-scroll-item">
                                        <span>Геронтология, гериатрия</span>
                                    </div>
                                    <div id="list-74" class="filter-scroll-item">
                                        <span>Дезинфектология</span>
                                    </div>
                                    <div id="list-107" class="filter-scroll-item">
                                        <span>Дерматовенерология</span>
                                    </div>
                                    <div id="list-88" class="filter-scroll-item">
                                        <span>Детская кардиология</span>
                                    </div>
                                    <div id="list-86" class="filter-scroll-item">
                                        <span>Детская неврология</span>
                                    </div>
                                    <div id="list-207" class="filter-scroll-item">
                                        <span>Детская онкология</span>
                                    </div>
                                    <div id="list-135" class="filter-scroll-item">
                                        <span>Детская ортопедия</span>
                                    </div>
                                    <div id="list-225" class="filter-scroll-item">
                                        <span>Детская психиатрия</span>
                                    </div>
                                    <div id="list-127" class="filter-scroll-item">
                                        <span>Детская хирургия</span>
                                    </div>
                                    <div id="list-122" class="filter-scroll-item">
                                        <span>Детские инфекционные болезни</span>
                                    </div>
                                    <div id="list-72" class="filter-scroll-item">
                                        <span>Диабетология</span>
                                    </div>
                                    <div id="list-9" class="filter-scroll-item">
                                        <span>Диетология</span>
                                    </div>
                                    <div id="list-180" class="filter-scroll-item">
                                        <span>Иммунология</span>
                                    </div>
                                    <div id="list-10" class="filter-scroll-item">
                                        <span>Инфекционные болезни</span>
                                    </div>
                                    <div id="list-11" class="filter-scroll-item">
                                        <span>Кардиология</span>
                                    </div>
                                    <div id="list-83" class="filter-scroll-item">
                                        <span>Кардиохирургия</span>
                                    </div>
                                    <div id="list-55" class="filter-scroll-item">
                                        <span>Клиническая микология</span>
                                    </div>
                                    <div id="list-58" class="filter-scroll-item">
                                        <span>Клиническая микология</span>
                                    </div>
                                    <div id="list-87" class="filter-scroll-item">
                                        <span>Клиническая психология</span>
                                    </div>
                                    <div id="list-66" class="filter-scroll-item">
                                        <span>Клиническая фармакология</span>
                                    </div>
                                    <div id="list-13" class="filter-scroll-item">
                                        <span>Колопроктология</span>
                                    </div>
                                    <div id="list-51" class="filter-scroll-item">
                                        <span>Косметология</span>
                                    </div>
                                    <div id="list-12" class="filter-scroll-item">
                                        <span>Лабораторная диагностика</span>
                                    </div>
                                    <div id="list-61" class="filter-scroll-item">
                                        <span>Лабораторная микология</span>
                                    </div>
                                    <div id="list-63" class="filter-scroll-item">
                                        <span>Лечебная физкультура и спортивная медицина</span>
                                    </div>
                                    <div id="list-18" class="filter-scroll-item">
                                        <span>Маммология</span>
                                    </div>
                                    <div id="list-49" class="filter-scroll-item">
                                        <span>Мануальная терапия</span>
                                    </div>
                                    <div id="list-45" class="filter-scroll-item">
                                        <span>Медбрат</span>
                                    </div>
                                    <div id="list-52" class="filter-scroll-item">
                                        <span>Медицинский лабораторный техник</span>
                                    </div>
                                    <div id="list-44" class="filter-scroll-item">
                                        <span>Медсестра</span>
                                    </div>
                                    <div id="list-15" class="filter-scroll-item">
                                        <span>Наркология</span>
                                    </div>
                                    <div id="list-16" class="filter-scroll-item">
                                        <span>Неврология</span>
                                    </div>
                                    <div id="list-146" class="filter-scroll-item">
                                        <span>Нейрохирургия</span>
                                    </div>
                                    <div id="list-14" class="filter-scroll-item">
                                        <span>Неонатология</span>
                                    </div>
                                    <div id="list-132" class="filter-scroll-item">
                                        <span>Нефрология</span>
                                    </div>
                                    <div id="list-73" class="filter-scroll-item">
                                        <span>Общая гигиена</span>
                                    </div>
                                    <div id="list-17" class="filter-scroll-item">
                                        <span>Онкология</span>
                                    </div>
                                    <div id="list-48" class="filter-scroll-item">
                                        <span>Организатор здравоохранения</span>
                                    </div>
                                    <div id="list-76" class="filter-scroll-item">
                                        <span>Ортодонтия</span>
                                    </div>
                                    <div id="list-129" class="filter-scroll-item">
                                        <span>Остеопатия</span>
                                    </div>
                                    <div id="list-19" class="filter-scroll-item">
                                        <span>Оториноларингология</span>
                                    </div>
                                    <div id="list-20" class="filter-scroll-item">
                                        <span>Офтальмология</span>
                                    </div>
                                    <div id="list-75" class="filter-scroll-item">
                                        <span>Паразитология</span>
                                    </div>
                                    <div id="list-241" class="filter-scroll-item">
                                        <span>Патологоанатомия</span>
                                    </div>
                                    <div id="list-164" class="filter-scroll-item">
                                        <span>Патофизиология</span>
                                    </div>
                                    <div id="list-22" class="filter-scroll-item">
                                        <span>Педиатрия</span>
                                    </div>
                                    <div id="list-23" class="filter-scroll-item">
                                        <span>Пластическая хирургия</span>
                                    </div>
                                    <div id="list-42" class="filter-scroll-item">
                                        <span>Провизор</span>
                                    </div>
                                    <div id="list-128" class="filter-scroll-item">
                                        <span>Профпатология</span>
                                    </div>
                                    <div id="list-24" class="filter-scroll-item">
                                        <span>Психиатрия</span>
                                    </div>
                                    <div id="list-85" class="filter-scroll-item">
                                        <span>Психотерапия</span>
                                    </div>
                                    <div id="list-25" class="filter-scroll-item">
                                        <span>Пульмонология, фтизиатрия</span>
                                    </div>
                                    <div id="list-65" class="filter-scroll-item">
                                        <span>Радиология</span>
                                    </div>
                                    <div id="list-238" class="filter-scroll-item">
                                        <span>Реабилитология</span>
                                    </div>
                                    <div id="list-26" class="filter-scroll-item">
                                        <span>Ревматология</span>
                                    </div>
                                    <div id="list-27" class="filter-scroll-item">
                                        <span>Рентгенология</span>
                                    </div>
                                    <div id="list-64" class="filter-scroll-item">
                                        <span>Рефлексотерапия</span>
                                    </div>
                                    <div id="list-68" class="filter-scroll-item">
                                        <span>Сексология</span>
                                    </div>
                                    <div id="list-235" class="filter-scroll-item">
                                        <span>Скорая Медицинская помощь</span>
                                    </div>
                                    <div id="list-29" class="filter-scroll-item">
                                        <span>Стоматология</span>
                                    </div>
                                    <div id="list-47" class="filter-scroll-item">
                                        <span>Студент</span>
                                    </div>
                                    <div id="list-126" class="filter-scroll-item">
                                        <span>Судебно-медицинская экспертиза </span>
                                    </div>
                                    <div id="list-30" class="filter-scroll-item">
                                        <span>Судмед экспертиза</span>
                                    </div>
                                    <div id="list-124" class="filter-scroll-item">
                                        <span>Судовая медицина</span>
                                    </div>
                                    <div id="list-31" class="filter-scroll-item">
                                        <span>Терапия</span>
                                    </div>
                                    <div id="list-54" class="filter-scroll-item">
                                        <span>Токсикология</span>
                                    </div>
                                    <div id="list-153" class="filter-scroll-item">
                                        <span>Торакальная хирургия</span>
                                    </div>
                                    <div id="list-32" class="filter-scroll-item">
                                        <span>Травматология и ортопедия</span>
                                    </div>
                                    <div id="list-195" class="filter-scroll-item">
                                        <span>Трансплантология</span>
                                    </div>
                                    <div id="list-141" class="filter-scroll-item">
                                        <span>Трансфузиология</span>
                                    </div>
                                    <div id="list-158" class="filter-scroll-item">
                                        <span>Трансфузиология</span>
                                    </div>
                                    <div id="list-116" class="filter-scroll-item">
                                        <span>Ультразвуковая диагностика</span>
                                    </div>
                                    <div id="list-33" class="filter-scroll-item">
                                        <span>Урология</span>
                                    </div>
                                    <div id="list-43" class="filter-scroll-item">
                                        <span>Фармация</span>
                                    </div>
                                    <div id="list-81" class="filter-scroll-item">
                                        <span>Физиология</span>
                                    </div>
                                    <div id="list-35" class="filter-scroll-item">
                                        <span>Физиотерапия</span>
                                    </div>
                                    <div id="list-34" class="filter-scroll-item">
                                        <span>Флебология</span>
                                    </div>
                                    <div id="list-145" class="filter-scroll-item">
                                        <span>Фтизиатрия</span>
                                    </div>
                                    <div id="list-37" class="filter-scroll-item">
                                        <span>Хирургия</span>
                                    </div>
                                    <div id="list-109" class="filter-scroll-item">
                                        <span>Челюстно-лицевая хирургия</span>
                                    </div>
                                    <div id="list-104" class="filter-scroll-item">
                                        <span>Эмбриология</span>
                                    </div>
                                    <div id="list-38" class="filter-scroll-item">
                                        <span>Эндокринология</span>
                                    </div>
                                    <div id="list-39" class="filter-scroll-item">
                                        <span>Эндоскопия</span>
                                    </div>
                                    <div id="list-40" class="filter-scroll-item">
                                        <span>Эпидемиология</span>
                                    </div>
                                </div>
                                <div class="mCSB_scrollTools" style="position: absolute; display: none;">
                                    <div class="mCSB_draggerContainer" style="position:relative;">
                                        <div class="mCSB_dragger ui-draggable" style="position: absolute; top: 0px;">
                                            <div class="mCSB_dragger_bar" style="position:relative;"></div>
                                        </div>
                                        <div class="mCSB_draggerRail"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <div class="content-block-top-block-1-window-filter-bottom">
            <input id="save-filter" class="form-key-7" type="submit" value="Сохранить параметры">
        </div>
    </div>
    <div class="content-block-top-block-1">
        <span>Фильтр ленты публикаций:</span>
        <div id="filter" class="content-block-top-block-1-filed" title="Изменить фильтр публикаций">
            <div class="content-block-top-block-1-filed-arrow"></div>
            <input id="filter-value" class="form-filed-8" type="text" name="filter" />
        </div>
    </div>
    <div class="content-block-top-separator"></div>
    <div class="content-block-top-block-2">
        <span>Поиск по слову:</span>
        <form class="content-block-top-block-2-filed">
            <div class="content-block-top-block-1-filed-search" title="Начать поиск"></div>
            <input class="form-filed-9" type="text" value="Что ищем?" placeholder="Что ищем?" name="search" />
        </form>
    </div>
    <div class="content-block-top-separator"></div>
        <div class="content-block-top-block-3">
            <form id="feedback_form" method="post" action="">
                <div class="content-block-top-window-message">
                    <div class="content-block-top-window-message-arrow"></div>
                    <div class="content-block-top-window-message-block-1">
                        <div class="content-block-top-window-message-block-1-left">
                            <span>Выберите тему:</span>
                        </div>
                        <div class="content-block-top-window-message-block-1-right">
                            <select class="default form-filed-5" name="topic">
                                <option value="Пожелания">Пожелания</option>
                                <option value="Отзыв">Отзыв</option>
                                <option value="Хочу сотрудничать">Хочу сотрудничать</option>
                                <option value="Техническая проблема на сайте">Техническая проблема на сайте</option>
                                <option value="Найдена ошибка на сайте">Найдена ошибка на сайте</option>
                                <option value="Другое">Другое</option>
                            </select>
                        </div>
                    </div>
                    <div class="content-block-top-window-message-block-1">
                        <div class="content-block-top-window-message-block-1-left">
                            <span>Ваше имя:</span>
                        </div>
                        <div class="content-block-top-window-message-block-1-right">
                            <input class="form-filed-6" type="text" value="Ким Владимир Олегович" name="name" />
                        </div>
                    </div>
                    <div class="content-block-top-window-message-block-1">
                        <div class="content-block-top-window-message-block-1-left">
                            <span>
                                Ваш E-mail
                                <br>
                                или телефон:
                            </span>
                        </div>
                        <div class="content-block-top-window-message-block-1-right">
                            <input class="form-filed-6" type="text" value="+7778620420 kimboo@mail.ru" name="contact" />
                        </div>
                    </div>
                    <div class="content-block-top-window-message-block-2">
                        <textarea class="form-filed-7 dontresize" placeholder="Текст Вашего сообщения" name="text"></textarea>
                    </div>
                    <input class="form-key-6" type="submit" value="Отправить сообщение" />
                </div>
            </form>
            <div class="content-block-top-block-3-link">
                <a id="message" title="Напиcать нам">
                    Напиcать
                    <br>
                    нам
                </a>
            </div>
        </div>
    </div>
