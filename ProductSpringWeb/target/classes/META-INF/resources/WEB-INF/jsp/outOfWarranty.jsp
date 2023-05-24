<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<li class="nav-item"><a class="nav-link " href="/addProduct">ADD PRODUCTS</a></li>
<li class="nav-item"><a class="nav-link " href="/searchByName">SEARCH BY NAME</a></li>
<li class="nav-item"><a class="nav-link " href="/searchByText">SEARCH BY TEXT</a></li>
<li class="nav-item"><a class="nav-link active" href="/outOfWarranty">OUT OF WARRANTY</a></li>
</ul>
</div>
</nav>

	
	<div class="container">
	<div><h3>Welcome to the your products</h3></div>
	<div>Products out of warranty</div>
	<div><table class="table">
	<thead>
	<tr>
	<th>Name</th>
	<th>Type</th>
	<th>Place</th>
	<th>Warranty</th></tr></thead><tbody>
		<c:forEach items="${products}" var="prod">
		<tr>
		<td>${prod.name}</td>
		<td>${prod.type}</td>
		<td>${prod.place}</td>
		<td>${prod.warranty}</td>
		</tr>
		
		</c:forEach>
		</tbody>
	</table></div></div>
	
	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>