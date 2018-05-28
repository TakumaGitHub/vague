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

<script src="js/lineBreak.js" type="text/javascript" ></script>
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

				<table id="review-confirm-table">

					<tr>
						<th>タイトル</th>
						<td class="line-break"><s:property value="#session.CreateReviewCompleteDTO.reviewTitle"/></td>
					</tr>

					<tr>
						<th>内容</th>
						<td class="line-break"><s:property value="#session.CreateReviewCompleteDTO.reviewBody"/></td>
					</tr>

					<tr>
						<th>評価</th>
						<td>
							<s:iterator begin="1" end="#session.CreateReviewCompleteDTO.reviewScore" step="1" >
								<img src="LogoImage/reviewScore.png" />
							</s:iterator>
						</td>
					</tr>

				</table>


				<div class="form-box-wrapper">

					<div class="form-box">

						<form action="CreateReviewCompleteAction" method="post">
						<input type="submit" value="投稿する" />
						</form>

					</div>

					<div class="form-box">

						<form action="createReview.jsp" method="post">
						<input type="submit" value="戻って修正する" />
						</form>

					</div>


				</div>

    		</div>



    	</div>



    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>