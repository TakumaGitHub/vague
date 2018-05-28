<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/address.css">
<!-- 郵便番号から住所自動検索 -->
<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
<title>宛先情報登録画面</title>
</head>
<body>




	<!--  headerの始まり -->

		<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

	<div id="main">

		<div class="container">
			<h3 class="title">宛先登録</h3>
			<p>※郵便番号及び、電話番号はハイフン抜きで入力して下さい。<br>
			※住所は、半角及び全角スペース抜きで詰めて入力して下さい。</p>

			<div class="box">

		<s:form id="form1" action="AddressRegiConfirmAction">

			<%--セッションにAddressDTOがある場合 --%>
			<s:if test="#session.AddressDTO != null" >

			<div class="name-box">

				<!-- 氏名 -->

				<div class="fullName">
					<span>[姓]<br><input type="text" name="familyName" value='<s:property value="#session.AddressDTO.familyName"/>' maxlength="16" size="16"/>
					</span>
				</div>

				<div class="fullName">

					<span>[名]<br><input type="text" name="firstName" value='<s:property value="#session.AddressDTO.firstName"/>' maxlength="16" size="16"/>

					</span>

				</div>
				<span class="error"><s:property value="errorFamilyNameMsg"/></span><br>
				<span class="error"><s:property value="errorFirstNameMsg"/></span>


			</div>

				<!-- 氏名のふりがな -->

				<div class="name-box">

					<div class="nameKana">
						<span>[せい]<br>
						<input type="text" name="familyNameKana" value='<s:property value="#session.AddressDTO.familyNameKana"/>' maxlength="16" size="16"/><br>
						</span>
					</div>

					<div class="nameKana">

						<span>[めい]<br><input type="text" name="firstNameKana" value='<s:property value="#session.AddressDTO.firstNameKana"/>' maxlength="16" size="16"/><br>
						</span>

					</div>


				</div>






		<!-- 郵便番号入力(7桁) -->

			<div class="form-text">
			<div>
				<span>郵便番号<br>〒<input type="text" name="postalCode" value='<s:property value="#session.AddressDTO.postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/></span>
			</div>
			<div class="error">
				<s:property value="errorPostalCodeMsg"/>
			</div>
			</div>


		<!-- 住所 -->

			<div class="form-text">
			<div>
				<span>住所<br>
					<input type="text" name="addr11" value='<s:property value="#session.AddressDTO.addr11"/>' maxlength="50" size="40"/>
				</span>
			</div>
			<div class="error">
				<s:property value="errorAddr11Msg"/>
			</div>
			</div>


		<!-- 電話番号 -->

			<div class="form-text">
			<div>
				<span>電話番号<br><input type="text" name="telNumber" value='<s:property value="#session.AddressDTO.telNumber"/>' maxlength="13" size="13"/></span>
			</div>
			<div class="error">
				<s:property value="errorTelNumberMsg"/>
			</div>
			</div>


		<!-- メールアドレス -->

			<div class="form-text">
			<div>
				<span>メールアドレス<br><input type="text" name="email" value='<s:property value="#session.AddressDTO.email"/>' maxlength="32" size="32"/></span>
			</div>
			<div class="error">
				<s:property value="errorEmailMsg"/>
			</div>
			</div>
			</s:if>


			<s:else>

			<%--セッションにAddressDTOがない場合 --%>
			<!-- 氏名 -->

			<div class="name-box">

				<!-- 氏名 -->

				<div class="fullName">
					<span>[姓]<br><input type="text" name="familyName" value='<s:property value="familyName"/>' maxlength="16" size="16"/>
					</span>
				</div>

				<div class="fullName">

					<span>[名]<br><input type="text" name="firstName" value='<s:property value="firstName"/>' maxlength="16" size="16"/>

					</span>

				</div>

			</div>
			<span class="error"><s:property value="errorFamilyNameMsg"/></span><br>
			<span class="error"><s:property value="errorFirstNameMsg"/></span>


		<!-- 氏名のふりがな -->

		<div class="name-box">

			<div class="nameKana">
				<span>[せい]<br>
				<input type="text" name="familyNameKana" value='<s:property value="familyNameKana"/>' maxlength="16" size="16"/><br>
				</span>
			</div>

			<div class="nameKana">

				<span>[めい]<br><input type="text" name="firstNameKana" value='<s:property value="firstNameKana"/>' maxlength="16" size="16"/><br>
				</span>

			</div>


		</div>

		<span class="error"><s:property value="errorFamilyNameKanaMsg"/></span><br>
		<span class="error"><s:property value="errorFirstNameKanaMsg"/></span>

		<!-- 郵便番号入力(7桁) -->

			<div class="form-text">
			<div>
				<span>郵便番号<br>
					〒<input type="text" name="postalCode" value='<s:property value="postalCode"/>' pattern="^[0-9]{7}$" size="8" oninput="AjaxZip3.zip2addr(this,'','addr11','addr11');"/>
				</span>
			</div>
			<div class="error">
				<s:property value="errorPostalCodeMsg"/>
			</div>
			</div>



		<!-- 住所 -->

			<div class="form-text">
			<div>
				<span>住所<br><input type="text" name="addr11" value='<s:property value="addr11"/>' maxlength="50" size="40"/></span>
			</div>
			<div class="error">
				<s:property value="errorAddr11Msg"/>
			</div>
			</div>


		<!-- 電話番号 -->

			<div class="form-text">
			<div>
				<span>電話番号<br><input type="text" name="telNumber" value='<s:property value="telNumber"/>' maxlength="13" size="13"/></span>
			</div>
			<div class="error">
				<s:property value="errorTelNumberMsg"/>
			</div>
			</div>


		<!-- メールアドレス -->

			<div class="form-text">
			<div>
				<span>メールアドレス<br><input type="text" name="email" value='<s:property value="email"/>' maxlength="32" size="32"/></span>
			</div>
			<div class="error">
				<s:property value="errorEmailMsg"/>
			</div>
			</div>

			</s:else>

			<div class="button">
				<input type="submit" value="確認"/>
			</div>
		</s:form>

		</div>
		</div>
	</div>

	<!-- footerの始まり -->

		<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->



</body>
</html>