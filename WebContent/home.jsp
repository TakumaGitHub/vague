<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>

<head>

<jsp:include page="head.jsp" />

<title>Vague</title>
</head>

<body>



	<!--  headerの始まり -->

	<jsp:include page="header.jsp" />

    <!--  headerの終わり -->





	<!--  mainの始まり -->

    <div id="main">

		<div class="container">



			<s:if test="#session.LoginUserDTO == null" >

				<h2>ログイン認証</h2>

				<form action="/vague/userInterface.jsp" method="post">

					<input type="submit" value="ログインする" />

				</form>


			</s:if>
			<s:else>

				<h2>ログアウト</h2>
				<form action="LogoutAction" method="post">

					<input type="submit" value="ログアウトする" />

				</form>

				<h2>ログインユーザーのレビュー</h2>

				<form action="ReviewMyListAction" method="post">
					<input type="submit" value="レビューを見る" />
				</form>


				<h2>マイページに行く</h2>

				<s:form action="MyPageAction" method="post">

					<input type="submit" value="マイページ" />

				</s:form>

			</s:else>

			<s:if test="#session.LoginUserDTO !=null && #session.LoginUserDTO.mFlg == 1">

				<h2>管理者ページに行く</h2>

				<s:form action="MasterAction" method="post">

					<input type="submit" value="管理者ページ" />

				</s:form>

			</s:if>



			<h2>商品一覧ページに行く</h2>

			<s:form action="ProductListAction" method="post">

				<input type="submit" value="商品一覧ページ" />

			</s:form>

			<h2>カートページに行く</h2>

			<s:form action="CartAction" method="post">

				<input type="submit" value="カートページ" />

			</s:form>


			<h2>ProductSearchAction</h2>

			<form id="ProductSearchAction" action="<s:url action='ProductSearchAction' />" method="post">


			<p>検索キーワード<input type="text" name="retrievalValue" value="<s:property value='#session.retrievalValue' />" required="required"/></p>
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



		</div>

    </div>

    <!--  mainの終わり -->




	<!-- footerの始まり -->

	<jsp:include page="footer.jsp" />

	<!-- footerの終わり -->


</body>
</html>