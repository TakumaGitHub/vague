<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入力情報確認</title>
</head>
<body>
	<s:form action="UserCreateCompleteAction" method="post">
		姓：<s:property value="familyName"/> <br>
		名：<s:property value="firstName"/> <br>
		姓かな：<s:property value="familyName_kana"/> <br>
		名かな：<s:property value="familyName_kana"/> <br>
		性別：<s:if test="sex == 0" > 男 </s:if>
		<s:if test="sex == 1" > 女 </s:if> <br>
		メールアドレス：<s:property value="email"/> <br>
		ログインID：<s:property value="loginId"/> <br>
		パスワード：<s:property value="password"/> <br>

		<s:submit  value="この情報で登録"/>



	</s:form>

	<a href="userCreate.jsp">戻って修正する</a>

</body>
</html>
