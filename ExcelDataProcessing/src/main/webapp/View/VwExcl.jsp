 <%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.excel.Dto.ExclDto"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=
    , initial-scale=1.0">
    <title>View Excel Data</title>
    <link rel="stylesheet" href="Css_Js/css/bootstrap.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
 
<body>
<div align="center" style="margin:20px; padding:10px;">
<%@ include file="NvBr.jsp"%>
 <ul class="pagination" >
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
    <table class="table bg-dark text-white">
        <thead>
          <tr  >
          	<th scope="col">ROW_ID</th>
            <th scope="col">ORDER_ID</th>
            <th scope="col">ORDER_DATE</th>
            <th scope="col">ORDER_QUANTITY</th>
            <th scope="col">ORDER_SALES</th>
            <th scope="col">SHIP_MODE</th>
            <th scope="col">PROFIT</th>
            <th scope="col">UNIT_PRICE</th>
            <th scope="col">CUST_NAME</th>
            <th scope="col">CUST_SEGMENT</th>
            <th scope="col">PRODUCT_CATEGORY</th>
          </tr>
        </thead>
        <tbody class="table bg-dark text-white">
            <%
            List<ExclDto> lst = (List<ExclDto>)  request.getAttribute("ExclList");
            if(lst != null)
            {
                for(ExclDto ed : lst)
                {
            %>
          <tr align="center">
            <th scope="row" style="margin-right:40px;"> <%= ed.getId() %></th>
            <td><%= ed.getOrdrId()%></td>
            <td><%= ed.getOrdrDt()    %></td>
            <td><%= ed.getOrdrQntty() %></td>
            <td><%= ed.getSls() %></td>
            <td><%= ed.getShpMd()  %></td>
            <td><%= ed.getPrft() %></td>
            <td><%= ed.getUntPrc() %></td>
            <td><%= ed.getCstmNm() %></td>
            <td><%= ed.getCstmSg() %></td>
            <td><%= ed.getPrdctCtgry() %></td>
          </tr>
          <%
        		}
            }
        else
        {
        %>
            <h4> Something Went Wrong ....Data not Found </h4>
        <%
        }
            
        %>
        </tbody>
      </table>
      <nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
</div>
</body>
</html>