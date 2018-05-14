<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="WEB-INF/head.jsp" />

<title>管理者画面</title>
</head>

<style type="text/css">

	.left {

	  float :left;

	}

	.right {

	  float :right;

	}


</style>
<body>

<s:if test="#session.LoginUserDTO == null || #session.LoginUserDTO.mFlg != 1" >
<%

response.sendRedirect("/vague/home.jsp");

%>
</s:if>


	<!--  headerの始まり -->

  	<jsp:include page="WEB-INF/header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

			<div id="left">


			<h2>MasterAction</h2>

			<form id="MasterAction" action="<s:url action='MasterAction' />" method="post">


				<p>検索キーワード<input type="text" name="retrievalValue" value="<s:property value='#session.retrievalValue' />"/></p>
				<s:if test="inputErrorMsg != ''">

					<s:property value='inputErrorMsg' />

				</s:if>



				<p><s:property value="errorMsg" /></p>
				<p>検索カテゴリー</p>

				<select name="category_id">

					<s:iterator value="{'全てのカテゴリー','椅子','ソファ','照明','テーブル'}" status="st">

						<s:if test="#session.retrievalCategory_id == #st.index" >

							<option value="<s:property value='#st.index' />" selected="selected"><s:property /></option>

						</s:if>
						<s:else>

							<option value="<s:property value='#st.index' />" ><s:property /></option>

						</s:else>



					</s:iterator>

				</select>

				<select name="rule">

					<s:iterator value="{'選択してください','価格の高い順','価格の安い順','在庫の多い順','在庫の少ない順'}" status="st">

						<s:if test="#session.retrievalRule == #st.index" >

							<option value="<s:property value='#st.index' />" selected="selected"><s:property /></option>

						</s:if>
						<s:else>

							<option value="<s:property value='#st.index' />" ><s:property /></option>

						</s:else>



					</s:iterator>

				</select>

				<input type="submit" value="検索する"/>

			</form>

			<form action="<s:url action='MasterAddAction' />" method="post">
				<input type="submit" value="商品を追加する" />
			</form>




		</div>


		<!-- ======= 商品の検索結果を表示する ======= -->

		<div class="right">

			<s:form action="MasterAction" method="post" >
				<button name="deleteFlg" value="2" >商品を全削除</button>
			</s:form>

			<s:form id="checkDelete" action="MasterAction" method="post" >
				<button name="deleteFlg" value="1" >チェックした商品を削除</button>
			</s:form>

			<h3>商品の検索結果</h3>
			<s:if test="#session.SearchListLength != null">

				<span>ページ数</span>

					<s:iterator begin="1" end="#session.SearchListLength" step="1" status="st">


						<a href="<s:url action='MasterAction' />?ListNumber=<s:property value='#st.index' />&retrievalValue=<s:property value='#session.retrievalValue' />&category_id=<s:property value='#session.retrievalCategory_id' />&rule=<s:property value='#session.retrievalRule' />" ><s:property value='#st.count' /> </a>

					</s:iterator>

			</s:if>


			<s:iterator value="#session.SearchList" status="row">

				<!-- statusが１（有効）であれば -->
				<s:if test="status == 1" >

					<div>

						<input type="checkbox" form="checkDelete" name="product_id" value="<s:property value='productId' />"/>

						<img src="<s:property value="imageFilePath"/>" width="200" height="auto" />
						<p><s:property value="productName" /></p>

						<form action="MasterChangeAction" method="post" >
							<button name="productId" value="<s:property value='productId' />">商品情報を変更する</button>
						</form>

					</div>

				</s:if>



			</s:iterator>

		</div>


    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="WEB-INF/footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>