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
import java.util.ArrayList;
import mainDialog.main.Main;

public class UsuarioDAO {
    Connection conn;
    
    public int antenticacaoUsuario(UsuarioDTO estudante){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "select * from estudantes where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, estudante.getEmail());
            pstm.setString(2, estudante.getSenha());

            ResultSet result = pstm.executeQuery();
            result.next();
            return result.getInt("id_estudante");
        } catch (Exception e) {
            System.err.println("Error (UsuarioDAO): " + e);
            return -1;
        }
    }
    
    public int cadastrarUsuario(UsuarioDTO estudante){
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
            
            sql = "select * from estudantes where email = ? and senha = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, estudante.getEmail());
            pstm.setString(2, estudante.getSenha());
            
            ResultSet result = pstm.executeQuery();
            result.next();
            return result.getInt("id_estudante");
        } catch (Exception e) {
            System.err.println("Error (UusarioDAO): " + e);
            return -1;
        }
    }
    
    public ArrayList<UsuarioDTO> infoEstudante(){
        conn = new ConexaoDAO().contectarDB();
        ArrayList<UsuarioDTO> lista = new ArrayList<>();
        
        try {
            String sql = "select * from estudantes where id_estudante = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, Main.getUser());

            ResultSet result = pstm.executeQuery();
            result.next();
            
            UsuarioDTO materia = new UsuarioDTO();
            materia.setNome(result.getString("nome"));
            materia.setEmail(result.getString("email"));
            materia.setMatricula(result.getString("matricula"));
            
            lista.add(materia);

        } catch (Exception e) {
            System.err.println("Error (infoEstudante): " + e);
        }

        return lista;
    }
}
