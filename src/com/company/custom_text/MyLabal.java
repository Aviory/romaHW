package com.company.custom_text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MyLabal extends JTextArea {

    public MyLabal() {
        setFont(new Font("Algerian", Font.BOLD, 14));

        setEditable(false);
    }


    int counterSpace;

    @Override
    public void paint(Graphics g) {

        g.drawRect(0, 0, getWidth(), getHeight());


        super.paint(g);

    }

    private void textFormater() {

    }

    public void textCatcher(char s) {
        setText(getText() + s); //забирает старое + новые символы (s), кладет обратно
        counterSpace++;
        if (counterSpace == 12) {

            setText(getText() + "\n");
            counterSpace = 0;
        }

        //textFormater();
    }

    public void delChar() { //метод удаления

        if (getText().length() != 0) {
            setText(getText().substring(0, getText().length() - 1));

            counterSpace--;
        }

        //   "hamburger".
    }
    //"hamburger".substring(3, 9) returns "burger"
}