<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>商品詳細ページ</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
</head>
<body>
<!-- ヘッダーのインクルード -->
<%-- <jsp:include page="include_header.jsp"/> --%>


	<%-- <s:form action="CartProductAction" name="select"> --%>
	<table class="detailsTable">
	<tr>
	<th>
		<!-- カテゴリ分類 -->
		<span>
			<s:if test="session.category_id==1">
				<h2>Chair</h2>
			</s:if>
			<s:if test="session.category_id==2">
				<h2>Sofa</h2>
			</s:if>
			<s:if test="session.category_id==3">
				<h2>Lighting</h2>
			</s:if>
			<s:if test="session.category_id==4">
				<h2>Table</h2>
			</s:if>
		</span>
	</th>
	</tr>
<!-- 画像の表示 -->
	<tr>
	<td>
		<span>
			<img class="image" src="<s:property value='session.image_file_path' />" alt="Photo" style="max-width:400px; max-height:300px;">
		</span>
	</td>
<!-- 商品名 -->
	<td>
		<span>
			<s:property value="session.product_name"/>
		</span>
	</td>
<!-- 商品名かな -->
	<td>
		<span>
			<s:property value="sessioon.product_name_kana"/>
		</span>
	</td>
<!-- 商品詳細 -->
	<td>
		<span>
			<s:property value="session.produt_description"/>
		</span>
	</td>
<!-- 在庫  -->
	<td>
		<span>
			<select name="product_stock">
			<option value="1" selected="selected">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
			</select>
		</span>
	</td>
<!-- 金額  -->
	<td>
		<s:property value="session.price"/>
	</td>
<!-- 販売会社・販売日  -->
	<td>>
		<s:property value="session.release_company"/>
		<s:property value="session.release_date"/>
	</td>
	</tr>
	</table>
<%-- </s:form> --%>

<!-- オススメリスト -->
<s:iterator value="suggestList">
	<a
		href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
		<img class="image" src="<s:property value='imageFilePath'/>"
		alt="Photo" width="200" height="170"><br>
		</a>
	<s:property value="productName"/><br>
	<s:property value="productNameKana"/><br>
	<s:property value="price"/><br>
	</s:iterator>



</body>
</html>