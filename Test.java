package CalculatorApplication;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener
{
    double num1, num2, result;
    int circulation;

    JTextField textField = new JTextField();

    JFrame frame = new JFrame();

    // First Line Calculator
    JButton buttonAC = new JButton("AC");
    JButton buttonDel = new JButton("Del");
    JButton buttonModulo = new JButton("%");
    JButton buttonDiv = new JButton("/");


    // Second Line Calculator
    JButton buttonMul = new JButton("x");
    JButton buttonNine = new JButton("9");
    JButton buttonEight = new JButton("8");
    JButton buttonSeven = new JButton("7");


    // Third Line Calculator
    JButton buttonSix = new JButton("6");
    JButton buttonFive = new JButton("5");
    JButton buttonFour = new JButton("4");
    JButton buttonMinus = new JButton("-");


    // Forth Line Calculator
    JButton buttonThree = new JButton("3");
    JButton buttonTwo = new JButton("2");
    JButton buttonOne = new JButton("1");
    JButton buttonPlus = new JButton("+");


    // Fifth Line Calculator
    JButton buttonEqual = new JButton("=");
    JButton buttonDot = new JButton(".");
    JButton buttonZero = new JButton("0");


    public void prepareGui()
    {
        frame.setSize(485, 600);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator Application");
        frame.getContentPane().setBackground(Color.black);
        frame.setVisible(true);
    }

    public void prepareComponents()
    {
        textField.setBounds(20, 70, 430, 100);
        textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        // First Line Calculator
        buttonAC.setBounds(20, 235, 100, 50);
        buttonAC.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonAC.setBackground(Color.orange);
        buttonAC.setFocusable(false);
        frame.add(buttonAC);

        buttonDel.setBounds(130, 235, 100, 50);
        buttonDel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonDel.setBackground(Color.orange);
        buttonDel.setFocusable(false);
        frame.add(buttonDel);

        buttonModulo.setBounds(240, 235, 100, 50);
        buttonModulo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonModulo.setBackground(Color.orange);
        buttonModulo.setFocusable(false);
        frame.add(buttonModulo);

        buttonDiv.setBounds(350, 235, 100, 50);
        buttonDiv.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonDiv.setBackground(Color.orange);
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);


        // Second Line Calculator
        buttonSeven.setBounds(20, 300, 100, 50);
        buttonSeven.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(130, 300, 100, 50);
        buttonEight.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(240, 300, 100, 50);
        buttonNine.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonMul.setBounds(350, 300, 100, 50);
        buttonMul.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonMul.setBackground(Color.orange);
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        // Third Line Calculator
        buttonFour.setBounds(20, 365, 100, 50);
        buttonFour.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(130, 365, 100, 50);
        buttonFive.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(240, 365, 100, 50);
        buttonSix.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonMinus.setBounds(350, 365, 100, 50);
        buttonMinus.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonMinus.setBackground(Color.orange);
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);

        // Forth Line Calculator
        buttonOne.setBounds(20, 430, 100, 50);
        buttonOne.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(130, 430, 100, 50);
        buttonTwo.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(240, 430, 100, 50);
        buttonThree.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonPlus.setBounds(350, 430, 100, 50);
        buttonPlus.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonPlus.setBackground(Color.orange);
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);

        // Fifth Line Calculator
        buttonZero.setBounds(20, 495, 210, 50);
        buttonZero.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonDot.setBounds(240, 495, 100, 50);
        buttonDot.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonEqual.setBounds(350, 495, 100, 50);
        buttonEqual.setFont(new Font("Times New Roman", Font.BOLD, 20));
        buttonEqual.setBackground(Color.red);
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);
    }

    public void addActionEvent()
    {
        // Listener Button
        buttonAC.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonModulo.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonEqual.addActionListener(this);

        // Button Enable
        buttonAC.setEnabled(true);
        buttonDel.setEnabled(true);
        buttonModulo.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonEqual.setEnabled(true);
    }

    Test()
    {
        prepareGui();
        prepareComponents();
        addActionEvent();
    }
    public static void main(String[] args)
    {
        new Test();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj == buttonAC)
        {
            textField.setText("");
        }
        else if (obj == buttonDel)
        {
            int length = textField.getText().length() - 1;
            if(length >= 0)
            {
                StringBuilder str = new StringBuilder(textField.getText());
                str.deleteCharAt(length);
                textField.setText(str.toString());
            }
            textField.getText();
        }
        else if (obj == buttonModulo)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            circulation = 1;
            textField.setText(str + "%");
        }
        else if (obj == buttonDiv)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            circulation = 2;
            textField.setText(str + "/");
        }
        else if (obj == buttonSeven)
        {
            textField.setText(textField.getText() + "7");
        }
        else if (obj == buttonEight)
        {
            textField.setText(textField.getText() + "8");
        }
        else if (obj == buttonNine)
        {
            textField.setText(textField.getText() + "9");
        }
        else if (obj == buttonFour)
        {
            textField.setText(textField.getText() + "4");
        }
        else if (obj == buttonFive)
        {
            textField.setText(textField.getText() + "5");
        }
        else if (obj == buttonSix)
        {
            textField.setText(textField.getText() + "6");
        }
        else if (obj == buttonOne)
        {
            textField.setText(textField.getText() + "1");
        }
        else if (obj == buttonTwo)
        {
            textField.setText(textField.getText() + "2");
        }
        else if (obj == buttonThree)
        {
            textField.setText(textField.getText() + "3");
        }
        else if (obj == buttonZero)
        {
            textField.setText(textField.getText() + "0");
        }
        else if (obj == buttonMul)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            circulation = 3;
            textField.setText(str + "x");
        }
        else if (obj == buttonMinus)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            circulation = 4;
            textField.setText(str + "-");
        }
        else if (obj == buttonPlus)
        {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            circulation = 5;
            textField.setText(str + "+");
        }
        else if (obj == buttonDot)
        {
            textField.setText(textField.getText() + ".");
        }
        else if (obj == buttonEqual)
        {
            if (textField.getText().contains("%"))
            {
                int signIndex = textField.getText().indexOf("%");
                String str = textField.getText().substring(signIndex + 1);
                num2 = Integer.parseInt(str);
            }
            else if (textField.getText().contains("/"))
            {
                int signIndex = textField.getText().indexOf("/");
                String str = textField.getText().substring(signIndex + 1);
                num2 = Integer.parseInt(str);
            }
            else if (textField.getText().contains("x"))
            {
                int signIndex = textField.getText().indexOf("x");
                String str = textField.getText().substring(signIndex + 1);
                num2 = Integer.parseInt(str);
            }
            else if (textField.getText().contains("-"))
            {
                int signIndex = textField.getText().indexOf("-");
                String str = textField.getText().substring(signIndex + 1);
                num2 = Integer.parseInt(str);
            }
            else if (textField.getText().contains("+"))
            {
                int signIndex = textField.getText().indexOf("+");
                String str = textField.getText().substring(signIndex + 1);
                num2 = Integer.parseInt(str);
            }

            switch (circulation)
            {
                case 1-> result = num1 % num2;
                case 2-> result = num1 / num2;
                case 3-> result = num1 * num2;
                case 4-> result = num1 - num2;
                case 5-> result = num1 + num2;
            }
            if (Double.toString(result).endsWith(".0"))
            {
                textField.setText(Double.toString(result).replace(".0", ""));
            }
            else textField.setText(Double.toString(result));

            num1 = result;
        }
    }
}