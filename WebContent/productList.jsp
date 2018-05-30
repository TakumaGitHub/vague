<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="head.jsp" />

<link rel="stylesheet" href="./css/product.css">
<script src="js/productList.js" type="text/javascript" ></script>

<title>商品一覧</title>


</head>
<body>

	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->



<!--  一覧表示ボタン押下 -->

<div id="main">
	<div class="container">



		<div class="tittle">

				<s:if test="#session.ProductListLength  >= 1">
					<h2 class="title">商品一覧</h2>
					<div class="pages">
					<span><s:property value="#session.ProductListLength" />ページ中  <s:property value="%{pageNum +1}" />ページ目</span>
					</div>
				</s:if>
				<s:if test="#session.SearchListLength >= 1">
					<h2 class="title">商品の検索結果</h2>
					<div class="pages">
					<span><s:property value="#session.SearchListLength" />ページ中 <s:property value="%{ListNumber +1}" />ページ目</span>
					</div>
				</s:if>
			</div>



	<div class="product-box-outer">

		<s:iterator value="#session.ProductList">

		<div class="product-box" >
		<s:if test="#session.ProductList.isEmpty()">
				<div class="center" style="text-align : center;"><p>商品が登録されていません。</p></div>
		</s:if>

		<s:else>
			<a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>"></a>


		<!-- 商品画像 -->

		<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="250" height="220"><br>



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
			￥<span class="comma-price"><s:property value="price"/></span>
			<br>
			</div>

	<div class="product-box-top" ></div>
	<div class="product-box-left" ></div>
	<div class="product-box-right" ></div>
	<div class="product-box-bottom" ></div>
	</s:else>
	</div>

</s:iterator>

</div>

<!-- ページネーション -->
<div class="center" style="text-align: center;">
 <s:if test="#session.ProductListLength != null && #session.ProductListLength >= 1">

             <span>ページ</span><br>



				<div class="page-number">
                     <s:iterator begin="1" end="#session.ProductListLength" step="1" status="st">

						<a href="<s:url action='ProductListAction' ><s:param name="pageNum" value="#st.index" /></s:url>" ><s:property value='#st.count' /></a>

                     </s:iterator>
					 <br>

					<s:if test="pageNum != 0">

                     	<a href="<s:url action='ProductListAction' ><s:param name="pageNum" value="%{pageNum-1}" /></s:url>" >
                     <span>&laquo;<s:text name="戻る"/></span></a>

                     </s:if>


             		 <s:if test="pageNum != #session.ProductListLength -1">

						<a href="<s:url action='ProductListAction' ><s:param name="pageNum" value="%{pageNum+1}" /></s:url>" >
	                     <span><s:text name="進む"/>&raquo;</span></a>

					</s:if>

				</div>

 </s:if>

</div>


<!-- 検索結果 -->



		<div class="error-msg">
		<p> <s:property value="errorMsg" /></p>
		<p> <s:property value="inputErrorMsg" /> </p>
		</div>

		<div class="product-box-outer">

			<s:iterator value="#session.SearchList">
				<s:if test="#session.SearchList.isEmpty()">
					<div class="center" style="text-align : center;"><p>商品が登録されていません。</p></div>
				</s:if>
		       <s:if test="status == 1" >
		               <div class="product-box">
		                 <a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /><s:param name="categoryId" value="categoryId" /></s:url>"></a>


								<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="250" height="220"><br>

							<div class="proName">
							    <s:property value="productName" />
							</div>
							<div class="proName2">
							    <s:property value="productNameKana" />
							</div>
							<div class="proPrice">
							    ￥<span class="comma-price"><s:property value="price" /></span>
						 </div>
	 <div class="product-box-top" ></div>
	<div class="product-box-left" ></div>
	<div class="product-box-right" ></div>
	<div class="product-box-bottom" ></div>

		               </div>
		       </s:if>

      		 </s:iterator>


		</div>

<!-- ページネーション（検索時） -->
<div class="center" style="text-align: center;">
       <s:if test="#session.SearchListLength != null && #session.SearchListLength >= 1">

               <span>ページ</span>
                       <s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">
                         <a href="<s:url action='ProductSearchAction' ><s:param name="ListNumber" value="#st.index" /><s:param name="retrievalValue" value="#session.retrievalValue" /><s:param name="category_id" value="#session.retrievalCategory_id" /><s:param name="rule" value="#session.retrievalRule" /></s:url>" ><s:property value='#st.count' /> </a>

                       </s:iterator>


                       <div class="page-number">
					 	<br>
					<s:if test="ListNumber != 0">

                     	<a href="<s:url action='ProductSearchAction' ><s:param name="ListNumber" value="ListNumber - 1 " /><s:param name="retrievalValue" value="#session.retrievalValue" /><s:param name="category_id" value="#session.retrievalCategory_id" /><s:param name="rule" value="#session.retrievalRule" /></s:url>" >
                     	<span>&laquo;<s:text name="戻る"/></span></a>

                     </s:if>
             		 <s:if test="ListNumber != #session.SearchListLength -1">

						<a href="<s:url action='ProductSearchAction' ><s:param name="ListNumber" value="ListNumber + 1" /><s:param name="retrievalValue" value="#session.retrievalValue" /><s:param name="category_id" value="#session.retrievalCategory_id" /><s:param name="rule" value="#session.retrievalRule" /></s:url>" >
	                     <span><s:text name="進む"/>&raquo;</span></a>

					</s:if>


					</div>

       </s:if>


</div>

</div>
</div>

	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->



</body>
</html>