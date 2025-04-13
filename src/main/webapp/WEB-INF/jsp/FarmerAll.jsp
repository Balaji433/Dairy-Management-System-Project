<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>
<jsp:include page="modules/header.jsp" />


<!-- Start::app-content -->
<div class="main-content app-content">
	<div class="container-fluid my-5">


		<!-- Start:: row-1 -->
		<div class="row">
			<div class="col-xl-12">
				<div class="card custom-card">
					<div class="card-header justify-content-between">
						<div class="card-title">All Farmers</div>
					</div>
					<div class="card-body">
					<form action="/FarmerAll" method="get">
					
						<div class="mb-3">

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DATE OF REGISTRATION</th>
			<th>CONTACT</th>
			<th>ROUTE</th>
			<th>ADDRESS</th>
			<th>STATUS</th>
			<th>BRANCH</th>
			<th>REMARK</th>
		</tr>
		<c:forEach items="${farmlist}" var="f">
			<tr>
				<td>${f.id}</td>
				<td>${f.name}</td>
				<td>${f.date_of_registration}</td>
				<td>${f.contact}</td>
				<td>${f.route}</td>
				<td>${f.address}</td>
				<td>${f.status}</td>
				<td>${f.branch}</td>
				<td>${f.remark}</td>
			</tr>
		</c:forEach>
	</table>

 </div>
					 </form>
					 </div>
					 
					</div>
					<div class="card-footer d-none border-top-0"></div>
				</div>
			</div>

		</div>

	</div>

<!-- End::app-content -->




</body>

</html>
<jsp:include page="modules/footer.jsp" />
