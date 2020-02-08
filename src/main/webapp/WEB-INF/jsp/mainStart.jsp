
<!DOCTYPE HTML>
<html>
   <head>
   	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<script src="bootstrap/js/jquery.js"></script>
		<script src="bootstrap/js/bootstrap.js"></script>
      <title>Applet Run</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/style.css"/>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"/>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.css"/>          
   </head>
   <body>
   <div class="bg-light" align="center">
   <div class="bg-warning text-dark">
       <h1>Applet Dog Race JAR</h1>
   </div>
		<h2>Before running the applet below please do the following:</h2>
			<h5>1. Open "Open Configure Java"</h5>
			<h5>2. Go to "Java Control Panel"</h5>
			<h5>3. Click on "Security"</h5>
			<h5>4. "Edit Site List" by adding following link to "Exception Site List":</h5>
			<div class="bg-info text-dark">
				<h5>https://dog-race.herokuapp.com/DogAppletJ.jar</h5>
			</div>

	<a href="${pageContext.request.contextPath}/runJar" class="btn btn-secondary btn-lg btn-block active" role="button" aria-pressed="true">Click Here to Start Dog Race JAR Applet</a>

		<div class="p-3 mb-2 bg-success text-white" align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Bulterrier.png">

        	<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Airedale.png">

			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Akitas.png">

			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Corgi.png">
			  
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Greyhound.png">

			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Husky.png">
		</div> 
   </div>
     
   </body>
</html>