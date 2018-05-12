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
<s:iterator value="#session.AddressInfoListDTO">
<s:form action="BuyItemConfirmAction">
	<s:property value="familyName" />
	<s:property value="firstName" />
	<s:property value="postalCode" />
	<s:property value="addr11" />
	<s:hidden name="addressId" value="addressId"/>
	<s:submit value="選択"/>
</s:form>
</s:iterator>

<s:submit action="BuyItemConfirmAction"/>

</body>
</html>