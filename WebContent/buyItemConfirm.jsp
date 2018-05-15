<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
	<title>決済確認</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->


	<div>
		<h3>決済確認</h3>
		<p>以下の内容でよろしいですか？</p>
	</div>
	<!-- カートの情報 -->
		<s:iterator value="cartList">
			<div>
				<span>商品名：<s:property value="productName"/></span>
			</div>

			<div>
				<img src="<s:property value='imageFilePath' />" width="100" height="auto" />.
			</div>

			<div>
				<span>金額：<s:property value="price"/></span>
			</div>
			<div>
				<span>購入個数：<s:property value="productCount"/></span>
			</div>
			<div>
				<span>小計：<s:property value="totalPrice"/></span>
			</div>
		</s:iterator>
		<div>
			<span>請求金額：<s:property value="finallyPrice"/></span>
		</div>
		<br>
		<br>


	<s:form action="BuyItemCompleteAction">

	<!-- 宛先情報 -->
			<div>
				<span>名前：<s:property value="#session.ChooseAddressDTO.familyName"/><s:property value="#session.ChooseAddressDTO.firstName"/></span>
			</div>
			<div>
				<span>ふりがな：<s:property value="#session.ChooseAddressDTO.familyNameKana"/><s:property value="#session.ChooseAddressDTO.firstNameKana"/></span>
			</div>
			<div>
				<span>郵便番号：<s:property value="#session.ChooseAddressDTO.postalCode"/></span>
			</div>
			<div>
				<span>住所：<s:property value="#session.ChooseAddressDTO.addr11"/></span>
			</div>
			<div>
				<span>電話番号：<s:property value="#session.ChooseAddressDTO.telNumber"/></span>
			</div>
			<div>
				<span>メールアドレス：<s:property value="#session.ChooseAddressDTO.email"/></span>
			</div>
		<div>
			<s:submit value="完了"/>
		</div>
	</s:form>

	<!-- 戻って編集する場合 -->
	<s:form action="BuyItemAction"><s:submit value="戻る"/></s:form>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>