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
import java.util.ArrayList;

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
    
    public ArrayList<CalendarioDTO> pegarRotina(int id_estudante) {
        conn = new ConexaoDAO().contectarDB();
        ArrayList<CalendarioDTO> lista = new ArrayList<>();
        
        try {
            String sql = "select * from calendario_estudante where id_estudante = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id_estudante);

            ResultSet result = pstm.executeQuery();

            while (result.next()) {
                CalendarioDTO rotina = new CalendarioDTO();
                rotina.setDia_semana(result.getString("dia_semana"));
                rotina.setHorario(result.getString("horario"));
                rotina.setInfo(result.getString("info"));
                rotina.setId_estudante(result.getInt("id_estudante"));

                lista.add(rotina);
            }
        } catch (Exception e) {
            System.err.println("Error (pegarRotina): " + e);
        }
        
        return lista;
    }
}
