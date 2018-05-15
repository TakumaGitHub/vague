<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<title><s:property value="#session.LoginUserDTO.userId" />のカート</title>
</head>
<body>


	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->

	<%-- 在庫数を購入個数が上回っているときのエラーメッセージ --%>
	<s:iterator value="errorMsg">
		<strong><s:property /></strong>
	</s:iterator>
	<s:if test='#session.CartDTOList == null || #session.CartDTOList.isEmpty()'>
		<p>カートに入れた商品はありません。</p>
	</s:if>
	<s:else>



		<s:iterator value="#session.CartDTOList">
			<div>
				<p><input form="CartDeleteForm" type="checkbox" name="productId" value="<s:property value='productId'/>" /> </p>
				<p>商品画像</p><img src="<s:property value='imageFilePath' />" width="200" height="auto"/>
				<p>商品名：<s:property value="productName" /></p>
				<p>ふりがな：<s:property value="productNameKana" /></p>
				<p>発売年月日：<s:property value="releaseDate" /></p>
				<p>発売会社名：<s:property value="releaseCompany" /></p>
				<p>値段：<s:property value="Price" /></p>
				<p>購買個数：<s:property value="productCount" /></p>
				<p>購入個数合計金額：<s:property value="productTotalPrice" /></p>


			</div>


		</s:iterator>

			<p>カート合計金額：<s:property value="#session.CartTotalPrice" /></p>


		<s:form action="BuyItemAction">
			<s:submit value="決済"/>
		</s:form>

		<s:form id="CartDeleteForm" action="CartDeleteAction">
			<s:submit value="削除"/>
		</s:form>

	</s:else>

	<form action="<s:url action='GoHomeAction' />" >
		<input type="submit" value="HOMEに戻る" />
	</form>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>