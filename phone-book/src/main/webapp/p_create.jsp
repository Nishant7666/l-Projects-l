<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
 <style>
    #form
    {
        width: 50%;
        position: fixed;
        transform: translate(50%,50%);
        padding: 4px;
        border-radius: 7px;
        background-color: rgba(0, 0, 0, 0.542);
        color: aliceblue;
        padding-top: 20px;
        padding-right: 10px;
    }
    #create
    {

        transform: translate(45%,0%);
        margin: 4px;
    }
    .body
    {
    	 background-color: rgba(0, 0, 255 , 0.396);
    }
    h2
    {
        text-align: center;
        padding-top: 40px;
    }
 </style>
<body class="body">
	 <%@ include file="p_nav.jsp" %>
	 
	 	<h2> Create New Contact </h2>
	 <form id="form" class="row g-3 bg-black">
        <div class="col-md-6">
          <label for="inputEmail4" class="form-label">Name</label>
          <input type="text" class="form-control" id="inputEmail4" placeholder="enter name" name="name">
        </div>
        <div class="col-md-6">
          <label for="inputPassword4" class="form-label">Contact</label>
          <input type="text" class="form-control" id="inputPassword4" placeholder="enter contact" name="contact">
        </div>
        <div class="col-12">
          <label for="inputAddress" class="form-label">Address</label>
          <input type="text" class="form-control" id="inputAddress" placeholder="enter address here" name="address">
        </div>
         
        <div class="col-md-6">
          <label for="inputCity" class="form-label">City</label>
          <input type="text" class="form-control" id="inputCity" placeholder="enter city" name="city">
        </div>
        <div class="col-md-4">
          <label for="inputState" class="form-label">State</label>
          <select id="inputState" class="form-select" name="state">
            <option selected>Choose...</option>
            <option value="">Maharashtra</option>
            <option value="">Uttar Pradesh</option>
            <option value="">Rajasthan</option>
            <option value="">Madhya Pradesh</option>
            <option value="">Bihar</option>
            <option value="">Chennai</option>
            <option>...</option>
          </select>
        </div>
        <div class="col-md-2">
          <label for="inputZip" class="form-label">Pin</label>
          <input type="text" class="form-control" id="inputZip" name="pin">
        </div>
        <div class="col-12">
           
        </div>
        <div id="create" class="col-12">
          <button type="submit" class="btn btn-primary">Create</button>
        </div>
      </form>

      <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
</body>
</html>