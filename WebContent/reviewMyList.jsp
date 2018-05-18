<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/reviewMyList.css" />

<title>マイレビュー画面</title>
</head>

<body>



	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<div class="container">

			<div class="review-container">

				<h2 class="introduce-msg">MY REVIEW</h2>

				<s:iterator value="#session.ReviewMyListDTOList" >

					<div class="my-review-box" >

						<input form="checkDelete" type="checkbox" name="review_id" value="<s:property value='reviewDTO.id' />" />

						<div class="my-review-inner-box">

							<div class="review-image-box">

							<img src="<s:property value='productDTO.imageFilePath' />" alt="マイレビューの写真" />

							</div>


							<div class="my-review-body-box">

								<p>商品名：<s:property value="productDTO.productName" /></p>
								<p>タイトル：<s:property value="reviewDTO.reviewTitle" /></p>
								<p>内容：</p>
								<textarea rows="4" readonly><s:property value="reviewDTO.reviewBody" /></textarea>
								<p>評価：

									<s:iterator begin="1" end="reviewDTO.reviewScore" step="2" >
										<img class="review-socre-star" src="LogoImage/reviewScore.png" />
									</s:iterator>

								</p>

							</div>


						</div>



					</div>



				</s:iterator>


				<s:if test="#session.reviewMyListLength != null">


	                       <s:iterator begin="1" end="#session.reviewMyListLength" step="1" status="st">

	                               <a class="pageNation" href="<s:url action='ReviewMyListAction' />?ListNumber=<s:property value='#st.index' />" ><s:property value='#st.count' /> </a>

	                       </s:iterator>

	       		</s:if>



				<form action="ReviewMyListAction" method="post" >
					<input type="hidden" name="deleteFlg" value="2" />
					<input type="submit" value="レビューを全削除"/>
				</form>

				<form id="checkDelete" action="ReviewMyListAction" method="post" >
				<input type="hidden" name="deleteFlg" value="1" />
					<input type="submit" value="チェックしたレビューを削除"/>
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