<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<link rel="stylesheet" href="./css/product.css">


<title>商品詳細ページ</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
<script>
	$(function() {
		$(".imageHover .image").hover(function() {
			$(this).animate({
				width : "240px",
				height : "210px"
			});
		}, function() {
			$(this).animate({
				width : "200px",
				height : "170px"
			});
		});
	});
</script>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->



	<div id="main" >

		<div class="container">

		<s:form action="CartInsertAction">


		<table class="description-box">


		<tr>

		<!-- 画像の表示 -->
		<td>

			<span>
				<img class="image" src="<s:property value='#session.DetailProductDTO.imageFilePath' />" alt="Photo" style="max-width:400px; max-height:300px;">
			</span>

		</td>
		<td>
<%--
			<!-- カテゴリ分類 -->
			<span id="category">
				<s:if test="#session.DetailProductDTO.categoryId == 1">
					<h2>製品カテゴリ：Chair</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId == 2">
					<h2>製品カテゴリ：Sofa</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId == 3">
					<h2>製品カテゴリ：Lighting</h2>
				</s:if>
				<s:if test="#session.DetailProductDTO.categoryId == 4">
					<h2>製品カテゴリ：Table</h2>
				</s:if>
			</span>

 --%>

	<!-- 商品名/かな -->
			<span id="productName">商品名：
				<s:property value="#session.DetailProductDTO.productName"/><br></span>
				<div id="proNameKana">商品名ふりがな：<s:property value="#session.DetailProductDTO.productNameKana"/></div><br>



	<!-- 商品詳細情報 -->
			<div id="description">
			<fieldset>
				<legend>商品詳細情報</legend>
				<s:property value="#session.DetailProductDTO.productDescription"/><br>
			</fieldset>
			</div>
	<!-- 発売会社名・発売年月日  -->

		<div id="reCompany">
			発売会社名：<s:property value="#session.DetailProductDTO.releaseCompany"/><br>
			</div>
		<div id="reDate">
			発売年月日：<s:property value="#session.DetailProductDTO.releaseDate.substring(0,10)"/><br>
			</div>

	<!-- 金額  -->
		<div id="proPrice">
			値段：￥<s:property value="#session.DetailProductDTO.price"/><br>
		</div>

	<!-- 在庫  -->

		<div id="proPrice">
			<span>購入個数：
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
			</span><br>
			</div>
		</td>
		</tr>
		</table>
		<s:submit value="カートに入れる"/>
    </s:form>

<!-- オススメリスト -->


<h3 id="suggestProduct">この製品を見ている人はこんな製品も見ています</h3>

<div id="suggest-outer-box" >

	<s:iterator value="#session.SuggestList">

		<div class="suggest-box">

			<div class="imageHover">
			<a href="<s:url action='ProductDetailsAction'/>?productId=<s:param value='productId'/>&&categoryId=<s:param value='categoryId'/>">
		<img class="image" src="<s:param value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>
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
<s:if test="#session.ReviewList.isEmpty()">
<span>この商品にはまだレビューが投稿されていません。</span>
</s:if>
<s:else>
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
			<td>投稿日：<s:property value="reviewDTO.insertDate.substring(0,10)" /></td>
		</tr>
	</table>

</s:iterator>
</s:else>

</div>
		</div>


	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>