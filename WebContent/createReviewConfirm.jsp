<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<title>Vague</title>
</head>

<body>



	<!--  headerの始まり -->

   <header>

   </header>

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<p>タイトル</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewTitle"/>
		<p>内容</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewBody"/>
		<p>評価</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewScore"/>


		<form action="CreateReviewCompleteAction" method="post">
			<input type="submit" value="投稿する" />
		</form>

    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>