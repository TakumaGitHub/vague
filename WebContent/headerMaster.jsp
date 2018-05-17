<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!--  headerの始まり -->
    <header>

        <div class="inner-container">

            <div id="header-left">


	            <form id="MasterAction" action="<s:url action='MasterAction' ><s:param name="retrievalFlg" value="1" /></s:url>" method="post" >

					<div id="retrieval-form">

						<input type="text" name="retrievalValue" value="<s:property value='#session.retrievalValue' />" required="required"/>

						<button><img src="LogoImage/retrievalLogo.jpeg"/></button>


					</div>



					<p><s:property value='inputErrorMsg' /></p>


					<select name="category_id">

						<option value="0" selected="selected">全てのカテゴリー</option>

						<s:iterator value="#session.CategoryList">


							<s:if test="#session.retrievalCategory_id == categoryId" >
								<option value="<s:property value='categoryId' />" selected="selected"><s:property value='categoryId' />:<s:property value='categoryName' /></option>
							</s:if>
							<s:else>
								<option value="<s:property value='categoryId' />" ><s:property value='categoryId' />:<s:property value='categoryName' /></option>
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



					</form>

            </div>

            <div id="header-center">

            	<a href="/vague/home.jsp"><img src="LogoImage/headerLogo.png" /></a>

            	<s:if test="#session.LoginUserDTO == null">
	            <p>- ようこそゲストさん -</p>
	            </s:if>
	            <s:else>
	            <p>- ようこそ<s:property value="#session.LoginUserDTO.familyName" />さん -</p>
	            </s:else>

            </div>

            <div id="header-right">

				<div class="menu-box">

					<ul>
					<s:if test="#session.LoginUserDTO == null">

						<li><a href="/vague/userInterface.jsp" >ログイン  <img src="LogoImage/Login.png" /></a></li>
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mycart.png" /></a></li>
            			<li><a href="<s:url action='ProductListAction' />">商品一覧  <img src="LogoImage/productList.png" /></a></li>

					</s:if>

					<s:elseif test="#session.LoginUserDTO.mFlg == 1 ">

						<li><a href="<s:url action='LogoutAction' />">ログアウト  <img src="LogoImage/LogOut.png" /></a></li>
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mycart.png" /></a></li>
            			<li><a href="<s:url action='MasterAction' />">商品一覧  <img src="LogoImage/productList.png" /></a></li>
						<li><a href="<s:url action='MasterAction' />">管理画面  <img src="LogoImage/administer.png" /></a></li>

					</s:elseif>

					<s:else>

						<li><a href="<s:url action='LogoutAction' />">ログアウト  <img src="LogoImage/LogOut.png" /></a></li>
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mycart.png" /></a></li>
            			<li><a href="<s:url action='MasterAction' />">商品一覧  <img src="LogoImage/productList.png" /></a></li>
						<li><a href="<s:url action='MyPageAction' />">マイページ  <img src="LogoImage/mypage.png" /></a></li>
						<li><a href="<s:url action='ReviewMyListAction' />">マイレビュー  <img src="LogoImage/myreview.png" /></a></li>

					</s:else>



					</ul>

				</div>

            </div>

        </div>

    </header>
    <!--  headerの終わり -->


    <!-- スクロールボタン -->
    <div id="scroll-button" ><img src="LogoImage/scrollTop.png" /></div>



	<!-- 背景の画像 -->

		<img  id="background-image-box" src="BackgroundImage/homeBackground.jpg" usemap="#mapping" />

		<map name="mapping">

			<area class="background-image-area"  data-src="BackgroundImage/homeBackgroundSofa.jpg" shape="poly" coords="0,806,304,716,300,702,382,702,391,718,425,736,429,775,480,775,483,837,623,844,618,946,570,1025,0,1017" href="<s:url action='ProductSearchAction' ></s:url>?category_id=2&&retrievalValue=ソファ" alt="リンク1">
			<area class="background-image-area"  data-src="BackgroundImage/homeBackgroundLighting.jpg" shape="poly" coords="377,404,284,528,382,557,382,702,393,702,393,557,513,529" href="<s:url action='ProductSearchAction' ></s:url>?category_id=3&&retrievalValue=ライト" alt="リンク2">
			<area class="background-image-area"  data-src="BackgroundImage/homeBackgroundChair.jpg" shape="poly" coords="407,720,425,736,429,775,480,775,482,827,505,831,566,806,569,707,499,702,472,629,404,638" href="<s:url action='ProductSearchAction' ></s:url>?category_id=1&&retrievalValue=チェア" alt="リンク3">
			<area class="background-image-area"  data-src="BackgroundImage/homeBackgroundTable.jpg" shape="poly" coords="999,883,999,789,1083,787,1448,819,1436,934,1304,902,1295,814,1098,814,1100,905,996,895" href="<s:url action='ProductSearchAction' ></s:url>?category_id=4&&retrievalValue=テーブル " alt="リンク4">

		</map>
