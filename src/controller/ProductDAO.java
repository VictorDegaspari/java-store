/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import util.BD;
import model.Product;

public class ProductDAO {
    public Product product;
    public BD bd;
    private PreparedStatement statement;
    private String men, sql;

    public ProductDAO() {
        bd = new BD();
        product = new Product();
    }

    public String post() {
        men = "Operacao realizada com sucesso!";
        try {
                
            sql = "INSERT INTO produto VALUES (?,?,?,?,?,?,?,?)";
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, product.getNome());
            statement.setString(2, product.getDescricao());
            statement.setInt(3, product.getQuantidade());
            statement.setInt(4, product.getPreco());
            statement.setString(5, product.getTamanho());  
            statement.setString(6, product.getCategoria());
            statement.setString(7, product.getTipo());
            statement.setInt(8, product.getCodigo());
            statement.executeUpdate();
                               
        }catch (SQLException erro) {  
          men = "Falha na operacao!" + erro.toString();            
        }
        return men;
    }
    
    public String update(int codigo) {
        men = "Operacao realizada com sucesso!";
        try{
            sql = "UPDATE produto SET name=?, size=?, category=?, type=?, price=? WHERE product_id ='" + codigo + "'";
            statement = bd.connection.prepareStatement(sql);
            
            statement.setString(1, product.getNome());
            statement.setString(2, product.getTamanho());
            statement.setString(3, product.getCategoria());
            statement.setString(4, product.getTipo());
            statement.setInt(5, product.getPreco()); 
            int count = statement.executeUpdate();
            if (count == 0) {
                men = "Falha na operacao! Produto não encontrado"; 
            }
                    
        }catch (SQLException erro) {            
            men = "Falha na operacao!" + erro.toString();            
        }
        return men;
    }
    
    public String delete(int codigo) {
        men = "Operacao realizada com sucesso!";
        try{
            sql = "DELETE FROM produto WHERE product_id ='"+ codigo +"'";
            statement = bd.connection.prepareStatement(sql);
            int count = statement.executeUpdate();
            if (count == 0) {
                men = "Falha na operacao! Produto não encontrado"; 
            }
        }catch (SQLException erro) {
            men = "Falha na operacao!" + erro.toString();            
        }
        return men;
    }
}