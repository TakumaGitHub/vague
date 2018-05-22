<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<link rel="stylesheet" href="./css/product.css">


<title>商品詳細ページ</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
<script>
	$(function() {
		$(".imageHover .image").hover(function() {
			$(this).animate({
				width : "210px",
				height : "180px"
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

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->



	<div id="main" >

		<div class="container">


			<h2  class="title">商品詳細画面</h2>


	<div class="detail-box-wrapper" >

		<div class="detail-box-left">
		<!-- 画像の表示 -->



				<img class="detail-image" src="<s:property value='#session.DetailProductDTO.imageFilePath' />" alt="Photo"style="width:400px; height:300px; ">




		</div>


	<!-- 商品名/かな -->
	<div class="detail-box">
	<s:form action="CartInsertAction">
		<div id="detailName">
			<span id="productName">商品名：
				<s:property value="#session.DetailProductDTO.productName"/><br></span>
		</div>
				<div id="detailName2">商品名ふりがな：<s:property value="#session.DetailProductDTO.productNameKana"/></div><br>

	<!-- 金額  -->
		<div id="detailPrice">
			値段：￥<s:property value="#session.DetailProductDTO.price"/><br>
		</div>

	<!-- 在庫  -->

	<s:if test="#session.DetailProductDTO.productStock == 0">
		<p class="caution-msg">在庫切れです(T_T)</p>
	</s:if>

	<s:else>

		<div class="cart">
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


		<s:submit value="カートに入れる"/>

		</div>

	</s:else>


		</s:form>


	<!-- 商品詳細情報 -->
			<div id="description-box">
				商品詳細情報<br>
				<div class="detail-info">
				<s:property value="#session.DetailProductDTO.productDescription"/><br>
				<!-- 発売会社名・発売年月日  -->


				発売会社名：<s:property value="#session.DetailProductDTO.releaseCompany"/><br>


				発売年月日：<s:property value="#session.DetailProductDTO.releaseDate.substring(0,10)"/><br>
				</div>
			</div>


		</div>


	</div>





<!-- オススメリスト -->


<h3 id="suggestProduct">この製品を見ている人はこんな製品も見ています</h3>

<div class="suggest-outer-box" >

	<s:iterator value="#session.SuggestList">

		<div class="suggest-box">

			<div class="imageHover">
			<a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>">
			<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>
			</a>
			</div>
			<div id="sugName">
			<s:property value="productName"/><br>
			</div>
			<div id="sugName2">
			<s:property value="productNameKana"/><br>
			</div>
			<div id="sugPrice">
			￥<s:property value="price"/><br>
			</div>

		</div>



	</s:iterator>

</div>


<!-- レビュー -->
<h3>商品レビュー</h3>

<s:if test="#session.ReviewList.isEmpty()">
<div class="reviewBox">
<div class="empReview">
<span>この商品にはまだレビューが投稿されていません。</span>
</div>
</div>
</s:if>
<s:else>

<s:iterator value="#session.ReviewList">
<div class="reviewBox">
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

			<td>
			<div class="stars">評価：
			<s:iterator begin="1" end="reviewDTO.reviewScore" step="1">
				<img src="LogoImage/reviewScore.png" />
			</s:iterator>
			</div>
			</td>

		</tr>
		<tr>
			<td>投稿日：<s:property value="reviewDTO.insertDate.substring(0,10)" /></td>
		</tr>
	</table>
</div>
</s:iterator>

</s:else>



</div>

</div>



	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>