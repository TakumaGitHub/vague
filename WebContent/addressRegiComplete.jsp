<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />
<script src="js/blowserBackPrevent.js" type="text/javascript"></script>
<title>宛先登録完了画面</title>
</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->

	<div>
		<h3>宛先が登録されました。</h3>
	</div>
	<div>
		<p>決済画面に<a href='<s:url action="BuyItemAction"/>'>戻る</a></p>
	</div>


	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->

</body>
</html>