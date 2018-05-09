<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="imagetoolbar" content="no"/>
<title>商品一覧</title>
<style type="text/css">


</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="./js/jquery-1.8.2.min.js"></script>
</head>
<body>
<!-- ヘッダーのインクルード  -->
<%-- <jsp:include page="include_header.jsp" /> --%>

<!-- 一覧ボタン押下 -->
<s:iterator value="displayList">
<div class="itemList">
		<!-- 商品画像（オンクリックで詳細にジャンプ） -->
		<a href="<s:url action='ProductDetailsAction' />?productId=<s:property value='productId'/>">
		<img class="image" src="<s:property value='imageFilePath'/>"  alt="Photo" width="200" height="170"><br>
		</a>
		<!-- 商品名 -->
		<s:property value="productName" />
		<br>
		<!-- 商品名かな -->
		<s:property value="productNameKana"/>
		<br>
		<%-- <!-- 価格 -->
		<s:property value="price"/>
		<br> --%>
</div>
</s:iterator>
<!-- リストにデータが存在するとき  -->

	<s:if test="number > 8">
		<s:if test="listFlg == 1">
			<!--  1ページ目 -->
			<s:if test="pageNum==1">
				<span>&laquo;<s:text name="戻る" /></span>
			</s:if>
			<!-- ページネート:1ページ目以外 -->
		<s:else>
			<a
				href='<s:url action="ProductListAction">
				<s:param name="pageNum" value="pageNum-1" />
				<s:param name="listFlg" value="listFlg" />
				</s:url>'><span>&laquo;<s:text name="戻る" /></span></a>
		</s:else>
		<!-- 最終ページ -->
		<s:property value="pageNum"/>
			<s:if test="pageNum == maxPage">
				<s:text name="進む" />&raquo;
			</s:if>
		<!-- 最終ページ以外 -->
		<s:else>
			<a
				href='<s:url action="ProductListAction">
				<s:param name="pageNum" value="pageNum+1"/>
				<s:param name="listFlg" value="listFlg" />
				</s:url>'><span>&laquo;<s:text name="戻る" /></span></a>
		</s:else>
		</s:if>
	</s:if>

<!-- 検索結果 -->

       <s:if test="#session.SearchListLength != null">

               <span>ページ数</span>

                       <s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">

                               <a href="<s:url action='ProductSearchAction' />?ListNumber=<s:property value='#st.index' />&retrievalValue=<s:property value='#session.retrievalValue' />&category_id=<s:property value='#session.retrievalCategory_id' />&rule=<s:property value='#session.retrievalRule' />" ><s:property value='#st.count' /> </a>

                       </s:iterator>

       </s:if>


       <s:iterator value="#session.SearchList">

       <s:if test="status == 1" >

               <div>

                       <img src="<s:property value="imageFilePath"/>" width="200" height="auto" />
                       <p><s:property value="productName" /></p>

               </div>


       </s:if>


       </s:iterator>



</body>
</html>