package org.o7planning.sbjsp;

import java.io.IOException;
import java.io.InputStream;

public class YourClass {

    public void getOutputStringFromJar() throws IOException, InterruptedException {
    	   Process proc = Runtime.getRuntime().exec("java -jar /HelloSpringJSP/src/main/webapp/WebRace.jar");
    	    proc.waitFor();
    	    // Then retreive the process output
    	    InputStream in = proc.getInputStream();
    	    InputStream err = proc.getErrorStream();

    	    byte b[]=new byte[in.available()];
    	    in.read(b,0,b.length);
    	    System.out.println(new String(b));

    	    byte c[]=new byte[err.available()];
    	    err.read(c,0,c.length);
    	    System.out.println(new String(c));
     	}
    }

