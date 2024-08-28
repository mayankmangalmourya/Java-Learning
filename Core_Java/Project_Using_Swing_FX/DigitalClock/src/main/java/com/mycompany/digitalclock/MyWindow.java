/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.digitalclock;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import java.util.Timer;

/**
 *
 * @author shant
 */
public class MyWindow extends JFrame {
    
    private JLabel heading;
    private JLabel clockLevel;
    private Font font = new Font("", Font.BOLD, 35);
    
    MyWindow(){
        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(300, 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }
    
    public void createGUI(){
        heading = new JLabel("My Clock");
        clockLevel = new JLabel("Clock");
        heading.setFont(font);
        clockLevel.setFont(font);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLevel);
        
    }
    public void startClock(){
        Timer timer = new Timer();
        
    }
}
