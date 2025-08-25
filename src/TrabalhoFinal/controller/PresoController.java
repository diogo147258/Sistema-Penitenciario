/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoFinal.controller;

import TrabalhoFinal.model.PresoModel;
import TrabalhoFinal.util.Conexao;

import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/**
 *
 * @author andre
 */
public class PresoController {
    
    public List<PresoModel> listar() {
        
        Conexao conexao = new Conexao();
        java.sql.Connection con = conexao.conectar();
        String instrucao = "SELECT *FROM prisao";
        List<PresoModel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = con.prepareStatement(instrucao);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                PresoModel preso = new PresoModel();
                preso.setIdPreso(rs.getInt(1));
                preso.setNome(rs.getString(2));
                preso.setCpf(rs.getString(3));
                preso.setDataNascimento(rs.getString(4));
                preso.setFiliacao(rs.getString(5));
                preso.setNaturalidade(rs.getString(6));
                preso.setCor(rs.getString(7));
                preso.setDataEntrada(rs.getString(8));
                preso.setPena(rs.getString(9));
                preso.setIdCela(rs.getInt(10));
                
                lista.add(preso);
            }
            return lista;
        }catch(Exception ex){
            System.err.println(ex);
            lista = null;
          }
        finally{
            conexao.encerrar(con);
            return lista;
        }
    } 
    
     public boolean inserir(PresoModel preso) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "INSERT INTO prisao ( nome, data_nascimento, cpf , cela_id, data_prisao, pena_anos, cor, naturalidade, filiacao) VALUES (?,?,?,?,?,?,?,?,?)";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            //ps.setInt(1, preso.getIdPreso());
            ps.setString(1, preso.getNome());
            ps.setString(2, preso.getDataNascimento());
            ps.setString(3, preso.getCpf());
            ps.setInt(4, preso.getIdCela());
            ps.setString(5, preso.getDataEntrada());
            ps.setString(6, preso.getPena());
            ps.setString(7,preso.getCor());
            ps.setString(8, preso.getNaturalidade());
            ps.setString(9, preso.getFiliacao());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
     
     
     public boolean atualizar(PresoModel preso) {
         
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "UPDATE prisao SET nome=?,data_nascimento=?,cpf=?,cela_id=?, data_prisao=?,pena_anos=?, cor=?, naturalidade=?, filiacao=? WHERE id_preso=?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
           
            ps.setString(1, preso.getNome());
            ps.setString(2, preso.getDataNascimento());
            ps.setString(3, preso.getCpf());
            ps.setInt(4, preso.getIdCela());
            ps.setString(5, preso.getDataEntrada());
            ps.setString(6, preso.getPena());
            ps.setString(7,preso.getCor());
            ps.setString(8, preso.getNaturalidade());
            ps.setString(9, preso.getFiliacao());
            ps.setInt(10, preso.getIdPreso());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
           return retorno; 
        }
    }
     
     
       public boolean excluir(PresoModel preso) {
        
        Conexao conexao = new Conexao();
        Connection con = conexao.conectar();
        String instrucao = "DELETE FROM prisao WHERE id_preso = ?";
        boolean retorno = false;
        try {
            PreparedStatement ps = con.prepareStatement(instrucao);
            ps.setInt(1, preso.getIdPreso());
            int resultado = ps.executeUpdate();
            retorno = resultado >= 0;
            JOptionPane.showMessageDialog(null, "Preso excluído com sucesso!");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conexao.encerrar(con);
            return retorno;
        }       
    }       
    
}

   



