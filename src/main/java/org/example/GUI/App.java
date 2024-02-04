package org.example.GUI;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private JPanel body;
    public App (){
        initComponents();
    }
    public void initComponents(){
        body=new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        body.setLayout(new BorderLayout());
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(body,GroupLayout.DEFAULT_SIZE,1188,Short.MAX_VALUE)
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(body,GroupLayout.DEFAULT_SIZE,696,Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
