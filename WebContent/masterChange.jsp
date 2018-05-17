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


			<s:if test="productId != null">
				<div class="m-id">
	    		<span>商品ID:
				<s:property value="errorMsg.productId" />
				<input type="text" name="productId" value="<s:property value='productId' />" required="required"/>

				※現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。<br>
				</span><br>
				</div>
				<div class="m-name">
				<span>商品名:
				<s:property value="errorMsg.productName" />
				<input type="text" name="productName" value="<s:property value='productName' />"  required="required"/>
				</span><br>
				</div>
				<div class="m-name-kana">
				<span>商品名かな:
				<s:property value="errorMsg.productNameKana" />
				<input type="text" name="productNameKana" value="<s:property value='productNameKana' />" required="required" />
				</span><br>
				</div>
				<div class="m-description">
				<span>商品の説明:
				<s:property value="errorMsg.productDescription" />
				<textarea name="productDescription"  rows="2" cols="50"><s:property value="productDescription"/></textarea>
				</span><br>
				</div>
				<div class="m-category">
				<span>カテゴリーID:
				<s:property value="errorMsg.categoryId" />
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
				</span><br>
				</div>
				<div class="m-stock">
				<span>在庫:
				<s:property value="errorMsg.productStock" />
				<input type="text" name="productStock" value="<s:property value='productStock' />" required="required" />
				</span><br>
				</div>
				<div class="m-price">
				<span>価格:
				<s:property value="errorMsg.price" />
				<input type="text" name="price" value="<s:property value='price' />" required="required" />
				</span><br>
				</div>
				<div class="m-file">
				<span>ファイルアップロード
				<s:property value="errorMsg.imageFilePath" />
				<input type="file" name="userImage" />
				</span><br>
				</div>
				<div class="m-reDate">
				<span>発売日
				<s:property value="errorMsg.releaseDate" />

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


				</span><br>
				</div>
				<div class="m-reCompany">
				<span>販売会社:
				<s:property value="errorMsg.releaseCompany" />
				<input type="text" name="releaseCompany" value="<s:property value='releaseCompany' />"  required="required"/><br>
				</span>
				</div>
		</s:if>



			<!-- セッションにMasterChangeCompleteDTOがあれば -->
	    	<s:elseif test="#session.MasterChangeCompleteDTO != null" >
				<div class="m-id">
				<span>商品ID
				<s:property value="errorMsg.productId" />
				<input type="text" name="productId" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productId' />" required="required"/>

				現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。<br>
				</span><br>
				</div>
				<div class="m-name">
				<span>商品名:
				<s:property value="errorMsg.productName" />
				<input type="text" name="productName" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productName' />"  required="required"/>
				</span>
				</div>
				<div class="m-name-kana">
				<span>商品名かな:
				<s:property value="errorMsg.productNameKana" />
				<input type="text" name="productNameKana" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productNameKana' />" required="required" />
				</span>
				</div>
				<div class="m-description">
				<p>商品の説明:</p>
				<s:property value="errorMsg.productDescription" />
				<textarea name="productDescription" rows="2" cols="50" ><s:property value="#session.MasterChangeCompleteDTO.productDTO.productDescription"/></textarea>

				</div>
				<div class="m-category">
				<span>カテゴリーID:
				<s:property value="errorMsg.categoryId" />
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorytSearchDTOList">
						<s:if test="#session.MasterChangeCompleteDTO.productDTO.categoryId == categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>
				</span>
				</div>
				<div class="m-stock">
				<span>在庫:
				<s:property value="errorMsg.productStock" />
				<input type="text" name="productStock" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.productStock' />" required="required" />
				</span>
				</div>
				<div class="m-price">
				<span>価格:
				<s:property value="errorMsg.price" />
				<input type="text" name="price" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.price' />" required="required" />
				</span>
				</div>
				<div class="m-file">
				<span>ファイルアップロード:
				<s:property value="errorMsg.imageFilePath" />
				<input type="file" name="userImage" />
				</span>
				</div>
				<div class="m-reDate">
				<span>発売日:
				<s:property value="errorMsg.releaseDate" />

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


				</span>
				</div>
				<div class="m-reCompany">
				<span>販売会社:
				<s:property value="errorMsg.releaseCompany" />
				<input type="text" name="releaseCompany" value="<s:property value='#session.MasterChangeCompleteDTO.productDTO.releaseCompany' />"  required="required"/>
				</span>
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