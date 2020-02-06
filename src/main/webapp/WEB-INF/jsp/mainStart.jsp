
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Applet Run</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/style.css"/>
   </head>
   <body>
      <h1>JAR Run</h1>
      <h2>${message}</h2>
       
           <h1>Run JAR None</h1>
		<a href="${pageContext.request.contextPath}/moving" >Result of Race None</a>
       		<div align="center">
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Akitas.png">
		</div> 
      <h1>Run Applet Race JAR</h1>
		<a href="${pageContext.request.contextPath}/runJar" >Start Dog Race JAR Applet</a>
		<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Bulterrier.png">
		</div>     
           <div>
    <h4>What image</h4>
        <img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Airedale.png">
    </div>
   </body>
</html>