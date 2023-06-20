package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gussa
 */

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    Connection conn;
    
    public ResultSet antenticacaoUsuario(UsuarioDTO estudante){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "select * from estudantes where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, estudante.getEmail());
            pstm.setString(2, estudante.getSenha());

            ResultSet result = pstm.executeQuery();
            return result;
        } catch (Exception e) {
            // tratar erro
            System.err.println("Error (UusarioDAO): " + e);
            return null;
        }
    }
    
    public boolean cadastrarUsuario(UsuarioDTO estudante){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "insert into estudantes (nome, email, matricula, senha) values(?, ?, ?, ?);";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, estudante.getNome());
            pstm.setString(2, estudante.getEmail());
            pstm.setString(3, estudante.getMatricula());
            pstm.setString(4, estudante.getSenha());
            
            pstm.execute();
            pstm.close();
            
            return true;
        } catch (Exception e) {
            // tratar erro
            System.err.println("Error (UusarioDAO): " + e);
            return false;
        }
    }
}
