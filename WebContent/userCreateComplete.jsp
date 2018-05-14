<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<!-- ホーム画面に5秒後遷移 content="秒数" -->
<meta http-equiv="refresh" content="5;URL=GoHomeAction">

<title>新規ユーザー登録完了画面</title>
<jsp:include page="head.jsp" />

</head>

<body>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

				<div id="main">

					<h2>ユーザー登録完了</h2>

					<a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a>

				</div>



	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->
</body>
</html>