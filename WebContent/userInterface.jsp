<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE>
<html>
<head>
<meta charset=UTF-8>
<title>ログイン画面</title>

</head>
<body>
	<br><h3>ログインIDとパスワードを入力してください。</h3>
	<s:form action="LoginAction">
		ログインID：<input type="text" name="userId">
		<br>
		パスワード：<input type="text" name="password">
		<s:submit value="ログイン"/>
	</s:form>

	<a href="userCreate.jsp">新規登録はこちら！</a><br>
	<a href="changePassword.jsp">パスワードの再設定はこちら！</a>


	<br><br>
	<s:form action="">
		<h3>パスワードをお忘れの場合、秘密の質問にお答えください</h3><br>
		あなたの好きな食べ物は？：<input type="password" name="dislikeFood">
		<br>
		あなたのお気に入りの映画は？；<input type="password" name="favFood">
	</s:form>


	<br><br><a href="home.jsp" >ホーム画面に戻る</a>


</body>
</html>