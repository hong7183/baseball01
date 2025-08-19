<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<!doctype html>
<html lang ="ko">
<head>
     <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>이적시장 분석</title>
   <style>h6{padding: 10;
  background-color: #045;
  color: #67c46e;
 
  }
   @import url('https://fonts.googleapis.com/css2?family=Dancing+Script:wght@700&display=swap');
    body {
      background:url('${contextPath}/resources/images/야구장2.jpg') no-repeat fixed;
      background-size:cover;
      text-align:center;
    }
    @media screen and (min-width: 768)and (max-width: 1023px){
    body {
      background: url(images/bg-light.jpg) no-repeat fixed;  
      background-size: cover;
      color: fff;
    }
  }
    h1 {
      font-size:120px;
      color: #fff;  
    }
    .wfont {
      font-family: 'Dancing Script', cursive;
    }
  </style>
   <link rel="stylesheet" href="css/structure.css">
  </head>
  <body>
    
<table>
	<tr>
	<td>
	fffffff
	<img src = "http://transfermarket.dothome.co.kr/images/야구장2.jpg	">
	</td>
	</tr>
	
</table>
 <button onclick="openPopup()">타격하기!</button>
    <script>
      function openPopup() {
        window.open("popup.html", "popup", "width=500,height=400");
      }
    </script>
   <!--  <div style="position: relative; width: 200px; height: 200px;">
     
      
    </div> -->
       
  </body>
  </html>   
    
