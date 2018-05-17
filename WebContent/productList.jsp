<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />

<link rel="stylesheet" href="./css/product.css">


<title>商品一覧</title>


</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->


<!--  一覧表示ボタン押下 -->

<div id="main">
	<div class="container">
	<div class="product-box-outer">
		<s:iterator value="#session.ProductList">

		<div class="product-box" >

			<a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>"></a>


		<!-- 商品画像 -->

		<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>



			<!-- 商品名 -->
			<div class="proName">
			<s:property value="productName" />
			<br>
			</div>
			<!-- 商品名かな -->
			<div class="proName2">
			<s:property value="productNameKana"/>
			<br>
			</div>
			<!-- 価格 -->
			<div class="proPrice">
			￥<s:property value="price"/>
			<br>
			</div>



	</div>

</s:iterator>

</div>

<div class="center" style="text-align: center;">
 <s:if test="#session.ProductListLength != null && #session.ProductListLength >= 1">

             <span>ページ</span>

                     <s:iterator begin="1" end="#session.ProductListLength" step="1" status="st">

						<a href="<s:url action='ProductListAction' ><s:param name="pageNum" value="#st.index" /></s:url>" ><s:property value='#st.count' /> </a>

                     </s:iterator>

 </s:if>

</div>


<!-- 検索結果 -->


<div class="center" style="text-align: center;">

		<p><s:property value="errorMsg" /></p>
		<p><s:property value="inputErrorMsg" /></p>

		<div class="product-box-outer">

			<s:iterator value="#session.SearchList">

		       <s:if test="status == 1" >
		               <div class="product-box">
		               		<div class="imageHover">
							   <a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>">
								<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br></a>
							</div>
							<div class="proName">
							    <p><s:property value="productName" /></p>
							</div>
							<div class="proName2">
							    <p><s:property value="productNameKana" /></p>
							</div>
							<div class="proPrice">
							    <p>￥<s:property value="price" />円</p>
						 </div>
		               </div>
		       </s:if>

      		 </s:iterator>


		</div>



       <s:if test="#session.SearchListLength != null && #session.SearchListLength >= 1">

               <span>ページ</span>
                       <s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">
                         <a href="<s:url action='ProductSearchAction' ><s:param name="ListNumber" value="#st.index" /><s:param name="retrievalValue" value="#session.retrievalValue" /><s:param name="category_id" value="#session.retrievalCategory_id" /><s:param name="rule" value="#session.retrievalRule" /></s:url>" ><s:property value='#st.count' /> </a>

                       </s:iterator>

       </s:if>


</div>
</div>
</div>

	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->



</body>
</html>