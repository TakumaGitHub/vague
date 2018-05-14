<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<title>宛先入力情報確認画面</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />


    <!--  headerの終わり -->

	<div>
		<h3>登録する宛先情報は以下でよろしいですか？</h3>
		<s:form action="AddressRegiCompleteAction">
			<div>
				<span>[姓]<s:property value="#session.AddressDTO.familyName" escape="false"/></span>
			</div>
			<div>
				<span>[名]<s:property value="#session.AddressDTO.firstName" escape="false"/></span>
			</div>
			<div>
				<span>[せい]<s:property value="#session.AddressDTO.familyNameKana" escape="false"/></span>
			</div>
			<div>
				<span>[めい]<s:property value="#session.AddressDTO.firstNameKana" escape="false"/></span>
			</div>
			<!-- 郵便番号一旦保留 -->
			<%-- <div>
				<span>[郵便番号]<s:property value="#session.AddressDTO.postalCode" escape="false"/></span>
			</div> --%>
			<div>
				<span>[住所]<s:property value="#session.AddressDTO.addr11" escape="false"/></span>
			</div>
			<div>
				<span>[電話番号]<s:property value="#session.AddressDTO.telNumber" escape="false"/></span>
			</div>
			<div>
				<span>[メールアドレス]<s:property value="#session.AddressDTO.email" escape="false"/></span>
			</div>
			<div>
				<span><s:submit value="登録"/></span>
			</div>
		</s:form>
		<div>
		<s:form action="AddressAction">
			<span><s:submit value="戻る"/></span>
		</s:form>
		</div>
	</div>


	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>