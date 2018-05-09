<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:property value="#session.LoginUserDTO.userId" />のカート</title>
</head>
<body>

	<s:if test='#session.CartDTOList.isEmpty()'>
		<p>かーとに入れた商品はありません。</p>
	</s:if>
	<s:else>
		<s:iterator value="#session.CartDTOList">
			<s:property value="productName" />
			<s:property value="productNameKana" />
			<s:property value="releaseDate" />
			<s:property value="releaseCompany" />
			<s:property value="productTotalPrice" />
			<s:property value="productCount" />
			<img src="<s:property value='imageFilePath' />" />
			<s:property value="productTotalPrice" />
			<s:form action="CartDeleteAction">
				<input type="hidden" name="productId" value="<s:property value='productId'/>" />
				<s:submit value="削除"/>
			</s:form>
		</s:iterator>
			<s:property value="#session.CartTotalPrice" />
	</s:else>
	<s:form action="BuyItemConfirmAction">
		<s:submit value="決済"/>
	</s:form>


</body>
</html>