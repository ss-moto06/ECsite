<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<title>Home画面</title>

<style type="text/css">
/*========TAG LAYOUT========*/
	body{
		margin:0:
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
	}

	table{
		text-align:center;
		margin:0 auto;
	}
	/*========ID LAYOUT========*/
	#top{
		width:780px;
		margin:30px auto;
		border:1px solid #333;
	}

	#header{
		width:100%;
		height:80px;
		background-color:black;
	}

	#main{
		width:100%;
		height:500px;
		text-align:center;
	}

	#footer{
		width:100%
		height:80px;
		background-color:black;
		clear:both;
	}

	#item{
		display:inline-block;
		width:15%;
		margin-left:300px;
		border:1px solid #555555;
		padding: 15px;
	}

	#user{
		display:inline-block;
		width:15%;
		margin-right:300px;
		border:1px solid #555555;
		padding: 15px;
	}
</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<P>管理者TOP画面</P>
		</div>

	<div id="item">
		<span id="title">商品</span>
						<s:form action="ItemListAction">
							<s:submit value="商品一覧"/>
						</s:form>
						<s:form action="ItemCreateAction">
							<s:submit value="商品追加"/>
						</s:form>
					</div>

	<div id="user">
			<span id="title">ユーザー</span>
					<s:form action="UserListAction">
						<s:submit value="ユーザー一覧"/>
					</s:form>
					<s:form action="UserCreateAction">
						<s:submit value="ユーザー追加"/>
					</s:form>

</div>
<div>
					<span>Homeに戻る場合は
					<a href='<s:url action="GoHomeAction"/>'>こちら</a>
				</span>
				</div>
</div>
<div id="footer">
	<div id="pr">
	</div>
</div>
</body>
</html>