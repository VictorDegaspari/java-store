/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class register extends javax.swing.JFrame {
    private UserDAO users;
    /**
     * Creates new form register
     */
    public register() {
               
        new Login().setVisible(false);
        initComponents();
        toolTips();
        cadastro();
        
        users = new UserDAO();
        if (!users.bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Erro 500: Banco não conectado", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputTel = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        checkboxAdmin = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        buttonClear1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        inputPassword2 = new javax.swing.JPasswordField();
        inputPassword = new javax.swing.JPasswordField();
        buttonSave = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova conta");
        setMinimumSize(new java.awt.Dimension(1300, 660));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel1.setText("Telefone:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(820, 290, 62, 18);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 210, 44, 18);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel3.setText("Email:");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(820, 250, 41, 18);
        getContentPane().add(inputTel);
        inputTel.setBounds(940, 290, 190, 35);
        getContentPane().add(inputName);
        inputName.setBounds(940, 210, 190, 35);
        getContentPane().add(inputEmail);
        inputEmail.setBounds(940, 250, 190, 35);
        getContentPane().add(checkboxAdmin);
        checkboxAdmin.setBounds(940, 440, 21, 23);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel4.setText("Admin:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(820, 440, 47, 18);

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 350, 45, 18);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel6.setText("Repita a senha:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(820, 390, 103, 18);

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 144, 255));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel7.setText("Stylus Moda");
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel3.add(jLabel7);
        jLabel7.setBounds(190, 170, 220, 60);

        jLabel8.setBackground(new java.awt.Color(240, 240, 247));
        jLabel8.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 247));
        jLabel8.setText("Stilus");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(80, 20, 110, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(140, 170, 270, 100);

        jPanel4.setBackground(new java.awt.Color(253, 161, 161));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(180, 200, 270, 100);

        jLabel9.setBackground(new java.awt.Color(240, 240, 247));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 247));
        jLabel9.setText("Maior loja de moda do Brasil! Stilus Moda © 2021");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 600, 350, 18);

        buttonClear1.setBackground(new java.awt.Color(104, 146, 253));
        buttonClear1.setForeground(new java.awt.Color(240, 240, 247));
        buttonClear1.setText("Voltar");
        buttonClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear1);
        buttonClear1.setBounds(10, 10, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 630);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setText("Cadastro");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(920, 120, 110, 50);
        getContentPane().add(inputPassword2);
        inputPassword2.setBounds(940, 390, 190, 35);
        getContentPane().add(inputPassword);
        inputPassword.setBounds(940, 350, 190, 35);

        buttonSave.setBackground(new java.awt.Color(104, 146, 253));
        buttonSave.setForeground(new java.awt.Color(240, 240, 247));
        buttonSave.setText("Cadastrar");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSave);
        buttonSave.setBounds(990, 490, 140, 50);

        buttonClear.setBackground(new java.awt.Color(104, 146, 253));
        buttonClear.setForeground(new java.awt.Color(240, 240, 247));
        buttonClear.setText("Limpar");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        getContentPane().add(buttonClear);
        buttonClear.setBounds(820, 490, 140, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        limpar();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClear1ActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_buttonClear1ActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    
    public void limpar() {

        inputEmail.setText("");
        inputTel.setText("");
        inputName.setText("");
        inputPassword2.setText("");
        inputPassword.setText("");
        inputName.requestFocus();
        checkboxAdmin.setSelected(false);
    }
    
    public void toolTips(){
        
        buttonSave.setToolTipText("Salvar");        
        buttonClear.setToolTipText("Limpar campos");

        
    }
    
    
    public void cadastro() {
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                if (inputName.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O nome nao pode ser vazio!", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
                    inputName.requestFocus();
                    return;
                }
                if (inputEmail.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O email nao pode ser vazio!", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
                    inputEmail.requestFocus();
                    return;
                }
                if (inputTel.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "O telefone nao pode ser vazio!", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
                    inputTel.requestFocus();
                    return;
                }
                if (inputPassword.getPassword().length == 0 || inputPassword.getPassword().length < 3) {
                    JOptionPane.showMessageDialog(null, "A senha nao pode ser vazia ou menor que 3 dígitos!", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
                    inputPassword.requestFocus();
                    return;
                }
                if (!Arrays.equals(inputPassword.getPassword(), inputPassword2.getPassword())) {
                    JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!", "Cadastro não realizado", JOptionPane.ERROR_MESSAGE);
                    inputPassword.requestFocus();
                    return;
                }
                users.user.setEmail(inputEmail.getText());
                users.user.setNome(inputName.getText());
                users.user.setTelefone(inputTel.getText());
                users.user.setPassword(String.valueOf(inputPassword.getPassword()));
                users.user.setAdmin(checkboxAdmin.isSelected());

                JOptionPane.showMessageDialog(null, users.post());
                
                limpar();
                dispose();
                new Login().setVisible(true);
            }
        });
    }
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClear1;
    private javax.swing.JButton buttonSave;
    private javax.swing.JCheckBox checkboxAdmin;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JPasswordField inputPassword2;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
