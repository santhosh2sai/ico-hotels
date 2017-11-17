<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="includes/header.jsp"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

 
  <div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-6">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        Please Sign</h3></div>
  <c:if test="${param.logout != null}">
  		<div class="alert alert-success">
  			You have been logged out
  		</div>
  	</c:if>
  	
  	<c:if test="${param.error != null}">
  		<div class="alert alert-danger">
  			Failed to login.
  			<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
  				Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
  			</c:if>
  		</div>
  	</c:if>
  	
 <div class="panel-body">
                    <div class="row">
                        <div class="col-xs-12 col-sm-12 col-md-12 login-box">
	<form:form>
	
	  <div class="form-group">
	    <label for="email">Email address</label>
	    <input name="username" id="email" type="email" class="form-control" placeholder="Email" />
		<p class="help-block">Enter your email address</p>
	  </div>
	  <div class="form-group">
	    <label for="password">Password</label>
	    <input name="password" id="password" type="password" class="form-control" placeholder="Password" />
	  </div>
	  <div class="checkbox">
	    <label>
	      <input type="checkbox" name="remember-me"> Remember Me
	    </label>
	  </div>
	  <button type="submit" class="btn btn-primary">Sign In</button>
	   <a href="/forgot-password" class="btn btn-default">Forgot Password</a>
	</form:form>
	  </div>
  </div>
</div>
	
  </div>
  </div>
</div>
</div>
<%@include file="includes/footer.jsp"%> 