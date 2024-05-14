<%-- 
    Document   : template.jsp
    Created on : 14 mai 2024, 11:02:00
    Author     : Valentina Sarais
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="<c:url value="../../static/img/citron.jpg">" />
        <link rel="stylesheet" href="<c:url value="../../static/style.css">">
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <title>${param.title}</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/template/header.jsp" />
        <main>
            <jsp:include page="/WEB-INF/contents/${param.content}.jsp" />
        </main>
        <jsp:include page="/WEB-INF/template/footer.jsp" />
    </body>
</html>
