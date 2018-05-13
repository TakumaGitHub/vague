<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<title>パスワード更新画面</title>
</head>

<body>
<s:if test="#session.LoginUserDTO != null">
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

   <jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->

		<h2>パスワードの再設定</h2>

		<form action="UserPasswordUpdateAction" method="post">

			<strong><s:property value="errorMsg"/></strong>

			<p><s:property value="userIdErrorMsg"/></p>
			<p>半角英数字1～8文字で入力してください。</p>
			<p>ログインID</p>

			<s:if test="#session.UserPasswordUpdateDTO.userId != null">

				<p><input type="text" name="userId" value="<s:property value='#session.UserPasswordUpdateDTO.userId' />" pattern="^[a-zA-Z0-9]{1,16}$" /></p>

			</s:if>
			<s:else>

				<p><input type="text" name="userId" value="<s:property value='#session.saveId' />" pattern="^[a-zA-Z0-9]{1,16}$" /></p>

			</s:else>


			<p><s:property value="passwordErrorMsg"/></p>
			<p>半角英数字1～16文字で入力してください。</p>
			<p>新しいパスワード</p>
			<p><input type="password" name="newPassword" pattern="^[a-zA-Z0-9]{1,16}$" /></p>
			<p>新しいパスワード(確認)</p>
			<p><input type="password" name="newPasswordConfirm" pattern="^[a-zA-Z0-9]{1,16}$" /></p>


			<input type="submit" value="確認画面に行く" />

		</form>




	<!--  mainの始まり -->

    <div id="main">


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>

