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
<title>商品情報変更画面</title>
</head>

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




		<s:form action="MasterChangeConfirmAction" method="post" enctype="multipart/form-data">

			<p class="error-msg" style="margin-left : 100px;"><s:property value="errorMsg.NumberFormatException" /></p>
			<s:if test="productId != null">
				<div class="m-id">
	    		商品ID　<span class="caution-msg">※9桁以下の半角数字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productId" /></p>
				<input type="text" name="productId" value="<s:property value='productId' />" required="required"/>

				※現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。<br>
				<br>
				</div>
				<div class="m-name">
				商品名　<span class="caution-msg">※1～100文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productName" /></p>
				<input type="text" name="productName" value="<s:property value='productName' />"  required="required"/>
				<br>
				</div>
				<div class="m-name-kana">
				商品名かな　<span class="caution-msg">※1～100文字のひらがなで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productNameKana" /></p>
				<input type="text" name="productNameKana" value="<s:property value='productNameKana' />" required="required" />
				<br>
				</div>
				<div class="m-description">
				商品の説明　<span class="caution-msg">※1～255文字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productDescription" /></p>
				<textarea name="productDescription"  rows="4" cols="50"><s:property value="productDescription"/></textarea>
				<br>
				</div>
				<div class="m-category">
				カテゴリーID:
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
				<br>
				</div>
				<div class="m-stock">
				在庫　<span class="caution-msg">※9桁以下の半角数字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productStock" /></p>
				<input type="text" name="productStock" value="<s:property value='productStock' />" required="required" />
				<br>
				</div>
				<div class="m-price">
				<p>価格　<span class="caution-msg">※9桁以下の半角数字で入力してください</span></p>
				<s:property value="errorMsg.price" />
				<input type="text" name="price" value="<s:property value='price' />" required="required" />
				<br>
				</div>
				<div class="m-file">
				ファイルアップロード
				<p class="error-msg"><s:property value="errorMsg.imageFilePath" /></p>
				<input type="file" name="userImage" />
				<br>
				</div>
				<div class="m-reDate">
				発売日
				<p class="error-msg"><s:property value="errorMsg.releaseDate" /></p>

				<input type="text" name="year" pattern="^[1-2][0-9]{3}$" maxlength="4" value="<s:property value='year' />"/>年

					<select name="month">

						<s:iterator begin="1" end="12" step="1" status="st">
							<s:if test="month == #st.count">
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>月

					<select name="day">

						<s:iterator begin="1" end="31" step="1" status="st">
							<s:if test="day == #st.count">
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>日


				<br>
				</div>
				<div class="m-reCompany">
				販売会社　<span class="caution-msg">※1～50文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.releaseCompany" /></p>
				<input type="text" name="releaseCompany" value="<s:property value='releaseCompany' />"  required="required"/><br>

				</div>
		</s:if>



			<!-- セッションにMasterChangeCompleteDTOがあれば -->
	    	<s:elseif test="#session.MasterChangeCompleteDTO != null" >
				<div class="m-id">
				商品ID　<span class="caution-msg">※9桁以下の半角数字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productId" /></p>
				<input type="text" name="productId" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productId' />" required="required"/>

				現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。<br>
				<br>
				</div>
				<div class="m-name">
				商品名　<span class="caution-msg">※1～100文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productName" /></p>
				<input type="text" name="productName" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productName' />"  required="required"/>

				</div>
				<div class="m-name-kana">
				商品名かな　<span class="caution-msg">※1～100文字のひらがなで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productNameKana" /></p>
				<input type="text" name="productNameKana" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productNameKana' />" required="required" />

				</div>
				<div class="m-description">
				<p>商品の説明　<span class="caution-msg">※1～255文字で入力してください</span></p>
				<p class="error-msg"><s:property value="errorMsg.productDescription" /></p>
				<textarea name="productDescription" rows="2" cols="50" ><s:property value="#session.MasterChangeCompleteDTO.productDTO.productDescription"/></textarea>

				</div>
				<div class="m-category">
				カテゴリーID:
				<p class="error-msg"><s:property value="errorMsg.categoryId" /></p>
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorySearchDTOList">
						<s:if test="#session.MasterChangeCompleteDTO.productDTO.categoryId == categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>

				</div>
				<div class="m-stock">
				在庫　<span class="caution-msg">※9桁以下の半角数字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.productStock" /></p>
				<input type="text" name="productStock" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productStock' />" required="required" />

				</div>
				<div class="m-price">
				価格　<span class="caution-msg">※9桁以下の半角数字で入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.price" /></p>
				<input type="text" name="price" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.price' />" required="required" />

				</div>
				<div class="m-file">
				ファイルアップロード:
				<p class="error-msg"><s:property value="errorMsg.imageFilePath" /></p>
				<input type="file" name="userImage" />

				</div>
				<div class="m-reDate">
				発売日:
				<p class="error-msg"><s:property value="errorMsg.releaseDate" /></p>

				<input type="text" name="year" pattern="^[1-2][0-9]{3}$" maxlength="4" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.releaseDate.substring(0,4)' />"/>年

					<select name="month">

						<s:iterator begin="1" end="12" step="1" status="st">
							<s:if test='#session.MasterChangeCompleteDTO.productDTO.releaseDate.substring(4,6).replace("0", "") == #st.count || #session.MasterChangeCompleteDTO.productDTO.releaseDate.substring(4,6) == 10 && #st.count == 10 '>
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>月

					<select name="day">

						<s:iterator begin="1" end="31" step="1" status="st">
							<s:if test='(#session.MasterChangeCompleteDTO.productDTO.releaseDate.substring(6,8).replace("0", "") == #st.count && #st.count < 10) || (#session.MasterChangeCompleteDTO.productDTO.releaseDate.substring(6,8) == #st.count && #st.count >= 10) '>
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>日



				</div>
				<div class="m-reCompany">
				販売会社　<span class="caution-msg">※1～50文字の半角英数字、漢字、ひらがな、カタカナで入力してください</span>
				<p class="error-msg"><s:property value="errorMsg.releaseCompany" /></p>
				<input type="text" name="releaseCompany" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.releaseCompany' />"  required="required"/>

				</div>
	    	</s:elseif>


			<input type="submit" value="確認画面に行く" />

		</s:form>


    </div>
</div>
    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>