<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!--  headerの始まり -->
    <header>

        <div class="container">

            <div id="header-left">

	            <s:if test="#session.LoginUserDTO == null">
	            <p>- ようこそゲストさん -</p>
	            </s:if>
	            <s:else>
	            <p>- ようこそ<s:property value="#session.LoginUserDTO.familyName" />さん -</p>
	            </s:else>

            </div>

            <div id="header-center">

            	<a href="/vague/home.jsp"><img src="aaa" /></a>

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

