<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<link rel="stylesheet" href="./css/master.css">
<title>商品情報変更確認画面</title>
</head>

<body>

<s:if test="#session.LoginUserDTO == null || #session.LoginUserDTO.mFlg != 1 || #session.MasterChangeCompleteDTO == null" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>

	<!--  headerの始まり -->

  <jsp:include page="headerMaster.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">
		<div class="container">

    	<h2>変更内容</h2>
		<div class="m-confirm-box">
    	<table>

    		<tbody>

    			<tr>

    				<th>商品ID</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.productId" /></td>

    			</tr>

    			<tr>

    				<th>商品名</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.productName" /></td>

    			</tr>

    			<tr>

    				<th>商品名かな</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.productNameKana" /></td>

    			</tr>

    			<tr>

    				<th>商品の説明文</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.productDescription" /></td>

    			</tr>

    			<tr>

    				<th>カテゴリーID</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.categoryId" /></td>

    			</tr>

    			<tr>

    				<th>在庫</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.productStock" /></td>

    			</tr>

    			<tr>

    				<th>価格</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.price" /></td>

    			</tr>

    			<tr>

    				<th>更新する画像</th>
    				<td><img src="<s:property value='#session.MasterChangeCompleteDTO.productDTO.imageFilePath' />" width="200" height="auto" /></td>

    			</tr>

    			<tr>

    				<th>画像の名前</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.imageFileName" /></td>

    			</tr>

    			<tr>

    				<th>発売日</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.releaseDate" /></td>

    			</tr>

    				<tr>

    				<th>販売会社</th>
    				<td><s:property value="#session.MasterChangeCompleteDTO.productDTO.releaseCompany" /></td>

    			</tr>



    		</tbody>


    	</table>
		</div>
    	<s:form action="MasterChangeCompleteAction" method="post" >
    		<input type="submit" value="商品情報を変更する" />
    	</s:form>
		<br>
    	<form action="/vague/masterChange.jsp" method="post" >
    		<input type="submit" value="戻って修正する" />
    	</form>


    </div>
</div>
    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>