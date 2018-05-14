<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<title>レビュー投稿確認画面</title>
</head>

<body>
<s:if test="#session.LoginUserDTO == null || #session.CreateReviewCompleteDTO == null" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

 	 <jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<p>タイトル</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewTitle"/>
		<p>内容</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewBody"/>
		<p>評価</p>
		<s:property value="#session.CreateReviewCompleteDTO.reviewScore"/>


		<s:form action="CreateReviewCompleteAction" method="post">
			<input type="submit" value="投稿する" />
		</s:form>
		<form action="createReview.jsp" method="post">
			<input type="submit" value="戻って修正する" />
		</form>

    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>