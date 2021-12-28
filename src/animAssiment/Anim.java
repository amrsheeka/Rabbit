
package animAssiment;

import com.sun.opengl.util.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.media.opengl.*;
import javax.swing.*;
import listeners.Home;

public class Anim extends JFrame implements ActionListener , MouseListener{
    AnimListener listener;
    GLCanvas glcanvas;
    private Animator animator;
    JLabel j;
    JPanel jp;
    public static void main(String[] args) {
        new Anim().animator.start();
    }


    public Anim() {
       j = new JLabel();
        
        
        
        AnimListener listener1 = new AnimGLEventListener3();
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener1);
        glcanvas.addMouseListener(listener1);
        glcanvas.addMouseMotionListener(listener1);
        getContentPane().add(glcanvas, BorderLayout.CENTER);
        animator = new FPSAnimator(20);
        animator.add(glcanvas);

        setTitle("Anim Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setVisible(true);
        setFocusable(true);
        glcanvas.requestFocus();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
         Home listener1 = new Home();
        glcanvas.addGLEventListener(listener1);
         add(glcanvas, BorderLayout.CENTER);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
