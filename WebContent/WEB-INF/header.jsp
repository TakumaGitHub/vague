<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!--  headerの始まり -->
    <header>

        <div class="container">

            <div id="header-left">

	            <%-- <s:if test="#session.LoginUserDTO == null">
	            - ようこそゲストさん -
	            </s:if>
	            <s:else>
	            - ようこそ<s:property value="#session.LoginUserDTO.familyName" />さん -
	            </s:else> --%>

	            <form id="ProductSearchAction" action="<s:url action='ProductSearchAction' />" method="post">


					<p><input type="text" name="retrievalValue" value="<s:property value='#session.retrievalValue' />" required="required" style="float : left;"/></p>


						<s:property value='inputErrorMsg' />

					<button type="submit" style="float : right;"><img src="LogoImages/retrievalLogo.png" style="width : 30px; height : auto;"/></button>


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



					</form>

            </div>

            <div id="header-center">

            	<a href="/vague/home.jsp"><img src="aaa" /></a>
            	<s:form action="ProductListAction" method="post">

				<input type="submit" value="商品一覧ページ" />

				</s:form>

            </div>

            <div id="header-right">

				<ul>
					<s:if test="#session.LoginUserDTO == null">

						<a href="/vague/userInterface.jsp" ><li>ログイン<img src="LogoImage/Login.png" /></li></a>

					</s:if>

					<s:elseif test="#session.LoginUserDTO.mFlg == 1 ">

						<a href="<s:url action='LogoutAction' />"><li>ログアウト<img src="LogoImage/LogOut.png" /></li></a>
						<a href="<s:url action='MasterAction' />"><li>管理画面<img src="LogoImage/administer.png" /></li></a>

					</s:elseif>

					<s:else>

						<a href="<s:url action='LogoutAction' />"><li>ログアウト<img src="LogoImage/LogOut.png" /></li></a>
						<a href="<s:url action='MyPageAction' />"><li>マイページ<img src="LogoImage/mypage.png" /></li></a>

					</s:else>

						<a href="<s:url action='CartAction' />"><li>カート<img src="LogoImage/mypage.png" /></li></a>

				</ul>

            </div>

        </div>

    </header>
    <!--  headerの終わり -->


    <!-- スクロールボタン -->
    <div id="scroll-button" ><img src="LogoImage/scrollTop.png" /></div>

