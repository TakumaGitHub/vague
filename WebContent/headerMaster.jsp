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

						<input type="text" name="retrievalValue" value="<s:property value='#session.retrievalValue' />" required="required" style="width : 195px;"/>

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
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mypage.png" /></a></li>
            			<li><a href="<s:url action='ProductListAction' />">商品一覧  <img src="LogoImage/administer.png" /></a></li>

					</s:if>

					<s:elseif test="#session.LoginUserDTO.mFlg == 1 ">

						<li><a href="<s:url action='LogoutAction' />">ログアウト  <img src="LogoImage/LogOut.png" /></a></li>
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mypage.png" /></a></li>
            			<li><a href="<s:url action='MasterAction' />">商品一覧  <img src="LogoImage/administer.png" /></a></li>
						<li><a href="<s:url action='MasterAction' />">管理画面  <img src="LogoImage/administer.png" /></a></li>

					</s:elseif>

					<s:else>

						<li><a href="<s:url action='LogoutAction' />">ログアウト  <img src="LogoImage/LogOut.png" /></a></li>
						<li><a href="<s:url action='CartAction' />">カート  <img src="LogoImage/mypage.png" /></a></li>
            			<li><a href="<s:url action='MasterAction' />">商品一覧  <img src="LogoImage/administer.png" /></a></li>
						<li><a href="<s:url action='MyPageAction' />">マイページ  <img src="LogoImage/mypage.png" /></a></li>
						<li><a href="<s:url action='ReviewMyListAction' />">マイレビュー  <img src="LogoImage/mypage.png" /></a></li>

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

			<area shape="poly" coords="0,806,304,716,300,702,382,702,391,718,425,736,429,775,480,775,483,837,623,844,618,946,570,1025,0,1017" href="map1.html" alt="リンク1">
			<area shape="circle" coords="184,86,30" href="map2.html" alt="リンク2">
			<area shape="poly" coords="87,78,30,110,81,139,69,113" href="map3.html" alt="リンク3">

		</map>
