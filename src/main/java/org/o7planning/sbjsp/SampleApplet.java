// File   : deployment/appletapp/SampleApplet.java
// Purpose: Demos dual applet / application.
// Author : Fred Swartz - 2006 Aug 5 - placed in public domain.
// Comments: Unless the applet references parameters in the HTML
//           page, just add a main program which creates a
//           JFrame to put the applet in.
//           Applets are often initialized by calling their init()
//           method -- this sample applet defines a constructor 
//           instead of init(), but both styles work.
// Tag: <applet code="appletapp.SampleApplet.class" archive="appletapp.jar"
//                                         width="220" height="20"></applet>


package org.o7planning.sbjsp;

import java.awt.*;
import javax.swing.*;

public class SampleApplet extends JApplet {
    
    //============================================================ main
    public static void main(String[] args) {
        //... Create an initialize the applet.
        JApplet theApplet = new SampleApplet();
        //theApplet.init();         // Needed if overridden in applet
        //theApplet.start();        // Needed if overridden in applet
        
        //... Create a window (JFrame) and make applet the content pane.
        JFrame window = new JFrame("Sample Applet and Application");
        window.setContentPane(theApplet);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();              // Arrange the components.
        //System.out.println(theApplet.getSize());
        window.setVisible(true);    // Make the window visible.
    }
    
    //=============================================== Applet constructor
    public SampleApplet() {
        add(new JLabel("This is both an Applet and Application!"));
    }
}