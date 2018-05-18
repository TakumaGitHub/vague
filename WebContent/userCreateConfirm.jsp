<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<link rel="stylesheet" href="./css/userInterface.css">
<title>入力情報確認</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->


<div id="main">
	<div class="container">

	<div class="title">入力情報確認ページ</div>

	<h3>以下の情報で間違いがなければ登録ボタンをクリックしてください。</h3><br>

	<s:form action="UserCreateCompleteAction" method="post">
		<p  class="userinform">
		＜姓＞：<s:property value="familyName"/> <br><br>
		＜名＞：<s:property value="firstName"/> <br><br>
		＜姓かな＞：<s:property value="familyNameKana"/> <br><br>
		＜名かな＞：<s:property value="firstNameKana"/> <br><br>
		＜性別＞：<s:if test="sex == 0" > 男 </s:if>
		<s:if test="sex == 1" > 女 </s:if> <br><br>
		＜メールアドレス＞：<s:property value="email"/> <br><br>
		＜ログインID＞：<s:property value="userId"/> <br><br>
		＜パスワード＞：<s:property value="password"/> <br><br>
		</p>

		<s:submit  value="この情報で登録"/>



	</s:form>

	<a href="userCreate.jsp" class="button3">戻って修正する</a>

	</div>
</div>

	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>
