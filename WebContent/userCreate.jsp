<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<title>新規ユーザー情報登録ページ</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->

<p><s:property value="userIdErrorMsg" /></p>



<form action="UserCreateConfirmAction">

<%-- セッションにCreateUserDTOがあるとき --%>
<s:if test="#session.CreateUserDTO != null" >

	<p>氏名を漢字で入力してください。<p>
	<p><s:property value='errorMsg.familyName' /></p>
	<p>名字：<input type="text" name="familyName" value="<s:property value='#session.CreateUserDTO.familyName' />"> </p>
	<p><s:property value='errorMsg.firstName' /></p>
	<p>名前：<input type="text" name="firstName" value="<s:property value='#session.CreateUserDTO.firstName' />"></p>

	<p>氏名をひらがなで入力して下さい。</p>
	<p><s:property value='errorMsg.familyNameKana' /></p>
	<p>みょうじ：<input type="text" name="familyNameKana" value="<s:property value='#session.CreateUserDTO.familyNameKana' />"></p>
	<p><s:property value='errorMsg.firstNameKana' /></p>
	<p>なまえ：<input type="text" name="firstNameKana" value="<s:property value='#session.CreateUserDTO.firstNameKana' />"></p>

	<p>性別を選択して下さい。</p>
	<p>
	<input type="radio" name="sex" value="0" checked>男性
	<input type="radio" name="sex" value="1">女性
	</p>


	<p><s:property value='errorMsg.email' /></p>
	<p>メールアドレスを入力してください。（14～32文字）</p>
	<p><input type="text" size=35 name="email" value="<s:property value='#session.CreateUserDTO.email' />"></p>

	<p>以後ログイン時に使用するログインIDを<b>半角英数字1～8文字</b>で任意に入力してください。<p>
	<p><s:property value='errorMsg.userId' /></p>
	<p><input type="text" name="userId" value="<s:property value='#session.CreateUserDTO.userId' />"></p>


	<p>パスワードを<b>半角英数字1～16文字</b>で設定してください。</p>
	<p><s:property value='errorMsg.password' /></p>
	<p><input type="password" name="password"></p>

</s:if>

<s:else>

	<p>氏名を漢字で入力してください。<p>
	<p><s:property value='errorMsg.familyName' /></p>
	<p>名字：<input type="text" name="familyName" value="<s:property value='familyName' />"> </p>
	<p><s:property value='errorMsg.firstName' /></p>
	<p>名前：<input type="text" name="firstName" value="<s:property value='firstName' />"></p>

	<p>氏名をひらがなで入力して下さい。</p>
	<p><s:property value='errorMsg.familyNameKana' /></p>
	<p>みょうじ：<input type="text" name="familyNameKana" value="<s:property value='familyNameKana' />"></p>
	<p><s:property value='errorMsg.firstNameKana' /></p>
	<p>なまえ：<input type="text" name="firstNameKana" value="<s:property value='firstNameKana' />"></p>

	<p>性別を選択して下さい。</p>
	<p>
	<input type="radio" name="sex" value="0" checked>男性
	<input type="radio" name="sex" value="1">女性
	</p>


	<p><s:property value='errorMsg.email' /></p>
	<p>メールアドレスを入力してください。（14～32文字）</p>
	<p><input type="text" size=35 name="email" value="<s:property value='email' />"></p>

	<p>以後ログイン時に使用するログインIDを<b>半角英数字1～8文字</b>で任意に入力してください。<p>
	<p><s:property value='errorMsg.userId' /></p>
	<p><input type="text" name="userId" value="<s:property value='userId' />"></p>


	<p>パスワードを<b>半角英数字1～16文字</b>で設定してください。</p>
	<p><s:property value='errorMsg.password' /></p>
	<p><input type="password" name="password"></p>

</s:else>

<input type="submit" value="確認画面に行く"/>
</form>


	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>