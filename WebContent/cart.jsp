<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content=""/>
<!-- <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">-->
<!-- <link rel="stylesheet" href="text.html">-->
<link rel="stylesheet" type="text/css" href="css/cart.css">
<link href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" rel="stylesheet">
<script type="text/javascript">
	$('#all').on('change', function() {
	    $('input[name=check]').prop('checked', this.checked);
	});
</script>

<jsp:include page="head.jsp" />
<title>cart.jsp</title>
</head>
<body>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->

	<!--  mainの始まり -->

	<div id="main">

		<div class="container">
			<div class="title">ショッピングカート</div>

			<%-- 在庫数を購入個数が上回っているときのエラーメッセージ --%>
			<s:iterator value="errorMsg">
				<strong><s:property /></strong>
			</s:iterator>
			<s:if test='#session.CartDTOList == null || #session.CartDTOList.isEmpty()'>
				<p class="noproduct">カートに商品はありません。</p>
				<form id="ProductListForm" action="ProductListAction">
					<button type="submit" class="noproduct">
						<i class="fas fa-store"></i> 買い物に戻る
					</button>
				</form>
			</s:if>

			<s:else>
			<div class="left floatleft">
				<table>
					<tr class="column1">
						<th class="tag" width="5%"><input type="checkbox" name="all" onClick="AllChecked();" />️</th>
						<th class="tag" width="15%">商品画像</th>
						<th class="tag" width="35%">商品名</th>
						<th class="tag" width="10%">値段</th>
						<th class="tag" width="10%">購入個数</th>
						<th width="18%">購入個数合計金額</th>
					</tr>
					<s:iterator value="#session.CartDTOList">
						<tr>
							<td class="checkbox list">
								<input form="CartDeleteForm" type="checkbox" name="productId" value="<s:property value='productId'/>" onClick="DisChecked();"/>
							</td>
							<td class="image list">
								<img src="<s:property value='imageFilePath' />" width="200" height="auto"/>
							</td>
							<td class="product list">
								<p class="productname"><s:property value="productName" /></p>
								<p class="kana">ふりがな：<s:property value="productNameKana" /></p>
								<p class="date">発売年月日：<s:property value="releaseDate.split(' ')[0]" /></p>
								<p class="company">発売会社名：<s:property value="releaseCompany" /></p>
							</td>
							<td class="price lowerleft list">
								<p class="red">¥<s:property value="Price" /></p>
							</td>
							<td class="count lowerleft list">
								<p><s:property value="productCount" /></p>
							</td>
							<td class="totalprice lowerleft list">
								<p class="red">¥<s:property value="productTotalPrice" /></p>
							</td>
						</tr>
					</s:iterator>
					<tr>
						<th></th>
						<th></th>
						<th></th>
						<th><p class="price lowerleft">合計</p></th>
						<th><p class="price lowerleft">(<s:property value="#session.TotalProductCount"/>点)</p></th>
						<td><p class="red price lowerleft">¥<s:property value="#session.CartTotalPrice"/></p></td>
					</tr>
				</table>
				<div class="productlist floatright">
					<s:form id="ProductListForm" action="ProductListAction">
						<button type="submit" class="normal-button">
							買い物を続ける
						</button>
					</s:form>
				</div>
				<div class="delete floatright">
					<s:form id="CartDeleteForm" action="CartDeleteAction">
						<button type="submit" class="normal-button">
							☑️の商品を削除
						</button>
					</s:form>
				</div>
			</div>

			<div class="right floatright">
				<div class="register">
					<p>カート合計金額(<s:property value="#session.TotalProductCount"/>点):</p>
					<p class="red cartprice">¥<s:property value="#session.CartTotalPrice"/></p>
					<s:form action="BuyItemAction">
						<button type="submit">
							<i class="fas fa-shopping-cart"></i>レジに進む
						</button>
					</s:form>
				</div>
			</div>
			</s:else>
		</div>

    </div>
    <!--  mainの終わり -->


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
