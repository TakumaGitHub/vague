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

			<!-- 購入履歴 -->
				<div id="message">
				<s:if test="#session.PurchaseHistoryList.isEmpty()">
					<p class="message">購入履歴はありません</p>
				</s:if>
				<s:elseif test="#session.PurchaseHistoryList != null && #session.PurchaseHistoryList.size() != 0">
					<p class="message">購入情報は以下になります</p>

						<div id="table">
						<s:form action="PurchaseHistoryAction">
						<input type="hidden" name="deleteFlg" value="2" />

							<table>
								<tr>
									<th>商品番号</th>
									<th>商品画像</th>
									<th>購入情報</th>
									<th>お届け先</th>
								</tr>

								<s:iterator value="#session.PurchaseHistoryList" status="st">
								<tr>
									<th><s:property value="productId" /></th>
									<td class="image"><a href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
										<img src="<s:property value='imageFilePath'/>" alt="Photo" width=300px height=250px></a></td>
									<td>
										<p>商品名：<s:property value="productName" /></p>
										<p>ふりがな：<s:property value="productNameKana" /></p>
										<p>・値段：<s:property value="price" /> 円<br></p>
										<p>・購入個数：<s:property value="count" />点<br></p>
										<p>・発売会社名：<s:property value="releaseCompany" /><br></p>
										<p>・発売年月日：<s:property value="releaseDate.split(' ')[0]" /></p>
										<p><a href="<s:url action="CreateReviewAction"><s:param name="product_id" value="%{productId}" /></s:url>">【レビューを投稿する】</a></p>
									</td>

									<s:if test="#st.index == 0 || insertDate != #session.PurchaseHistoryList.get(#st.index - 1).insertDate" >
									<td>
										<p>郵便番号：<s:property value="postalCode" /></p>
										<p>住所：<s:property value="userAddress" /></p>
										<p>注文日：<s:property value="insertDate" /></p>
										<p>合計金額（※合計されるように書き換える）：<span class="totalPrice" data-date="<s:property value='insertDate' />"><s:property value="price" /> </span>円</p>
									</td>
									</s:if>

									<s:else>
											<span class="addPrice" data-date="<s:property value='insertDate' />"><s:property value="price" /></span>
									</s:else>

								</tr>
								</s:iterator>
							</table>

						<div class="clear"></div>
						</s:form>
						</div>
				</s:elseif>
				</div>
<!-- 以下引用 -->
			<div class="button">
				<input type="button" onclick="location.href='<s:url action="MyPageAction" />'" value="戻る">　　　　
				<input type="button" onclick="location.href='<s:url action="PurchaseHistoryAction" />'" value="商品購入履歴に行く">
			</div>
<!--  -->
			<!-- 戻るボタン -->
			<div class="button">
				<s:form action="MyPageAction">
					<s:submit class="" value="戻る" />
				</s:form>
			</div>

			<!-- 履歴すべて削除ボタン -->
			<div class="button">
				<s:form action="PurchaseHistoryAction">
					<input type="hidden" name="deleteFlg" value="1">
					<s:submit class="" value="履歴をすべて削除" onclick="return deleteCheck();"/>
				</s:form>
			</div>

			<script>
				function deleteCheck(){if(window.confirm('購入履歴を削除します。よろしいですか？')){
					return true
				}else{
					return false;
				}
				}
			</script>
		</div>
	</div>
	<!-- mainの終わり -->

	<!-- footerの始まり -->
	<jsp:include page="footer.jsp" />
	<!-- footerの終わり -->

</body>
</html>