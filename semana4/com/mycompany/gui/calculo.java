
package com.mycompany.gui;

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class calculo extends JFrame implements ActionListener {

   private JPanel contentPane;
   private JLabel lvlNumero;
   private JTextField txtNumero;
   private JButton btncalculo;
   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
     @Override
     public void run(){
         try {
             calculo frame= new calculo();
             frame.setVisible(true);
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
    });
    }
    
  public calculo(){
      setTitle("ejemplo ventana como en eclipse");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 500, 250);
      contentPane=new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5,5,5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      txtNumero=new JTextField();
      txtNumero.setBounds(28,83,138,25);
      contentPane.add(txtNumero);
      //txtNumero.setColumns(10);
      
      btncalculo=new JButton("CALCULAR");
      btncalculo.addActionListener(this);
      btncalculo.setBounds(320,83,120,25);
      contentPane.add(btncalculo);
      
      lvlNumero=new JLabel("RESULTADO");
     lvlNumero.setBounds(28, 142, 80, 25);
      contentPane.add(lvlNumero);
  }  

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource()==btncalculo) {
            actionPerformedBtnCalcular(arg0);
        }
    }

    private void actionPerformedBtnCalcular(ActionEvent arg0) {
   double x=Double.parseDouble(txtNumero.getText());
   double cantidad=x*x;
   lvlNumero.setText(""+cantidad);
    }
    
}
