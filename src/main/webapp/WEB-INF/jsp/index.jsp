
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Applet Race</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/style.css"/>
   </head>
   <body>
      <h1>Welcome Applet Race</h1>
      <h2>${message}</h2>
       
     
         
      <a href="${pageContext.request.contextPath}/personList">Person List</a>  
      		<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Corgi.png">
		</div>     
      
      <h1>Start Dog Race Applet Main</h1>
		<a href="${pageContext.request.contextPath}/mainStart" >Start Dog Race Applet Main</a>
				<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Greyhound.png">
		</div>     
       
             <h1>Index JNLP</h1>
		<a href="${pageContext.request.contextPath}/jnlpIndex" >Index JNLP</a>
				<div align="center" >
			<img height="80px" width="70px" src="${pageContext.request.contextPath}/images/Husky.png">
		</div>     
       
   </body>
</html>