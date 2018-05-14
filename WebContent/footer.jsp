<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--  footerの始まり -->
    <footer>

        <div class="container">
			<jsp:useBean id="date" class="java.util.Date"/>
        	<h2><a href="/vague/home.jsp">Vague</a></h2>
        	<p>Copyright © 2010-<fmt:formatDate value="${date}" pattern="yyyy" /> Vague All Rights Reserved.</p>

        </div>

    </footer>
<!--  footerの終わり -->