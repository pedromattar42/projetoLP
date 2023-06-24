package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gussa
 */

import DTO.MateriaDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class MateriaDAO {
    Connection conn;
    
    /* public ResultSet pegarMaterias(UsuarioDTO estudante){
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
    } */
    
    public boolean cadastrarMateria(MateriaDTO materia){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "insert into materias (nome, professor, carga_horaria, qnt_provas, id_estudante) values(?, ?, ?, ?, ?);";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, materia.getNome());
            pstm.setString(2, materia.getProfessor());
            pstm.setString(3, Integer.toString(materia.getCarga_horaria()));
            pstm.setString(4, Integer.toString(materia.getQnt_provas()));
            pstm.setString(5, Integer.toString(materia.getId_estudante()));
            
            pstm.execute();
            pstm.close();
            
            return true;
        } catch (Exception e) {
            // tratar erro
            System.err.println("Error (MaterialDAO): " + e);
            return false;
        }
    }
}
