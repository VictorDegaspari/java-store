/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import util.BD;

/**
 * @author victor
 */

public final class ProductList extends javax.swing.JFrame {
    private Product product;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private BD bd;
    private String sql;
    
    public ProductList() {
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
        sql = "SELECT * FROM produto";
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
            jLabel14.setText(String.valueOf(resultSet.getRow()));
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
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

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
                "Nome", "Descrição", "Quantidade", "Preço", "Tamanho", "Categoria", "Tipo", "Id do usuario", "Id do produto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane1.setBounds(150, 0, 1020, 490);

        jLabel14.setBackground(java.awt.Color.darkGray);
        jLabel14.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.darkGray);
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("0");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(300, 480, 610, 40);

        jLabel16.setBackground(java.awt.Color.darkGray);
        jLabel16.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 2, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.darkGray);
        jLabel16.setText("Produtos criados");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(150, 470, 150, 60);

        jLabel4.setBackground(new java.awt.Color(212, 194, 255));
        jLabel4.setForeground(new java.awt.Color(212, 194, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("❤");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 480, 20, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 270, 1370, 560);

        jPanel3.setBackground(new java.awt.Color(130, 87, 229));
        jPanel3.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(240, 240, 247));
        jLabel10.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 247));
        jLabel10.setText("Stilus moda");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(1330, 70, 120, 40);

        jLabel13.setBackground(new java.awt.Color(240, 240, 247));
        jLabel13.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 247));
        jLabel13.setText("Aqui você encontra todos os produtos!");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(330, 230, 460, 60);

        jLabel11.setBackground(new java.awt.Color(240, 240, 247));
        jLabel11.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 247));
        jLabel11.setText("criado por alguém!");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(510, 270, 480, 60);

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

        jButton2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(1260, 290, 90, 28);

        jButton3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1150, 290, 90, 28);

        jLabel15.setBackground(new java.awt.Color(240, 240, 247));
        jLabel15.setFont(new java.awt.Font("Noto Sans Mono CJK JP", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 247));
        jLabel15.setText("Escolha um produto,");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(330, 270, 190, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-180, -60, 1550, 330);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new BuyOrDelete().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Edit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
