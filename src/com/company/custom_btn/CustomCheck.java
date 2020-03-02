package com.company.custom_btn;

import javax.swing.*;
import java.awt.*;

public class CustomCheck extends JButton {
    public int tmp;//=0
    public CustomCheck(String name) {
        super(name);

    }


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.red);

        g.drawOval(0, 0, 50, 50);
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.BLACK);

        if (tmp <= 2) {
            g.drawOval(0, 0, 20, 20);
        }
        if (2<= tmp) {

            g.drawOval(40, 40, 20, 20);
        }
        if (tmp > 4) {

            g.drawOval(20, 20, 20, 20);
        }
        if (tmp > 5) {

            g.drawOval(0, 40, 20, 20);
        }
        if (tmp > 6) {
            g.drawOval(40, 0, 20, 20);
        }


        g.drawRect(0, 0, 60, 60);// кубик, найти где обрабатывается клик и где менял перерисовку

    }


    public void nextAction() {
        tmp++;
        repaint();
    }
}
