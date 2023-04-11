<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Phone-Book</title>
<link rel="stylesheet" href="css/bootstrap.css">
   
</head>
<style>
      nav
      {
        font-size: 17px;
      }
      a
      {
        margin-left: 10px;
      }
      #pb
      {
        border-radius: 7px;
        background-color: rgba(0, 0, 0, 0.54);
        padding: 10px;
      }
      ul
      {
        margin-top: 15px;
      }
      .m-card
      {
        display: flex;
        right: 20px;
        margin-top: 10px;
      }
      .card
      {
        margin-left: 15px;
      }
      li
      {
        margin-left:10px;
      }
      
     </style>
<body>
    <%@ include file="p_nav.jsp" %>

  <div class="m-card">
    <div class="card" style="width: 18rem;">
      <img src="images/nord.png" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Nord BREWERY</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <a href="#" class="btn btn-primary">   Contact</a>
      </div>
    </div>
    <div class="card" style="width: 18rem;">
      <img src="images/riso.avif" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Risott</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <a href="#" class="btn btn-primary">   Contact</a>
      </div>
    </div>

    <div class="card" style="width: 18rem;">
      <img src="images/av.webp" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Avery</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <a href="#" class="btn btn-primary"> Contact  </a>
      </div>
    </div>

    <div class="card" style="width: 18rem;">
      <img src="images/bob.jpeg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">BOB cats</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <a href="#" class="btn btn-primary">Contact</a>
      </div>
    </div>

    <div class="card" style="width: 18rem;">
      <img src="images/aero.png" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Travaling</h5>
        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
        <a href="#" class="btn btn-primary"> Contact  </a>
      </div>
    </div>
  </div>   

    </div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
</body>
</html>