package Controller;

import Model.Usuario;
import Model.UsuarioDAO;
import View.TelaCadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioController {
    private TelaCadastro view;
    private UsuarioDAO dao;

    public UsuarioController(TelaCadastro view, UsuarioDAO dao) {
        this.view = view;
        this.dao = dao;

        this.view.btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = view.campNome.getText();
                String email = view.campEmail.getText();

                if (nome.isEmpty() || email.isEmpty()){
                    JOptionPane.showMessageDialog(view, "Preencha todos os campos!");
                    return;
                }

                if (dao.emailExiste(email)){
                    JOptionPane.showMessageDialog(view, "Email já cadastrado!");
                    return;
                }

                Usuario usuario = new Usuario(nome,email);
                dao.salvar(usuario);
                JOptionPane.showMessageDialog(view,"Usuário cadastrado com sucesso!");
                view.campNome.setText("");
                view.campEmail.setText("");

            }
        });
    }
}
