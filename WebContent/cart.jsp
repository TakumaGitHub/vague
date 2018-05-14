<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<title><s:property value="#session.LoginUserDTO.userId" />のカート</title>
</head>
<body>


	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />


    <!--  headerの終わり -->

	<%-- 在庫数を購入個数が上回っているときのエラーメッセージ --%>
	<s:iterator value="errorMsg">
		<strong><s:property /></strong>
	</s:iterator>
	<s:if test='#session.CartDTOList == null || #session.CartDTOList.isEmpty()'>
		<p>かーとに入れた商品はありません。</p>
	</s:if>
	<s:else>



		<s:iterator value="#session.CartDTOList">
			<div>
				<p><input form="CartDeleteForm" type="checkbox" name="productId" value="<s:property value='productId'/>" /> </p>
				<img src="<s:property value='imageFilePath' />" width="200" height="auto"/>
				<p>商品名：<s:property value="productName" /></p>
				<p>ふりがな：<s:property value="productNameKana" /></p>
				<p>発売年月日：<s:property value="releaseDate" /></p>
				<p>発売会社：<s:property value="releaseCompany" /></p>
				<p>購買個数：<s:property value="productCount" /></p>
				<p>合計金額：<s:property value="productTotalPrice" /></p>


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

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>