package com.company.custom_text;

import javax.swing.*;
import java.awt.*;

public class MyLabal extends JLabel {

    @Override
    public void paint(Graphics g) {

        g.drawRect(0,0, getWidth(), getHeight());


        super.paint(g);

    }

    private void textFormater(){

    }

    public void textCatcher(char s){
        setText(getText()+s);

        //textFormater();
    }

    public void delChar() { //метод удаления

    }
}
