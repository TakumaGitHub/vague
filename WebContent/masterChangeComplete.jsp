<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />
<meta http-equiv="refresh" content="5;URL=<s:url action='MasterAction' />">
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>Vague</title>
</head>

<body>



	<!--  headerの始まり -->

   <header>

   </header>

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">


    	<h2>商品情報の変更が完了いたしました</h2>

    	<p>5秒後にトップページに戻ります</p>

    	<p><a href="/vague/home.jsp" >戻らない場合はこちら</a></p>


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>