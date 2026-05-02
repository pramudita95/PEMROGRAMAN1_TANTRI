/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author ASUS
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class latihan3 extends JFrame implements MouseListener, MouseMotionListener {
    
    TextField tf;

    public latihan3(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        tf = new TextField(60);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void launchFrame() {
        add(tf, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
        tf.setText("Mouse clicked.");
    }

    public void mouseEntered(MouseEvent me) {
        tf.setText("Mouse entered component.");
    }

    public void mouseExited(MouseEvent me) {
        tf.setText("Mouse exited component.");
    }

    public void mousePressed(MouseEvent me) {
        tf.setText("Mouse pressed at " + me.getX() + "," + me.getY());
    }

    public void mouseReleased(MouseEvent me) {
        tf.setText("Mouse released.");
    }

    public void mouseDragged(MouseEvent me) {
        tf.setText("Mouse dragged at " + me.getX() + "," + me.getY());
    }

    public void mouseMoved(MouseEvent me) {
        tf.setText("Mouse moved at " + me.getX() + "," + me.getY());
    }

    public static void main(String args[]) {
        latihan3 med = new latihan3("Mouse Events Demo");
        med.launchFrame();
    }
}
