package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gussa
 */

import DTO.CalendarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javaswingdev.main.Main;

public class CalendarioDAO {
    Connection conn;
    
    public boolean cadastrarRotina(CalendarioDTO calendario){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "insert into calendario_estudante (dia_semana, horario, info, id_estudante) values(?, ?, ?, ?);";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, calendario.getDia_semana());
            pstm.setString(2, calendario.getHorario());
            pstm.setString(3, calendario.getInfo());
            pstm.setString(4, Integer.toString(Main.getUser()));
            
            pstm.execute();
            pstm.close();

            return true;
        } catch (Exception e) {
            System.err.println("Error (CalendarioDAO): " + e);
            return false;
        }
    }
    
    public boolean excluirRotina(){
        conn = new ConexaoDAO().contectarDB();
        
        try {
            String sql = "delete from calendario_estudante where id_estudante = ?;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, Integer.toString(Main.getUser()));
            
            pstm.execute();
            pstm.close();

            return true;
        } catch (Exception e) {
            System.err.println("Error (CalendarioDAO): " + e);
            return false;
        }
    }
}
