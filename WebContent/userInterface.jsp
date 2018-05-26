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

		<h3 class="title">ログイン・新規登録ページ</h3>

		<div class="input-wrapper" >

			<div id="input" class="left">
				<h3>ログインIDとパスワードを入力してください。</h3>
				<p class="error-msg"><s:property value="errorMsg" /></p>

				<div>

					<form action="LoginAction">
						<p class="error-msg"><s:property value="userIdErrorMsg" /></p>
						ログインID：<input type="text" name="userId" value="<s:property value='#session.saveId' />" >
						<br>
						<p class="error-msg"><s:property value="passwordErrorMsg" /></p>
						パスワード：<input type="password" name="password">
						<p>ログインID保存
							<s:if test="#session.saveId != null" >
								<input type="checkbox" name="saveId" value="1" checked="checked">
							</s:if>
							<s:else>
								<input type="checkbox" name="saveId" value="1">
							</s:else>
						</p>

						<s:submit value="ログイン"/>

					</form>

				</div>


				<div>
					<form action="userPasswordUpdate.jsp">
					<input  type="submit" value="パスワードの再設定">
					</form>
				</div>

			</div>

			<div class="right">
				<h3>新規のお客様のご登録はこちら。</h3><br>
				<s:form action="userCreate.jsp">
						<input type="submit" value="新規登録">
						</s:form><br>
			</div>

		</div>

			<div class="input-wrapper" >

				<p><a href="home.jsp" >ホーム画面に戻る</a></p>

			</div>


		</div>
	</div>



	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>