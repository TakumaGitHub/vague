<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" href="./css/master.css">
<meta http-equiv="refresh" content="5;URL=<s:url action='MasterAction' />">
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>商品情報変更完了画面</title>
</head>

<body>
<s:if test="#session.LoginUserDTO == null || #session.LoginUserDTO.mFlg != 1" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

  <jsp:include page="headerMaster.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">
		<div class="container">

    	<h2>商品情報の変更が完了いたしました</h2>
		<div class="back-link">
    	<p>5秒後にトップページに戻ります</p>

    	<p><a href="/vague/home.jsp" >戻らない場合はこちら</a></p>
		</div>
		</div>
    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>