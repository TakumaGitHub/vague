<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新規ユーザー情報登録ページ</title>
</head>
<body>
<form action="UserCreate">
<p>氏名を漢字で入力してください。<br>
<s:property value="<#session.InputChecked.familyName>"/><br>
名字：<input type="text" name="familyName"> <br>
<s:property value="<#session.InputChecked.firstName>"/><br>
名前：<input type="text" name="firstName">
</p>
<p>
氏名をひらがなで入力して下さい。<br>
<s:property value="<#session.InputChecked.familyNameKana>"/><br>
みょうじ：<input type="text" name="familyName"><br>
<s:property value="<#session.InputChecked.firstNameKana>"/>
 なまえ：<input type="text" name="firstName">
</p>
<p>
性別を選択して下さい。<br>
<s:property value="<#session.InputChecked.sex>"/><br>
<input type="radio" name="sex" value="0" checked>男性
<input type="radio" name="sex" value="1">女性
</p>
<p>
メールアドレスを入力してください。（14～32文字）<br>
<br>
<input type="text" size=35 name="email">
</p>

<p>
以後ログイン時に使用するログインIDを<b>半角英数字1～8文字</b>で任意に入力してください。<br>
<s:property value="<#session.InputChecked.userID>"/><br>
<input type="text" name="loginiD">
</p>
<p>
パスワードを<b>半角英数字1～16文字</b>で設定してください。<br>
<s:property value="<#session.InputChecked.password>"/><br>
<input type="text" name="password">
</p>

<%--
<p>
パスワードを忘れてしまった時に本人確認のため使う秘密の質問を以下のどちらかから選択してください。<br>
<input type="radio" name="question" value="0" checked>嫌いな食べ物
<input type="radio" name="question"value="1">好きな映画
</p>
<p>
上で選択した秘密の質問に対する答えを入力してください。
<input type="text" name="answer">
</p>
--%>

<input type="submit" value="上記の内容でユーザー登録"/>
</form>

</body>
</html>