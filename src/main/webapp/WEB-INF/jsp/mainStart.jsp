
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Applet Run</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/style.css"/>
   </head>
   <body>
      <h1>Applet JAR Run</h1>
		<h2>Before running the applet below please do the following:</h2>
			<h3>1. Open "Open Configure Java"</h3>
			<h3>2. Go to "Java Control Panel"</h3>
			<h3>3. Click on "Security"</h3>
			<h3>4. "Edit Site List" by adding following link to "Exception Site List":</h3>
			<h3>https://stark-sands-66349.herokuapp.com/DogAppletJ.jar</h3>
		
      <h1>Run Applet Race JAR</h1>
		<a href="${pageContext.request.contextPath}/runJar" >Start Dog Race JAR Applet</a>
		<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Bulterrier.png">
		</div>     
           <div>
    <h4>What image</h4>
        <img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Airedale.png">
    </div>
         <div align="center">
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Akitas.png">
		</div> 
   </body>
</html>