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
<title>商品追加画面</title>
</head>

<body>
<body>

<s:if test="#session.LoginUserDTO == null || #session.LoginUserDTO.mFlg != 1" >
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
    	<h2>商品新規追加</h2>
			<div class="add-box">
		<s:form action="MasterAddConfirmAction" method="post" enctype="multipart/form-data">

			<p class="error-msg"><s:property value="errorMsg.NumberFormatException" /></p>
			<!-- セッションにMasterAddCompleteDTOがあれば -->
	    	<s:if test="#session.MasterAddCompleteDTO != null" >

				<p>商品ID　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productId" /></p>
				<input type="text" name="productId" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productId' />" required="required"/>※現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。


				<p>商品名　<span class="caution-msg">※1～100文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productName" /></p>
				<input type="text" name="productName" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productName' />"  required="required"/>


				<p>商品名かな　<span class="caution-msg">※1～100文字のひらがなで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productNameKana" /></p>
				<input type="text" name="productNameKana" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productNameKana' />" required="required" />



				<p>商品の説明　<span class="caution-msg">※1～255文字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productDescription" /></p>
				<textarea name="productDescription" rows="4" cols="50" ><s:property value="#session.MasterAddCompleteDTO.productDTO.productDescription"/></textarea>

				<p>カテゴリーID　</p>
				<p class="error-msg"><s:property value="errorMsg.categoryId" /></p>
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorySearchDTOList">
						<s:if test="#session.MasterAddCompleteDTO.productDTO.categoryId == categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>


				<p>在庫　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productStock" /></p>
				<input type="text" name="productStock" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productStock' />" required="required" />


				<p>価格　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.price" /></p>
				<input type="text" name="price" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.price' />" required="required" />


				<p>ファイルアップロード</p>
				<p class="error-msg"><s:property value="errorMsg.imageFilePath" /></p>
				<input type="file" name="userImage" required="required"/>


				<p>発売日</p>
				<p class="error-msg"><s:property value="errorMsg.releaseDate" /></p>

				<p><input name="releaseDate" type="date" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.releaseDate.replaceAll("/","-")' />" /></p>


				<p>販売会社　<span class="caution-msg">※1～50文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.releaseCompany" /></p>
				<input type="text" name="releaseCompany" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.releaseCompany' />"  required="required"/>

	    	</s:if>

			<s:else>

	    		<p>商品ID　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>

				<p class="error-msg"><s:property value="errorMsg.productId" /></p>
				<input type="text" name="productId" value="<s:property value='productId' />" required="required"/>※現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。

				<p>商品名　<span class="caution-msg">※1～100文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productName" /></p>
				<input type="text" name="productName" value="<s:property value='productName' />"  required="required"/>

				<p>商品名かな　<span class="caution-msg">※1～100文字のひらがなで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productNameKana" /></p>
				<input type="text" name="productNameKana" value="<s:property value='productNameKana' />" required="required" />

				<p>商品の説明　<span class="caution-msg">※1～255文字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productDescription" /></p>
				<textarea name="productDescription" rows="4" cols="50" ><s:property value="productDescription"/></textarea>

				<p>カテゴリーID　</p>
				<p class="error-msg"><s:property value="errorMsg.categoryId" /></p>
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorySearchDTOList">
						<s:if test="#session.masterChangeCategoryId == 	categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>

				<p>在庫　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productStock" /></p>
				<input type="text" name="productStock" value="<s:property value='productStock' />" required="required" />

				<p>価格　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.price" /></p>
				<input type="text" name="price" value="<s:property value='price' />" required="required" />

				<p>ファイルアップロード</p>
				<p class="error-msg"><s:property value="errorMsg.imageFilePath"/></p>
				<input type="file" name="userImage" required="required"/>

				<p>発売日</p>
				<p class="error-msg"><s:property value="errorMsg.releaseDate" /></p>

				<p><input name="releaseDate" type="date" value="<s:property value='releaseDateValueStack' />" /></p>


				<p>販売会社　<span class="caution-msg">※1～50文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.releaseCompany" /></p>
				<input type="text" name="releaseCompany" value="<s:property value='releaseCompany' />"  required="required"/>


	    	</s:else>




			<input type="submit" value="確認画面に行く" />

		</s:form>
			</div>
		</div>
    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>