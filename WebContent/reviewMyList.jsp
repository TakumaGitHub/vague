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

			<s:form action="ReviewMyListAction" method="post" >
				<button name="deleteFlg" value="2" >レビューを全削除</button>
			</s:form>

			<s:form id="checkDelete" action="ReviewMyListAction" method="post" >
				<button name="deleteFlg" value="1" >チェックしたレビューを削除</button>
			</s:form>


			<s:iterator value="#session.ReviewMyListDTOList" >

				<p>
					<input form="checkDelete" type="checkbox" name="review_id" value="<s:property value='reviewDTO.id' />" />
					<s:property value="reviewDTO.reviewTitle" />
					<s:property value="reviewDTO.reviewBody" />
					<s:property value="productDTO.productName" />
				</p>

			</s:iterator>




    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>