<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-brand" href="#">
                  <img src="https://cdn2.codingdojo.com/images/global/coding_dojo_logo_white.png" width="90" height="30" class="d-inline-block align-top" alt="">
                     Ninja Gold
                </a>
              </nav>

        <div class="gold_count_container">
            <p>Gold:</p>
        </div>

        <div class="goldcount"><p><c:out value="${gold}"/></p></div>

        <div class="box_selection_container">
            <form action="getGold" method="post">
                
                <div class="selection_box">
                    <h4>Farm</h4>
                    <p>(earn/lose 10-20 gold)</p>
                    <button type="submit" class="btn btn-outline-dark" name="button" value="farm">Get Gold</button>
                </div>
                <div class="selection_box">
                        <h4>Cave</h4>
                        <p>(earn/lose 5-10 gold)</p>
                        <button type="submit" class="btn btn-outline-dark" name="button" value="cave">Get Gold</button>

                </div>
                <div class="selection_box">
                        <h4>Loot People</h4>
                        <p>(earn/lose 2-5 gold)</p>
                        <button type="submit" class="btn btn-outline-dark" name="button" value="loot">Get Gold</button>

                </div>
                <div class="selection_box">
                        <h4>Casino</h4>
                        <p>(earn/lose 0-50 gold)</p>
                        
                        <button type="submit" class="btn btn-outline-dark" name="button" value="casino">Get Gold</button>

                </div>
            </form>
                
        </div>
        <div class="activity_log">
                <p>Activity log:</p>
                <div id="text_area">
                  <c:forEach items="${logList}" var="event">
                  	<c:out value="${event}" escapeXml="false" />
                  </c:forEach>
                       
                </div>
                <br>
                <br>

                <a href="/reset" class="startover"><button type="button" class="btn btn-outline-danger">Start Over</button></a>

            </div> 


</body>
</html>