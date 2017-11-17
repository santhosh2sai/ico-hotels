<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="alert alert-danger" role="alert">
There was an unexpected error (type=${error}, status=${status}): <strong>${message}</strong>
</div>
<%@include file="includes/footer.jsp"%>     
	
	
	