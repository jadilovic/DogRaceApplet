
<!DOCTYPE HTML>
<html>
   <head>
   	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script src="bootstrap/js/jquery.js"></script>
		<script src="bootstrap/js/bootstrap.js"></script>
      <title>Applet Race</title>

      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.css"/>
     
 </head>
  <body>
   <div class="bg-light" align="center">
   	  <div class="bg-success text-white">
   	  		<h1>Welcome to Applet Race</h1>
   	  </div>
      <h2>${message}</h2>
       
      <a href="${pageContext.request.contextPath}/personList">Person List</a>  
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Corgi.png">   
      
      <h1>Start Dog Race Applet</h1>
		<a href="${pageContext.request.contextPath}/mainStart" class="btn btn-warning btn-lg btn-block active" role="button" aria-pressed="true">Click Here to Go to Dog Race Applet Page</a>
		<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Greyhound.png">

			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Husky.png">
		</div>     
       
             <h1>Index JNLP</h1>
		<a href="${pageContext.request.contextPath}/jnlpIndex" >Index JNLP</a>   
   </div>
   </body>
</html>