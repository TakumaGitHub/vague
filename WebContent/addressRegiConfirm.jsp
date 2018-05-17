<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/address.css">
<title>宛先入力情報確認画面</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />


    <!--  headerの終わり -->
	<div id="main">

	<div class="container">

		<h3>登録する宛先情報は以下でよろしいですか？</h3>

		<s:form id="form1" action="AddressRegiCompleteAction">

			<div class="fullName1" >
				<span class="text">[姓]<br>
					<s:property value="#session.AddressDTO.familyName" escape="false"/></span>
				<span class="firstName">[名]<br>
				<s:property value="#session.AddressDTO.firstName" escape="false"/></span>
			</div>

			<div class="nameKana">
				<span class="text">[せい]<br>
					<s:property value="#session.AddressDTO.familyNameKana" escape="false"/></span>
				<span class="firstNameKana">[めい]<br>
				<s:property value="#session.AddressDTO.firstNameKana" escape="false"/></span>
			</div>

			<div class="form-text">
				<span class="text">[郵便番号]<br>
					<span><s:property value="#session.AddressDTO.postalCode" escape="false"/></span>
					</span>
			</div>

			<div class="form-text">
				<span class="text">[住所]<br>
					<span><s:property value="#session.AddressDTO.addr11" escape="false"/></span>
					</span>
			</div>

			<div class="form-text">
				<span class="text">[電話番号]<br>
					<span><s:property value="#session.AddressDTO.telNumber" escape="false"/></span>
					</span>
			</div>

			<div class="form-text">
				<span class="text">[メールアドレス]<br>
					<span><s:property value="#session.AddressDTO.email" escape="false"/></span>
					</span>
			</div>

			<div>
				<span><input type="submit" value="登録"></span>
			</div>

		</s:form>
		<div>

		<s:form id="form1" action="AddressAction">
			<span><input type="submit" value="戻る"></span>
		</s:form>

		</div>
	</div>
	</div>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>