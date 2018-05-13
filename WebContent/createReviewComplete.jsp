<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<meta http-equiv="refresh" content="5;URL=<s:property value='GoHomeAction' />" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>レビュー投稿完了画面</title>
</head>

<body>



	<!--  headerの始まり -->

   		<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->

		<h2>レビューの投稿が完了いたしました</h2>

    	<p>5秒後にトップページに戻ります</p>

		<p><a href="<s:property value='GoHomeAction' />" >戻らない場合はこちら</a></p>


	<!--  mainの始まり -->

    <div id="main">


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>