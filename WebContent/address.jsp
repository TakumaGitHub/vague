<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
<title>宛先情報登録画面</title>
</head>
<body>
	<div>
		<h3>宛先登録</h3>

	<s:form action="AddressRegiConfirmAction">


		<s:if test="#session.AddressDTO != null" >

			<!-- 氏名 -->
		<div>
			<s:property value="errorFamilyNameMsg"/>
		</div>
		<div>
			<span>[姓]<br><input type="text" placeholder="姓" name="familyName" value='<s:property value="#session.AddressDTO.familyName"/>' maxlength="16" size="16"/></span>
		</div>
		<div>
			<s:property value="errorFirstNameMsg"/>
		</div>
		<div>
			<span>[名]<br><input type="text" placeholder="名" name="firstName" value='<s:property value="#session.AddressDTO.firstName"/>' maxlength="16" size="16"/></span>
		</div>


		<!-- 氏名のふりがな -->
		<div>
			<s:property value="errorFamilyNameKanaMsg"/>
		</div>
		<div>
		<span>[せい]<br><input type="text" placeholder="せい" name="familyNameKana" value='<s:property value="#session.AddressDTO.familyNameKana"/>' maxlength="16" size="16"/></span>
		</div>
		<div>
			<s:property value="errorFirstNameKanaMsg"/>
		</div>
		<div>
			<span>[めい]<br><input type="text" placeholder="めい" name="firstNameKana" value='<s:property value="#session.AddressDTO.firstNameKana"/>' maxlength="16" size="16"/></span>
		</div>

		<!-- 郵便番号入力(7桁) -->
		<div>
			<s:property value="errorPostalCodeMsg"/>
		</div>
		<div>
			<span>郵便番号<br>〒<input type="text" placeholder="郵便番号" name="postalCode" value='<s:property value="#session.AddressDTO.postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/></span>
		</div>

		<!-- 住所 -->
		<div>
			<s:property value="errorAddr11Msg"/>
		</div>
			<span>住所<br><input type="text" placeholder="住所" name="addr11" value='<s:property value="#session.AddressDTO.addr11"/>' maxlength="50" size="50"/></span>

		<!-- 電話番号 -->
		<div>
			<s:property value="errorTelNumberMsg"/>
		</div>
		<div>
			<span>電話番号<br><input type="text" pleceholder="電話番号" name="telNumber" value='<s:property value="#session.AddressDTO.telNumber"/>' maxlength="13" size="13"/></span>
			</div>

		<!-- メールアドレス -->
		<div>
			<s:property value="errorEmailMsg"/>
		</div>
		<div>
			<span>メールアドレス<br><input type="text" placeholder="メールアドレス" name="email" value='<s:property value="#session.AddressDTO.email"/>' maxlength="32" size="32"/></span>
		</div>


		</s:if>
		<s:else>

			<!-- 氏名 -->
		<div>
			<s:property value="errorFamilyNameMsg"/>
		</div>
		<div>
			<span>[姓]<br><input type="text" placeholder="姓" name="familyName" value='<s:property value="familyName"/>' maxlength="16" size="16"/></span>
		</div>
		<div>
			<s:property value="errorFirstNameMsg"/>
		</div>
		<div>
			<span>[名]<br><input type="text" placeholder="名" name="firstName" value='<s:property value="firstName"/>' maxlength="16" size="16"/></span>
		</div>


		<!-- 氏名のふりがな -->
		<div>
			<s:property value="errorFamilyNameKanaMsg"/>
		</div>
		<div>
		<span>[せい]<br><input type="text" placeholder="せい" name="familyNameKana" value='<s:property value="familyNameKana"/>' maxlength="16" size="16"/></span>
		</div>
		<div>
			<s:property value="errorFirstNameKanaMsg"/>
		</div>
		<div>
			<span>[めい]<br><input type="text" placeholder="めい" name="firstNameKana" value='<s:property value="firstNameKana"/>' maxlength="16" size="16"/></span>
		</div>

		<!-- 郵便番号入力(7桁) -->
		<div>
			<s:property value="errorPostalCodeMsg"/>
		</div>
		<div>
			<span>郵便番号<br>〒<input type="text" placeholder="郵便番号" name="postalCode" value='<s:property value="postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/></span>
		</div>

		<!-- 住所 -->
		<div>
			<s:property value="errorAddr11Msg"/>
		</div>
			<span>住所<br><input type="text" placeholder="住所" name="addr11" value='<s:property value="addr11"/>' maxlength="50" size="50"/></span>

		<!-- 電話番号 -->
		<div>
			<s:property value="errorTelNumberMsg"/>
		</div>
		<div>
			<span>電話番号<br><input type="text" placeholder="xxx-xxxx-xxxx" name="telNumber" value='<s:property value="telNumber"/>' maxlength="13" size="13"/></span>
			</div>

		<!-- メールアドレス -->
		<div>
			<s:property value="errorEmailMsg"/>
		</div>
		<div>
			<span>メールアドレス<br><input type="text" placeholder="example@vague.co.jp" name="email" value='<s:property value="email"/>' maxlength="32" size="32"/></span>
		</div>


		</s:else>

		<div>
			<s:submit value="確認"/>
		</div>
	</s:form>
	</div>
</body>
</html>