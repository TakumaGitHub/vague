<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<link rel="stylesheet" href="./css/alatanapizza.css">

	<jsp:include page="head.jsp" />

<title>マイページ</title>
<style type="text/css">
#main{
width:80%;
background-color:#EEEEEE;
margin-top:60px;
margin-left:10%;
margin-bottom:60px;
}
h3{
font-size:30px;
margin-top:40px;
text-align:center;
}
table{
width:80%;
margin:0 auto;
text-align:left;
}
.line{
background-color:silver;
padding:10px;
}
.button{
text-align:center;
}


</style>
</head>
<body>

	<!--  headerの始まり -->
	<jsp:include page="WEB-INF/header.jsp" />
	<!--  headerの終わり -->

	<!--  mainの始まり -->
	<div id="main">
	<h3>MyPage</h3>

		<table>
		<tr><td colspan="2"><hr></td></tr>
		<s:iterator value="myPageList">
			<tr>
				<th class="line">　氏名</th>
				<td class="line">　<s:property value="familyName" escape="false" />　<s:property value="firstName" escape="false" /></td>
			</tr>
			<tr>
				<th class="line">　ふりがな</th>
				<td class="line">　<s:property value="familyNameKana" escape="false" />　<s:property value="firstNameKana" escape="false" /></td>
			</tr>
			<tr>
				<th class="line">　性別</th>
				<td class="line">
					<s:if test="sex == 0">　男性</s:if>
					<s:if test="sex == 1">　女性</s:if></td>
			</tr>
			<tr>
				<th class="line">　メールアドレス</th>
				<td class="line">　<s:property value="email" escape="false" /></td>
			</tr>
		</s:iterator>
		<tr><td colspan="2"><hr></td></tr>
		</table>

		<div class="button">
		<input type="button" onclick="location.href='<s:url action="GoHomeAction" />'" value="ホームに戻る">　　　　
		<input type="button" onclick="location.href='<s:url action="PurchaseHistoryAction" />'" value="商品購入履歴に行く">
		</div>

		<br>
		<br>

	</div>
	<!--  mainの終わり -->


	<!-- footerの始まり -->
	<jsp:include page="WEB-INF/footer.jsp" />
	<!-- footerの終わり -->

</body>
</html>