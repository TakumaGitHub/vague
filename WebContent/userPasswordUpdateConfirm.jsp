<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />

<title>パスワード更新確認画面</title>
</head>

<body>
<s:if test="#session.UserPasswordUpdateDTO == null">
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>



	<!--  headerの始まり -->

   <jsp:include page="header.jsp" />

    <!--  headerの終わり -->

    	<!--  mainの始まり -->

    <div id="main">
    	<div class="container">

    	<div class="title">パスワード更新確認画面</div>

		<h2>パスワードを変更してよろしいですか？</h2>

		<table>

			<tbody>

				<tr>

					<th>ログインID：</th>
					<td><s:property value='#session.UserPasswordUpdateDTO.userId' /></td>

				</tr>

				<tr>

					<th>新しいパスワード：</th>
					<td><s:property value='#session.hidePassword' /></td>

				</tr>



			</tbody>



		</table>


		<form action="UserPasswordUpdateCompleteAction" method="post" >
			<input type="submit" value="パスワードを変更する" />
		</form>
		<form action="/vague/userPasswordUpdate.jsp" method="post" >
			<input type="submit" value="戻って修正する" />
		</form>

		</div>
    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>