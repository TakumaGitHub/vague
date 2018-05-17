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

<jsp:include page="head.jsp" />
<title><s:property value="#session.LoginUserDTO.userId" />のカート</title>
</head>
<body>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->

	<!--  mainの始まり -->

	<div id="main">

		<div class="container">


			<%-- 在庫数を購入個数が上回っているときのエラーメッセージ --%>
			<s:iterator value="errorMsg">
				<strong><s:property /></strong>
			</s:iterator>
			<s:if test='#session.CartDTOList == null || #session.CartDTOList.isEmpty()'>
				<p>カートに商品はありません。</p>
			</s:if>
			<s:else>


			<div class="left float">
				<table>
					<tr>
						<th width="5%">☑️</th>
						<th width="20%">商品画像</th>
						<th width="50%">商品詳細</th>
						<th width="10%">購入個数</th>
						<th width="15%">購入個数合計金額</th>
					</tr>
					<s:iterator value="#session.CartDTOList">
						<tr>
							<td class="checkbox">
								<input form="CartDeleteForm" type="checkbox" name="productId" value="<s:property value='productId'/>" />
							</td>
							<td class="image">
								<img src="<s:property value='imageFilePath' />" width="200" height="auto"/>
							</td>
							<td class="product">
								<p class="productname">商品名：<s:property value="productName" /></p>
								<p class="kana">ふりがな：<s:property value="productNameKana" /></p>
								<p class="date">発売年月日：<s:property value="releaseDate.split(' ')[0]" /></p>
								<p class="company">発売会社名：<s:property value="releaseCompany" /></p>
								<p class="price">値段：<span class="red">¥<s:property value="Price" /></span></p>
							</td>
							<td class="count">
								<p><s:property value="productCount" /></p>
							</td>
							<td class="totalprice">
								<p class="red">¥<s:property value="productTotalPrice" /></p>
							</td>
						</tr>
					</s:iterator>
					<tr>
						<th></th>
						<th></th>
						<th>合計</th>
						<th></th>
						<th><span class="red cartprice">¥<s:property value="#session.CartTotalPrice"/></span></th>
					</tr>
				</table>
				<div class="productlist float">
					<s:form id="ProductListForm" action="ProductListAction">
						<s:submit value="買い物を続ける"/>
					</s:form>
				</div>
				<div class="delete float">
					<s:form id="CartDeleteForm" action="CartDeleteAction">
						<s:submit value="☑️の商品を削除"/>
					</s:form>
				</div>
			</div>

			<div class="right float">
				<div class="register">
					<p>カート合計金額：<br>
						<span class="red cartprice">¥<s:property value="#session.CartTotalPrice"/></span>
					</p>
					<s:form action="BuyItemAction">
						<s:submit value="レジに進む"/>
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
