<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/createReview.css" />

<meta http-equiv="refresh" content="3;URL=<s:url action='GoHomeAction' />" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>レビュー投稿完了画面</title>
</head>

<body>



	<!--  headerの始まり -->

   		<jsp:include page="header.jsp" />

    <!--  headerの終わり -->



	<!--  mainの始まり -->

    <div id="main">

    	<div class="container">

			<div class="main-container">

				<h2 class="title">レビュー投稿完了</h2>

				<p>レビューの投稿が完了いたしました</p>

		    	<p>3秒後にトップページに戻ります</p>

				<p><a href="<s:url action='GoHomeAction' />" >戻らない場合はこちら</a></p>

			</div>

    	</div>



    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>