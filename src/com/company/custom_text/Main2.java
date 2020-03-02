package com.company.custom_text;


import javax.swing.*;

public class Main2 extends JFrame {

    public Main2() {

        setSize(1500, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

    }


    public static void main(String[] args) {
        Main2 main = new Main2();

        MyLabal topscreen = new MyLabal();
        topscreen.setBounds(100,100, 1200 ,750 );
        main.getContentPane().add(topscreen);



        Input  smtn = new Input(topscreen);
        smtn.setBounds(200,900, 1100 ,80 );
        main.getContentPane().add(smtn);


        main.setVisible(true);


    }
}
