<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nav Bar</title>
  <link rel="stylesheet" href="Css_Js/css/bootstrap.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	  <nav class="navbar navbar-expand-lg bg-body-tertiary" style="margin-bottom:20px;">
                <div class="container-fluid">
                    <a class="navbar-brand" href="#"> Task </a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                           

                            <ul class="navbar-nav me-auto mb-2 mb-lg-0" style="padding-left: 100px;">
                                <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="create-task">create task</a>
                                </li>
                                    <li class="nav-item">
                                    <a class="nav-link" href="#">Link</a>
                                    </li>
                            </ul> 
                            
                             <form class="d-flex" role="search" action="GetSrchData">
                                 
                                <input class="form-control me-2" type="search" placeholder="Enter Column Name" name="column" aria-label="Search" required>
                                <input class="form-control me-2" type="search" placeholder="Enter Row Value" name="search" aria-label="Search" required>
                                <button class="btn btn-outline-success" type="submit">Search</button>
                            </form>
                    </div>
                </div>
            </nav>
</body>
</html>