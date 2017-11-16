<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="card">
	<h4 class="card-header">Please SignUp</h4>
	<div class="card-body">
		<form:form modelAttribute="userCommands">
		
		<form:errors cssClass="error" />
			<div class="form-group">
				<form:label path="email">Email address</form:label> <form:input path="email"
					name="email" type="email" class="form-control"
					id="exampleform:inputEmail1" aria-describedby="emailHelp"
					placeholder="Enter email" />
					<form:errors path="email" cssClass="error" /> <small id="emailHelp"
					class="form-text text-muted">We'll never share your email
					with anyone else.</small>
			</div>
			<div class="form-group">
				<form:label path="name">Name</form:label> <form:input name="name" path="name"
					type="text" class="form-control" id="exampleform:inputName1"
					placeholder="Enter Name" />
				<form:errors path="name" cssClass="error" />
			</div>
			<div class="form-group">
				<form:label path="password">Password</form:label> <form:input path="password"
					name="password" type="password" class="form-control"
					id="exampleform:inputPassword1" placeholder="Password" />
					<form:errors path="password" cssClass="error" />
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</div>

<%@include file="includes/footer.jsp"%>


