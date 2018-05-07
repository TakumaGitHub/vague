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

		<s:form action="MasterChangeConfirmAction" method="post" enctype="multipart/form-data" >

			<p>商品ID</p>
			<input type="text" name="productId" value="<s:property value='productId' />" required="required"/>

			<p>商品名</p>
			<input type="text" name="productName" value="<s:property value='productName' />"  required="required"/>

			<p>商品名かな</p>
			<input type="text" name="productNameKana" value="<s:property value='productNameKana' />" required="required" />

			<p>商品の説明</p>
			<textarea name="productDescription" ><s:property value="productDescription"/></textarea>

			<p>カテゴリーID</p>
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
			<input type="text" name="productStock" value="<s:property value='productStock' />" required="required" />

			<p>価格</p>
			<input type="text" name="price" value="<s:property value='price' />" required="required" />

			<p>ファイルアップロード</p>
			<input type="file" name="userImage" required="required"/>

			<p>発売日</p>

			<p><input type="text" pattern="" maxlength="4" value="<s:property value='year' />"/>年

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
			<input type="text" name="releaseCompany" value="<s:property value='releaseCompany' />"  required="required"/>

		</s:form>


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<footer>
	</footer>

	<!-- footerの終わり -->


</body>
</html>