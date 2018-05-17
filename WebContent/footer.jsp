<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--  footerの始まり -->
    <footer>

        <div class="container">
			<jsp:useBean id="date" class="java.util.Date"/>

			<div id="footer-logo-wrraper">

				<s:iterator value="#session.CategoryList">

        		<div class="footer-logo">

        			<p><a href="<s:url action='ProductSearchAction' ><s:param name='retrievalValue' value='categoryDescription' /><s:param name='category_id' value='categoryId' /></s:url>" ><img src="LogoImage/footer<s:property value='categoryName' />.png" />
        			<span><s:property value="categoryName" /></span></a></p>

        		</div>

        		</s:iterator>

			</div>




        	<p>Copyright © 2010-<fmt:formatDate value="${date}" pattern="yyyy" /> Vague All Rights Reserved.</p>

        </div>

    </footer>
<!--  footerの終わり -->