package ExecCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame implements ActionListener {

    private JTextField numField1, numField2, resultField;
    private JButton btnSum, btnSubtraction, btnMultiplication, btnDivision;

    public calculadora() {

        setTitle("Calculadora");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        numField1 = new JTextField(10);
        numField2 = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);


        btnSum = new JButton("Soma");
        btnSubtraction = new JButton("Subtração");
        btnMultiplication = new JButton("Multiplicação");
        btnDivision = new JButton("Divisão");


        btnSum.addActionListener(this);
        btnSubtraction.addActionListener(this);
        btnMultiplication.addActionListener(this);
        btnDivision.addActionListener(this);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEADING));
        panel.add(new JLabel("Insira o primeiro número:"));
        panel.add(numField1);
        panel.add(new JLabel("Insira o segundo número:"));
        panel.add(numField2);
        panel.add(btnSum);
        panel.add(btnSubtraction);
        panel.add(btnMultiplication);
        panel.add(btnDivision);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultField);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        double number1 = Double.parseDouble(numField1.getText());
        double number2 = Double.parseDouble(numField2.getText());

        if (e.getSource() == btnSum) {
            resultField.setText(String.valueOf(number1 + number2));
        } else if (e.getSource() == btnSubtraction) {
            resultField.setText(String.valueOf(number1 - number2));
        } else if (e.getSource() == btnMultiplication) {
            resultField.setText(String.valueOf(number1 * number2));
        } else if (e.getSource() == btnDivision) {
            if (number2 != 0) {
                resultField.setText(String.valueOf(number1 / number2));
            } else {
                resultField.setText("Erro: Divisão por zero");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calculadora calc = new calculadora();
            calc.setVisible(true);
        });
    }
}

