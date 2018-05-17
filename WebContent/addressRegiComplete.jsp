<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<meta http-equiv="refresh"content="3; url=BuyItemAction">
<link rel="stylesheet" type="text/css" href="css/address.css">
<title>宛先登録完了画面</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

	<div id="main">
	<div class="container">

		<h3>宛先が登録されました。</h3>

	<div>
		<p>3秒後に決済画面に戻ります。</p>
		<s:form action="BuyItemAction">
			<p>※決済画面に戻らない場合、こちらのボタンを押してください↓<input type="submit" value="戻る" ></p>
		</s:form>
	</div>

	</div>
	</div>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>