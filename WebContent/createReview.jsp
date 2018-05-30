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
<script type="text/javascript" src="js/createReview.js" ></script>
<title>レビュー投稿画面</title>
</head>

<body>

<s:if test="#session.LoginUserDTO == null || #session.CreateReviewProductDTO == null" >
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

				<h2 class="title">レビューの投稿</h2>


				<div class="review-product-box">

					<h3>商品名：<s:property value="#session.CreateReviewProductDTO.productName" /></h3>

					<img src="<s:property value="#session.CreateReviewProductDTO.imageFilePath"/>"/>

				</div>





				<s:form action="CreateReviewConfirmAction">

					<%-- セッションにCreateReviewCompleteDTOがないとき --%>
					<s:if test="#session.CreateReviewCompleteDTO != null && #session.CreateReviewProductDTO.productId != #session.CreateReviewCompleteDTO.productId || #session.CreateReviewCompleteDTO == null">


						<p>タイトル：<input class="reviewTitle-form" type="text" name="reviewTitle" value="<s:property value='reviewTitle' />" required="required" pattern="^.{1,100}$"/>　<span class="caution-msg">※あと<span class="max-reviewTitle">100</span>文字まで</span></p>
						<p class="error-msg"><s:property value="errorMsg.reviewTitle" /></p>

						<p>内容：　<span class="caution-msg">※あと<span class="max-reviewBody">255</span>文字まで</span></p>
						<p class="error-msg"><s:property value="errorMsg.reviewBody" /></p>
						<textarea class="reviewBody-form" rows="5" name="reviewBody"  required="required"><s:property value='reviewBody' /></textarea>


						<p>評価：


						<s:if test="reviewScore != null">
							<input type="hidden" id="reviewScore" name="reviewScore" value="<s:property value="reviewScore" />">
						</s:if>
						<s:else>
							<input type="hidden" id="reviewScore" name="reviewScore" value="1">
						</s:else>



							<s:iterator begin="1" end="5" step="1" status="st">

								<s:if test="#st.first">
									<img class="review-score-star" src="LogoImage/reviewScore.png" />
								</s:if>
								<s:else>
									<img class="review-score-star"  src="LogoImage/reviewScoreGrey.png" />
								</s:else>

							</s:iterator>

						</p>
						<p class="error-msg"><s:property value="errorMsg.reviewScore" /></p>

					</s:if>




					<%-- セッションにCreateReviewCompleteDTOがあるとき --%>
					<s:elseif test="#session.CreateReviewCompleteDTO != null">


						<p>タイトル<input class="reviewTitle-form"  type="text" name="reviewTitle" value="<s:property value='#session.CreateReviewCompleteDTO.reviewTitle' />" required="required" pattern="^.{1,100}$"/>　<span class="caution-msg">※あと<span class="max-reviewTitle">100</span>文字まで</span></p>
						<p class="error-msg"><s:property value="errorMsg.reviewTitle" /></p>

						<p>内容　<span class="caution-msg">※あと<span class="max-reviewBody">255</span>文字まで</span></p>
						<p class="error-msg"><s:property value="errorMsg.reviewBody" /></p>
						<textarea class="reviewBody-form"  rows="5" name="reviewBody"  required="required"><s:property value='#session.CreateReviewCompleteDTO.reviewBody'/></textarea>


						<p>評価



						<input type="hidden" id="reviewScore" name="reviewScore" value="<s:property value='#session.CreateReviewCompleteDTO.reviewScore' />">

							<s:iterator begin="1" end="5" step="1" status="st">

								<s:if test="#session.CreateReviewCompleteDTO.reviewScore >= #st.count">
									<img class="review-score-star" src="LogoImage/reviewScore.png" />
								</s:if>
								<s:else>
									<img class="review-score-star"  src="LogoImage/reviewScoreGrey.png" />
								</s:else>

							</s:iterator>

						</p>
						<p class="error-msg"><s:property value="errorMsg.reviewScore" /></p>


					</s:elseif>




					<input type="submit" value="確認画面に行く" />

				</s:form>


			</div><!-- main-container -->


		</div><!-- container -->


    </div><!-- main -->

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>