<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE>
<html>
<head>
<title>Student Registration Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" />
<style>
.error{
color:red
}
</style>
</head>
<body>
<br/>
<form:form action="processForm" modelAttribute="student" method="GET">
 <div class="col-12 h-100 d-flex align-items-center justify-content-center">
 <div class="col-6">
 <h3>Student Registration Form</h3>
 <p>Full Name: </p><form:input path="name" class="w-100"/>
 <form:errors path="name" cssClass="error" />
 <p>Age: </p><form:input path="age" class="w-100"/>
 <form:errors path="age" cssClass="error" />
 <p>Postal Code: </p><form:input path="postalCode" class="w-100"/>
 <form:errors path="postalCode" cssClass="error" />
 <p>School Name: </p><form:input path="schoolName" class="w-100"/>
 <form:errors path="schoolName" cssClass="error" />
 <br/>
 <button type="submit" class="btn btn-primary my-3">Submit</button>
 </div>
 </div>
 </form:form>
</body>
</html>