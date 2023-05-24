<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet"/>
<title>Welcome to your products</title>
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light md- p-1">

<div class="nav nav-pills">
<ul class="nav justify-content-center">
<li class="nav-item"><a class="nav-link " href="/">HOME</a></li>
<li class="nav-item"><a class="nav-link active" href="/addProduct">ADD PRODUCTS</a></li>
<li class="nav-item"><a class="nav-link " href="/searchByName">SEARCH BY NAME</a></li>
<li class="nav-item"><a class="nav-link " href="/searchByText">SEARCH BY TEXT</a></li>
<li class="nav-item"><a class="nav-link " href="/outOfWarranty">OUT OF WARRANTY</a></li>
</ul>
</div>
</nav>

	
<div class="container">
	Place Enter the product details that need to be added.
	

<div class="form-group">
	<form:form method="post" modelAttribute="product">
	<div>	<form:input type="text" path="name" placeholder="Name" class="form-control"/> </div>
	<div>	<form:input type="text" path="type" placeholder="Type" class="form-control"/></div>
	<div>	<form:input type="text" path="place" placeholder="Place" class="form-control"/></div>
	<div>	<form:input type="number" path="warranty" placeholder="Warranty" class="form-control"/></div>
	<div>	<input type="submit"  class="btn btn-success"></div>
	</form:form>
	</div></div>
	
	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>