<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/buyItemConfirm.css">
	<title>決済確認</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->


	<div id="main">
	<div class="container">
		<h3>決済確認</h3>
		<p>以下の内容でよろしいですか？</p>
	<!-- カートの情報 -->
		<div class="left">
		<s:iterator value="cartList">
		<div class="box1">
			<div class="product">
				<span class="productName">商品名：<s:property value="productName"/></span>
			</div>
			<div class="detail">
			<div>
			<img src="<s:property value='imageFilePath' />" width="300px" height="200px" />
			</div>
			<div class="box2">
			<div class="detail1">
				<p>金額：<s:property value="price"/>円</p>
			</div>
			<div class="detail2">
				<p>購入個数：<s:property value="productCount"/>個</p>
			</div>
			<div class="detail3">
				<p>小計：<s:property value="productTotalPrice"/>円</p>
			</div>
			</div>
			</div>
			</div>
		</s:iterator>
		</div>


		<div class="right">
	<s:form id="form1" name="form1" action="BuyItemCompleteAction">


	<!-- 宛先情報 -->
		<div class="address">
				<span>名前：<s:property value="#session.ChooseAddressDTO.familyName"/><s:property value="#session.ChooseAddressDTO.firstName"/></span><br>
				<span>ふりがな：<s:property value="#session.ChooseAddressDTO.familyNameKana"/><s:property value="#session.ChooseAddressDTO.firstNameKana"/></span><br>
				<span>郵便番号：<s:property value="#session.ChooseAddressDTO.postalCode"/></span><br>
				<span>住所：<s:property value="#session.ChooseAddressDTO.addr11"/></span><br>
				<span>電話番号：<s:property value="#session.ChooseAddressDTO.telNumber"/></span><br>
				<span>メールアドレス：<s:property value="#session.ChooseAddressDTO.email"/></span>
		</div>

		<div class="price">
			<span>請求金額：<s:property value="finallyPrice"/>円</span>

		<div class="buttom">
			<input id="buttom2" type="submit" value="戻る">
			<input id="buttom1" type="submit" value="完了">
		</div>
		</div>
	</s:form>



	<script>
		$(function(){
			$('#buttom1').click(function() {
				$('#form1').attr('action','BuyItemCompleteAction');
				$('#form1').submit();
			});
			$('#buttom2').click(function(){
				$('#form1').attr('action','BuyItemAction');
				$('#form1').submit();
			});
		});
	</script>
	</div>

	</div>
	</div>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>