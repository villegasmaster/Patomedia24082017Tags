<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="org.patomediatags.configuration.*" %>
<%@page import="javax.servlet.ServletInputStream,javax.servlet.http.HttpServletRequest"%>


<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Patomedia Tags</title>
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/patomedia.css"/>
 
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.6.1/jquery.min.js"></script>
<script src="js/validations.js" type="text/javascript"></script>   
</head>

<%


// List<String> ads = PropertiesConf.getInstance().getAds();

// request.setAttribute("ads",ads); 
// System.out.println(ads);

// Map<String, String> foods = new HashMap<String, String>();

// //here key stores the food codes
// //and values are that which will be visible to the user in the drop-down
// foods.put("man", "mango");
// foods.put("app", "apple");
// foods.put("gra", "grapes");

// //if this is your servlet or action class having access to HttpRequest object then
// session.setAttribute("foods", foods); // so that you can retrieve in JSP
//System.out.println(session.getAttribute("ads"));
// List<String> ads = (List<String>)session.getAttribute("ads");
// System.out.println(ads);
// System.out.println(foods.toString());
%>

<body>

<%-- <%List<String> ads = (List<String>) session.getAttribute("ads");   --%>

<!-- %> -->

  <form method="post" action="OperationsServlet"  class="login" id="formTag" enctype="multipart/form-data">
  <div class="container">
	  <div id="start">
	    
	     <h1>ORIGEN</h1>
	     	
	       <input type="radio"  class="radio_opt_start" name="radio_opt" id="radio_opt_start" value="T" > TagOption </br> 
	   		<input type="text" name="start_prueba" id="start_prueba" value="" size="100"></br></br>
	       <input type="radio" class="radio_opt_destiny" name="radio_opt" id="radio_opt_destiny" value="F"> FileOption </br>
	      <input type="text" name="file_name" id="file_name" value="" size="30">
	      <input type="file" name="file" id="file" value="" multiple="multiple">
	     
	     <%
	     System.out.println(session.getAttribute("ads"));
	     
	     %>
<%-- 	   		 <c:forEach items="<%=ads%>" var="item"> --%>

<%-- 				<c:out value="item"></c:out> --%>
<%-- 	    	</c:forEach> --%>
	    	
	    	 <c:forEach items="${ads}" var="item">

				<c:out value="${item.value}"></c:out>
	    	</c:forEach>
	
<%-- 	<c:out value="ads" /> --%>
			
	      
	   
	 </div>
	 <div id="destiny">
	    
	      <h1>DESTINO</h1>
	     
	      <input type="text" name="destiny" id="destiny" value="" size="100">
	   
	   </div>
	  <div id="button_submit">
		 
	      <button type="submit">Calcular</button>
	<!--        <button type="submit" class="login-button">Calcular</button> -->
	   
    </div>
   </div>
    


  </form>

 
</body>
</html>
