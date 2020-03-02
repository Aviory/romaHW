package com.company.custom_btn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomNPC extends JFrame {

    public CustomNPC() {

        setSize(1500, 1800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //JButton button = new JButton("dassad");
        //button.setBounds(0,0,100,100);


        CustomCheck box = new CustomCheck("saf");
        box.setBounds(100,100,100,100);
        getContentPane().add(box);
        setVisible(true);

        ActionListener lister = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                box.nextAction();
            }
        };

        box.addActionListener(lister);

    }


}
