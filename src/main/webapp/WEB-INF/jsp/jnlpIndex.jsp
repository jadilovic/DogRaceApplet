<%
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
    response.setContentType("application/x-java-jnlp-file");
%> 

<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/xml; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE jnlp PUBLIC
    "-//Sun Microsystems, Inc//DTD JNLP Descriptor 6.0//EN"
    "http://java.sun.com/dtd/JNLP-6.0.dtd">
    
   <jnlp spec="1.0+" codebase='<%=request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ request.getContextPath() + "/" %>'>
    <information>
        <title>Jnlp Testing</title>
        <vendor>Test Vendor</vendor>
        <homepage href="http://localhost:8080/" />
        <description>Testing Testing</description>
    </information>
    <security>
        <all-permissions/>
    </security>
    <resources>
        <j2se version="1.6+" />
        <jar href="WebRace.jar" />
    </resources>
    <application-desc main-class="StartingMain">
                <argument><%=request.getParameter("test_param")%></argument>
        </application-desc>
</jnlp>