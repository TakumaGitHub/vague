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


		<s:iterator value="#session.ReviewMyListDTOList" >

			<s:property value="reviewDTO.reviewTitle" />
			<s:property value="reviewDTO.reviewBody" />
			<s:property value="productDTO.productName" />

		</s:iterator>

    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>