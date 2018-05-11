<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<meta http-equiv="refresh" content="5;URL=/vague/userInterface.jsp" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>Vague</title>
</head>

<body>
<s:if test="#session.LoginUserDTO != null">
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>



	<!--  headerの始まり -->

   <header>

   </header>

    <!--  headerの終わり -->

		<h2>パスワードの再設定が完了いたしました</h2>

    	<p>5秒後にログイン画面に移動します</p>

		<p><a href="/vague/userInterface.jsp" >移動しない場合はこちら</a></p>


	<!--  mainの始まり -->

    <div id="main">


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>