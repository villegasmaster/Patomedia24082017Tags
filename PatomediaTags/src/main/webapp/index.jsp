<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Patomedia Tags</title>
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" type="text/css" href="css/patomedia.css"/>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <form method="post" action="OperationsServlet"  class="login" id="formTag" enctype="multipart/form-data">
  <div class="container">
	  <div id="start">
	    <p>
	     <h1>ORIGEN</h1>
	     	
	       <input type="radio" name="radio_opt" id="radio_opt" value="T"> TagOption </br>
	        
	   <input type="text" name="start" id="start" value="" size="100"></br>
	      
	      <input type="text" name="file_name" id="file_name" value="" size="30">
	      <input type="file" name="file" id="file" value="" multiple="multiple">
	    </p>
	 </div>
	 <div id="destiny">
	    <p>
	      <h1>DESTINO</h1>
	      <input type="radio" name="radio_opt" id="radio_opt" value="F"> FileOption </br>
	      <input type="text" name="destiny" id="destiny" value="" size="100">
	    </p>
	   </div>
	  <div id="button_submit">
		 <p>
	      <button type="submit">Calcular</button>
	<!--        <button type="submit" class="login-button">Calcular</button> -->
	    </p>
    </div>
   </div>
    


  </form>

 
</body>
</html>
