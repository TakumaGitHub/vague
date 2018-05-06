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


		<h2>商品名：<s:property value="#session.CreateReviewProductDTO.productName" /></h2>

		<img src="<s:property value="#session.CreateReviewProductDTO.imageFilePath"/>" width="200" height="auto" />

		<h3>レビューの投稿</h3>

		<s:form action="CreateReviewConfirmAction">

			<p><s:property value="errorMsg.reviewTitle" /></p>
			<p>タイトル<input type="text" name="reviewTitle" value="<s:property value='reviewTitle' />" required="required"/></p>

			<p><s:property value="errorMsg.reviewBody" /></p>
			<p>内容</p>
			<textarea rows="5" name="reviewBody"  required="required"/></textarea>

			<p><s:property value="errorMsg.reviewScore" /></p>
			<p>評価</p>

			<select name="reviewScore" >

				<s:iterator begin="1" end="5" step="1" status="st">
					<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
				</s:iterator>

			</select>


			<input type="submit" value="確認画面に行く" />

		</s:form>


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>