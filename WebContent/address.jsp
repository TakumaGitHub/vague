<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<!-- 郵便番号から住所自動検索 -->
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
<title>宛先情報登録画面</title>
</head>
<body>


	<!--  headerの始まり -->
	<div class="header">
		<jsp:include page="header.jsp" />
	</div>

    <!--  headerの終わり -->
	<div class="main">

		<div class="container">
			<h3>宛先登録</h3>

		<s:form action="AddressRegiConfirmAction">


			<s:if test="#session.AddressDTO != null" >

			<!-- 氏名 -->
			<div class="error">
				<s:property value="errorFamilyNameMsg"/>
			</div>
			<div class="form-text">
				<span>[姓]<br><input type="text" placeholder="姓" name="familyName" value='<s:property value="#session.AddressDTO.familyName"/>' maxlength="16" size="16"/></span>
			</div>
			<div class="error">
				<s:property value="errorFirstNameMsg"/>
			</div>
			<div class="form-text">
				<span>[名]<br><input type="text" placeholder="名" name="firstName" value='<s:property value="#session.AddressDTO.firstName"/>' maxlength="16" size="16"/></span>
			</div>


		<!-- 氏名のふりがな -->
			<div class="error">
				<s:property value="errorFamilyNameKanaMsg"/>
			</div>
			<div class="form-text">
				<span>[せい]<br><input type="text" placeholder="せい" name="familyNameKana" value='<s:property value="#session.AddressDTO.familyNameKana"/>' maxlength="16" size="16"/></span>
			</div>
			<div class="error">
				<s:property value="errorFirstNameKanaMsg"/>
			</div>
			<div class="form-text">
				<span>[めい]<br><input type="text" placeholder="めい" name="firstNameKana" value='<s:property value="#session.AddressDTO.firstNameKana"/>' maxlength="16" size="16"/></span>
			</div>

		<!-- 郵便番号入力(7桁) -->
		 	<div class="error">
				<s:property value="errorPostalCodeMsg"/>
			</div>
			<div class="form-text">
				<span>郵便番号<br>〒<input type="text" placeholder="xxxxxxx" name="postalCode" value='<s:property value="#session.AddressDTO.postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/></span>
			</div>

		<!-- 住所 -->
			<div class="error">
				<s:property value="errorAddr11Msg"/>
			</div>
			<div class="form-text">
				<span>住所<br><input type="text" placeholder="住所" name="addr11" value='<s:property value="#session.AddressDTO.addr11"/>' maxlength="50" size="50"/></span>
			</div>
		<!-- 電話番号 -->
			<div class="error">
				<s:property value="errorTelNumberMsg"/>
			</div>
			<div class="form-text">
				<span>電話番号<br><input type="text" placeholder="電話番号" name="telNumber" value='<s:property value="#session.AddressDTO.telNumber"/>' maxlength="13" size="13"/></span>
			</div>

		<!-- メールアドレス -->
			<div class="error">
				<s:property value="errorEmailMsg"/>
			</div>
			<div class="form-text">
				<span>メールアドレス<br><input type="text" placeholder="メールアドレス" name="email" value='<s:property value="#session.AddressDTO.email"/>' maxlength="32" size="32"/></span>
			</div>


			</s:if>




			<s:else>

			<!-- 氏名 -->
			<div class="error">
				<s:property value="errorFamilyNameMsg"/>
			</div>
			<div class="form-text">
				<span>[姓]<br><input type="text" placeholder="姓" name="familyName" value='<s:property value="familyName"/>' maxlength="16" size="16"/></span>
			</div>
			<div class="error">
				<s:property value="errorFirstNameMsg"/>
			</div>
			<div class="form-text">
				<span>[名]<br><input type="text" placeholder="名" name="firstName" value='<s:property value="firstName"/>' maxlength="16" size="16"/></span>
			</div>


		<!-- 氏名のふりがな -->
			<div class="error">
				<s:property value="errorFamilyNameKanaMsg"/>
			</div>
			<div class="form-text">
			<span>[せい]<br><input type="text" placeholder="せい" name="familyNameKana" value='<s:property value="familyNameKana"/>' maxlength="16" size="16"/></span>
			</div>
			<div class="error">
				<s:property value="errorFirstNameKanaMsg"/>
			</div>
			<div class="form-text">
				<span>[めい]<br><input type="text" placeholder="めい" name="firstNameKana" value='<s:property value="firstNameKana"/>' maxlength="16" size="16"/></span>
			</div>

		<!-- 郵便番号入力(7桁) -->
		 	<div class="error">
				<s:property value="errorPostalCodeMsg"/>
			</div>
			<div class="form-text">
				<span>郵便番号<br>〒<input type="text" placeholder="xxxxxxx" name="postalCode" value='<s:property value="postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/></span>
			</div>

		<!-- 住所 -->
			<div class="error">
				<s:property value="errorAddr11Msg"/>
			</div>
			<div class="form-text">
				<span>住所<br><input type="text" placeholder="住所" name="addr11" value='<s:property value="addr11"/>' maxlength="50" size="50"/></span>
			</div>
		<!-- 電話番号 -->
			<div class="error">
				<s:property value="errorTelNumberMsg"/>
			</div>
			<div class="form-text">
				<span>電話番号<br><input type="text" placeholder="xxx-xxxx-xxxx" name="telNumber" value='<s:property value="telNumber"/>' maxlength="13" size="13"/></span>
			</div>

		<!-- メールアドレス -->
			<div class="error">
				<s:property value="errorEmailMsg"/>
			</div>
			<div class="form-text">
				<span>メールアドレス<br><input type="text" placeholder="example@vague.co.jp" name="email" value='<s:property value="email"/>' maxlength="32" size="32"/></span>
			</div>


			</s:else>

			<div class="button">
				<s:submit value="確認"/>
			</div>
		</s:form>
		</div>
	</div>

	<!-- footerの始まり -->
	<div class="footer">
		<jsp:include page="footer.jsp" />
	</div>
	<!-- footerの終わり -->



</body>
</html>