<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />
<title>新規ユーザー情報登録ページ</title>
</head>
<body>
<s:if test="#session.LoginUserDTO != null " >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->

<div id="main">

	<div class="container">

		<div class="title">新規ユーザー登録ページ</div>



		<form action="UserCreateConfirmAction">

		<%-- セッションにCreateUserDTOがあるとき --%>
		<s:if test="#session.CreateUserDTO != null" >

			<p>氏名を漢字で入力してください。(氏名に漢字以外が含まれている場合は、ひらがな・半角英語も使用できます。)<p>
			<p class="error-msg"><s:property value='errorMsg.familyName' /></p>
			<p class="error-msg"><s:property value='errorMsg.firstName' /></p>
			<p><span>姓：<input type="text" name="familyName" value="<s:property value='#session.CreateUserDTO.familyName' />"></span>
			<span>名：<input type="text" name="firstName" value="<s:property value='#session.CreateUserDTO.firstName' />"></span></p>

			<p>氏名をひらがなで入力して下さい。</p>
			<p class="error-msg"><s:property value='errorMsg.familyNameKana' /></p>
			<p class="error-msg"><s:property value='errorMsg.firstNameKana' /></p>
			<p><span>姓かな：<input type="text" name="familyNameKana" value="<s:property value='#session.CreateUserDTO.familyNameKana' />"></span>
			<span>名かな：<input type="text" name="firstNameKana" value="<s:property value='#session.CreateUserDTO.firstNameKana' />"></span></p>

			<p>性別を選択して下さい。</p>
			<p class="error-msg"><s:property value='errorMsg.sex' /></p>

			<p><span>
			<s:if test="#session.sex == 0">
			<input type="radio" name="sex" value='0' checked/>男性
			<input type="radio" name="sex" value='1'/>女性
			</s:if></span>

			<p><span>
			<s:if test="#session.sex == 1">
			<input type="radio" name="sex" value='0'/>男性
			<input type="radio" name="sex" value='1' checked/>女性
			</s:if></span>


			<p>メールアドレスを入力してください。（14～32文字）</p>
			<p class="error-msg"><s:property value='errorMsg.email' /></p>
			<p><input type="text" size=35 name="email" value="<s:property value='#session.CreateUserDTO.email' />"></p>

			<p>以後ログイン時に使用するログインIDを<b>半角英数字1～8文字</b>で任意に入力してください。<p>
			<p class="error-msg"><s:property value='errorMsg.userId' /></p>
			<p class="error-msg"><s:property value="userIdErrorMsg" /></p>
			<p><input type="text" name="userId" value="<s:property value='#session.CreateUserDTO.userId' />"></p>

			<p>パスワードを<b>半角英数字1～16文字</b>で設定してください。</p>
			<p class="error-msg"><s:property value='errorMsg.password' /></p>
			<p><input type="password" name="password"></p>

		</s:if>


	<%-- セッションにCreateUserDTOがないとき（初回） --%>
		<s:else>

			<p>氏名を漢字で入力してください。(氏名に漢字以外が含まれている場合は、ひらがな・半角英語も使用できます。)<p>
			<p class="error-msg"><s:property value='errorMsg.familyName' /></p>
			<p class="error-msg"><s:property value='errorMsg.firstName'/></p>
			<p><span>姓：<input type="text" name="familyName" value="<s:property value='familyName' />"></span>
			   <span>名：<input type="text" name="firstName"  value="<s:property value='firstName' />"></span></p>

			<p>氏名をひらがなで入力して下さい。</p>
			<p class="error-msg"><s:property value='errorMsg.familyNameKana' /></p>
			<p class="error-msg"><s:property value='errorMsg.firstNameKana' /></p>
			<p><span>姓かな：<input type="text" name="familyNameKana" value="<s:property value='familyNameKana' />" ></span>
			   <span>名かな：<input type="text" name="firstNameKana" value="<s:property value='firstNameKana' />" ></span></p>

			<p>性別を選択して下さい。</p>
			<p class="error-msg"><s:property value='errorMsg.sex' /></p>
			<p><span>

			<input type="radio" name="sex" value='0' checked/>男性
			<s:if test="sex == 1">
			<input type="radio" name="sex" value='1' checked/>女性
			</s:if>
			<s:else>
			<input type="radio" name="sex" value='1'/>女性
			</s:else></span>

			<p>


			<p>メールアドレスを入力してください。（14～32文字）</p>
			<p class="error-msg"><s:property value='errorMsg.email' /></p>
			<p><input type="text" size=35 name="email" value="<s:property value='email' />"></p>

			<p>以後ログイン時に使用するログインIDを<b>半角英数字1～8文字</b>で任意に入力してください。<p>
			<p class="error-msg"><s:property value='errorMsg.userId' /></p>
			<p class="error-msg"><s:property value="userIdErrorMsg" /></p>
			<p><input type="text" name="userId" value="<s:property value='userId' />"></p>

			<p>パスワードを<b>半角英数字1～16文字</b>で設定してください。</p>
			<p class="error-msg"><s:property value='errorMsg.password' /></p>
			<p><input type="password" name="password"></p>

		</s:else>

		<input type="submit" value="確認画面に行く"/>
		</form>

	</div>
</div>

	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>