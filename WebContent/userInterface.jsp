<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<link rel="stylesheet" href="./css/userInterface.css">
<title>ログイン画面</title>

</head>
<body>

<s:if test="#session.LoginUserDTO != null">
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

	<div id="main">

		<div class="container">


			<div id="input" class="left">
				<br><h3>ログインIDとパスワードを入力してください。</h3>
				<p><s:property value="errorMsg" /></p>
				<s:form action="LoginAction">
						<p><s:property value="userIdErrorMsg" /></p>





						ログインID：<input type="text" name="userId" value="<s:property value='#session.saveId' />" >
						<br>
						<p><s:property value="passwordErrorMsg" /></p>
						パスワード：<input type="password" name="password">
						<p>ログインID保存
							<s:if test="#session.savaId != 0" >
								<input type="checkbox" name="saveId" value="1">
							</s:if>
							<s:else>
								<input type="checkbox" name="saveId" value="1">
							</s:else>
						</p>
						<s:submit value="ログイン"/>


				</s:form>
			</div>

		<div class="right">
			<br><h3>新規登録・パスワードの再設定はこちら。</h3><br>
			<a href="userCreate.jsp">新規登録はこちら！</a><br>
			<a href="userPasswordUpdate.jsp">パスワードの再設定はこちら！</a>
			<br><br><br><a href="home.jsp" >ホーム画面に戻る</a>
		</div>




		</div>


	</div>





	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>