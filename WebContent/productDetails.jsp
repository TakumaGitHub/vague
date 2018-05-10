<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<link rel="stylesheet" href="./css/product.css">


<title>商品詳細ページ</title>

</head>
<body>

<header>
<!-- ヘッダーのインクルード -->
</header>

<%-- <jsp:include page="include_header.jsp"/> --%>

	<div id="main" >

		<div class="container">

			<s:form action="CartInsertAction">
		<table class="detailsTable">
		<tr>
		<th>
			<!-- カテゴリ分類 -->
			<span id="category">
				<s:if test="#session.DetailProductDTO.categoryId==1">
					<h2>Chair</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId==2">
					<h2>Sofa</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId==3">
					<h2>Lighting</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId==4">
					<h2>Table</h2>
				</s:if>
			</span>
		</th>
		</tr>
	<!-- 画像の表示 -->
		<tr>
		<td>
			<span id="img">
				<img class="image" src="<s:property value='#session.DetailProductDTO.imageFilePath' />" alt="Photo" style="max-width:400px; max-height:300px;">
			</span>
		</td>
	<!-- 商品名/かな -->
		<td>
			<span id="productName">
				<s:property value="#session.DetailProductDTO.productName"/><br>
				<s:property value="#sessioon.DetailProductDTO.productNameKana"/>
			</span>
		</td>
	<%-- <!-- 商品名かな -->
		<td>
			<span id="productNameKana">
				<s:property value="#sessioon.DetailProductDTO.productNameKana"/>
			</span>
		</td> --%>
	<!-- 商品詳細 -->
		<td>
			<fieldset>
				<legend>商品詳細</legend>
				<s:property value="#session.DetailProductDTO.productDescription"/>
			</fieldset>
		</td>
		</tr>
	<!-- 在庫  -->
		<tr>
		<td>
			<span>
				<select name="productCount">

					<s:if test="#session.DetailProductDTO.productStock < 5">

						<s:iterator begin="1" end="#session.DetailProductDTO.productStock" step="1" status="st" >
							<option value="<s:property value='#st.count' />" ><s:property value='#st.count' /></option>
						</s:iterator>

					</s:if>
					<s:else>

						<option value="1" selected="selected">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>

					</s:else>


				</select>
			</span>
		</td>

	<!-- 金額  -->
		<td>
			製品価格：￥<s:property value="#session.DetailProductDTO.price"/>
		</td>
	<!-- 販売会社・販売日  -->
		<td>
			販売元：<s:property value="#session.DetailProductDTO.releaseCompany"/><br>
			発売開始日：<s:property value="#session.DetailProductDTO.releaseDate.substring(0,10)"/>
		</td>
		</tr>
		</table>
		<s:submit value="カートに入れる"/>
    </s:form>

<!-- オススメリスト -->

<div id="sP">
<h3 id="suggestProduct">この製品を見ている人はこんな商品も見ています</h3>

<div id="suggest-outer-box" >

	<s:iterator value="#session.SuggestList">

		<div class="suggest-box">

			<div class="img">
			<a
				href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
				<img class="image" src="<s:property value='imageFilePath'/>"
				alt="Photo" width="200" height="170"><br>
				</a>
			</div>
			<div class="sugName">
			<s:property value="productName"/><br>
			</div>
			<div class="sugName2">
			<s:property value="productNameKana"/><br>
			</div>
			<div class="sugPrice">
			￥<s:property value="price"/><br>
			</div>

		</div>


	</s:iterator>

</div>


</div>





<!-- レビュー -->
<h3>商品レビュー</h3>
<div class="reviewBox">
<s:iterator value="#session.ReviewList">
	<table>
		<tr>
			<td><s:property value="reviewDTO.reviewTitle"/></td>
		</tr>
		<tr>
			<td>投稿者：<s:property value="familyName"/><s:property value="firstName"/>さん</td>
		</tr>
		<tr>
			<td><s:property value="reviewDTO.reviewBody"/></td>
		</tr>
		<tr>
			<td>評価：<s:property value="reviewDTO.reviewScore"/></td>
		</tr>
		<tr>
			<td>投稿日：<s:property value="reviewDTO.insertDate" /></td>
		</tr>
	</table>
</s:iterator>
</div>


		</div>


	</div>



<footer>
<!-- footerのインクルード -->
</footer>

</body>
</html>