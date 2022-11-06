<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE>
<html>
<head>
<title>Process Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<style>
.font-22{
font-size:22px
}
</style>
<body>
<h3>Registered User</h3>
<p class="font-22 my-3">Student Name : ${student.name}</p>
<p class="font-22 my-3">Student age : ${student.age}</p>
<p class="font-22 my-3">Student Postal Code : ${student.postalCode}</p>
<p class="font-22 my-3">Student School Name: ${student.schoolName}</p>
</body>
</html>
