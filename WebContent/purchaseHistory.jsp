<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<title>商品購入履歴画面</title>
</head>

<body>

	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->


	<div id="main" class="ph">
		<div class="title">
			<div class="titlefont">
				<h1 class="spacing">PURCHASE HISTORY</h1>
				<p class="title">テストページ</p>
			</div>
		</div>

		<s:if test="PurchaseHistoryList ==null">
			<h3>購入履歴はありません</h3>
		</s:if>
		<s:elseif test="message == null">
			<h3>購入情報は以下になります。</h3>
		</s:elseif>


		<div id="contents" class="border ph">
			<div id="left" class="border">
			</div>

			<div id="right">
				<div id="rightcon">
					<br>
					<div class="message">
						<span style="color:red;"><s:property value="message" /></span>

						<s:if test="#session.PurchaseHistoryList ==null">
							<p>購入履歴はありません</p>
						</s:if>
						<s:elseif test="#session.PurchaseHistoryList != null && #session.PurchaseHistoryList.size() != 0">
							<div class="message">
								<p>購入情報は以下になります。</p>
							</div>
						</s:elseif>
					</div>



						<s:form action="PurchaseHistoryAction">
						<input type="hidden" name="deleteFlg" value="2" />
						<div id="boxlist">

							<s:iterator value="#session.PurchaseHistoryList" status="st">
								<div class="box">
								<!-- -------------------------box--------------------------- -->
									<!-- 商品情報 -->
									<div class="number">No.<s:property value="id" /></div>
									<a href="<s:url action="ProductDetailsAction"><s:param name="productId" value="%{productId}" /></s:url>">
										<img src="<s:property value='imageFilePath'/>" alt="Photo">
									</a>
									<div class="pname"><s:property value="productName" /></div>
									<div class="kana"><s:property value="productNameKana" /></div>
									<br>
									<div class="info">値段：<s:property value="price" /> 円</div>
									<div class="info">購入個数：<s:property value="count" /> 点</div>
									<div class="info">宛先</div>
									<div class="info">・郵便番号：<s:property value="postalCode" /></div>
									<div class="info">・住所：<s:property value="userAddress" /></div>
									<div class="info">購入日時：<s:property value="insertDate" /></div>
									<br>
									<div class="info">発売会社名：<s:property value="releaseCompany" /></div>
									<div class="info">発売年月日：<s:property value="releaseDate" /></div>

									<!-- レビュー -->
									<div class="review"><a href="<s:url action="CreateReviewAction"><s:param name="product_id" value="%{productId}" /></s:url>">【レビューを投稿する】</a></div>
									<br>
									<br>
								<!-- ------------------------ここまで------------------------- -->
								</div>
							</s:iterator>

						</div>
						<div class="clear"></div>
						</s:form>

						<!-- 戻るボタン -->
<!--
							<input type="button" onclick="location.href='<s:url action="MyPageAction" />'" value="戻る">
-->

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



<%--
			<!-- ページネーション -->
					<div id="page_move">
						<ul>
							<li>
								<s:if test="pageSelect > 0">
									<form action="PurchaseHistoryAction">
										<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
										<s:hidden name="sort" value="%{sort}" />
										<s:submit class="button-layout pm" value=" 前へ" />
									</form>
								</s:if>
							</li>
							<li class="pm"><s:property value="pageSelect+1" /></li>
							<li>
								<s:if
									test="pageSelect < mainList.size() -1 && historyList.size() != allHistoryList.size()">
									<form action="PurchaseHistoryAction" method="post">
										<s:hidden name="sort" value="%{sort}" />
										<s:hidden name="pageSelect" value="%{pageSelect + 1}" />
										<s:submit class="button-layout pm" value=" 次へ" />
									</form>
								</s:if>
							</li>
						</ul>
					</div>
--%>

				</div>
			</div>
		</div>
	</div>

	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>

</html>













