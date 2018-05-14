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

				<h2 class="introduce-msg">レビューの投稿</h2>

				<h3>商品名：<s:property value="#session.CreateReviewProductDTO.productName" /></h3>

				<img src="<s:property value="#session.CreateReviewProductDTO.imageFilePath"/>"/>



				<s:form action="CreateReviewConfirmAction">

					<s:if test="#session.CreateReviewCompleteDTO != null && #session.CreateReviewProductDTO.productId != #session.CreateReviewCompleteDTO.productId || #session.CreateReviewCompleteDTO == null">

						<p><s:property value="errorMsg.reviewTitle" /></p>
						<p>タイトル：<input type="text" name="reviewTitle" value="<s:property value='reviewTitle' />" required="required"/>　<span class="caution-msg">※１～１００文字以内</span></p>

						<p><s:property value="errorMsg.reviewBody" /></p>
						<p>内容：　<span class="caution-msg">※１～２５５文字以内</p>
						<textarea rows="5" name="reviewBody"  required="required"/><s:property value='reviewBody' /></textarea>

						<p><s:property value="errorMsg.reviewScore" /></p>
						<p>評価：

						<select name="reviewScore" >

							<s:iterator begin="1" end="5" step="1" status="st">
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:iterator>

						</select></p>

					</s:if>

					<s:elseif test="#session.CreateReviewCompleteDTO != null">

						<p><s:property value="errorMsg.reviewTitle" /></p>
						<p>タイトル<input type="text" name="reviewTitle" value="<s:property value='#session.CreateReviewCompleteDTO.reviewTitle' />" required="required"/>　<span class="caution-msg">※１～１００文字以内</span></p>

						<p><s:property value="errorMsg.reviewBody" /></p>
						<p>内容　<span class="caution-msg">※１～２５５文字以内</span></p>
						<textarea rows="5" name="reviewBody"  required="required"/><s:property value='#session.CreateReviewCompleteDTO.reviewBody' /></textarea>

						<p><s:property value="errorMsg.reviewScore" /></p>
						<p>評価

						<select name="reviewScore" >

							<s:iterator begin="1" end="5" step="1" status="st">

								<s:if test="#session.CreateReviewCompleteDTO.reviewScore == #st.count">
									<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
								</s:if>
								<s:else>
									<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
								</s:else>

							</s:iterator>

						</select></p>

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