<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.min.js"></script>
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

	<div class="error2">
		<s:property value="errorMsg"/>
	</div>

		<div class="box">
			<div>
				<h3>宛先登録確認</h3>
					<p>以下の情報でよろしければ登録を押して下さい。<br>
					※修正する場合は戻るを押して下さい。</p>
			</div>

			<s:form id="form2" action="AddressRegiCompleteAction">

				<div class="fullName1" >
					<span class="text">[姓]<br>
						<s:property value="#session.AddressDTO.familyName" escape="false"/>
					</span>
					<span class="firstName">[名]<br>
						<s:property value="#session.AddressDTO.firstName" escape="false"/>
					</span>
				</div>

					<div class="nameKana">
						<span class="text">[せい]<br>
							<s:property value="#session.AddressDTO.familyNameKana" escape="false"/>
						</span>
						<span class="firstNameKana">[めい]<br>
							<s:property value="#session.AddressDTO.firstNameKana" escape="false"/>
						</span>
					</div>

					<div class="form-text">
						<span class="text">[郵便番号]<br>
							<span>
								<s:property value="#session.AddressDTO.postalCode" escape="false"/>
							</span>
						</span>
					</div>

					<div class="form-text">
						<span class="text">[住所]<br>
							<span>
								<s:property value="#session.AddressDTO.addr11" escape="false"/>
							</span>
						</span>
					</div>

					<div class="form-text">
						<span class="text">[電話番号]<br>
							<span>
								<s:property value="#session.AddressDTO.telNumber" escape="false"/>
							</span>
						</span>
					</div>

					<div class="form-text">
						<span class="text">[メールアドレス]<br>
							<span>
								<s:property value="#session.AddressDTO.email" escape="false"/>
							</span>
						</span>
					</div>

					<div class="buttom">
						<input id="buttom2" type="submit" value="戻る">
						<input id="buttom1" type="submit" value="登録">
					</div>
			</s:form>
		</div>
	</div>
	</div>

	<script>
		$(function(){
			$('#buttom1').click(function() {
				$('#form2').attr('action','AddressRegiCompleteAction');
				$('#form2').submit();
			});
			$('#buttom2').click(function(){
				$('#form2').attr('action','AddressAction');
				$('#form2').submit();
			});
		});
	</script>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>