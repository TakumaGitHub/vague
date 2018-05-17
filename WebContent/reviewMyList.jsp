<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />

<title>マイレビュー画面</title>
</head>

<body>



	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<div class="container">

			<s:iterator value="#session.ReviewMyListDTOList" >

				<p>
					<input form="checkDelete" type="checkbox" name="review_id" value="<s:property value='reviewDTO.id' />" />
					<s:property value="reviewDTO.reviewTitle" />
					<s:property value="reviewDTO.reviewBody" />
					<s:property value="productDTO.productName" />
				</p>

			</s:iterator>


			<s:if test="#session.reviewMyListLength != null">

               <span>ページ数</span>

                       <s:iterator begin="1" end="#session.reviewMyListLength" step="1" status="st">

                               <a href="<s:url action='ReviewMyListAction' />?ListNumber=<s:property value='#st.index' />" ><s:property value='#st.count' /> </a>

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

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>