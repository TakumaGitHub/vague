<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />
<title>Vague</title>
</head>

<body>



	<!--  headerの始まり -->

   <header>

   </header>

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<s:form action="MasterAddConfirmAction" method="post" enctype="multipart/form-data">

			<!-- セッションにMasterAddCompleteDTOがあれば -->
	    	<s:if test="#session.MasterAddCompleteDTO != null" >

				<p>商品ID</p>
				<p>現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。</p>
				<s:property value="errorMsg.productId" />
				<input type="text" name="productId" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productId' />" required="required"/>

				<p>商品名</p>
				<s:property value="errorMsg.productName" />
				<input type="text" name="productName" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productName' />"  required="required"/>

				<p>商品名かな</p>
				<s:property value="errorMsg.productNameKana" />
				<input type="text" name="productNameKana" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productNameKana' />" required="required" />

				<p>商品の説明</p>
				<s:property value="errorMsg.productDescription" />
				<textarea name="productDescription" ><s:property value="#session.MasterAddCompleteDTO.productDTO.productDescription"/></textarea>

				<p>カテゴリーID</p>
				<s:property value="errorMsg.categoryId" />
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorytSearchDTOList">
						<s:if test="#session.MasterAddCompleteDTO.productDTO.categoryId == categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>

				<p>在庫</p>
				<s:property value="errorMsg.productStock" />
				<input type="text" name="productStock" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.productStock' />" required="required" />

				<p>価格</p>
				<s:property value="errorMsg.price" />
				<input type="text" name="price" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.price' />" required="required" />

				<p>ファイルアップロード</p>
				<s:property value="errorMsg.imageFilePath" />
				<s:file name="userImage" label="画像" required="required"/>

				<p>発売日</p>
				<s:property value="errorMsg.releaseDate" />

				<p><input type="text" name="year" pattern="^[1-2][0-9]{3}$" maxlength="4" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.releaseDate.substring(0,4)' />"/>年

					<select name="month">

						<s:iterator begin="1" end="12" step="1" status="st">
							<s:if test='#session.MasterAddCompleteDTO.productDTO.releaseDate.substring(4,6).replace("0", "") == #st.count || #session.MasterAddCompleteDTO.productDTO.releaseDate.substring(4,6) == 10 && #st.count == 10 '>
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>月

					<select name="day">

						<s:iterator begin="1" end="31" step="1" status="st">
							<s:if test='(#session.MasterAddCompleteDTO.productDTO.releaseDate.substring(6,8).replace("0", "") == #st.count && #st.count < 10) || (#session.MasterAddCompleteDTO.productDTO.releaseDate.substring(6,8) == #st.count && #st.count >= 10) '>
								<option value="<s:property value='#st.count' />" selected="selected"><s:property value='#st.count' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='#st.count' />"><s:property value='#st.count' /></option>
							</s:else>
						</s:iterator>

					</select>日

				</p>


				<p>販売会社</p>
				<s:property value="errorMsg.releaseCompany" />
				<input type="text" name="releaseCompany" value="<s:property value='#session.MasterAddCompleteDTO.productDTO.releaseCompany' />"  required="required"/>

	    	</s:if>

			<s:else>

	    		<p>商品ID</p>
				<p>現在最も大きい商品IDは<s:property value="#session.maxProductId" />です。</p>
				<s:property value="errorMsg.productId" />
				<input type="text" name="productId" value="<s:property value='productId' />" required="required"/>

				<p>商品名</p>
				<s:property value="errorMsg.productName" />
				<input type="text" name="productName" value="<s:property value='productName' />"  required="required"/>

				<p>商品名かな</p>
				<s:property value="errorMsg.productNameKana" />
				<input type="text" name="productNameKana" value="<s:property value='productNameKana' />" required="required" />

				<p>商品の説明</p>
				<s:property value="errorMsg.productDescription" />
				<textarea name="productDescription" ><s:property value="productDescription"/></textarea>

				<p>カテゴリーID</p>
				<s:property value="errorMsg.categoryId" />
				<select name="categoryId" required="required">

					<s:iterator value="#session.CategorytSearchDTOList">
						<s:if test="#session.masterChangeCategoryId == 	categoryId" >
							<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:if>
						<s:else>
							<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
						</s:else>
					</s:iterator>

				</select>

				<p>在庫</p>
				<s:property value="errorMsg.productStock" />
				<input type="text" name="productStock" value="<s:property value='productStock' />" required="required" />

				<p>価格</p>
				<s:property value="errorMsg.price" />
				<input type="text" name="price" value="<s:property value='price' />" required="required" />

				<p>ファイルアップロード</p>
				<s:property value="errorMsg.imageFilePath"/>
				<s:file name="userImage" label="画像" required="required"/>

				<p>発売日</p>
				<s:property value="errorMsg.releaseDate" />

				<p><input type="text" name="year" pattern="^[1-2][0-9]{3}$" maxlength="4" value="<s:property value='year' />"/>年

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

				</p>


				<p>販売会社</p>
				<s:property value="errorMsg.releaseCompany" />
				<input type="text" name="releaseCompany" value="<s:property value='releaseCompany' />"  required="required"/>


	    	</s:else>




			<input type="submit" value="確認画面に行く" />

		</s:form>



    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>