
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/style.css"/>
   </head>
   <body>
      <h1>Welcome</h1>
      <h2>${message}</h2>
       
     
         
      <a href="${pageContext.request.contextPath}/personList">Person List</a>  
      
      <h1>JNLP Race</h1>
		<a href="${pageContext.request.contextPath}/JNLPExample.jnlp" >JNLP File</a>
       
             <h1>Index JNLP</h1>
		<a href="${pageContext.request.contextPath}/jnlpIndex" >Index JNLP</a>
       
   </body>
</html>