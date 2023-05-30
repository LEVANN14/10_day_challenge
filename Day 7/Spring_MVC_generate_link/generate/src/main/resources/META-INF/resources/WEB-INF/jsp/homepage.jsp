<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet"/>
<title>Welcome to your products</title>
</head>
<body>


<div class="container">
<div>
Please enter the Link you want to shorten
</div>
<div><form class="form-group" method="POST">
	<input type="text" name="ip_link" placeholder="search"/>
	<input type="submit" />
</form></div>
	${op_lnk}
</div>



	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>