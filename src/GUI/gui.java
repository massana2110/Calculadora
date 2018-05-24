/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author uca
 */
public class gui extends JFrame{
    private JTextField caja1,caja2,caja3;
    private JButton botonSuma, botonResta, botonMult, botonDiv;
    
    public gui() {
        super("Calculadora");
        initComponent();
    }
    
    public void initComponent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        botonSuma = new JButton(" + ");
        botonSuma.setBounds(10, 150, 60, 30);
        Container contenedor = getContentPane();
        
        botonResta = new JButton(" - ");
        botonResta.setBounds(90,150,60,30);
        
        botonMult = new JButton(" x ");
        botonMult.setBounds(160, 150, 60, 30);
        
        botonDiv = new JButton(" / ");
        botonDiv.setBounds(240,150,60,30);
        
        caja1 = new JTextField("");
        caja1.setBounds(10, 100, 80, 30);
        
        caja2 = new JTextField();
        caja2.setBounds(100, 100, 80, 30);
        
        caja3 = new JTextField();
        caja3.setBounds(190, 100, 80, 30);
        caja3.setEditable(false);
        
        contenedor.add(caja1);
        contenedor.add(botonSuma);
        contenedor.add(botonResta);
        contenedor.add(botonMult);
        contenedor.add(botonDiv);
        contenedor.add(caja2);
        
        botonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null,"Dististes click");
                    caja2.setText(caja1.getText());
            }
        });
       
    setSize(400,400);
    }
    
}
