<%-- 
    Document   : login to video conference
    Created on : 23.08.2015, 16:42:10
    Author     : Kim Vladimir
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/2.css" type="text/css" media="screen" title="default" />

        <style type="text/css">
            html { 
                background: url(${pageContext.request.contextPath}/resources/images/ceab21b8be1124fe4c40e859d4556e180b9e76c0_900_600_c.jpg) no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
            }

            .broadcast-login {
                margin: 0 auto;
                width: 355px;
            }
            .broadcast-login .countdown-container {
                height: 130px;
            }
            .broadcast-login .time {
                border-radius: 5px;
                box-shadow: 0 0 10px 0 rgba(0,0,0,0.5);
                display: inline-block;
                text-align: center;
                position: relative;
                height: 68px;
                width: 65px;

                -webkit-perspective: 500px;
                -moz-perspective: 500px;
                -ms-perspective: 500px;
                -o-perspective: 500px;
                perspective: 500px;

                -webkit-backface-visibility: hidden;
                -moz-backface-visibility: hidden;
                -ms-backface-visibility: hidden;
                -o-backface-visibility: hidden;
                backface-visibility: hidden;

                -webkit-transform: translateZ(0);
                -moz-transform: translateZ(0);
                -ms-transform: translateZ(0);
                -o-transform: translateZ(0);
                transform: translateZ(0);

                -webkit-transform: translate3d(0,0,0);
                -moz-transform: translate3d(0,0,0);
                -ms-transform: translate3d(0,0,0);
                -o-transform: translate3d(0,0,0);
                transform: translate3d(0,0,0);
            }
            .broadcast-login .count {
                background: #202020;
                color: #f8f8f8;
                display: block;
                font-family: 'Oswald', sans-serif;
                font-size: 2em;
                line-height: 2.4em;
                overflow: hidden;
                position: absolute;
                text-align: center;
                text-shadow: 0 0 10px rgba(0, 0, 0, 0.8);
                top: 0;
                width: 100%;

                -webkit-transform: translateZ(0);
                -moz-transform: translateZ(0);
                -ms-transform: translateZ(0);
                -o-transform: translateZ(0);
                transform: translateZ(0);

                -webkit-transform-style: flat;
                -moz-transform-style: flat;
                -ms-transform-style: flat;
                -o-transform-style: flat;
                transform-style: flat;
            }
            .broadcast-login .count.top {
                border-top: 1px solid rgba(255,255,255,0.2);
                /*border-bottom: 1px solid rgba(255,255,255,0.1);*/
                border-radius: 5px 5px 0 0;
                height: 50%;

                -webkit-transform-origin: 50% 100%;
                -moz-transform-origin: 50% 100%;
                -ms-transform-origin: 50% 100%;
                -o-transform-origin: 50% 100%;
                transform-origin: 50% 100%;
            }
            .broadcast-login .count.bottom {
                background-image: linear-gradient(rgba(255,255,255,0.1), transparent);
                background-image: -webkit-linear-gradient(rgba(255,255,255,0.1), transparent);
                background-image: -moz-linear-gradient(rgba(255,255,255,0.1), transparent);
                background-image: -ms-linear-gradient(rgba(255,255,255,0.1), transparent);
                background-image: -o-linear-gradient(rgba(255,255,255,0.1), transparent);
                /*border-top: 1px solid #000;*/
                border-bottom: 1px solid #000;
                border-radius: 0 0 5px 5px;
                line-height: 0;
                height: 50%;
                top: 50%;

                -webkit-transform-origin: 50% 0;
                -moz-transform-origin: 50% 0;
                -ms-transform-origin: 50% 0;
                -o-transform-origin: 50% 0;
                transform-origin: 50% 0;
            }
            .broadcast-login .count.next {
            }
            .broadcast-login .label {
                font-size: normal;
                margin-top: 5px;
                display: block;
                position: absolute;
                top: 95px;
                width: 100%;
            }
            /* Animation start */
            .broadcast-login .count.curr.top {
                -webkit-transform: rotateX(0deg);
                -moz-transform: rotateX(0deg);
                -ms-transform: rotateX(0deg);
                -o-transform: rotateX(0deg);
                transform: rotateX(0deg);
                z-index: 3;
            }
            .broadcast-login .count.next.bottom {
                -webkit-transform: rotateX(90deg);
                -moz-transform: rotateX(90deg);
                -ms-transform: rotateX(90deg);
                -o-transform: rotateX(90deg);
                transform: rotateX(90deg);
                z-index: 2;
            }
            /* Animation end */
            .broadcast-login .flip .count.curr.top {
                -webkit-transition: all 250ms ease-in-out;
                -moz-transition: all 250ms ease-in-out;
                -ms-transition: all 250ms ease-in-out;
                -o-transition: all 250ms ease-in-out;
                transition: all 250ms ease-in-out;

                -webkit-transform: rotateX(-90deg);
                -moz-transform: rotateX(-90deg);
                -ms-transform: rotateX(-90deg);
                -o-transform: rotateX(-90deg);
                transform: rotateX(-90deg);
            }
            .broadcast-login .flip .count.next.bottom {
                -webkit-transition: all 250ms ease-in-out 250ms;
                -moz-transition: all 250ms ease-in-out 250ms;
                -ms-transition: all 250ms ease-in-out 250ms;
                -o-transition: all 250ms ease-in-out 250ms;
                transition: all 250ms ease-in-out 250ms;

                -webkit-transform: rotateX(0deg);
                -moz-transform: rotateX(0deg);
                -ms-transform: rotateX(0deg);
                -o-transform: rotateX(0deg);
                transform: rotateX(0deg);
            }
            @media screen and (max-width: 48em) {
                .broadcast-login {
                    width: 100%;
                }
                .broadcast-login .countdown-container {
                    height: 100px;
                }
                .broadcast-login .time {
                    height: 70px;
                    width: 48px;
                }
                .broadcast-login .count {
                    font-size: 1.5em;
                    line-height: 70px;
                }
                .broadcast-login .label {
                    font-size: 0.8em;
                    top: 72px;
                }
            }

        </style>

        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/countdown/lodash.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/countdown/jquery.countdown.min.js"></script>
        <title><spring:message code="label.ivf" text="IVF" /></title>
    </head>
    <body>
        <div class="container">
            <c:if test="${not empty login_error}">
                <font color="red">
                    <spring:message code="label.loginerror" text="login error" /><br/><br/>
                </font>
            </c:if>
            <div class="row" id="pwd-container">
                <div class="col-md-4"></div>
                <div class="col-md-4">
                    <section class="login-form">
                        <c:if test="${status == 1}">
                            <form action="/video/login/login" method="GET" >
                                <a href="http://www.ivf.kz">
                                    <img src="http://irm.kz/wp-content/themes/irm-template/assets/images/logo2.png" class="img-responsive" alt="" />
                                </a>
                                <input type="HIDDEN" name="meetingId" id="meetingId" class="form-control input-lg" value="${mettingId}" />

                                <input type="text" class="form-control input-lg btn-block" name="login" id="login" />
                                <input type="password" class="form-control input-lg btn-block" name="pass" id="pass" />

                                <div class="pwstrength_viewport_progress"></div>


                                <button type="submit" class="btn btn-lg btn-primary btn-block">
                                    <spring:message code="label.logining" />
                                </button>



                            </form>
                        </c:if>
                        <c:if test="${status == 3}">
                            <div class="broadcast-login">
                                <H2>
                                    <code>
                                        This broadcast not found!
                                    </code>
                                </H2>
                            </div>    
                        </c:if>
                        <c:if test="${status == 0}">
                            <div class="broadcast-login">
                                <H2>
                                    До начала трансляции осталось:
                                </H2>
                                <div class="countdown-container" id="broadcast-login">
                                </div>
                            </div>
                        </c:if>
                        <div class="form-links"></div>

                    </section>  
                </div>
                <div class="col-md-4"></div>

                <c:if test="${status == 0}">
                    <script type="text/template" id="broadcast-login-template">
                        <div class="time <@= label@>">
                        <span class="count curr top"><@= curr@></span>
                        <span class="count next top"><@= next@></span>
                        <span class="count next bottom"><@= next@></span>
                        <span class="count curr bottom"><@= curr@></span>
                        <span class="label"><@= label.length < 6 ? label : label.substr(0, 3)@></span>
                        </div>
                    </script>
                    <script type="text/javascript">
                            $(window).on('load', function () {
                                _.templateSettings = {
                                    interpolate: /\<\@\=(.+?)\@\>/g,
                                    evaluate: /\<\@([\s\S]+?)\@\>/g,
                                    escape: /\<\@\-(.+?)\@\>/g
                                };

                                var labels = ['weeks', 'days', 'hours', 'minutes', 'seconds'],
                                        nextYear = '${brdcDate}', //(new Date().getFullYear() + 1) + '/01/01 18:00:00',
                                        template = _.template($('#broadcast-login-template').html()),
                                        currDate = '00:00:00:00:00',
                                        nextDate = '00:00:00:00:00',
                                        parser = /([0-9]{2})/gi,
                                        $example = $('#broadcast-login');
                                // Parse countdown string to an object
                                function strfobj(str) {
                                    var parsed = str.match(parser),
                                            obj = {};
                                    labels.forEach(function (label, i) {
                                        obj[label] = parsed[i]
                                    });
                                    return obj;
                                }
                                // Return the time components that diffs
                                function diff(obj1, obj2) {
                                    var diff = [];
                                    labels.forEach(function (key) {
                                        if (obj1[key] !== obj2[key]) {
                                            diff.push(key);
                                        }
                                    });
                                    return diff;
                                }
                                // Build the layout
                                var initData = strfobj(currDate);
                                labels.forEach(function (label, i) {
                                    $example.append(template({
                                        curr: initData[label],
                                        next: initData[label],
                                        label: label
                                    }));
                                });
                                // Starts the countdown
                                $example.countdown(nextYear, function (event) {
                                    var newDate = event.strftime('%w:%d:%H:%M:%S'),
                                            data;
                                    if (newDate !== nextDate) {
                                        currDate = nextDate;
                                        nextDate = newDate;
                                        // Setup the data
                                        data = {
                                            'curr': strfobj(currDate),
                                            'next': strfobj(nextDate)
                                        };
                                        // Apply the new values to each node that changed
                                        diff(data.curr, data.next).forEach(function (label) {
                                            var selector = '.%s'.replace(/%s/, label),
                                                    $node = $example.find(selector);
                                            // Update the node
                                            $node.removeClass('flip');
                                            $node.find('.curr').text(data.curr[label]);
                                            $node.find('.next').text(data.next[label]);
                                            // Wait for a repaint to then flip
                                            _.delay(function ($node) {
                                                $node.addClass('flip');
                                            }, 50, $node);
                                        });
                                    }
                                });
                            });
                    </script>   
                </c:if>
            </div>
            <p>
                <br>
                <br>
            </p>  
        </div>        
    </body>
</html>
