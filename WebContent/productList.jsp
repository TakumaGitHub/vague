<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="imagetoolbar" content="no"/>
<title>商品一覧</title>
<style type="text/css">


</style>
</head>
<body>
<!-- ヘッダーのインクルード  -->
<%-- <jsp:include page="include_header.jsp" /> --%>

<!-- 一覧ボタン押下 -->
<s:iterator value="displayList">
<div class="itemList">
		<!-- 商品画像（オンクリックで詳細にジャンプ） -->
		<a href="<s:url action='ProductDetailsAction' />?productId=<s:property value='productId'/>">
		<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>
		</a>
		<!-- 商品名 -->
		<s:property value="productName" />
		<br>
		<!-- 商品名かな -->
		<s:property value="productNameKana"/>
		<br>
		<%-- <!-- 価格 -->
		<s:property value="price"/>
		<br> --%>
</div>
</s:iterator>

</body>
</html>