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
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import mainDialog.main.Main;

public class MateriaDAO {
    Connection conn;
    
    public ArrayList<MateriaDTO> pegarMaterias(int id_estudante){
        conn = new ConexaoDAO().contectarDB();
        ArrayList<MateriaDTO> lista = new ArrayList<>();
        
        try {
            String sql = "select * from materias where id_estudante = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id_estudante);

            ResultSet result = pstm.executeQuery();

            while (result.next()) {
                MateriaDTO materia = new MateriaDTO();
                materia.setNome(result.getString("nome"));
                materia.setProfessor(result.getString("professor"));
                materia.setCarga_horaria(result.getInt("carga_horaria"));
                materia.setQnt_provas(result.getInt("qnt_provas"));
                materia.setId_estudante(result.getInt("id_estudante"));

                lista.add(materia);
            }
        } catch (Exception e) {
            System.err.println("Error (pegarMaterias): " + e);
        }

        return lista;
    }
    
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
            System.err.println("Error (MaterialDAO): " + e);
            return false;
        }
    }
    
    public void cadastrarRendimentoSemanal(String rendimento, String nome_materia){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "update materias set rendimento_semanal = ? where nome = ? and id_estudante = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, rendimento);
            pstm.setString(2, nome_materia);
            pstm.setInt(3, Main.getUser());
            
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            System.err.println("Error (MaterialDAO): " + e);
        }
    }
    
    public String pegarRendimento(String nome_materia){
        conn = new ConexaoDAO().contectarDB();
        String result = null;
        
        try {
            String sql = "select  *  from materias where nome = ? and id_estudante = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome_materia);
            pstm.setInt(2, Main.getUser());

            ResultSet resultDb = pstm.executeQuery();
            resultDb.next();
            System.out.println(resultDb.getString("rendimento_semanal"));
            result = resultDb.getString("rendimento_semanal");
            
        } catch (Exception e) {
            System.err.println("Error (MaterialDAO): " + e);
        }
        
        return result;
    }
}
