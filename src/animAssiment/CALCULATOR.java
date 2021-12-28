package animAssiment;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CALCULATOR extends JFrame implements ActionListener {

    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton plus;
    JButton mins;
    JButton deivide;
    JButton product;
    TextField tf;
    JPanel jp;
    JButton bc;
    JButton equal;

    public CALCULATOR() {

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        equal = new JButton("=");
        plus = new JButton("+");
        mins = new JButton("-");
        deivide = new JButton("/");
        product = new JButton("*");
        bc = new JButton("Clear");
        tf = new TextField();
        jp = new JPanel();
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        plus.addActionListener(this);
        mins.addActionListener(this);
        product.addActionListener(this);
        deivide.addActionListener(this);
        bc.addActionListener(this);
        equal.addActionListener(this);

        jp.setLayout(new GridLayout(6, 3, 40, 40));

        jp.add(tf);
        jp.add(equal);
        jp.add(bc);
        jp.add(b1);
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);
        jp.add(b7);
        jp.add(b8);
        jp.add(b9);
        jp.add(plus);
        jp.add(mins);
        jp.add(deivide);
        jp.add(product);

        add(jp);

        setSize(360, 450);
        setLocationRelativeTo(this);
        setLayout(new GridLayout(WIDTH, WIDTH, WIDTH, WIDTH));
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {

        new CALCULATOR();
    }
    double x = 0, y = 0, res = 0;
    char index;

    public void actionPerformed(ActionEvent e) {
        
        try {
            
        
        if (e.getSource().equals(b1)) {
            setNumber("1");

        } else if (e.getSource().equals(b2)) {
            setNumber("2");

        } else if (e.getSource().equals(b3)) {
            setNumber("3");

        } else if (e.getSource().equals(b4)) {
            setNumber("4");

        } else if (e.getSource().equals(b5)) {
            setNumber("5");

        } else if (e.getSource().equals(b6)) {
            setNumber("6");

        } else if (e.getSource().equals(b7)) {
            setNumber("7");

        } else if (e.getSource().equals(b8)) {
            setNumber("8");

        } else if (e.getSource().equals(b9)) {
            setNumber("9");

        } else if (e.getSource().equals(plus)) {
            setOperation('+');

        } else if (e.getSource().equals(mins)) {
            setOperation('-');

        } else if (e.getSource().equals(product)) {
            setOperation('*');

        } else if (e.getSource().equals(deivide)) {
            setOperation('/');

        } else if (e.getSource().equals(bc)) {
            tf.setText("");
        }
        } catch (Exception m) {
            System.out.println("invalid");
        }

        if (e.getSource().equals(equal)) {
            try {
                y = Double.parseDouble(tf.getText());
            } catch (NumberFormatException m) {
                System.out.println("invalid");
            }
            
            switch (index) {
                case '+':
                    res = x + y;
                    break;
                case '-':
                    res = x - y;
                    break;
                case '*':
                    res = x * y;
                    break;
                case '/':
                    res = x / y;
                    break;
            }
            tf.setText(String.format("%.0f", res));
            x=y=res=0;
        }

    }

    private void setNumber(String s) {
//        if(tf.getText().isEmpty()){
            String ss = tf.getText() + s;
            tf.setText(ss);
//        }
//        else{
//            clear();
//            String ss = tf.getText() + s;
//            tf.setText(ss);
//        }
    }

    private void setOperation(char ope) {
        switch (ope) {
            case '+':
                x += Double.parseDouble(tf.getText());
                break;
            case '-':
                x -= Double.parseDouble(tf.getText());
                break;
            case '*':
                x *= Double.parseDouble(tf.getText());
                break;
            case '/':
                x = Double.parseDouble(tf.getText());
                break;
        }

        tf.setText("");
        index = ope;
    }
    private void clear(){
        tf.setText("");
    }
}
