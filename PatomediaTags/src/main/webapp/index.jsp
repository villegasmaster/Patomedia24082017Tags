<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="org.patomediatags.configuration.*" %>
<%@page import="javax.servlet.ServletInputStream,javax.servlet.http.HttpServletRequest"%>
<%@ page isELIgnored="false" %>


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

<body>


  <form method="post" action="OperationsServlet"  class="login" id="formTag" enctype="multipart/form-data">
  <div class="container">
	  <div id="start">
	    
	     <h1>ORIGEN</h1>
	     	
	       <input type="radio"  class="radio_opt_start" name="radio_opt" id="radio_opt_start" value="T" > TagOption <br> 
	   		<input type="text" name="start_prueba" id="start_prueba" value="" size="100"><br><br>
	       <input type="radio" class="radio_opt_destiny" name="radio_opt" id="radio_opt_destiny" value="F"> FileOption <br>
	      <input type="text" name="file_name" id="file_name" value="" size="30">
	      <input type="file" name="file" id="file" value="" multiple="multiple"><br>
	   
<%-- 	   		 <c:forEach items="<%=ads%>" var="item"> --%>

<%-- 				<c:out value="item"></c:out> --%>
<%-- 	    	</c:forEach> --%>
	    	
	    	 <c:forEach var="ads" items="${ads}" varStatus="loop">
	    	 	<dl>
					<dt><input type="radio" name="adsRadio" id="${ads.value}" value="${ads.value}" />${ads.value}</dt>
						<c:forEach var="types" items="${types}" varStatus="loop">
							<dd><input type="checkbox" name="${types}" id="${types}" value="${types}" />${types}</dd>
						</c:forEach>
				</dl> 
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
