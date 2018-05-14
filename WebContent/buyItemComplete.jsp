<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<!-- ホーム画面に10秒後遷移 content="秒数" -->
<jsp:include page="head.jsp" />
<meta http-equiv="refresh" content="3;URL=GoHomeAction">

<title>決済完了画面</title>


</head>

<body>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->

	<div class="main">
		<div class="form">
			<div class="form-heading">
				<h2>【決済完了】</h2>
			</div>

				<h2>ご注文ありがとうございました。</h2>
				ご購入履歴の確認は<a href='<s:url action="PurchaseHistoryAction"/>'>こちら</a>
				<p>10秒後に自動的にホーム画面へ遷移します。</p>
				<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
				<a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a>

			</div>
		</div>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>