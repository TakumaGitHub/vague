<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/createReview.css" />

<title>レビュー投稿確認画面</title>
</head>

<body>
<s:if test="#session.LoginUserDTO == null || #session.CreateReviewCompleteDTO == null || accessKey == null && accessKey != true" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

 	 <jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

    	<div class="container">

    		<div class="main-container">

    			<h2 class="title">レビュー投稿確認画面</h2>

    			<div class="review-product-box">

					<h3>商品名：<s:property value="#session.CreateReviewProductDTO.productName" /></h3>

					<img src="<s:property value="#session.CreateReviewProductDTO.imageFilePath"/>"/>

				</div>


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



    	</div>



    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>