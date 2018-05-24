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
<title>管理者画面</title>
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


		<div class="bottons">
			<form action="<s:url action='MasterAddAction' />" method="post">
				<input type="submit" value="商品を追加する" /><br>
			</form>
		</div>







		<!-- ======= 商品の検索結果を表示する ======= -->

		<s:if test="#session.SearchList == null || #session.SearchList.isEmpty()">


			<div class="pages">
			<h3>商品の検索結果がありません</h3>
			</div>

		</s:if>

		<s:else>

				<div class="bottons">
				<s:if test="#session.SearchList != null && !#session.SearchList.isEmpty()">

					<s:form action="MasterAction" method="post" >
					<button name="deleteFlg" value="2" >商品を全削除</button>
					</s:form>

				</s:if>
			</div>

				<div class="pages">
				<h3>商品の検索結果</h3>
				</div>

				<div class="master-list-outer">
				<s:iterator value="#session.SearchList" status="row">

				<s:if test="status == 1" >
				<div class="master-list">
					<!-- statusが１（有効）であれば -->




							<input type="checkbox" form="checkDelete" name="product_id" value="<s:property value='productId' />" />


							<img src="<s:property value="imageFilePath"/>" width="200" height="170" />

							<p><s:property value="productName" /></p>
							<p><s:property value="productNameKana" /></p>
							<p>￥<span class="comma-price"><s:property value="price" /></span></p>

							<form action="MasterChangeAction" method="post" >
								<button name="productId" value="<s:property value='productId' />">商品情報を変更する</button>
							</form>






				</div>

				</s:if>
				</s:iterator>
				</div>
			<div class="pages">
			<s:if test="#session.SearchListLength != null">

					<span>ページ数</span>

						<s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">


							<a href="<s:url action='MasterAction' />?ListNumber=<s:property value='#st.index' />&retrievalValue=<s:property value='#session.retrievalValue' />&category_id=<s:property value='#session.retrievalCategory_id' />&rule=<s:property value='#session.retrievalRule' />" ><s:property value='#st.count' /> </a>

						</s:iterator>
			</s:if>
			</div>
			<div class="bottons">
				<s:if test="#session.SearchList != null && !#session.SearchList.isEmpty()">

					<s:form id="checkDelete" action="MasterAction" method="post" >
						<button name="deleteFlg" value="1" >チェックした商品を削除</button>
					</s:form>


				</s:if>
			</div>



		</s:else>




    </div>
</div>



    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>