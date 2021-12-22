
package calculator;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

    JPanel panel1, panel2, panel3;
    JTextField text;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot, btnAdd, btnSub, btnMulti, btnDiv, 
    btnEqual, btnDoubleZero,btnMod;
    double n1,n2,result;
    int flag;

    Calculator() {
        setSize(525, 570);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(null);
       
        Font font = new Font("Arial", Font.BOLD, 30);

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 500, 150);
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setLayout(null);
        add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(0, 155, 350, 380);
        panel2.setBackground(Color.GRAY);
        panel2.setLayout(new GridLayout(4, 3, 5, 5));
        add(panel2);

        panel3 = new JPanel();
        panel3.setBounds(350, 155, 170, 380);
        panel3.setBackground(Color.DARK_GRAY);
        panel3.setLayout(new GridLayout(6, 1, 2, 2));
        add(panel3);

        text = new JTextField();
        text.setBounds(10, 10, 480, 130);
        text.setFont(font);
        panel1.add(text);

        btn0 = new JButton("0");
        btn0.addActionListener(this);
        btn0.setFont(font);
        
        btn1 = new JButton("1");
        btn1.addActionListener(this);
        btn1.setFont(font);
        btn2 = new JButton("2");
        btn2.addActionListener(this);
        btn2.setFont(font);
        btn3 = new JButton("3");
        btn3.addActionListener(this);
        btn3.setFont(font);
        btn4 = new JButton("4");
        btn4.addActionListener(this);
        btn4.setFont(font);
        btn5 = new JButton("5");
        btn5.addActionListener(this);
        btn5.setFont(font);
        btn6 = new JButton("6");
        btn6.addActionListener(this);
        btn6.setFont(font);
        btn7 = new JButton("7");
        btn7.addActionListener(this);
        btn7.setFont(font);
        btn8 = new JButton("8");
        btn8.addActionListener(this);
        btn8.setFont(font);
        btn9 = new JButton("9");
        btn9.addActionListener(this);
        btn9.setFont(font);
        btnDot = new JButton(".");
        btnDot.addActionListener(this);
        btnDot.setFont(font);
        btnDoubleZero = new JButton("00");
        btnDoubleZero.addActionListener(this);
        btnDoubleZero.setFont(font);

        panel2.add(btn0);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btnDot);
        panel2.add(btnDoubleZero);

        btnAdd = new JButton("+");
        btnAdd.addActionListener(this);
        btnAdd.setFont(font);
        btnSub = new JButton("-");
        btnSub.addActionListener(this);
        btnSub.setFont(font);
        btnDiv = new JButton("\u00F7");
        btnDiv.addActionListener(this);
        btnDiv.setFont(font);
        btnMulti = new JButton("*");
        btnMulti.addActionListener(this);
        btnMulti.setFont(font);
        btnMod = new JButton("%");
        btnMod.addActionListener(this);
        btnMod.setFont(font);
        btnEqual = new JButton("=");
        btnEqual.addActionListener(this);
        btnEqual.setFont(font);
       
        panel3.add(btnAdd);
        panel3.add(btnSub);
        panel3.add(btnDiv);
        panel3.add(btnMulti);
        panel3.add(btnMod);
         panel3.add(btnEqual);
       
        

        setVisible(true);
    }


    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn0)
        {
            text.setText(text.getText() + "0" );
        }
        if(e.getSource() == btn1)
        {
            text.setText(text.getText()+ "1");
        }
        
        if(e.getSource()== btn2)
        {
          text.setText(text.getText()+"2");
        }
        if(e.getSource()== btn3)
        {
          text.setText(text.getText()+"3");
        }
        
        if(e.getSource()== btn4)
        {
          text.setText(text.getText()+"4");
        }
        if(e.getSource()== btn5)
        {
          text.setText(text.getText()+"5");
        }
        if(e.getSource()== btn6)
        {
          text.setText(text.getText()+"6");
        }
        if(e.getSource()== btn7)
        {
          text.setText(text.getText()+"7");
        }
        if(e.getSource()== btn8)
        {
          text.setText(text.getText()+"8");
        }
        if(e.getSource()== btn9)
        {
          text.setText(text.getText()+"9");
        }
        if(e.getSource()== btnDot)
        {
          text.setText(text.getText()+".");
        }
        if(e.getSource()== btnDoubleZero)
        {
          text.setText(text.getText()+"00");
        }
        
        
        if(e.getSource()==btnAdd){
            String str1 = text.getText();
            n1 = Double.parseDouble(str1);
            text.setText("");
            flag = 1;
        }
        if(e.getSource()==btnSub){
            String str1 = text.getText();
            n1 = Double.parseDouble(str1);
            text.setText("");
            flag = 2;
        }
        if(e.getSource()==btnMulti){
            String str1 = text.getText();
            n1 = Double.parseDouble(str1);
            text.setText("");
            flag = 3;
        }
        if(e.getSource()==btnDiv){
            String str1 = text.getText();
            n1 = Double.parseDouble(str1);
            text.setText("");
            flag = 4;
        }
        
        if(e.getSource()==btnMod){
            String str1 = text.getText();
            n1 = Double.parseDouble(str1);
            text.setText("");
            flag = 5;
        }
        
        if(e.getSource()==btnEqual){
            if(flag == 1){
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 + n2;
                text.setText(Double.toString(result));

                if(Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                }
                    else{
                        text.setText(Double.toString(result));
                }

            }
            if(flag == 2){
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 - n2;
                text.setText(Double.toString(result));

                if(Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                }
                else{
                    text.setText(Double.toString(result));
                }
            }
            if(flag == 3){
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 * n2;
                text.setText(Double.toString(result));

                if(Double.toString(result).endsWith(".0")) {
                    text.setText(Double.toString(result).replace(".0", ""));
                }
                else{
                    text.setText(Double.toString(result));
                }

            }
            if(flag == 4){
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 / n2;
                text.setText(Double.toString(result));
       }
            if(flag == 5){
                String str2 = text.getText();
                n2 = Double.parseDouble(str2);
                result = n1 % n2;
                text.setText(Double.toString(result));
    }
        
 }
    
}
}
