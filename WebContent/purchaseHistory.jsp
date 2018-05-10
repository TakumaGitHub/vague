<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>

<html>

<head>
<title>purchaseHistory.jsp</title>
</head>

<body>
	<div id="main" class="ph">
		<div class="title">
			<div class="titlefont">
				<h1 class="spacing">PURCHASE HISTORY</h1>
				<p class="title">テストページ</p>
			</div>
		</div>

		<div id="contents" class="border ph">

			<div id="left" class="border">
				<p class="list _1"><a href='<s:url action="MyPageAction" />'>戻る</a></p>
				<p class="list _2"><a href='<s:url action="" />'>レビュー投稿</a></p>
			</div>

			<div id="right">

				<div id="rightcon">

					<br>
					<div class="message">
						<span style="color: red;"><s:property value="message" /></span>

						<s:if test="historyList==null">
							<p>購入履歴はありません</p>
						</s:if>
					</div>

					<s:elseif test="historyList != null && historyList.size() != 0">
						<div class="message">
							<p>購入情報は以下になります。</p>


						</div>


						<s:form action="PurchaseHistoryAction">
						<input type="hidden" name="deleteFlg" value="2" />
						<div id="boxlist">
							<s:iterator value="historyList" status="st">

								<div class="box">
								<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ----ｰｰｰｰｰｰboxｰｰｰｰ-----ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
									<a href="<s:url action="ProductDetailsAction"><s:param name="product_id" value="%{productId}" /></s:url>">
										<img src="<s:property value='imageFilePath'/>"
											alt="Photo">
									</a>
									<div class="pname"><s:property value="productName" /></div>
									<div class="kana"><s:property value="productNameKana" /></div>
									<div class="info">購入個数　<s:property value="count" />点</div>

										<!-- 購入日時 -->
										<div class="info">購入日時：<s:property value="insertDate" /></div>
										<div class="info">値段：<s:property value="price" /></div>
										<div class="info">発売会社名：<s:property value="releaseCompany" /></div>
										<div class="info">発売年月日：<s:property value="releaseDate" /></div>

								<!-- チェックボックス,選択したものだけを削除 -->
									<div class="info">
										<s:if test="#st.index == 0">
											<label><s:checkbox name="checkList" value="0"
													fieldValue="%{id}" />チェック</label>
										</s:if>
										<s:else>
											<label><s:checkbox name="checkList" value="0"
													fieldValue="%{id}" />チェック</label>
										</s:else>
									</div>

									<!-- レビュー -->
									 <div class="review"><a
										href="<s:url action="CreateReviewAction"><s:param name="productId" value="%{productId}" />
										<s:param name="imageFilePath" value="%{imageFilePath}" />
										<s:param name="productName" value="%{productName}" /></s:url>">レビューを投稿する</a></div>
								<!-- ｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰここまでｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰｰ -->
								</div>

							</s:iterator>
						</div>
						<div class="clear"></div>

						<!--  ■削除ボタン■ -->
							<s:submit class="button-layout button1" value="チェックした項目を削除" />

						</s:form>

							<s:form action="PurchaseHistoryAction">
								<input type="hidden" name="deleteFlg" value="1">
								<s:submit class="button-layout button1" value="履歴をすべて削除" />
							</s:form>
					</s:elseif>





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
				</div>
			</div>
		</div>
	</div>



</body>

</html>













