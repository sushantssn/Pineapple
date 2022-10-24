<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Your todos are</caption>
			<thead>
				<tr>
				    <th>UserID</th>
				    <th>User</th>
					<th>Scheme Desc</th>
					<th>Investment Date</th>
					<th>Maturity Date</th>
					<th>Invested Amount</th>
					<th>Maturity Amount</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
					<td>${todo.userId}</td>
					<td>${todo.userName}</td>
						<td>${todo.schemeDes}</td>
						<td><fmt:formatDate value="${todo.investmentDate}" pattern="dd/MM/yyyy"/></td>
						<td><fmt:formatDate value="${todo.maturityDate}" pattern="dd/MM/yyyy"/></td>
							<td>${todo.investedAmount}</td>
								<td>${todo.maturityAmount}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-todo">Add a Todo</a>
		</div>
	</div>
<%@ include file="common/footer.jspf" %>