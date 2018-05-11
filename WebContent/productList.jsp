<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="WEB-INF/head.jsp" />

<link rel="stylesheet" href="./css/product.css">

<title>商品一覧</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
<script>
	$(function() {
		$(".imageHover .image").hover(function() {
			$(this).animate({
				width : "240px",
				height : "210px"
			});
		}, function() {
			$(this).animate({
				width : "200px",
				height : "170px"
			});
		});
	});
</script>
</head>
<body>

<!-- ヘッダーのインクルード -->
<jsp:include page="headerSearch.jsp"/>


<!--  一覧表示ボタン押下 -->

<s:iterator value="#session.ProductList">

<div class="itemListBox">
	<div class="imageHover">
		<!-- 商品画像（オンクリックで詳細にジャンプ） -->
		<a href="<s:url action='ProductDetailsAction' />?productId=<s:property value='productId'/>&&categoryId=<s:property value='categoryId'/>">
		<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>
		</a>
	</div>
	<div class="productInfo">
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
</div>
</s:iterator>

<div class="center" style="text-align: center;">
 <s:if test="#session.SearchListLength != null && #session.SearchListLength >= 1">

             <span>ページ数</span>

                     <s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">

						<a href="<s:url action='ProductListAction' />?pageNum=<s:property value='#st.index' />" ><s:property value='#st.count' /> </a>

                     </s:iterator>

 </s:if>

</div>


<!-- 検索結果 -->


<div class="center" style="text-align: center;">
       <s:iterator value="#session.SearchList">

        <s:if test="#session.SearchListLength != null && #session.SearchListLength >= 1">

               <span>ページ数</span>
                       <s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">
                               <a href="<s:url action='ProductSearchAction' />?ListNumber=<s:property value='#st.index' />&retrievalValue=<s:property value='#session.retrievalValue' />&category_id=<s:property value='#session.retrievalCategory_id' />&rule=<s:property value='#session.retrievalRule' />" ><s:property value='#st.count' /> </a>

                       </s:iterator>
       </s:if>

       <s:if test="status == 1" >
               <div>
					   <a href="<s:url action='ProductDetailsAction' />?productId=<s:property value='productId'/>&&categoryId=<s:property value='categoryId'/>">
                       <img src="<s:property value="imageFilePath"/>" width="200" height="auto" />
                       </a>
                  	    <p><s:property value="productName" /></p>
               </div>
       </s:if>
       </s:iterator>
</div>





</body>
</html>