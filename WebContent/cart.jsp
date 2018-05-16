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
				<p>カートに入れた商品はありません。</p>
			</s:if>
			<s:else>


			<div class="left clear">
				<table  class="clear">
					<tr>
						<th>☑️</th>
						<th>商品画像</th>
						<th>商品詳細</th>
						<th>購入個数</th>
						<th>購入個数合計金額</th>
					</tr>
					<s:iterator value="#session.CartDTOList">
						<tr  class="clear">
							<td class="checkbox">
								<input form="CartDeleteForm" type="checkbox" name="productId" value="<s:property value='productId'/>" />
							</td>
							<td class="image">
								<img src="<s:property value='imageFilePath' />" width="200" height="auto"/>
							</td>
							<td class="product">
								<div class="productname"><p>商品名：<s:property value="productName" /><p></div>
								<div class="kana"><p>ふりがな：<s:property value="productNameKana" /><p></div>
								<div class="date"><p>発売年月日：<s:property value="releaseDate" /></p></div>
								<div class="company"><p>発売会社名：<s:property value="releaseCompany" /></p></div>
								<div class="price"><p>値段：¥<s:property value="Price" /></p></div>
							</td>
							<td class="count">
								<p><s:property value="productCount" /></p>
							</td>
							<td class="totalprice">
								<p>¥<s:property value="productTotalPrice" /></p>
							</td>
						</tr>
					</s:iterator>
				</table>
			</div>

			<div class="right clear">
				<div class="register">
					<p>カート合計金額：<br>
					¥<s:property value="#session.CartTotalPrice"/></p>
					<s:form action="BuyItemAction">
						<s:submit value="決済"/>
					</s:form>
				</div>
				<div class="delete">
					<s:form id="CartDeleteForm" action="CartDeleteAction">
						<s:submit value="削除"/>
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
