<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>

<head>
	<jsp:include page="head.jsp" />
	<style type="text/css">
		<%@ include file="../css/myPage.css" %>
	</style>

	<title>myPage.jsp</title>
</head>

<body>
	<!--  headerの始まり -->
	<jsp:include page="header.jsp" />
	<!--  headerの終わり -->

	<!--  mainの始まり -->
	<div id="main">
		<div class="container">
			<h2 class="title">My Page</h2>

				<table>
					<tr><td colspan="2"><hr></td></tr>
						<s:iterator value="myPageList">

							<tr>
								<th class="line">　氏名</th>
								<td class="line">　<s:property value="familyName" escape="false" />　<s:property value="firstName" escape="false" /></td>
							</tr>
							<tr>
								<th class="line">　ふりがな</th>
								<td class="line">　<s:property value="familyNameKana" escape="false" />　<s:property value="firstNameKana" escape="false" /></td>
							</tr>
							<tr>
								<th class="line">　性別</th>
								<td class="line">
									<s:if test="sex == 0">　男性</s:if>
									<s:if test="sex == 1">　女性</s:if></td>
							</tr>
							<tr>
								<th class="line">　メールアドレス</th>
								<td class="line">　<s:property value="email" escape="false" /></td>
							</tr>
							<tr><td colspan="2"><hr></td></tr>
							<tr>
								<th class="line">　ログインID</th>
								<td class="line">　<s:property value="#session.LoginUserDTO.userId" escape="false" /></td>
							</tr>
							<tr>
								<th class="line">　パスワード</th>
								<td class="line">　<s:property value="#session.invisiblePassword" escape="false" /></td>
							</tr>

						</s:iterator>
					<tr><td colspan="2"><hr></td></tr>
				</table>

			<div class="button">
				<form action="GoHomeAction">
					<input class="normal-button" type="submit" value="ホームに戻る" />
				</form>
				<form action="userPasswordUpdate.jsp">
					<input class="button" type="submit" value="パスワードを変更" />
				</form>
				<form action="AddressAction" >
					<input class="button" type="submit" value="宛先を登録する" />
				</form>
				<form action="PurchaseHistoryAction">
					<input class="button" type="submit" value="商品購入履歴へ" />
				</form>
			</div>

			<br>
			<br>

		</div>
	</div>
	<!--  mainの終わり -->

	<!-- footerの始まり -->
	<jsp:include page="footer.jsp" />
	<!-- footerの終わり -->

</body>
</html>