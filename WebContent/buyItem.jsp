<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="head.jsp" />
<title>宛先の選択</title>
<style type="text/css">
h3{ font-size:20px;
	background-color:gray;
	}
</style>
</head>
<body>



	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->
	<h3>お届け先を選択して下さい</h3>

<s:iterator value="#session.AddressInfoListDTO" status="st">

	<div>

		<s:if test="#st.first" >
			<input form="BuyItemForm"  type="radio" name="addressId" value="<s:property value='addressId' />" checked="checked" />
		</s:if>
		<s:else>
			<input form="BuyItemForm" type="radio" name="addressId" value="<s:property value='addressId' />" />
		</s:else>

		<table border="0" cellspacing="5">
	<tr>
		<td><s:property value="familyName" />
		<s:property value="firstName" /></td>
	</tr>
	<tr>
		<td><s:property value="familyNameKana" />
		<s:property value="firstNameKana" /></td>
	</tr>
	<tr>
		<td><s:property value="postalCode" /></td>
	</tr>
	<tr>
		<td><s:property value="addr11" /></td>
	</tr>
	<tr>
		<td><s:property value="telNumber" /></td>
	</tr>
	<tr>
		<td><s:property value="email" /></td>
	</tr>


		</table>
	</div>

</s:iterator>


<s:if test="#session.AddressInfoListDTO != null">

<form id="BuyItemForm" action="BuyItemConfirmAction" >
	<input type="submit" value="確認画面に行く" />
</form>

<form action="AddressAction" >
	<input type="submit" value="宛先の新規登録" />
</form>

</s:if>

<s:else>

<form action="AddressAction" >
	<input type="submit" value="宛先を登録する" />
</form>

</s:else>




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>