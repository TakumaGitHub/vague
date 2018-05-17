<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<head>
	<jsp:include page="head.jsp" />
	<style type="text/css">
		<%@ include file="../css/purchaseHistory.css" %>
	</style>

	<script type="text/javascript" src="js/purchaseHistory.js" ></script>

	<title>商品購入履歴画面</title>
</head>

<body>
	<!--  headerの始まり -->
	<jsp:include page="header.jsp" />
    <!--  headerの終わり -->

	<!-- mainの始まり -->
	<div id="main">
		<div class="container">

			<!-- タイトル -->
			<h3 id="tytle">PURCHASE HISTORY</h3>

			<!-- 購入履歴（なし） -->
			<div id="message">
				<s:if test="#session.PurchaseHistoryList.isEmpty()">
					<p class="message">購入履歴はありません</p>
								<!-- 戻るボタン -->
					<div class="button">
						<form action="MyPageAction">
						<input type="submit" value="戻る" />
						</form>
					</div>
				</s:if>

			<!-- 購入履歴（あり） -->
				<s:elseif test="#session.PurchaseHistoryList != null && #session.PurchaseHistoryList.size() != 0">
					<p class="message">購入情報は以下になります</p>
						<div id="table">
						<input type="hidden" name="deleteFlg" value="2" />

								<table>
								<tr class="tableTopics">
									<th>商品番号</th>
									<th>商品画像</th>
									<th>購入情報</th>
									<th>お届け先</th>
								</tr>

								<s:iterator value="#session.PurchaseHistoryList" status="st">
								<tr>
									<th class="productId-th"><s:property value="productId" /></th>
									<td class="image"><a href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
										<img src="<s:property value='imageFilePath'/>" alt="Photo" width=270px height=220px></a></td>
									<td class="purchaseProductInfo">
										<p>商品名：<s:property value="productName" /></p>
										<p>ふりがな：<s:property value="productNameKana" /></p>
										<p>　・値段：<s:property value="price" /> 円<br></p>
										<p>　・購入個数：<s:property value="count" />点<br></p>
										<p>　・発売会社名：<s:property value="releaseCompany" /><br></p>
										<p>　・発売年月日：<s:property value="releaseDate.split(' ')[0]" /></p>
										<p class="review-button"><input type="button" onclick="location.href='<s:url action="CreateReviewAction"><s:param name="product_id" value="%{productId}" /></s:url>'" value="レビューを投稿する"></p>
									</td>

									<s:if test="#st.index == 0 || insertDate != #session.PurchaseHistoryList.get(#st.index - 1).insertDate" >
									<td class="purchaseAddress">
										<p>郵便番号：<s:property value="postalCode" /></p>
										<p>住所：<s:property value="userAddress" /></p>
										<p>注文日：<s:property value="insertDate" /></p>
										<p>合計金額：<span class="totalPrice" data-date="<s:property value='insertDate' />"><s:property value="price" /></span>円</p>
									</td>
									</s:if>

									<s:else>
										<td class="addPrice-td">
											<span class="addPrice" data-date="<s:property value='insertDate' />"><s:property value="price" /></span>
										</td>

									</s:else>

								</tr>
								</s:iterator>
							</table>

						<div class="clear"></div>
						</div>

					<!-- 戻るボタン -->
					<div class="button">
						<form action="MyPageAction">
							<input type="submit" value="戻る" />
						</form>

					<!-- 履歴すべて削除ボタン -->
						<form action="PurchaseHistoryAction">
							<input type="hidden" name="deleteFlg" value="1">
							<input type="submit" value="履歴をすべて削除" onclick="return deleteCheck();"/>
						</form>
						<script>
							function deleteCheck(){if(window.confirm('購入履歴を削除します。よろしいですか？')){
								return true
							}else{
								return false;
							}
							}
						</script>
					</div>
				</s:elseif>
			</div>
		</div>
	</div>
	<!-- mainの終わり -->

	<!-- footerの始まり -->
	<jsp:include page="footer.jsp" />
	<!-- footerの終わり -->

</body>
</html>