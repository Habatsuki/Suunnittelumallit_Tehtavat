/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

/**
 *
 * @author hannu.korhonen
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class example2 extends JFrame {
    public static void main(String[] args) {
        example2 test = new example2();
        test.setBounds(20,20,250,150);
        test.show();
    }
   
    public example2() {
        super("Border flyweights");
        JPanel panel   = new JPanel(), panel2 = new JPanel();
        Border border  = BorderFactory.createRaisedBevelBorder();
        Border border2 = BorderFactory.createRaisedBevelBorder();
        panel.setBorder(border);
        panel.setPreferredSize(new Dimension(100,100));
        panel2.setBorder(border2);
        panel2.setPreferredSize(new Dimension(100,100));
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(panel);
        contentPane.add(panel2);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        if(border == border2)
            System.out.println("bevel borders are shared");
        else
            System.out.println("bevel borders are NOT shared");
    }
}