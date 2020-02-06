package org.o7planning.sbjsp;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
	    YourClass yClass = new YourClass();
	    try {
			yClass.getOutputStringFromJar();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
