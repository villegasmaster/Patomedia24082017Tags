
$(document).ready(function () {
	$('.radio_opt_start').click(function () {
         // document.getElementById('price').innerHTML = $(this).val();
    	  document.getElementById("file_name").disabled = true;
    	  document.getElementById("file").disabled = true;
    	  document.getElementById("start_prueba").disabled = false;
    	  
      });
	$('.radio_opt_destiny').click(function () {
          // document.getElementById('price').innerHTML = $(this).val();
     	 document.getElementById("file_name").disabled = false;
     	 document.getElementById("file").disabled = false;
     	document.getElementById("start_prueba").disabled = true;
     	
     	
       });

  });