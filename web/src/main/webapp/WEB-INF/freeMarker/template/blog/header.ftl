<#assign config_v="20141009044">
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="shishuo_seo_description">
<meta name="author" content="师说CMS">
<link rel="icon" href="/static/images/favicon.ico">

<title>shishuo_seo_title</title>

<!-- Bootstrap core CSS -->
<link href="/static/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/static/css/blog.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="/static/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="/static/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="/static/js/html5shiv.min.js"></script>
      <script src="/static/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<div class="blog-masthead">
		<div class="container">
		
			<nav class="blog-nav">
			<@shishuo_folder_list_tag folderId= 0>
			<a class="blog-nav-item <#if 0==g_folderId>active</#if>" href="/index.htm">首页</a>
	                <#list tag_folder_list as tag_folder>
	                	<a class="blog-nav-item <#if tag_folder.folderId==g_folderId>active</#if>" href="<@shishuo_folder_url_tag folderId=tag_folder.folderId/>">tag_folder.name</a>
			</#list>
           		</@shishuo_folder_list_tag>
			</nav>
		
		</div>
	</div>
	<div class="container">

		<div class="blog-header">
			<h1 class="blog-title">shishuo_seo_title</h1>
			<p class="lead blog-description">shishuo_seo_description</p>
		</div>
