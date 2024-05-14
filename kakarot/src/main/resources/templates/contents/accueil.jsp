<%-- 
    Document   : accueil
    Created on : 14 mai 2024, 10:59:07
    Author     : Elisa BOTHY
--%>

%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="container" id="container">
    <a class="createPlants" href="<c:url value="/ajouter"/>"><span  class="button">Ajouter une plante</span></a>
    <div class="MonthPlants">
        <h2>Ce mois-ci</h2>
        <c:forEach var="plants" items="${requestScope.monthPlants}">
            <div class="plant">
                <a href=" <c:url value="/visitor/news?id=${plants.id} "/>" class="article-link">
                    <img src="<c:url value='/assets/photos/${plants.filename}'/>" alt="${plants.title}"/>
            </div>
        </c:forEach>
    </div>
    <div class="nextMonthPlants">
        <h2>Le mois suivant</h2>
        <c:forEach var="plants" items="${requestScope.nextMonthPlants}">
            <div class="MonthPlants">
                <h2>Le mois suivant</h2>
                <div class="plant">
                    <a href=" <c:url value="/visitor/news?id=${plants.id} "/>" class="article-link">
                        <img src="<c:url value='/assets/photos/${plants.filename}'/>" alt="${plants.title}"/>
                    </a>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
