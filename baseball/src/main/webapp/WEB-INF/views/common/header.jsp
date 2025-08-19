<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
  request.setCharacterEncoding("UTF-8");
%> 
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
<title>헤더</title>
</head>
<body>
<style>
@import url('https://fonts.googleapis.com/css2?family=Merienda:wght@700&display=swap');

* {
  margin:0;   /* 마진 리셋 */
  padding:0;   /* 패딩 리셋 */
  box-sizing: border-box;   /* 박스 영역은 테두리까지 */ 
   margin: 0 auto;
}
a {
   box-sizing: border-box;
  text-decoration:none;  /* 텍스트 링크 밑줄 없애기 */ 
}
ul {
   box-sizing: border-box;
  list-style: none;
   margin: 0 auto;
}

#container {
   box-sizing: border-box;
  margin:10 auto;  /* 화면 중앙에 배치 */
  width:1200px;    /* 너비 */    
  background-color: #fff;
   margin: 0 auto;
}


.element {
  min-width: 200px;
  max-width: 500px;
}
/*********************************/
/* 헤더 영역 - 로고와 내비게이션 */
/*********************************/

header{
   box-sizing: border-box;
  width:100%;    /*  너비 */
  height:100px;   /* 높이 */ 
  background-color:#045;  
}

 #wrapper {
   box-sizing: border-box;
	position: relative;
	width: 100%;
	height: 0;
	overflow: hidden;
	padding-bottom: 30%;
}
#wrapper .wrap {
   box-sizing: border-box;
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
}
		.sidebar {
       box-sizing: border-box;
			width: 5%;
			height: 100%;
       margin: 0 auto;
		}
		#left{
       box-sizing: border-box;
			background:#f1a054;
      float: right;
       margin: 0 auto;
		}


/* 로고 */
#logo{ 
   box-sizing: border-box;
  float:left;   /* 왼쪽으로 플로팅 */ 
  width:150px;   /*  너비 */ 
  height:60px;   /* 높이 */
  line-height:110px;  /* 세로로 중간에 맞춤 - 줄간격을 높이 값과 같게 */
  padding-left:0px;  /* 왼쪽에 여백 */
   margin: 0 auto;
}
#logo h1 {
   box-sizing: border-box;
  font-family:'Merienda', cursive;
  font-weight:700;
  font-size:40px;   /* 글자 크기 */
  color:#fff;   /* 글자 색*/
  text-shadow:0 -1px 0 #222;  /* 그림자 색 */
   margin: 0 auto;
}

/* 내비게이션 */
nav{  
   box-sizing: border-box;
  float:right;   /* 오른쪽으로 플로팅 */
  width:1500px;   /*   너비 */  
  height:100px;   /* 메뉴 영역 높이 */  
  padding-top:20px;  /* 메뉴를 아래로 내리기 위해 */  
   margin: 0 auto;
}
#topMenu {  
   box-sizing: border-box;
  height:30px; 
}
#topMenu > li {
  float:left;  /* 메뉴 항목을 왼쪽으로 플로팅 */ 
  position: relative;  
   margin: 0 auto;
}
#topMenu > li > a{
  display:block;  /* 링크 텍스트는 블록으로 */ 
  font-size:1.1em;
  color:rgb(192, 51, 51);  /* 글자 색 */
  font-weight:600;  /* 글자 굵기 */
  padding:20px 60px;  /* 패딩 */ 
   margin: 0 auto;
}
#topMenu > li > a:hover {
  color:#1fa8f8;
  text-shadow:0 -2px #222;
   margin: 0 auto;
}



#topMenu1 {  
   margin: 0 auto;
  height:80px; 
  width:1550px;
   box-sizing: border-box;
}
#topMenu1 > li {
   margin: 0 auto;
  width:500px;
  float:right;  /* 메뉴 항목을 왼쪽으로 플로팅 */ 
  position: relative;  
}
#topMenu1 > li > a{
   margin: 0 auto;
  display:block;  /* 링크 텍스트는 블록으로 */ 
  font-size:1.5em;
  color:rgb(192, 51, 51);  /* 글자 색 */
  font-weight:600;  /* 글자 굵기 */
  padding:20px 60px;  /* 패딩 */ 
}
#topMenu1 > li > a:hover {
   margin: 0 auto;
  color:#1fa8f8;
  text-shadow:0 -2px #222;
}


.login-wrapper{
    width: 400px;
    height: 10px;
    padding: 40px;
    box-sizing: border-box;
}

.login-wrapper > h2{
    font-size: 70px;
    color: #1fc41f;
    margin-bottom: 100px;
}
#login-form > input{
    width: 100%;
    height: 48px;
    padding: 0 10px;
    box-sizing: border-box;
    margin-bottom: 16px;
    border-radius: 6px;
    background-color: #F8F8F8;
}
#login-form > input::placeholder{
    color: #D2D2D2;
}
#login-form > input[type="submit"]{
    color: #fff;
    font-size: 16px;
    background-color: #1fc41f;
    margin-top: 10px;
}


/* 본문 */

.contents {
  width:1000px;
  margin:50px auto;  
}
main > section {
  margin-top:60px;  
}
main h2 {    
  font-size:1.5em;
  line-height: 2.5;
}
main div {
  margin-top:20px;
}
main h3 {
  font-size:1.2em;
  line-height:2.2;
}
.detail p {
  line-height: 2.0;
  color:#222;
}
.detail > img {
  float:left; 
  margin-right:50px;
  border-radius:20px;
}
.schedule h4 {
  font-size:1.2em;
}
.schedule ul {
  list-style: none;
}
.schedule ul li { 
  line-height: 2;
}


/******************/
/*   푸터 영역    */
/******************/

footer{   
  width:1200px;   /* 너비 */
  height:100px;  /* 높이 */
  border-top:2px solid #222;
}
#bottomMenu{
  width:100%;
  height:20px;
  margin-left:60px;
}
#bottomMenu ul {
  margin-top:15px;  
}
#bottomMenu ul li{
  float:left;  /* 가로로 배치 */ 
  padding:5px 20px;
  border-right:1px solid #ddd;   /* 항목 오른쪽에 테두리 */ 
}
#bottomMenu ul li:last-child{
  border:none;  /* 마지막 항목에는 오른쪽 테두리 없음 */  
}
#bottomMenu ul li a, #bottomMenu ul li a:visited {  
  font-size:15px;  /* 글자 크기 */ 
  color:#666;   /* 글자 색 */ 
} 

button{
  font-size: 1em;
  background: #fff;
  padding: 1px;
  margin: 20;
  border: 1px solid #222;
  box-shadow: 1px -1px 5px 2px #000;
  position: absolute;
  left:1440px;
  top:870px;
   background-color: #ff2600;
}

h1 {
  color: #fff;
  font-size: 120px;
  text-shadow: 2px 3px 0 #000;
  position:absolute;
 right: 100px;
 bottom: 100px;
}
img{
   position: absolute;
  left:100px;
  top:30px;
}




table {
    width: 700px;
    height: 500px;
    margin: auto;      
}
.email {
    width: 127px;
    height: 32px;
    font-size: 15px;
    border: 0;
    border-color: lightgray;
    border-radius: 15px;
    outline: none;
    padding-left: 10px;
    background-color: rgb(233,233,233);
}
.text {
    width: 250px;
    height: 32px;
    font-size: 15px;
    border: 0;
    border-radius: 15px;
    outline: none;
    padding-left: 10px;
    background-color: rgb(233,233,233);
}
select {
    width: 100px;
    height: 32px;
    font-size: 15px;
    border: 1;
    border-color: lightgray;
    border-radius: 100px;
    outline: none;
    padding-left: 100px;
}
.btn {
    width: 262px;
    height: 32px;
    font-size: 15px;
    border: 0;
    border-radius: 15px;
    outline: none;
    padding-left: 10px;
    background-color: rgb(26, 212, 57);
}
.btn:active {
    width: 262px;
    height: 32px;
    font-size: 15px;
    border: 0;
    border-radius: 15px;
    outline: none;
    padding-left: 10px;
    background-color: rgb(48, 196, 29);
}
</style>
<table border=0  width="100%">
  <tr>
     <td>
		<a href="${contextPath}/main.do">
			 <img src="//6ptotvmi5753.edge.naverncp.com/KBO_IMAGE/KBOHome/resources/images/common/h1_logo.png" alt="" >
  			<iframe width="30" height="30" src="https://www.youtube.com/embed/AVA2scCo7ds?si=_0YpWH62J2JTkw2C"></iframe>
		</a>
     </td>
     <td>
       <!-- 내비게이션 -->
  <nav>
    <ul id="topMenu">
      <li><a href="player_info-2.html">FA선수 정보</a></li>
      <li><a href="teams.html">팀 순위</a></li>
      <li><a href="baseball.html">게임하기</a></li>
      <li><a href="q.html">문의하기</a></li>
      <li><a href="gallery.html">커뮤니티</a></li>
      <ul id="topMenu1">
        <li><a href="hidden.html"><h6><blockquote> 로그인</blockquote></h6></a></li>
        </ul >
   </nav>
     </td>
     
     <td>
       <!-- <a href="#"><h3>로그인</h3></a> -->
       <c:choose>
          <c:when test="${isLogOn == true  && member!= null}">
            <h3>환영합니다. ${member.name }님!</h3>
            <a href="${contextPath}/member/logout.do"><h3>로그아웃</h3></a>
          </c:when>
          <c:otherwise>
	        <a href="${contextPath}/member/loginForm.do"><h3>로그인</h3></a>
	      </c:otherwise>
	   </c:choose>     
     </td>
  </tr>
</table>


 
</body>
</html>