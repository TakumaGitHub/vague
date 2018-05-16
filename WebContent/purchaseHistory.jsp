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
			<h3>PURCHASE HISTORY</h3>
			<br>
			<div class="message">
				<s:if test="#session.PurchaseHistoryList.isEmpty()">
					<p>購入履歴はありません</p>
				</s:if>
				<s:elseif test="#session.PurchaseHistoryList != null && #session.PurchaseHistoryList.size() != 0">
					<p>購入情報は以下になります。</p>

					<div id="left">
						<s:form action="PurchaseHistoryAction">
							<input type="hidden" name="deleteFlg" value="2" />
								<div id="box">

									<table>
										<tr>
											<th>商品No.</th>
											<th>商品画像</th>
											<th>購入情報</th>
										</tr>
										<s:iterator value="#session.PurchaseHistoryList" status="st">
										<tr>
											<th>
												<s:property value="id" />
											</th>
											<td>
												<a href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
												<img src="<s:property value='imageFilePath'/>" alt="Photo" width=300px height=250px></a>
											</td>
											<td>
												<p><s:property value="productName" /><br>（<s:property value="productNameKana" />）</p>
												<p>・値段：<s:property value="price" /> 円<br></p>
												<p>・購入個数：<s:property value="count" />点<br></p>
												<p>・発売会社名：<s:property value="releaseCompany" /><br></p>
												<p>・発売年月日：<s:property value="releaseDate" /></p>
												<p><a href="<s:url action="CreateReviewAction"><s:param name="product_id" value="%{productId}" /></s:url>">【レビューを投稿する】</a></p>
											</td>
											</tr>
										</s:iterator>
									</table>
								</div>
							<div class="clear"></div>
						</s:form>
					</div>

					<div id="right">

						<!-- -------------------------商品合計情報表示--------------------------- -->
						<div id="boxright">
							<!-- 合計 -->
							<div>お届け先</div>
							<div>・郵便番号：<s:property value="postalCode" /></div>
							<div>・住所：<s:property value="userAddress" /></div>
							<br>
							<div>注文日：<s:property value="insertDate" /></div>
							<br>
							<div>合計金額（※合計されるように書き換える）：<s:property value="price" /> 円</div>
							<br>
							<br>
						</div>
						<!-- ------------------------ここまで------------------------- -->
					</div>
				</s:elseif>
			</div>

			<!-- 戻るボタン -->
			<s:form action="MyPageAction">
				<s:submit class="button-layout button1" value="戻る" />
			</s:form>

			<!-- 履歴すべて削除ボタン -->
			<s:form action="PurchaseHistoryAction">
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit class="button-layout button2" value="履歴をすべて削除" onclick="return deleteCheck();"/>
			</s:form>

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