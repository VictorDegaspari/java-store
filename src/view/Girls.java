/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.ProductDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;
import util.BD;

/**
 * @author victor
 */

public final class Girls extends javax.swing.JFrame {
    private PreparedStatement statement;
    private ResultSet resultSet;
    private final BD bd;
    private String sql;
    
    public Girls() {
        initComponents();
        bd = new BD();
        if (!bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha na conexão", "Erro 500: Banco não conectado", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        listTab();
    }
    public void listTab(){
     try {
        sql = "SELECT * FROM produto WHERE category='Feminino'";
        statement = bd.connection.prepareStatement(sql);
        resultSet = statement.executeQuery();


        DefaultTableModel tableModel = new DefaultTableModel(
            new String[]{}, 0) {
        };
        
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();
        
        int qtdeColunas = resultSet.getMetaData().getColumnCount();
        for (int indice = 1; indice <= qtdeColunas; indice++) {
            tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
        }
        while (resultSet.next()) {
            String[] dados = new String[qtdeColunas];
            for (int i = 1; i <= qtdeColunas; i++) {
                dados[i - 1] = resultSet.getString(i);
            }
            dtm.addRow(dados);
        }
        resultSet.close();
        statement.close();
        bd.close();
    } catch (SQLException erro) {
        JOptionPane.showConfirmDialog(null, "Comando SQL Invalido !" + erro.toString());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vitrine");
        setMinimumSize(new java.awt.Dimension(1326, 824));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(240, 240, 247));
        jPanel1.setLayout(null);

        productTable.setBackground(new java.awt.Color(255, 255, 255));
        productTable.setBorder(new javax.swing.border.LineBorder(java.awt.Color.darkGray, 1, true));
        productTable.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        productTable.setForeground(java.awt.Color.darkGray);
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Preço", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productTable.setGridColor(new java.awt.Color(46, 1, 86));
        productTable.setRowHeight(40);
        productTable.setSelectionBackground(new java.awt.Color(192, 255, 200));
        productTable.setSelectionForeground(java.awt.Color.gray);
        productTable.setShowGrid(true);
        jScrollPane1.setViewportView(productTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(210, 0, 900, 490);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 270, 1370, 560);

        jPanel3.setBackground(new java.awt.Color(130, 87, 229));
        jPanel3.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(240, 240, 247));
        jLabel10.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 247));
        jLabel10.setText("GIRLS");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(1320, 70, 60, 40);

        jLabel13.setBackground(new java.awt.Color(240, 240, 247));
        jLabel13.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 247));
        jLabel13.setText("Escolha um produto!");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(390, 230, 480, 60);

        jLabel14.setBackground(new java.awt.Color(240, 240, 247));
        jLabel14.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 247));
        jLabel14.setText("Escolha um produto,");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(390, 270, 190, 60);

        jLabel11.setBackground(new java.awt.Color(240, 240, 247));
        jLabel11.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 247));
        jLabel11.setText("criado por alguém!");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(570, 270, 480, 60);

        jButton1.setBackground(new java.awt.Color(152, 113, 245));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<-------");
        jButton1.setToolTipText("Voltar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(230, 80, 110, 30);

        jLabel12.setBackground(new java.awt.Color(240, 240, 247));
        jLabel12.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 247));
        jLabel12.setText("Stilus moda");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(1210, 70, 120, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-180, -60, 1550, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
