<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<head>
	<jsp:include page="WEB-INF/head.jsp" />
<title>マイページ</title>
<style type="text/css">





</style>
</head>





<body>

	<!--  headerの始まり -->
	<jsp:include page="WEB-INF/header.jsp" />
	<!--  headerの終わり -->



	<!--  mainの始まり -->
	<div id="main">

		<table><s:iterator value="myPageList">
			<tr>
				<th>お名前（姓）</th>
				<td><s:property value="familyName" escape="false" /></td>
			</tr>
			<tr>
				<th>お名前（名）</th>
				<td><s:property value="firstName" escape="false" /></td>
			</tr>
			<tr>
				<th>ふりがな（せい）</th>
				<td><s:property value="familyNameKana" escape="false" /></td>
			</tr>
			<tr>
				<th>ふりがな（めい）</th>
				<td><s:property value="firstNameKana" escape="false" /></td>
			</tr>
			<tr>
				<th>性別</th>
				<td><s:if test="sex==0">男性</s:if>
					<s:if test="sex==1">女性</s:if></td>
			</tr>
			<tr>
				<th>メールアドレス</th>
				<td><s:property value="email" escape="false" /></td>
			</tr>
		</s:iterator></table>



		<input type="button" onclick="location.href='<s:url action="GoHomeAction" />'" value="ホームに戻る">

		<br>

		<input type="button" onclick="location.href='<s:url action="PurchaseHistoryAction" />'" value="商品購入履歴に行く">


	</div>
	<!--  mainの終わり -->


	<!-- footerの始まり -->
	<jsp:include page="WEB-INF/footer.jsp" />
	<!-- footerの終わり -->

</body>
</html>