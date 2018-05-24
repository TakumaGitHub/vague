<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<meta http-equiv="refresh" content="3;URL=<s:url action='GoHomeAction' />">
<title>セッションアウト</title>
</head>

<body>



	<!--  headerの始まり -->

	<s:if test="#session.LoginUserDTO != null && #session.LoginUserDTO.mFlg == 1" >
		<jsp:include page="headerMaster.jsp" />
	</s:if>
	<s:else>
		<jsp:include page="header.jsp" />
	</s:else>


    <!--  headerの終わり -->





	<!--  mainの始まり -->

	<div id="main">
		<div class="container" style="text-align :center;">
			<h2 class="title">エラーページ</h2>

				<p>セッションがタイムアウトしました。3秒後にホームページに戻ります。</p>
				<p>ジャンプしない場合は、以下のリンクをクリックしてください。</p>
				<p><a href='<s:url action="GoHomeAction" />'>ホーム画面へ</a></p>

		</div>
	</div>


    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>