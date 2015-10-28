<%-- 
    Document   : navbar-static-side
    Created on : Oct 8, 2015, 1:08:17 PM
    Author     : kvo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <tiles:importAttribute name="MainMenu" />
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">
                            <i class="fa fa-search"></i>
                        </button>
                    </span>
                </div>
                <!-- /input-group -->
            </li>
            
            <c:forEach items="${MainMenu}" var="userMenuItem">
                <c:if test="${userMenuItem.menuItemEnabled}">
                    <c:if test="${empty userMenuItem.parrent}">
                        <li <c:if test="${!empty userMenuItem.menuItems}">class</c:if>>
                            <a href="${pageContext.request.contextPath}${userMenuItem.page.pageurl}">
                                <i class="fa ${userMenuItem.icon} fa-fw"></i>
                                ${userMenuItem.menuItemtitle}
                                <c:if test="${!empty userMenuItem.menuItems}">
                                    <span class="fa arrow"></span>
                                </c:if>
                            </a>
                            <c:if test="${!empty userMenuItem.menuItems}">
                                <ul class="nav nav-second-level collapse" aria-expanded="false" style="height: 0px;">
                                    <c:forEach items="${userMenuItem.menuItems}" var="userMenuItemMenuItem">
                                        <li>
                                            <a href="${pageContext.request.contextPath}${userMenuItemMenuItem.page.pageurl}">
                                                ${userMenuItemMenuItem.menuItemtitle}
                                            </a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </c:if>
                        </li>
                    </c:if>
                </c:if>
            </c:forEach>            
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->
