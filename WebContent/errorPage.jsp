<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<meta http-equiv="refresh" content="3;URL=<s:url action='GoHomeAction' />" />
<title>エラーページ</title>

</head>
<body>

	<!--  headerの始まり -->

 	<jsp:include page="headerMaster.jsp" />

    <!--  headerの終わり -->

	<!--  mainの始まり -->
	<div id="main">
		<div class="container">
			<h2 class="title">エラーページ</h2>

				<p>エラーが発生しました。3秒後にホームページに戻ります。</p>
				<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
				<p><a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a></p>

		</div>
	</div>
	<!--  mainの終わり -->

	<!-- footerの始まり -->
	<jsp:include page="footer.jsp" />
	<!-- footerの終わり -->



</body>
</html>