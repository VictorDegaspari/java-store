/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import util.BD;
import model.User;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.InitialPage1;

public class UserDAO {

    public User user;
    public BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    public String email;

    public UserDAO() {
        bd = new BD();
        user = new User();
    }

    public void localizarLogin(String loginEmail, String loginPassword) {

        try {
            sql = "SELECT * FROM public.\"user\" WHERE email='"+loginEmail +"' AND password='"+loginPassword+"' ";
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            if (!resultSet.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Email ou senha inválidos!", "Cadastro não executado", JOptionPane.ERROR_MESSAGE);
                return;
            }             
            while (resultSet.next()){
                user.setCodigo(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));                
                user.setPassword(resultSet.getString("password"));
                user.setNome(resultSet.getString("nome"));
                user.setTelefone(resultSet.getString("telefone"));
                user.setAdmin(resultSet.getBoolean("admin"));
            }
            
            resultSet.close();
            statement.close();
            
        }catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Problemas na conexao com a fonte de dados!\n" + erro.toString());
        }


    }
    public void localizarTodos() {
        try {
            sql = "SELECT * FROM public.\"user\"";
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()){
                user.setRowCount(resultSet.getRow());
            }
            
            resultSet.close();
            statement.close();
            bd.close();
            new InitialPage1(user).setVisible(true);
        }catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Problemas na conexao com a fonte de dados!\n" + erro.toString());
        }
    }
    public String post() {
        men = "Operacao realizada com sucesso!";
        try {
            sql = "INSERT INTO public.\"user\" VALUES (?,?,?,?,?)";
            statement = bd.connection.prepareStatement(sql);
//                statement.setInt(1, user.getCodigo()); auto increment
            statement.setString(1, user.getNome());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getTelefone());
            statement.setBoolean(5, user.getAdmin());
            statement.executeUpdate();
                
        } catch (SQLException erro) {

            men = "Falha na operacao!" + erro.toString();

        }
        return men;
    }
}
