package View;

import javax.swing.*;

public class TelaCadastro extends JFrame{
    public JTextField campNome = new JTextField();
    public JTextField campEmail = new JTextField();
    public JButton btnCadastrar = new JButton("Cadastrar");


    public TelaCadastro(){
        setTitle("Tela de cadastro");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nome = new JLabel("Nome: ");
        nome.setBounds(10,20,80,25);
        campNome.setBounds(100,20,165,25);

        JLabel email = new JLabel("E-mail: ");
        email.setBounds(10,50,80,25);
        campEmail.setBounds(100,50,165,25);

        btnCadastrar.setBounds(100,90,120,25);

        add(nome);
        add(campNome);
        add(email);
        add(campEmail);
        add(btnCadastrar);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
