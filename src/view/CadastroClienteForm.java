package view;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroClienteForm extends JFrame {

    public static void main(String[] args) {
        JFrame window = new JFrame();

        JMenuBar bar = new JMenuBar();
        JMenu addRegister = new JMenu("Cadastros");
        JMenu addEdit = new JMenu("Edit");
        JMenu addHelp = new JMenu("Help");
        JMenuItem cadClient = new JMenuItem("Cliente");
        JMenuItem save = new JMenu("Save");
        JMenuItem saveAs = new JMenu("Save As");
        JMenuItem exit = new JMenuItem("Exit");

        window.setSize(400, 500);

        bar.add(addRegister);
        bar.add(addEdit);
        bar.add(addHelp);

        addRegister.add(cadClient);
        addRegister.add(save);
        addRegister.add(saveAs);
        addRegister.add(exit);

        window.setJMenuBar(bar);
        window.setVisible(true);

        cadClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> {
            new CadastroClienteForm();
        });
            }});  
    }

    public CadastroClienteForm() {
        setTitle("Cadastro de Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel nameLabel = new JLabel("Nome:");
        JTextField nameField = new JTextField(10);

        JLabel documentLabel = new JLabel("Documento:");
        JTextField documentField = new JTextField(10);

        JLabel fidelityLabel = new JLabel("Fidelidade:");
        JTextField fidelityField = new JTextField(5);

        JLabel bornLabel = new JLabel("Nascimento:");
        JTextField bornField = new JTextField(10);

        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField(10);

        JLabel phoneLabel = new JLabel("Telefone:");
        JTextField phoneField = new JTextField(10);

        JLabel streetLabel = new JLabel("Rua:");
        JTextField streetField = new JTextField(10);

        JLabel numberLabel = new JLabel("Nº:");
        JTextField numberField = new JTextField(3);

        JLabel cityLabel = new JLabel("Cidade:");
        JTextField cityField = new JTextField(10);

        JLabel ufLabel = new JLabel("UF:");
        JTextField ufField = new JTextField(2);

        JLabel squareLabel = new JLabel("Bairro:");
        JTextField squareField = new JTextField(10);

        JLabel cepLabel = new JLabel("CEP:");
        JTextField cepField = new JTextField(10);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(documentLabel);
        panel.add(documentField);
        panel.add(fidelityLabel);
        panel.add(fidelityField);
        panel.add(bornLabel);
        panel.add(bornField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(streetLabel);
        panel.add(streetField);
        panel.add(numberLabel);
        panel.add(numberField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(ufLabel);
        panel.add(ufField);
        panel.add(squareLabel);
        panel.add(squareField);
        panel.add(cepLabel);
        panel.add(cepField);
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));
        panel.add(new JLabel("      "));

        JButton newButton = new JButton("Novo");
        panel.add(newButton);

        JButton saveButton = new JButton("Salvar");
        panel.add(saveButton);

        JButton delButton = new JButton("Excluir");
        panel.add(delButton);

        add(panel);
        setVisible(true);
    }
}
