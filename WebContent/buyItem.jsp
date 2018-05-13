<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宛先の選択</title>
</head>
<body>
<s:iterator value="#session.AddressInfoListDTO" status="st">

	<div>

		<s:if test="#st.first" >
			<input form="BuyItemForm" type="radio" name="addressId" value="<s:property value='addressId' />" checked="checked" />
		</s:if>
		<s:else>
			<input form="BuyItemForm" type="radio" name="addressId" value="<s:property value='addressId' />" />
		</s:else>

	<s:property value="familyName" />
	<s:property value="firstName" />
	<s:property value="familyNameKana" />
	<s:property value="firstNameKana" />
	<s:property value="telNumber" />
	<s:property value="email" />
	<s:property value="postalCode" />
	<s:property value="addr11" />

	</div>

</s:iterator>


<form id="BuyItemForm" action="BuyItemConfirmAction" >
	<input type="submit" value="確認画面に行く" />
</form>
<form action="AdressAction" >
	<input type="submit" value="宛先の新規登録" />
</form>

</body>
</html>