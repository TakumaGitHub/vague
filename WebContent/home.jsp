<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" type="text/css" href="css/home.css" />
<script src="js/home.js" type="text/javascript"></script>
<title>Vague</title>
</head>

<body>



	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->



	    <!-- Vagueのロゴ -->
	    <div class="Vague-Logo" >
	    <img id="Vague-Logo-Outer" src="LogoImage/VagueLogoOuter.png"  />
	    <img id="Vague-Logo-Inner" src="LogoImage/VagueLogoInner.png"   />
	    </div>


    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>