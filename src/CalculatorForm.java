import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorForm extends JFrame implements ActionListener
{
    double value1, value2, result;
    char op;
    JLabel label;
    JButton button1; JButton button4; JButton button7; JButton button0;
    JButton button2; JButton button5; JButton button8; /*Added extra buttons*/
    JButton button3; JButton button6; JButton button9;
    JButton buttonDot; JButton buttonEq; JButton buttonA; JButton buttonS; JButton buttonD;
    JButton buttonM; JButton buttonBS; JButton buttonCL;
    JPanel panel;
    CalculatorForm()
    {
        super("MyCalculator");
        this.setSize(450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        label = new JLabel("");
        label.setBounds(100,20,400,25);// made changes here 1
        panel.add(label);
        panel.setBackground(Color.WHITE);

        buttonCL = new JButton("Clear");
        buttonCL.setBounds(220,60,110,30);
        buttonCL.addActionListener(this);
        panel.add(buttonCL);

        buttonBS = new JButton("BackSpace");
        buttonBS.setBounds(100,60,110,30);
        buttonBS.addActionListener(this);
        panel.add(buttonBS);

        button7 = new JButton("7");
        button7.setBounds(100,100,50,50);
        button7.addActionListener(this);
        panel.add(button7);

        button8 = new JButton("8");
        button8.setBounds(160,100,50,50);
        button8.addActionListener(this);
        panel.add(button8);

        button9 = new JButton("9");
        button9.setBounds(220,100,50,50);
        button9.addActionListener(this);
        panel.add(button9);

        buttonM = new JButton("*");
        buttonM.setBounds(280,100,50,50);
        buttonM.addActionListener(this);
        panel.add(buttonM);
        /* 4 5 6 / */
        button4 = new JButton("4");
        button4.setBounds(100,160,50,50);
        button4.addActionListener(this);
        panel.add(button4);

        button5 = new JButton("5");
        button5.setBounds(160,160,50,50);
        button5.addActionListener(this);
        panel.add(button5);


        button6 = new JButton("6");
        button6.setBounds(220,160,50,50);
        button6.addActionListener(this);
        panel.add(button6);

        buttonD = new JButton("/");
        buttonD.setBounds(280,160,50,50);
        buttonD.addActionListener(this);
        panel.add(buttonD);

        /* 1 2 3 - */
        button1 = new JButton("1");
        button1.setBounds(100,220,50,50);
        button1.addActionListener(this);
        panel.add(button1);


        button2 = new JButton("2");
        button2.setBounds(160,220,50,50);
        button2.addActionListener(this);
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(220,220,50,50);
        button3.addActionListener(this);
        panel.add(button3);

        buttonS = new JButton("-");
        buttonS.setBounds(280,220,50,50);
        buttonS.addActionListener(this);
        panel.add(buttonS);
        /* 0 . = + */
        button0 = new JButton("0");
        button0.setBounds(100,280,50,50);
        button0.addActionListener(this);
        panel.add(button0);

        buttonDot = new JButton(".");
        buttonDot.setBounds(160,280,50,50);
        buttonDot.addActionListener(this);
        panel.add(buttonDot);

        buttonEq = new JButton("=");
        buttonEq.setBounds(220,280,50,50);
        buttonEq.addActionListener(this);
        panel.add(buttonEq);

        buttonA = new JButton("+");
        buttonA.setBounds(280,280,50,50);
        buttonA.addActionListener(this);
        panel.add(buttonA);

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
    {

        String str = ae.getActionCommand();
        if(str.equals("1"))
        {
            label.setText(label.getText()+button1.getText());
        }
        else if(str.equals("2"))
        {
            label.setText(label.getText()+button2.getText());
        }
        else if(str.equals("3"))
        {
            label.setText(label.getText()+button3.getText());
        }
        else if(str.equals("4"))
        {
            label.setText(label.getText()+button4.getText());
        }
        else if(str.equals("5"))
        {
            label.setText(label.getText()+button5.getText());
        }
        else if(str.equals("6"))
        {
            label.setText(label.getText()+button6.getText());
        }else if(str.equals("7"))
        {
            label.setText(label.getText()+button7.getText());
        }
        else if(str.equals("8"))
        {
            label.setText(label.getText()+button8.getText());
        }
        else if(str.equals("9"))
        {
            label.setText(label.getText()+button9.getText());
        }
        else if(str.equals("0"))
        {
            label.setText(label.getText()+button0.getText());
        }else if(str.equals("."))
        {
            label.setText(label.getText()+buttonDot.getText());
        }else if(str.equals("="))
        {
            System.out.println(label.getText()+"**********************");
            calculator Es = new calculator(label.getText());
            result = Es.Result();
            String ans = Double.toString(result);
            label.setText(ans);
            //label.setText(label.getText()+buttonEq.getText());
        }
        else if(str.equals("+"))
        {
            label.setText(label.getText()+buttonA.getText());
        }else if(str.equals("-"))
        {
            label.setText(label.getText()+buttonS.getText());
        }else if(str.equals("*"))
        {
            label.setText(label.getText()+buttonM.getText());
        }else if(str.equals("/"))
        {
            label.setText(label.getText()+buttonD.getText());
        }else if(str.equals("BackSpace"))
        {
            String temp = label.getText(); int len = temp.length();
            if (len!=0) {
                temp = temp.substring(0, len - 1);
                label.setText(temp);
            }
        }else if(str.equals("Clear"))
        {

            label.setText("");
        }
        else{}
    }

}