/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparc.view;

import javax.swing.JFrame;
/**
 *
 * @author aids
 */
public class Driver {
    
    
    public static void main (String[] args) {
        JFrame frame = new JFrame ("Group 4");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MainPanel());
        frame.pack();
        frame.setVisible (true);
    }
}
