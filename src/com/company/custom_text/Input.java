package com.company.custom_text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input extends JTextField implements ActionListener, KeyListener {

    private MyLabal topScreen;
    public Input(MyLabal topscreen) {
        this.topScreen = topscreen;
        addActionListener(this);    //этот класс внутри инпута
        addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      //  topScreen.textCatcher("d");
        System.out.println("ssssssssssssss");

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Press");
        if(e.getKeyChar()=="backspace")
            topScreen.delChar();
        topScreen.textCatcher(e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
