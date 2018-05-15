<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<title>入力情報確認</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

	<s:form action="UserCreateCompleteAction" method="post">
		姓：<s:property value="familyName"/> <br>
		名：<s:property value="firstName"/> <br>
		姓かな：<s:property value="familyNameKana"/> <br>
		名かな：<s:property value="firstNameKana"/> <br>
		性別：<s:if test="sex == 0" > 男 </s:if>
		<s:if test="sex == 1" > 女 </s:if> <br>
		メールアドレス：<s:property value="email"/> <br>
		ログインID：<s:property value="userId"/> <br>
		パスワード：<s:property value="password"/> <br>

		<s:submit  value="この情報で登録"/>



	</s:form>

	<a href="userCreate.jsp">戻って修正する</a>


	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>
