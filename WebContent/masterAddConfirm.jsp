<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />
<title>商品追加確認画面</title>
</head>

<body>
<body>

<s:if test="#session.LoginUserDTO == null || #session.LoginUserDTO.mFlg != 1 || #session.MasterAddCompleteDTO == null" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>



	<!--  headerの始まり -->

 	  <jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

    	<h2>追加内容</h2>

    	<table>

    		<tbody>

    			<tr>

    				<th>商品ID</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.productId" /></td>

    			</tr>

    			<tr>

    				<th>商品名</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.productName" /></td>

    			</tr>

    			<tr>

    				<th>商品名かな</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.productNameKana" /></td>

    			</tr>

    			<tr>

    				<th>商品の説明文</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.productDescription" /></td>

    			</tr>

    			<tr>

    				<th>カテゴリーID</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.categoryId" /></td>

    			</tr>

    			<tr>

    				<th>在庫</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.productStock" /></td>

    			</tr>

    			<tr>

    				<th>価格</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.price" /></td>

    			</tr>

    			<tr>

    				<th>更新する画像</th>
    				<td><img src="<s:property value='#session.MasterAddCompleteDTO.productDTO.imageFilePath' />" width="200" height="auto" /></td>

    			</tr>

    			<tr>

    				<th>画像の名前</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.imageFileName" /></td>

    			</tr>

    			<tr>

    				<th>発売日</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.releaseDate" /></td>

    			</tr>

    				<tr>

    				<th>販売会社</th>
    				<td><s:property value="#session.MasterAddCompleteDTO.productDTO.releaseCompany" /></td>

    			</tr>



    		</tbody>


    	</table>

    	<s:form action="MasterAddCompleteAction" method="post" >
    		<input type="submit" value="商品を追加する" />
    	</s:form>

    	<form action="/vague/masterAdd.jsp" >
			<input type="submit" value="戻って修正する">
		</form>


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>