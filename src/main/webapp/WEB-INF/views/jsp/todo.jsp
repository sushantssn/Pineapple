<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<form:form method="post" modelAttribute="Account">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="schemeDes">Description</form:label>
			<form:input path="schemeDes" type="text" class="form-control"
				required="required" />
			<form:errors path="schemeDes" cssClass="text-warning" />
		</fieldset>

		<fieldset class="form-group">
			<form:label path="maturityDate">Maturity Date</form:label>
			<form:input path="maturityDate" type="text" class="form-control"
				required="required" />
			<form:errors path="maturityDate" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">
        			<form:label path="investmentDate">Investment Date</form:label>
        			<form:input path="investmentDate" type="text" class="form-control"
        				required="required" />
        			<form:errors path="investmentDate" cssClass="text-warning" />
        		</fieldset>

		<button type="submit" class="btn btn-success">Add</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>