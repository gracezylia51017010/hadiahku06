/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprak06_1;

import javax.swing.*;
import java.awt.event.*;

public abstract class Hadiahprak06_1 implements ActionListener {

       private static void createAndShowGUI() {
        JFrame frame = new JFrame ("Hitung Mundur"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,300,100);
        frame.getContentPane().setLayout(null);
        
        //make a buttom
        JButton butt = new JButton("Click Me");
        frame.getContentPane().add(butt);
        butt.setBounds(20,20,200,20);
        
        //instatite an application objeck=t
        Hadiahprak06_1 app = new Hadiahprak06_1 () {};
        
        //make the label
        app.label = new JLabel("o clicks");
        app.label.setBounds(20,40,200,20);
        frame.getContentPane().add(app.label);
        
        //set the application object to be the thing which
        // listens to the button
        butt.addActionListener(app);
        frame.setVisible(true);
    }
    private JLabel label;
    public void actionPerformed(ActionEvent e)
    {
        //ini akan dieksekusi ketika button diklik
  {     clickCount--;
        label.setText("Clicks = "+clickCount);
    }
  }
    public static void main(String[] args){
        //memulai swing GUI
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
              createAndShowGUI();
            }
});
}

int clickCount=4;
    }
    
